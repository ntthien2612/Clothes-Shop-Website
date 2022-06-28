package ClothesShop.Service.Admin;

import java.util.List;

import ClothesShop.Entity.DonHang;

public interface IDonHang {
	public List<DonHang> DanhSachDonHang();
	public int XacNhanDonHang(int don);
	public int ThemNhatKy(int don);
	public List<String[]> ChiTietDonHang(int don);
}
