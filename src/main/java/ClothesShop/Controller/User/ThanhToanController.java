package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Service.User.ThanhToanImpl;

@Controller
public class ThanhToanController {
@Autowired
ThanhToanImpl thanhtoanImpl;
//thanh toan
@RequestMapping(value = "/muahang", method = RequestMethod.GET, params = "id")
public ModelAndView MuaHang(String[] id) {
	ModelAndView muahang = new ModelAndView("user/chitietdonhang");
	muahang.addObject("giohang", thanhtoanImpl.MuaHang(id));
	return muahang;
}
}
