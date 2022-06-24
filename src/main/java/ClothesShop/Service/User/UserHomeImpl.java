package ClothesShop.Service.User;

import java.util.List;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;

=======
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.DanhMucDao;
<<<<<<< HEAD
import ClothesShop.Dao.GioHangDao;
import ClothesShop.Dao.SanPhamDao;
import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
=======
import ClothesShop.Dao.SanPhamDao;
import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
import ClothesShop.Entity.SanPham;
@Service
public class UserHomeImpl implements UserIHome{
	@Autowired
	private SanPhamDao sanphamDao;
	@Autowired
	private DanhMucDao danhmucDao;
<<<<<<< HEAD
	@Autowired
	private GioHangDao giohangDao;
	public List<SanPham> GetDataSanPham() {
		return sanphamDao.GetDataSanPham();
	}
=======
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
	
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
	public List<DanhMuc> GetDataDanhMuc() {
		return danhmucDao.GetDataDanhMuc();
	}
	public List<SanPham> GetDataChiTiet(int id) {
		return sanphamDao.GetDataChiTiet(id);
	}
	public List<ChiTietSanPham> GetDataSizeChiTiet(int id) {
		return sanphamDao.GetDataSizeChiTiet(id);
	}
//	public List<SanPham> GetDataSanPhamTimKiem(String ten_sp) {
//		return sanphamDao.GetDataSanPhamTimKiem(ten_sp);
//	}
<<<<<<< HEAD
//	public List<GioHang>  GetGioHang() {
//		return giohangDao.GetGioHang();
//	}
//	
=======
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
	
}
