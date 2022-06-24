package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Service.Admin.AdminIHome;

@Service
public class AdminHomeImpl implements AdminIHome{
	@Autowired
	private DanhMucDao danhmucDao;
	public List<DanhMuc> GetDataDanhMuc() {
		return danhmucDao.GetDataDanhMuc();
	}
	
<<<<<<< HEAD
=======
	
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
//	public int DeleteDanhMuc(int id) {
//		return danhmucDao. DeleteDanhMuc(id);
//	}
}
