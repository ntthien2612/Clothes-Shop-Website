package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.DonHangDao;
import ClothesShop.Entity.DonHang;

@Service
public class UserDonHangImpl {
	@Autowired
	DonHangDao donHangDao;
	public List<DonHang> getDonHang(int id_kh){
		return donHangDao.getDonHang(id_kh);
	}
	public List<String[]> getChiTietDH(int id){
		return donHangDao.ChiTietDonHang(id);
	}
}
