package ClothesShop.Entity;

import java.util.Date;

public class NhatKy {
private int id;
private int id_dh;
private Date thoigianupdate;
private String trangthai;
public NhatKy() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getId_dh() {
	return id_dh;
}
public void setId_dh(int id_dh) {
	this.id_dh = id_dh;
}
public Date getThoigianupdate() {
	return thoigianupdate;
}
public void setThoigianupdate(Date thoigianupdate) {
	this.thoigianupdate = thoigianupdate;
}
public String getTrangthai() {
	return trangthai;
}
public void setTrangthai(String trangthai) {
	this.trangthai = trangthai;
}

}
