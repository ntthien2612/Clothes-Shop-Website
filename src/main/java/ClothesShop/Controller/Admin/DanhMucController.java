package ClothesShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.DanhMuc;
import ClothesShop.Service.Admin.AdminHomeImpl;
import ClothesShop.Service.Admin.DanhMucImpl;
import ClothesShop.Service.User.UserHomeImpl;
@Controller
public class DanhMucController {
	@Autowired
	UserHomeImpl UserService;
	@Autowired
	AdminHomeImpl AdminService;
	public ModelAndView _mvShare = new ModelAndView();

	// trang them danh muc
	@RequestMapping(value = "/admin/quanlydanhmucSP", method = RequestMethod.GET, produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView DanhMuc() {
		_mvShare.setViewName("admin/admin_danhmuc");
		_mvShare.addObject("danhsach", UserService.GetDataDanhMuc());//danhsach do ra o var va items ben file jsp
		_mvShare.addObject("danhmuc", new DanhMuc());// tao 1 doi tuong danh muc moi
		return _mvShare;
	}

	@Autowired
	DanhMucImpl danhmucHomeImpl = new DanhMucImpl();
	@RequestMapping(value = "admin/quanlydanhmucSP", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateDanhMuc(@ModelAttribute("danhmuc") DanhMuc danhmuc) {
		int count = danhmucHomeImpl.AddDanhMuc(danhmuc);
		if (count > 0) {// them it nhat dc 1 dong
			_mvShare.addObject("status", "Thêm danh mục thành công !");

		} else {
			_mvShare.addObject("status", "Thêm danh mục thất bại !");
		}
		_mvShare.setViewName("redirect: admin/admin_danhmuc");// file tra ve
		return _mvShare;
	}
//xoa danh muc
	@RequestMapping(value = "/admin/quanlydanhmucSP/xoa", method = RequestMethod.GET, params = "id")
	public ModelAndView DeleteDanhMuc(int id) {
		int count = danhmucHomeImpl.XoaDanhMuc(id);
		if (count > 0) {// them it nhat dc 1 dong
			_mvShare.addObject("status", "Thêm danh mục thành công !");

		} else {
			_mvShare.addObject("status", "Thêm danh mục thất bại !");
		}
		_mvShare.setViewName("redirect: admin/admin_danhmuc");// file tra ve
		return _mvShare;
	}
	
	//chinh sua danh muc
		//hien giao dien trang chinh sua
		@RequestMapping(value = "/admin/chinhsua", method = RequestMethod.GET, params = "id_chinhsua", produces = "application/x-www-form-urlencoded;charset=UTF-8")
		public ModelAndView SuaDanhMuc(int id_chinhsua) {
			_mvShare.addObject("edit_danhmuc",danhmucHomeImpl.GetDataSuaDanhMuc(id_chinhsua));
			_mvShare.setViewName("admin/chinhsua_danhmuc");
				return _mvShare;
		}
		//xu ly chinh sua
		@RequestMapping(value = "/admin/chinhsuadanhmuc", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
		public ModelAndView EditDanhMuc(@ModelAttribute("danhmuc") DanhMuc danhmuc) {
			int count = danhmucHomeImpl.ChinhSuaDanhMuc(danhmuc);
			_mvShare.setViewName("redirect:/admin/quanlydanhmucSP");
			return _mvShare;
		}
		
		
}
