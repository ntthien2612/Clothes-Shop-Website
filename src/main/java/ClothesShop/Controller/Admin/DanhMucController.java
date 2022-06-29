package ClothesShop.Controller.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Service.Admin.AdminHomeImpl;
import ClothesShop.Service.Admin.DanhMucImpl;
import ClothesShop.Service.User.UserHomeImpl;

@Controller
public class DanhMucController {
	@Autowired
	UserHomeImpl UserService;
	@Autowired
	AdminHomeImpl AdminService;
	@Autowired
	DanhMucImpl danhmucHomeImpl = new DanhMucImpl();
	@Autowired
	DanhMucDao danhmucDao;
	public ModelAndView _mvShare = new ModelAndView();

	//xu ly them danh muc
		@RequestMapping(value = "admin/quanlydanhmucSP", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
		public ModelAndView CreateDanhMuc(HttpSession session, @ModelAttribute("danhmuc") DanhMuc danhmuc) {
			int check = danhmucDao.Count(danhmuc.getTen_dm());
			if(check!=0) {
				session.setAttribute("notification","Tên danh mục này đã tồn tại!");
				_mvShare.setViewName("redirect:/admin/quanlydanhmucSP");
				return _mvShare;
			}else {
				danhmucHomeImpl.AddDanhMuc(danhmuc);
				session.setAttribute("notification","Thêm danh mục sản phẩm thành công!");
				_mvShare.setViewName("redirect:/admin/quanlydanhmucSP");
				return _mvShare;
			}
		}
// trang danh muc
	@RequestMapping(value = "/admin/quanlydanhmucSP", method = RequestMethod.GET)
	public ModelAndView DanhMuc(HttpSession session, HttpServletRequest request) {
		if (session.getAttribute("AdminLoginInfo") != null) {
			_mvShare.addObject("danhsach", danhmucHomeImpl.GetDataHienDanhMuc());
			_mvShare.setViewName("admin/admin_danhmuc");
			return _mvShare;
		} else {
			_mvShare.setViewName("redirect: ../login/");
			return _mvShare;
		}
	}

//xoa danh muc
	@RequestMapping(value = "/admin/xoa", method = RequestMethod.GET, params = "id_xoa")
	public ModelAndView XoaDanhMuc(int id_xoa) {
		_mvShare.addObject(danhmucHomeImpl.GetDataXoaDanhMuc(id_xoa));
		_mvShare.addObject("danhsach", danhmucHomeImpl.GetDataHienDanhMuc());
		_mvShare.setViewName("admin/admin_danhmuc");
		return _mvShare;
	}

//chinh sua danh muc
	// hien giao dien trang chinh sua
	@RequestMapping(value = "/admin/chinhsua", method = RequestMethod.GET, params = "id_chinhsua", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView SuaDanhMuc(int id_chinhsua) {
		_mvShare.addObject("edit_danhmuc", danhmucHomeImpl.GetDataSuaDanhMuc(id_chinhsua));
		_mvShare.setViewName("admin/chinhsua_danhmuc");
		return _mvShare;
	}

	// xu ly chinh sua
	@RequestMapping(value = "/admin/chinhsuadanhmuc", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView EditDanhMuc(@ModelAttribute("danhmuc") DanhMuc danhmuc) {
		int count = danhmucHomeImpl.ChinhSuaDanhMuc(danhmuc);
		_mvShare.setViewName("redirect:/admin/quanlydanhmucSP");
		return _mvShare;
	}
}
