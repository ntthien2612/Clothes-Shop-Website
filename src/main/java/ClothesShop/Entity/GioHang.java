package ClothesShop.Entity;

public class GioHang {
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
	
}