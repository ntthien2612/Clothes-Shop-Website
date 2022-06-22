package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Service.Admin.IDanhMuc;

@Service
public class DanhMucImpl implements IDanhMuc {
	@Autowired
	DanhMucDao danhmucDao = new DanhMucDao();

	public int AddDanhMuc(DanhMuc danhmuc) {
		return danhmucDao.AddDanhMuc(danhmuc);
	}
	public int XoaDanhMuc(int id) {
		return danhmucDao.XoaDanhMuc(id);
	}
	
	public List<DanhMuc> GetDataSuaDanhMuc(int id_chinhsua) {
		return danhmucDao.GetDataSuaDanhMuc(id_chinhsua);
	}
	public int ChinhSuaDanhMuc(DanhMuc danhmuc) {
		return danhmucDao.ChinhSuaDanhMuc(danhmuc);
	}
	
	
}
