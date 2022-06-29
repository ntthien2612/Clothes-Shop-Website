package ClothesShop.Service.User;

import java.util.List;

import ClothesShop.Entity.DonHang;

public interface IUserDonHang {
	public List<DonHang> getDonHang();
	public List<String[]> getChiTietDH(int id);
}
