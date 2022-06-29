package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.ThanhToanDao;
import ClothesShop.Entity.DonHang;
import ClothesShop.Entity.SanPham;
import ClothesShop.Service.Admin.IDanhMuc;

@Service
public class ThanhToanImpl implements IThanhToan{
	@Autowired
	ThanhToanDao thanhToanDao;
	public List<String[]> HienThiThanhToan(String[] check) {
		return thanhToanDao.HienThiThanhToan(check);
	}
	public List TongTien(String[] check) {
		return thanhToanDao.TongTien(check);
		
	}
	
	public int SaveThanhToan(DonHang donhang) {
		return thanhToanDao.SaveDonHang(donhang);
	}
	public int SaveChiTietDonHang(int id_dh,String size, int gia, int id_sp, int soluong) {
		return thanhToanDao.SaveChiTietDonHang(id_dh,size,  gia, id_sp, soluong);
	}
	public SanPham getSanPham(int id_sp) {
		return thanhToanDao.GetSanPham(id_sp);
	}
	public int getIdDonHang() {
		return thanhToanDao.GetIdDonHang();
	}
	public int deleteGioHang(int id_sp) {
		return thanhToanDao.DeleteGioHang(id_sp);
	}

}
