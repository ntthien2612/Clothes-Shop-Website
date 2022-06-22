package ClothesShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Entity.SanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Service.Admin.AdminHomeImpl;
import ClothesShop.Service.Admin.DanhMucImpl;
import ClothesShop.Service.Admin.SanPhamImpl;
import ClothesShop.Service.User.AccountServiceImpl;

@Controller
public class AdminController {
	@Autowired
	AdminHomeImpl HomeService;

	@RequestMapping(value = "/admin/")
	public ModelAndView Admin() {
		ModelAndView mv = new ModelAndView("admin/admin");
		return mv;
	}
}
