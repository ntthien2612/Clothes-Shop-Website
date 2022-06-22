package ClothesShop.Entity;

public class ChiTietSanPham {
	private int id_sp;
	private int soluong;
	private String size;
	public ChiTietSanPham() {
		super();
	}
	public int getId_sp() {
		return id_sp;
	}
	public void setId_sp(int id_sp) {
		this.id_sp = id_sp;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
