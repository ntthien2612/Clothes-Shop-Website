package ClothesShop.Service.Admin;

import java.util.List;

import ClothesShop.Entity.DanhMuc;

public interface IDanhMuc {
	public int AddDanhMuc(DanhMuc danhmuc);
	public int XoaDanhMuc(int id);
	
	public List<DanhMuc> GetDataSuaDanhMuc(int id_chinhsua);
	public int ChinhSuaDanhMuc(DanhMuc danhmuc);
	
}
