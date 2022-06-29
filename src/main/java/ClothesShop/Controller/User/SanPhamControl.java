package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Service.User.UserHomeImpl;

@Controller
public class SanPhamControl {
	@Autowired
	UserHomeImpl HomeService;

	// trang san pham
	@RequestMapping(value = "/sanpham")
	public ModelAndView Product() {
		ModelAndView sp = new ModelAndView("user/sanpham");
		sp.addObject("sanpham", HomeService.GetDataSanPham());
		sp.addObject("danhmuc", HomeService.GetDataDanhMuc());
		return sp;
	}
// hiển thị sản phẩm theo danh mục
	@RequestMapping(value = "/sanpham", method = RequestMethod.GET, params = "id")
	public ModelAndView Product(int id) {
		ModelAndView sp = new ModelAndView("user/sanpham");
		sp.addObject("sanpham", HomeService.GetDataSanPham(id));
		sp.addObject("danhmuc", HomeService.GetDataDanhMuc());
		sp.addObject("tendanhmuc", HomeService.laytenDanhMuc(id));
		return sp;
	}
// tìm kiếm sản phẩm theo tên
	@RequestMapping(value = "/sanpham", method = RequestMethod.GET, params = "noidung", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView Product(String noidung) {
		ModelAndView sp = new ModelAndView("user/sanpham");
		sp.addObject("sanpham", HomeService.GetDataSanPham(noidung));
		sp.addObject("danhmuc", HomeService.GetDataDanhMuc());
		return sp;
	}
}
