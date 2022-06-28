package ClothesShop.Service.Admin;

import org.mindrot.jbcrypt.BCrypt;

import ClothesShop.Dao.AdminDao;
import ClothesShop.Entity.Admin;

public class TaiKhoanServiceImpl {
	AdminDao adminDao = new AdminDao();
	public int AddAccount(Admin admin) {
		
		admin.setPass(BCrypt.hashpw(admin.getPass(), BCrypt.gensalt(12)));
		
		return adminDao.AddAccountAdmin(admin);
	}
	public Admin CheckAccountAdmin(Admin admin) {
		
		String pass = admin.getPass();
		admin = adminDao.GetAdminByAcc(admin);
		if (admin != null) {
			if (BCrypt.checkpw(pass, admin.getPass())) {
				return admin;
			} else {
				return null;
			}
		}
		return null;
		

	}
}
