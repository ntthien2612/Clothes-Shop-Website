package ClothesShop.Service.Admin;

import ClothesShop.Entity.Admin;

public interface AdminIAccount {
//	khai bao phương thức kiểm tra tài khoản
	public Admin CheckAccount(Admin admin);
	public int AddAccountAdmin(Admin admin);
}
