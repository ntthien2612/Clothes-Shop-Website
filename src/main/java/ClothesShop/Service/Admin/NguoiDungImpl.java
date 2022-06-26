package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.NguoiDungDao;
import ClothesShop.Entity.NguoiDung;

@Service
public class NguoiDungImpl implements INguoiDung {
	@Autowired
	NguoiDungDao nguoidungDao = new NguoiDungDao();
	public List<NguoiDung> GetDataKhachHang() {
		return nguoidungDao.GetDataKhachHang();
	}
	public List<NguoiDung> GetDataTimKiemNguoiDung(String tenkh) {
		return nguoidungDao.GetDataTimKiemNguoiDung(tenkh);
	}

}
