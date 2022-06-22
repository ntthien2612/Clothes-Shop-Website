package ClothesShop.Entity;

public class DanhMuc {
	private int id_dm;
	private String ten_dm;
	public DanhMuc() {
		super();
	}
	public int getId_dm() {
		return id_dm;
	}
	public void setId_dm(int id_dm) {
		this.id_dm = id_dm;
	}
	public DanhMuc(int id_dm, String ten_dm) {
		super();
		this.id_dm = id_dm;
		this.ten_dm = ten_dm;
	}
	public String getTen_dm() {
		return ten_dm;
	}
	public void setTen_dm(String ten_dm) {
		this.ten_dm = ten_dm;
	}
	
}
