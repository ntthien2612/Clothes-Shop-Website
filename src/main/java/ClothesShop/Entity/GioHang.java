package ClothesShop.Entity;

public class GioHang {
	private int quanty;
	private double totalPrice;
	private SanPham product;
	
	public GioHang() {
		
	}
	
	public GioHang(int quanty, double totalPrice, SanPham product) {
		this.quanty = quanty;
		this.totalPrice = totalPrice;
		this.product = product;
	}
	
	public int getQuanty() {
		return quanty;
	}
	
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public SanPham getProduct() {
		return product;
	}
	
	public void setProduct(SanPham product) {
		this.product = product;
	}
}