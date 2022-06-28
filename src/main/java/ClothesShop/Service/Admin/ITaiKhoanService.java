package ClothesShop.Service.Admin;

import ClothesShop.Entity.Admin;

public interface ITaiKhoanService {
	public int AddAccount(Admin admin);
	public Admin CheckAccountAdmin(Admin admin);
}
