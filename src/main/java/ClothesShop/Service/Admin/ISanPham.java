package ClothesShop.Service.Admin;

import java.util.List;

import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.SanPham;

public interface ISanPham {
	public int AddSanPham(SanPham sanpham);
	public int ThemSanPhamChiTiet(ChiTietSanPham chitietsp);
	public int UpdateChiTiet(ChiTietSanPham chitietsp);
	public int KiemTraChiTiet(ChiTietSanPham chitietsp);
<<<<<<< HEAD
	public List<String[]> GetDataDanhSachSanPham();
	public List<SanPham> GetDataXoaSanPham(int id_xoa);
	public List<String[]> GetDataSuaSanPham(int id_chinhsua);
	public int UpdateSanPham(SanPham sanpham);
	public List<String[]> TimSanPham(String ten_sp);
=======
//	public List<ChiTietSanPham>KiemTraChiTiet(int id_sp, int soluong, String size);
//	public List<SanPham> ThemSanPhamChiTiet(ChiTietSanPham chitietsp);
//	public int UpdateSanPhamChiTiet(ChiTietSanPham chitietsp);
//	public int ThemMoiSanPhamChiTiet(ChiTietSanPham chitietsp);
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
}
