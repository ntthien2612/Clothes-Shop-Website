package ClothesShop.Controller.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.GioHangDao;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.Users;
import ClothesShop.Service.User.AccountServiceImpl;
import ClothesShop.Service.User.UserHomeImpl;

@Controller
public class UserController {
	@Autowired
	UserHomeImpl HomeService;
	@Autowired
	GioHangDao giohangDao;
	@Autowired
	HttpSession session;
	public ModelAndView _mvShare = new ModelAndView();
//trang index
	@RequestMapping(value = "/")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("sanpham", HomeService.GetDataSanPham());
		mv.addObject("danhmuc", HomeService.GetDataDanhMuc());
		return mv;
	}
//trang chi tiet don hang
	@RequestMapping(value = "/chitietdonhang")
	public ModelAndView ChiTietDonHang() {
		ModelAndView mv = new ModelAndView("user/chitietdonhang");
		return mv;
	}
//trang tim kiem
//	@RequestMapping(value="/timkiem", method = RequestMethod.GET, produces = "application/x-www-form-urlencoded;charset=UTF-8", params = "ten_sp")
//	public ModelAndView TimKiem(String ten_sp) {
//		_mvShare.addObject("sanpham", HomeService.GetDataSanPhamTimKiem(ten_sp));
//		_mvShare.setViewName("user/timkiem");
//		return _mvShare;
//	}
}
