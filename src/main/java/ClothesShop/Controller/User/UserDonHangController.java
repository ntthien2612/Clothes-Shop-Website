package ClothesShop.Controller.User;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.MapperGioHang;
import ClothesShop.Service.User.UserDonHangImpl;

@Controller
public class UserDonHangController {
	@Autowired
	UserDonHangImpl userDonHangImpl;
	public ModelAndView _mvShare = new ModelAndView();
	@RequestMapping(value = "donhang", method = RequestMethod.GET, params = "id_kh")
	public ModelAndView HienThiDonHang(int id_kh) {
	
		_mvShare.setViewName("user/donhang");
		_mvShare.addObject("donhang", userDonHangImpl.getDonHang(id_kh));
		return _mvShare;
	}
	
	@RequestMapping(value = "chitietdonhang", method = RequestMethod.GET, params = {"id","tongtien"})
	public ModelAndView HienThiChiTietDonHang(int id,int tongtien) {
		_mvShare.setViewName("user/chitietdonhang");
		_mvShare.addObject("chitietdonhang",userDonHangImpl.getChiTietDH(id));
		_mvShare.addObject("tongtien", tongtien);
		return _mvShare;
	}
}
