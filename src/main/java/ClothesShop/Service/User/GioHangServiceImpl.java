//package ClothesShop.Service.User;
//
//import java.util.HashMap;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ClothesShop.Dao.GioHangDao;
//import ClothesShop.Dto.CartDto;
//
//@Service
//public class GioHangServiceImpl implements IGioHangService{
//	@Autowired
//	private GioHangDao cartDao = new GioHangDao();
//
//	public HashMap<Long, GioHang> AddCart(int id, HashMap<Long, GioHang> cart) {
//		return cartDao.AddCart(id, cart);
//	}
//
//	public HashMap<Long, GioHang> EditCart(int id, int quanty, HashMap<Long, GioHang> cart) {
//		return cartDao.EditCart(id, quanty, cart);
//	}
//
//	public HashMap<Long, GioHang> DeleteCart(int id, HashMap<Long, GioHang> cart) {
//		return cartDao.DeleteCart(id, cart);
//	}
//
//	public int TotalQuanty(HashMap<Long, GioHang> cart) {
//		return cartDao.TotalQuanty(cart);
//	}
//
//	public double TotalPrice(HashMap<Long, GioHang> cart) {
//		return cartDao.TotalPrice(cart);
//	}
//	
//}