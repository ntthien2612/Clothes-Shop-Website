package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Service.User.UserHomeImpl;
@Controller
public class SanPhamControl {
	@Autowired
	UserHomeImpl HomeService;
	//trang san pham
		@RequestMapping(value = "/sanpham")
		public ModelAndView Product() {
			ModelAndView sp = new ModelAndView("user/sanpham");
			sp.addObject("sanpham", HomeService.GetDataSanPham());
			return sp;
		}
}
