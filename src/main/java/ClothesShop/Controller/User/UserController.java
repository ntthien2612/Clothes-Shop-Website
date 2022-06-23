package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.Users;
import ClothesShop.Service.User.AccountServiceImpl;
import ClothesShop.Service.User.UserHomeImpl;

@Controller
//@RequestMapping(value="/")
public class UserController {
	@Autowired
	UserHomeImpl HomeService;
	public ModelAndView _mvShare = new ModelAndView();
//trang index
	@RequestMapping(value = "/")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("sanpham", HomeService.GetDataSanPham());
		mv.addObject("danhmuc", HomeService.GetDataDanhMuc());
		return mv;
	}
	
	

}
