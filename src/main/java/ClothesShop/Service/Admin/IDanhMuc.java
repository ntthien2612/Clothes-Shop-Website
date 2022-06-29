package ClothesShop.Service.Admin;

import java.util.List;

import ClothesShop.Entity.DanhMuc;

public interface IDanhMuc {
	public int AddDanhMuc(DanhMuc danhmuc);
	public List<DanhMuc> GetDataXoaDanhMuc(int id_xoa);
	public List<DanhMuc> GetDataHienDanhMuc();
	public List<DanhMuc> GetDataSuaDanhMuc(int id_chinhsua);
	public int ChinhSuaDanhMuc(DanhMuc danhmuc);
	public int Count(String tendm);
}
