package ClothesShop.Controller.User;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;

=======
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
import ClothesShop.Dao.GioHangDao;
import ClothesShop.Entity.DanhMuc;
=======
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
import ClothesShop.Entity.Users;
import ClothesShop.Service.User.AccountServiceImpl;
import ClothesShop.Service.User.UserHomeImpl;

@Controller
<<<<<<< HEAD
public class UserController {
	@Autowired
	UserHomeImpl HomeService;
	@Autowired
	GioHangDao giohangDao;
	@Autowired
	HttpSession session;
=======
//@RequestMapping(value="/")
public class UserController {
	@Autowired
	UserHomeImpl HomeService;
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
	public ModelAndView _mvShare = new ModelAndView();
//trang index
	@RequestMapping(value = "/")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("sanpham", HomeService.GetDataSanPham());
		mv.addObject("danhmuc", HomeService.GetDataDanhMuc());
		return mv;
	}
<<<<<<< HEAD
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
=======
	
	

>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
}
