package ClothesShop.Service.Admin;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.AdminDao;
import ClothesShop.Entity.Admin;
import ClothesShop.Entity.Users;

@Service
public class AdminAccountImpl implements AdminIAccount {
	
	@Autowired
	
	AdminDao adminDao = new AdminDao();
	
	
	public Admin CheckAccount(Admin admin) {
		String pass = admin.getPass();
		admin = adminDao.GetAdminByAcc(admin);
		if (admin != null) {
			if (admin.getPass().equals(pass)) {
				return admin;
			} else {
				return null;
			}
		}
		return null;

	}
	

}
