package ClothesShop.Controller.Admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.Admin;
import ClothesShop.Service.Admin.AdminAccountImpl;
import ClothesShop.Service.Admin.AdminHomeImpl;

@Controller
public class AdminController {

	@Autowired
	AdminHomeImpl HomeService;
	@Autowired
	AdminAccountImpl adminAccount;
	public ModelAndView _mvShare = new ModelAndView();

//	chuyển hướng đến trang admin
	@RequestMapping(value = "/admin/", method = RequestMethod.GET)
	public ModelAndView Admin(HttpSession session, HttpServletRequest request) {
		if (session.getAttribute("AdminLoginInfo") != null) {
			_mvShare.setViewName("admin/admin");
			return _mvShare;
		} else {
			_mvShare.setViewName("redirect: ../login/");
			return _mvShare;
		}
	}

	// danh sach admin
	@RequestMapping(value = "/admin/quanlynhanvien", method = RequestMethod.GET)
	public ModelAndView NhanVien(HttpSession session, HttpServletRequest request) {
		if (session.getAttribute("AdminLoginInfo") != null) {
			_mvShare.addObject("admin", HomeService.GetDataDanhSachAdmin());
			_mvShare.setViewName("admin/admin_nhanvien");
			return _mvShare;
		} else {
			_mvShare.setViewName("redirect: ../login/");
			return _mvShare;
		}
	}
//xoa nhan vien
	@RequestMapping(value = "/admin/xoanhanvien", method = RequestMethod.GET, params = "idnv")
	public ModelAndView XoaNhanVien(HttpSession session, HttpServletRequest request, int idnv) {
		_mvShare.addObject("danhsach", HomeService.XoaNhanVien(idnv));
		_mvShare.setViewName("redirect: ../admin/quanlynhanvien");
		return _mvShare;
	}
	
	// tim kiem admin
	@RequestMapping(value = "/admin/timkiem_admin", method = RequestMethod.GET, params = "tenad")
	public ModelAndView TimKiemNhanVien(String tenad) {
		ModelAndView ad = new ModelAndView("admin/admin_nhanvien");
		ad.addObject("timkiem_ad", HomeService.GetDataTimKiemAdmin(tenad));
		return ad;
	}
	//trang Doi mat khau nhan vien
	@RequestMapping(value = "/admin/doimatkhau", method = RequestMethod.GET, params = "idnv")
	public ModelAndView DoiMatKhau(int idnv) {
		_mvShare.addObject("layid", HomeService.LayAdmin(idnv));
		_mvShare.setViewName("admin/admin_doimatkhau");
		return _mvShare;
	}
	//xu ly doi mat khau
	@RequestMapping(value = "/admin/xulydoimatkhau", method = RequestMethod.GET, params = {"pass_cu", "pass_moi","id"})
	public ModelAndView DoiPass(String pass_cu, String pass_moi, int id, @ModelAttribute("admin") Admin admin) {
		admin = adminAccount.CheckAccount(pass_cu, id);
		if(admin!=null) {
			adminAccount.SetAccountAdmin(pass_moi, id, admin);
			_mvShare.setViewName("redirect: ../login/");
		}
		return _mvShare;
		
	}
}
