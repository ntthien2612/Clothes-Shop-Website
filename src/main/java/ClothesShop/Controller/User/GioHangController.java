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