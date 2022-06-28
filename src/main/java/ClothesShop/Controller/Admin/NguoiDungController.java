package ClothesShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.NguoiDung;
import ClothesShop.Service.Admin.NguoiDungImpl;

@Controller
public class NguoiDungController {
@Autowired
NguoiDungImpl nguoidungImpl;
public ModelAndView _mvShare = new ModelAndView();
//trang quan ly nguoi dung
	@RequestMapping(value = "/admin/quanlynguoidung")
	public ModelAndView NguoiDung() {
		_mvShare.addObject("khachhang", nguoidungImpl.GetDataKhachHang());
		_mvShare.setViewName("admin/admin_nguoidung");
		return _mvShare;
	}
	
//	tìm kiếm người dùng
	@RequestMapping(value = "/admin/timkiem", method = RequestMethod.GET, params = "tenkh", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView TimKiemNguoiDung(String tenkh) {
		ModelAndView nguoidung = new ModelAndView("admin/admin_nguoidung");
		nguoidung.addObject("nguoidung", nguoidungImpl.GetDataTimKiemNguoiDung(tenkh));
		return nguoidung;
	}
}
