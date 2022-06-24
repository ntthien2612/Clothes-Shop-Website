package ClothesShop.Controller.Admin;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
=======
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Entity.SanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Service.Admin.AdminHomeImpl;
import ClothesShop.Service.Admin.DanhMucImpl;
import ClothesShop.Service.Admin.SanPhamImpl;
import ClothesShop.Service.User.AccountServiceImpl;

@Controller
public class AdminController {
	@Autowired
	AdminHomeImpl HomeService;
<<<<<<< HEAD

	@RequestMapping(value = "/admin/")
	public ModelAndView Admin() {
		ModelAndView mv = new ModelAndView("admin/admin");
		return mv;
	}
=======
	public ModelAndView _mvShare = new ModelAndView();
	
	@RequestMapping(value = "/admin/")
	public ModelAndView Admin(HttpSession session, HttpServletRequest request) {
		if(session.getAttribute("AdminLoginInfo") != null) {
			_mvShare.setViewName("admin/admin");
			return _mvShare;
		} else {
			_mvShare.setViewName("redirect: ../login/");
			return _mvShare;
			
			
		}
		
		
		
	}
	
	
	
	
	
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
}
