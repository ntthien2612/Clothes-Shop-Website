package ClothesShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.SanPham;
import ClothesShop.Service.Admin.AdminHomeImpl;
import ClothesShop.Service.Admin.SanPhamImpl;

@Controller
public class SanPhamController {
	@Autowired
	AdminHomeImpl HomeService;
	public ModelAndView _mvShare = new ModelAndView();
	// trang them san pham
		@RequestMapping(value = "/admin/quanlysanpham", method = RequestMethod.GET, produces="application/x-www-form-urlencoded;charset=UTF-8")
		public ModelAndView SanPham() {
			_mvShare.setViewName("admin/admin_sanpham");
			_mvShare.addObject("danhmuc", HomeService.GetDataDanhMuc());
			_mvShare.addObject("sanpham", new SanPham());
			return _mvShare;
		}

		@Autowired
		SanPhamImpl sanphamHomeImpl = new SanPhamImpl();

		@RequestMapping(value = "admin/quanlysanpham", method = RequestMethod.POST, produces="application/x-www-form-urlencoded;charset=UTF-8")
		public ModelAndView CreateSanPham(@ModelAttribute("sanpham") SanPham sanpham) {
			int count = sanphamHomeImpl.AddSanPham(sanpham);
			if (count > 0) {
				_mvShare.addObject("status", "Thêm sản phẩm thành công !");

			} else {
				_mvShare.addObject("status", "Thêm sản phẩm thất bại !");
			}
			_mvShare.setViewName("/admin/admin_sanpham");
			return _mvShare;
		}
		
		
}
