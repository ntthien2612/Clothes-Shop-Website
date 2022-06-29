package ClothesShop.Controller.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.Admin;
import ClothesShop.Entity.Users;
import ClothesShop.Service.Admin.AdminAccountImpl;
import ClothesShop.Service.User.AccountServiceImpl;
import ClothesShop.Service.User.UserHomeImpl;

@Controller
public class AdminDangNhapController {
	@Autowired
	UserHomeImpl HomeService;
	public ModelAndView _mvShare = new ModelAndView();
	// ĐĂNG NHẬP TÀI KHOẢN

	@RequestMapping(value = "/login/")
	public ModelAndView Admin_Login() {
		_mvShare.setViewName("admin/admin_dangnhap");
		return _mvShare;
	}

	@Autowired
	AdminAccountImpl  adminAccount = new AdminAccountImpl();
	// ĐĂNG NHẬP TÀI KHOẢN

	@RequestMapping(value = "/login/dang-nhap", method = RequestMethod.GET)
	public ModelAndView Admin_Login(HttpSession session, @ModelAttribute("admin") Admin admin) {
		admin = adminAccount.CheckAccount(admin);
		if (admin!=null) {
			_mvShare.setViewName("redirect:/admin/");
			session.setAttribute("AdminLoginInfo", admin);
		_mvShare.addObject("statusLogin", "");
		} else {
			_mvShare.addObject("statusLogin", "Đăng nhập thất bại!");
			_mvShare.setViewName("redirect:/admin/");
		}
		return _mvShare;
	}

	// ĐĂNG XUẤT TÀI KHOẢN
	@RequestMapping(value = "/login/dang-xuat", method = RequestMethod.GET)
	public String Logout(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("AdminLoginInfo");
		return "redirect:/login/";
	}
	
	

}
