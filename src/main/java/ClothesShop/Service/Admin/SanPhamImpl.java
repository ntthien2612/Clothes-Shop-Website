package ClothesShop.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.SanPhamDao;
import ClothesShop.Entity.SanPham;
import ClothesShop.Service.Admin.ISanPham;
@Service
public class SanPhamImpl implements ISanPham{
	@Autowired
	SanPhamDao sanphamDao = new SanPhamDao();
	
	public int AddSanPham(SanPham sanpham) {
		return sanphamDao.AddSanPham(sanpham);
	}
}
