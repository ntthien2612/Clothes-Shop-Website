package ClothesShop.Entity;

import java.sql.Date;
import java.sql.Timestamp;

public class DonHang {
	private int id_dh;
	private int id_kh;
	private Timestamp thoigian_mua;
	private int tongtien;
	private String trangthai;
	private String ten_kh;
	private String email_kh;
	private String sdt;
	private String diachi;
	public DonHang() {
		super();
	}
	public int getId_dh() {
		return id_dh;
	}
	public void setId_dh(int id_dh) {
		this.id_dh = id_dh;
	}
	public int getId_kh() {
		return id_kh;
	}
	public void setId_kh(int id_kh) {
		this.id_kh = id_kh;
	}
	public Timestamp getThoigian_mua() {
		return thoigian_mua;
	}
	public void setThoigian_mua(Timestamp thoigian_mua) {
		this.thoigian_mua = thoigian_mua;
	}
	public int getTongtien() {
		return tongtien;
	}
	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getTen_kh() {
		return ten_kh;
	}
	public void setTen_kh(String ten_kh) {
		this.ten_kh = ten_kh;
	}
	public String getEmail_kh() {
		return email_kh;
	}
	public void setEmail_kh(String email_kh) {
		this.email_kh = email_kh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	
}
