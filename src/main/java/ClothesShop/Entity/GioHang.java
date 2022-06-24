package ClothesShop.Entity;

public class GioHang {
<<<<<<< HEAD
	private int id;
	private int id_kh;
	private int id_sp;
	private int soluong_them;
	private String size;
	public GioHang() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_kh() {
		return id_kh;
	}
	public void setId_kh(int id_kh) {
		this.id_kh = id_kh;
	}
	public int getId_sp() {
		return id_sp;
	}
	public void setId_sp(int id_sp) {
		this.id_sp = id_sp;
	}
	public int getSoluong_them() {
		return soluong_them;
	}
	public void setSoluong_them(int soluong_them) {
		this.soluong_them = soluong_them;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
=======
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
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
}