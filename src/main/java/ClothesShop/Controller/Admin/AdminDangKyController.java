package ClothesShop.Controller.Admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.AdminDao;
import ClothesShop.Entity.Admin;
import ClothesShop.Entity.Users;
import ClothesShop.Service.Admin.AdminAccountImpl;
import ClothesShop.Service.User.AccountServiceImpl;

@Controller
public class AdminDangKyController {
	
	@Autowired
	AdminAccountImpl accountService = new AdminAccountImpl();
	public ModelAndView _mvShare = new ModelAndView();
	// ĐĂNG KÝ TÀI KHOẢN
			@RequestMapping(value = "admin/dangkyadmin", method = RequestMethod.GET)
			public ModelAndView Register() {
				_mvShare.setViewName("admin/admin_dangky");
				_mvShare.addObject("admin", new Admin());
				return _mvShare;
			}
			@RequestMapping(value = "admin/dangkyadmin", method = RequestMethod.POST)
			public ModelAndView CreateAcc(HttpSession session, @ModelAttribute("admin") Admin admin) {
					session.setAttribute("notification","Đăng ký tài khoản thành công");
					accountService.AddAccountAdmin(admin);
					_mvShare.setViewName("redirect: ./quanlynhanvien");
					return _mvShare;
				

			}
}
