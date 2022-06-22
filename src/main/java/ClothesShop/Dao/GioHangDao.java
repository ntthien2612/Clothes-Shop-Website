//package ClothesShop.Dao;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import ClothesShop.Dto.CartDto;
//import ClothesShop.Dto.SanPham;
//@Repository
//public class GioHangDao extends BaseDao{
//	
//	@Autowired
//	SanPhamDao productsDao = new SanPhamDao();
//	
//	public HashMap<Long, GioHang> AddCart(long id, HashMap<Long, GioHang> cart) {
//		GioHang itemCart = new GioHang();
//		SanPham product = productsDao.FindProductByID(id);
//		if(product != null && cart.containsKey(id)) {
//			itemCart = cart.get(id);
//			itemCart.setQuanty(itemCart.getQuanty() + 1);
//			itemCart.setTotalPrice(itemCart.getQuanty() * itemCart.getProduct().getGia());
//			
//		}
//		else {
//			itemCart.setProduct(product);
//			itemCart.setQuanty(1);
//			itemCart.setTotalPrice(product.getGia());
//		}
//		cart.put(id, itemCart);
//		return cart;
//	}
//	
//	public HashMap<Long, GioHang> EditCart(long id, int quanty, HashMap<Long, GioHang> cart) {
//		if(cart == null) {
//			return cart;
//		}
//		GioHang itemCart = new GioHang();
//		if(cart.containsKey(id)) {
//			itemCart = cart.get(id);
//			itemCart.setQuanty(quanty);
//			double totalPrice = quanty * itemCart.getProduct().getGia();
//			itemCart.setTotalPrice(totalPrice);
//		}
//		cart.put(id, itemCart);
//		return cart;
//	}
//	
//	public HashMap<Long, GioHang> DeleteCart(long id, HashMap<Long, GioHang> cart) {
//		if(cart == null) {
//			return cart;
//		}
//		if(cart.containsKey(id)) {
//			cart.remove(id);
//		}
//		return cart;
//	}
//	
//	public int TotalQuanty(HashMap<Long, GioHang> cart) {
//		int totalQuanty = 0;
//		for(Map.Entry<Long, GioHang> itemCart : cart.entrySet()) {
//			totalQuanty += itemCart.getValue().getQuanty();
//		}
//		return totalQuanty;
//	}
//	
//	public double TotalPrice(HashMap<Long, GioHang> cart) {
//		double totalPrice = 0;
//		for(Map.Entry<Long, GioHang> itemCart : cart.entrySet()) {
//			totalPrice += itemCart.getValue().getTotalPrice();
//		}
//		return totalPrice;
//	}
//	public double Price(HashMap<Long, GioHang> cart) {
//		double Price = 0;
//		for(Map.Entry<Long, GioHang> itemCart : cart.entrySet()) {
//			Price = itemCart.getValue().getProduct().getGia();
//		}
//		return Price;
//	}
//	
//
//
//	
//}