package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.SanPham;
import ClothesShop.Service.Admin.IDanhMuc;

@Service
public class DanhMucImpl implements IDanhMuc {
	@Autowired
	DanhMucDao danhmucDao = new DanhMucDao();

	public int AddDanhMuc(DanhMuc danhmuc) {
		return danhmucDao.AddDanhMuc(danhmuc);
	}
	public List<DanhMuc> GetDataXoaDanhMuc(int id_xoa) {
		return danhmucDao.GetDataXoaDanhMuc(id_xoa);
	}
	public List<DanhMuc> GetDataHienDanhMuc() {
		return danhmucDao.GetDataHienDanhMuc();
	}
	public List<DanhMuc> GetDataSuaDanhMuc(int id_chinhsua) {
		return danhmucDao.GetDataSuaDanhMuc(id_chinhsua);
	}
	public int ChinhSuaDanhMuc(DanhMuc danhmuc) {
		return danhmucDao.ChinhSuaDanhMuc(danhmuc);
	}
}
