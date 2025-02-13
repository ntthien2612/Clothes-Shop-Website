package ClothesShop.Controller.Admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.SanPhamDao;
import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.SanPham;
import ClothesShop.Service.Admin.AdminHomeImpl;
import ClothesShop.Service.Admin.SanPhamImpl;

@Controller
public class SanPhamController {
	@Autowired
	AdminHomeImpl HomeService;
	public ModelAndView _mvShare = new ModelAndView();
	@Autowired
	SanPhamImpl sanphamHomeImpl = new SanPhamImpl();
	@Autowired
	SanPhamDao sanphamDao;

	// trang hien danh sach san pham
	@RequestMapping(value = "/admin/quanlysanpham", method = RequestMethod.GET, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView DanhSachSanPham(HttpSession session, HttpServletRequest request) {
		if (session.getAttribute("AdminLoginInfo") != null) {
			_mvShare.setViewName("admin/admin_danhsachsanpham");
			_mvShare.addObject("danhsachsanpham", sanphamHomeImpl.GetDataDanhSachSanPham());
			_mvShare.addObject("locdanhmuc", HomeService.GetDataDanhMuc());
			return _mvShare;
		} else {
			_mvShare.setViewName("redirect: ../login/");
			return _mvShare;
		}
	}

	// trang them san pham
	@RequestMapping(value = "/admin/themsanpham", method = RequestMethod.GET, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView SanPham(HttpSession session, HttpServletRequest request) {
		if (session.getAttribute("AdminLoginInfo") != null) {
			_mvShare.setViewName("admin/admin_sanpham");
			_mvShare.addObject("danhmuc", HomeService.GetDataDanhMuc());
			_mvShare.addObject("tensanpham", sanphamHomeImpl.GetDataSanPham());
			_mvShare.addObject("sanpham", new SanPham());
			return _mvShare;
		} else {
			_mvShare.setViewName("redirect: ../login/");
			return _mvShare;
		}
	}

	// xu ly them san pham
	@RequestMapping(value = "admin/themsanpham", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")

	public ModelAndView CreateSanPham(HttpSession session, @ModelAttribute("sanpham") SanPham sanpham,
		@RequestParam(value = "image", required = false) MultipartFile file, HttpServletRequest request) {
		int check = sanphamDao.Count(sanpham.getTen_sp());
		if (check!=0) {
			session.setAttribute("notification", "Tên sản phẩm đã tồn tại");
			_mvShare.setViewName("redirect:/admin/themsanpham");
		}else {
			//String pathdir = request.getSession().getServletContext().getRealPath("/") + "assets\\user\\img\\";
			String pathdir = System.getProperty("catalina.home")+"/img/";
			System.out.println(pathdir);
			String filename = String.valueOf(new Date().getTime()) + file.getOriginalFilename();
			try {
				byte[] bytes = file.getBytes();
				File dir = new File(pathdir);
				if (!dir.exists()) {
					dir.mkdir();
				}
				File serverFile = new File(pathdir + File.separator + filename);
				System.out.println(serverFile.getAbsolutePath());
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				sanpham.setHinhanh(filename);

			}catch(IOException e) {
				e.printStackTrace();

			}
			sanphamHomeImpl.AddSanPham(sanpham);
			session.setAttribute("notification", "Thêm sản phẩm thành công");
			_mvShare.setViewName("redirect: ./quanlysanpham");
		}
		return _mvShare;
	}

	// xu ly them chi tiet san pham
	@RequestMapping(value = "admin/themchitietsanpham", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView SanPhamChiTiet(@ModelAttribute("chitietsanpham") ChiTietSanPham chitietsp) {
		int count = sanphamHomeImpl.KiemTraChiTiet(chitietsp);
		if (count > 0) {
			sanphamHomeImpl.UpdateChiTiet(chitietsp);

		} else {
			sanphamHomeImpl.ThemSanPhamChiTiet(chitietsp);
		}
		_mvShare.setViewName("redirect:/admin/quanlysanpham");
		return _mvShare;
	}

	// xoa san pham
	@RequestMapping(value = "/admin/xoa_sp", method = RequestMethod.GET, params = "id_xoa", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView XoaSanPham(int id_xoa) {
		_mvShare.addObject(sanphamHomeImpl.GetDataXoaSanPham(id_xoa));
		_mvShare.addObject("danhsachsanpham", sanphamHomeImpl.GetDataDanhSachSanPham());
		_mvShare.setViewName("admin/admin_danhsachsanpham");
		return _mvShare;
	}

	// hien trang chinh sua san pham
	@RequestMapping(value = "/admin/chinhsua_sp", method = RequestMethod.GET, params = "id_chinhsua", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView ChinhSuaSanPham(int id_chinhsua) {
		_mvShare.addObject("edit_sanpham", sanphamHomeImpl.GetDataSuaSanPham(id_chinhsua));
		_mvShare.addObject("danhmuc", HomeService.GetDataDanhMuc());
		_mvShare.setViewName("admin/chinhsua_sanpham");
		return _mvShare;
	}

	// xu ly chinh sua san pham
		@RequestMapping(value = "/admin/chinhsua", method = RequestMethod.POST)
		public ModelAndView SuaSanPham(@ModelAttribute("sanpham") SanPham sanpham,
				@RequestParam(value = "image", required = false) MultipartFile file, HttpServletRequest request) {

			//String pathdir = request.getSession().getServletContext().getRealPath("/") + "assets\\user\\img\\";
			String pathdir = System.getProperty("catalina.home")+"/img/";
			//System.out.println(pathdir);
			String filename = String.valueOf(new Date().getTime()) + file.getOriginalFilename();
			if(!file.getOriginalFilename().isEmpty()) {
				sanpham.setHinhanh(filename);
			}
			try {
				byte[] bytes = file.getBytes();
				File dir = new File(pathdir);
				if (!dir.exists()) {
					dir.mkdir();
				}

				File serverFile = new File(pathdir + File.separator + filename);
				System.out.println(serverFile.getAbsolutePath());
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				

			} catch (IOException e) {

				e.printStackTrace();
			}

			int count = sanphamHomeImpl.UpdateSanPham(sanpham);

			_mvShare.setViewName("redirect:/admin/quanlysanpham");
			return _mvShare;
		}
//tim kiem san pham trang admin
	@RequestMapping(value = "admin/timsp", method = RequestMethod.GET, params = "ten_sp", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView TimKiemSanPham(String ten_sp) {
		ModelAndView sanpham = new ModelAndView("admin/admin_danhsachsanpham");
		sanpham.addObject("locdanhmuc", HomeService.GetDataDanhMuc());
		sanpham.addObject("sanphamtim", sanphamHomeImpl.TimSanPham(ten_sp));
		return sanpham;
	}
//loc san pham theo danh muc
	@RequestMapping(value = "admin/loc_danhmuc", method = RequestMethod.GET, params = "dm", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView LocDanhMuc(int dm) {
		ModelAndView sanpham = new ModelAndView("admin/admin_danhsachsanpham");
		sanpham.addObject("locsanpham", sanphamHomeImpl.LocDanhMuc(dm));
		sanpham.addObject("tendm", sanphamHomeImpl.TenDanhMuc(dm));
		sanpham.addObject("locdanhmuc", HomeService.GetDataDanhMuc());
		return sanpham;
	}
}
