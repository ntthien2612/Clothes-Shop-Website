package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.ThanhToanDao;
import ClothesShop.Service.Admin.IDanhMuc;

@Service
public class ThanhToanImpl implements IThanhToan{
@Autowired
ThanhToanDao thanhtoanDao;
public List<String[]> MuaHang(String[] id) {
	return thanhtoanDao.MuaHang(id);
}

}
