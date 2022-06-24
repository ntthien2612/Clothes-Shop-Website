package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.SanPhamDao;
import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.SanPham;
import ClothesShop.Service.Admin.ISanPham;
@Service
public class SanPhamImpl implements ISanPham{
	@Autowired
	SanPhamDao sanphamDao = new SanPhamDao();
<<<<<<< HEAD
//them san pham	
	public int AddSanPham(SanPham sanpham) {
		return sanphamDao.AddSanPham(sanpham);
	}
//hien danh sach san pham ra cho nguoi dung
	public List<SanPham> GetDataSanPham() {
		return sanphamDao.GetDataSanPham();
	}
//them moi chi tiet san pham	
	public int ThemSanPhamChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.ThemSanPhamChiTiet(chitietsp);
	}
//kiem tra chi tiet san pham
	public int KiemTraChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.KiemTraChiTiet(chitietsp);
	}
//update so luong chi tiet san pham
=======
	
	public int AddSanPham(SanPham sanpham) {
		return sanphamDao.AddSanPham(sanpham);
	}

	public List<SanPham> GetDataSanPham() {
		return sanphamDao.GetDataSanPham();
	}

	public List<ChiTietSanPham>KiemTraChiTiet(int id_sp, int soluong, String size) {
		return sanphamDao.KiemTraChiTiet(id_sp, soluong, size);
	}

	public int ThemSanPhamChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.ThemSanPhamChiTiet(chitietsp);
	}

	public int KiemTraChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.KiemTraChiTiet(chitietsp);
	}

>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
	public int UpdateChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.UpdateChiTiet(chitietsp);
		
	}
<<<<<<< HEAD
//hien danh sach san pham
	public List<String[]> GetDataDanhSachSanPham() {
		return sanphamDao.GetDataDanhSachSanPham();
	}
//xoa san pham
	public List<SanPham> GetDataXoaSanPham(int id_xoa) {
		return sanphamDao.GetDataXoaSanPham(id_xoa);
	}
//hien trang sua
	public List<String[]> GetDataSuaSanPham(int id_chinhsua) {
		return sanphamDao.GetDataSuaSanPham(id_chinhsua);
	}
	public int UpdateSanPham(SanPham sanpham) {
		return sanphamDao.UpdateSanPham(sanpham);
	}
	public List<String[]> TimSanPham(String ten_sp) {
		return sanphamDao.TimSanPham(ten_sp);
	}
=======

//	public int ThemSanPhamChiTiet(ChiTietSanPham chitietsp) {
//		return sanphamDao.ThemSanPhamChiTiet(chitietsp);
//	}
//
//	public int UpdateSanPhamChiTiet(ChiTietSanPham chitietsp) {
//		return sanphamDao.UpdateSanPhamChiTiet(chitietsp);
//	}
//
//	public int ThemMoiSanPhamChiTiet(ChiTietSanPham chitietsp) {
//		return sanphamDao.ThemMoiSanPhamChiTiet(chitietsp);
//	}
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
}
