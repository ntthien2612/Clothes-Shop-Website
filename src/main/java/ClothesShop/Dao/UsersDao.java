package ClothesShop.Dao;



import org.springframework.stereotype.Repository;

import ClothesShop.Entity.MapperUsers;
import ClothesShop.Entity.Users;

@Repository
public class UsersDao extends BaseDao {
<<<<<<< HEAD
	//them khach hang
=======
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
	public int AddAccount(Users user)
	{
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO khachhang ");
		sql.append("( ");
		sql.append("	ten_kh, ");
		sql.append("	email_kh, ");
		sql.append("	pass, ");
		sql.append("	diachi, ");
		sql.append("	sdt ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("	'"+user.getTen_kh()+"', ");
		sql.append("	'"+user.getEmail_kh()+"', ");
		sql.append("	'"+user.getPass()+"', ");
		sql.append("	'"+user.getDiachi()+"', ");
		sql.append("	'"+user.getSdt()+"' ");
		sql.append(")");
		
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
<<<<<<< HEAD
	//dang nhap
	public Users GetUserByAcc(Users user)
	{
		String sql = "SELECT * FROM khachhang WHERE email_kh = '"+user.getEmail_kh()+"'";
		Users result = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		return result;
	}
	
=======
	public Users GetUserByAcc(Users user)
	{
		
		String sql = "SELECT * FROM khachhang WHERE email_kh = '"+user.getEmail_kh()+"'";
		Users result = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		
		
		return result;
	}
	
	
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
}
