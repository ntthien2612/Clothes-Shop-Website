package ClothesShop.Service.User;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Dao.GioHangDao;
import ClothesShop.Dao.SanPhamDao;
import ClothesShop.Dao.UsersDao;
import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
import ClothesShop.Entity.SanPham;
import ClothesShop.Entity.Users;
@Service
public class UserHomeImpl implements UserIHome{
	@Autowired
	private SanPhamDao sanphamDao;
	@Autowired
	private DanhMucDao danhmucDao;
	
	@Autowired
	private UsersDao usersDao;
	@Autowired
	private GioHangDao giohangDao;
	
	
	public List<SanPham> GetDataSanPham() {
		return sanphamDao.GetDataSanPham();
	}
	
	//khai bao get san pham theo doanh muc
		public List<SanPham> GetDataSanPham(int id) {
			return sanphamDao.GetDataSanPham(id);
		}
//		tim kiem san pham theo ten
		public List<SanPham> GetDataSanPham(String noidung) {
			return sanphamDao.GetDataSanPham(noidung);
		}
	
	public List<DanhMuc> GetDataDanhMuc() {
		return danhmucDao.GetDataDanhMuc();
	}
	public List<SanPham> GetDataChiTiet(int id) {
		return sanphamDao.GetDataChiTiet(id);
	}
	public List<ChiTietSanPham> GetDataSizeChiTiet(int id) {
		return sanphamDao.GetDataSizeChiTiet(id);
	}
	
	
	public List<Users> GetDataChiTietKhachHang(int id_kh) {
		return usersDao.GetDataChiTietKhachHang(id_kh);
	}
	
	public int ChinhSuaKhachHang(Users khachhang) {
		return usersDao.ChinhSuaKhachHang(khachhang);
	}
	
}
