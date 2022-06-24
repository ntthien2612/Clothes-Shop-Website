<<<<<<< HEAD
package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
import ClothesShop.Service.User.GioHangImpl;

@Controller
public class GioHangController{
	@Autowired
	GioHangImpl giohangImpl;
	public ModelAndView _mvShare = new ModelAndView();
	@RequestMapping(value = "themgiohang", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateDanhMuc(@ModelAttribute("giohang") GioHang giohang) {
		int count = giohangImpl.ThemGioHang(giohang);
		if (count > 0) {// them it nhat dc 1 dong
			_mvShare.addObject("status", "Thêm giỏ hàng thành công !");

		} else {
			_mvShare.addObject("status", "Thêm giỏ hàng thất bại !");
		}
		_mvShare.setViewName("redirect:/");
		return _mvShare;
	}
	//trang gio hang
		@RequestMapping(value = "/giohang", method = RequestMethod.GET, params = "id_kh")
		public ModelAndView GioHang(int id_kh) {
			ModelAndView giohang = new ModelAndView("user/giohang");
			giohang.addObject("giohang", giohangImpl.HienGioHang(id_kh));
			return giohang;
		}
	//cong so luong
		@RequestMapping(value = "/cong", method = RequestMethod.GET, params = "idsp")
		public ModelAndView CongGioHang(int idsp, int idkh) {
			_mvShare.addObject("giohang", giohangImpl.CongGioHang(idsp, idkh));
			_mvShare.setViewName("redirect:/giohang?id_kh="+idkh);
			return _mvShare;
		}
	//tru so luong
		@RequestMapping(value = "/tru", method = RequestMethod.GET, params = "idsp")
		public ModelAndView TruGioHang(int idsp, int idkh) {
			_mvShare.addObject("giohang", giohangImpl.TruGioHang(idsp, idkh));
			_mvShare.setViewName("redirect:/giohang?id_kh="+idkh);
			return _mvShare;
		}
	//xoa san pham
		@RequestMapping(value = "/xoagiohang", method = RequestMethod.GET, params = "id")
		public ModelAndView XoaGioHang(int id, int idkh) {
			_mvShare.addObject(giohangImpl.XoaGioHang(id, idkh));
			_mvShare.setViewName("redirect:/giohang?id_kh="+idkh);
			return _mvShare;
		}
}
=======
//package ClothesShop.Controller.User;
//
//import java.util.HashMap;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import ClothesShop.Entity.GioHang;
//import ClothesShop.Service.User.GioHangServiceImpl;
//import ClothesShop.Service.User.UserHomeImpl;
//
//@Controller
//public class GioHangController {
//	
//	@Autowired
//	UserHomeImpl _homeService;
//	public ModelAndView _mvShare = new ModelAndView();
//	@Autowired
//	private GioHangServiceImpl cartService = new GioHangServiceImpl();
//	
//	@RequestMapping(value = "gio-hang")
//	public ModelAndView Index() {
////		_mvShare.addObject("slides", _homeService.GetDataSlide());
//		_mvShare.addObject("danhmuc", _homeService.GetDataDanhMuc());
//		_mvShare.addObject("sanpham", _homeService.GetDataSanPham());
//		_mvShare.setViewName("user/cart/list_cart");
//		return _mvShare;
//	}
//	
//	@RequestMapping(value = "AddCart/{id}")
//	public String AddCart(HttpServletRequest request ,HttpSession session, @PathVariable int id) {
//		HashMap<Long, GioHang> cart = (HashMap<Long, GioHang>)session.getAttribute("Cart");
//		if(cart == null) {
//			cart = new HashMap<Long, GioHang>();
//		}
//		cart = cartService.AddCart(id, cart);
//		session.setAttribute("Cart", cart);
//		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
//		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
//		return "redirect:/chitietsanpham?id="+id;
//	}
//	
//	@RequestMapping(value = "EditCart/{id}/{quanty}")
//	public String EditCart(HttpServletRequest request ,HttpSession session, @PathVariable int id, @PathVariable int quanty) {
//		HashMap<Long, GioHang> cart = (HashMap<Long, GioHang>)session.getAttribute("Cart");
//		if(cart == null) {
//			cart = new HashMap<Long, GioHang>();
//		}
//		cart = cartService.EditCart(id, quanty, cart);
//		session.setAttribute("Cart", cart);
//		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
//		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
//		return "redirect:"+request.getHeader("Referer");
//	}
//	
//	
//	@RequestMapping(value = "DeleteCart/{id}")
//	public String DeleteCart(HttpServletRequest request ,HttpSession session, @PathVariable int id) {
//		HashMap<Long, GioHang> cart = (HashMap<Long, GioHang>)session.getAttribute("Cart");
//		if(cart == null) {
//			cart = new HashMap<Long, GioHang>();
//		}
//		cart = cartService.DeleteCart(id, cart);
//		session.setAttribute("Cart", cart);
//		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
//		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
//		return "redirect:"+request.getHeader("Referer");
//	}
//}
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
