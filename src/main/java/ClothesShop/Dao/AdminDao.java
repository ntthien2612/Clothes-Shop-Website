package ClothesShop.Dao;



import org.springframework.stereotype.Repository;

import ClothesShop.Entity.Admin;
import ClothesShop.Entity.MapperAdmin;
import ClothesShop.Entity.MapperUsers;
import ClothesShop.Entity.Users;

@Repository
public class AdminDao extends BaseDao {
	public Admin GetAdminByAcc(Admin admin){
		
		String sql = "SELECT * FROM admin WHERE taikhoan = '"+admin.getTaikhoan()+"'";
		Admin result = _jdbcTemplate.queryForObject(sql, new MapperAdmin());
		return result;
	}
	
}
