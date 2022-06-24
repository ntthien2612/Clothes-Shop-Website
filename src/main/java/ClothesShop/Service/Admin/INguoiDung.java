package ClothesShop.Service.Admin;

import java.util.List;

import ClothesShop.Entity.NguoiDung;

public interface INguoiDung {
	public List<NguoiDung> GetDataKhachHang();
	public List<NguoiDung> GetDataTimKiemNguoiDung(String tenkh);
}
