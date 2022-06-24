package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Service.User.UserHomeImpl;
@Controller
public class ChiTietSanPhamControl {
	@Autowired
	UserHomeImpl HomeService;

	//trang chi tiet san pham
		@RequestMapping(value = "/chitietsanpham", method = RequestMethod.GET, params = "id")
		public ModelAndView ChiTiet(int id) {
			ModelAndView chitiet = new ModelAndView("user/chitietsanpham");
			chitiet.addObject("sanpham", HomeService.GetDataChiTiet(id));
			chitiet.addObject("chitietsanpham", HomeService.GetDataSizeChiTiet(id));
			return chitiet;
		}

}
