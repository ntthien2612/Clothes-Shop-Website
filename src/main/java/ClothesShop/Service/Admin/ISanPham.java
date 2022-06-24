package ClothesShop.Service.Admin;

import java.util.List;

import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.SanPham;

public interface ISanPham {
	public int AddSanPham(SanPham sanpham);
	public int ThemSanPhamChiTiet(ChiTietSanPham chitietsp);
	public int UpdateChiTiet(ChiTietSanPham chitietsp);
	public int KiemTraChiTiet(ChiTietSanPham chitietsp);
	public List<String[]> GetDataDanhSachSanPham();
	public List<SanPham> GetDataXoaSanPham(int id_xoa);
	public List<String[]> GetDataSuaSanPham(int id_chinhsua);
	public int UpdateSanPham(SanPham sanpham);
	public List<String[]> TimSanPham(String ten_sp);
}
