package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
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
<<<<<<< HEAD
=======
		
		
		@RequestMapping(value = "/sanpham", method = RequestMethod.GET, params = "id" )
		public ModelAndView Product(int id) {
			ModelAndView sp = new ModelAndView("user/sanpham");
			sp.addObject("sanpham", HomeService.GetDataSanPham(id));
				
			return sp;
		}
		
		@RequestMapping(value = "/sanpham", method = RequestMethod.GET, params = "noidung", produces="application/x-www-form-urlencoded;charset=UTF-8" )
		public ModelAndView Product(String noidung) {
			ModelAndView sp = new ModelAndView("user/sanpham");
			sp.addObject("sanpham", HomeService.GetDataSanPham(noidung));
				
			return sp;
		}
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
}
