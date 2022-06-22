package ClothesShop.Entity;

import org.springframework.web.multipart.MultipartFile;

public class SanPham {
	private int id_sp;
	private int id_dm;
	private String ten_sp;
	private String hinhanh;
	private int gia;
	private String mota;
	public SanPham() {
		super();
	}
	public int getId_sp() {
		return id_sp;
	}
	public void setId_sp(int id_sp) {
		this.id_sp = id_sp;
	}
	public int getId_dm() {
		return id_dm;
	}
	public void setId_dm(int id_dm) {
		this.id_dm = id_dm;
	}
	public String getTen_sp() {
		return ten_sp;
	}
	public void setTen_sp(String ten_sp) {
		this.ten_sp = ten_sp;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	
	
}
