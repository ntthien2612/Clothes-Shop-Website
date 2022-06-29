<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<div class="container-fluid text-center" style="border: 1px solid black">
	<div class="row content">
		<div class="col-sm-2 sidenav" style="text-align: left;height:150%">
			<p>
				<a class="nav-link active" href="./"> <i
					class="bi bi-house-fill"></i> Trang Chủ
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydanhmucSP"> <i
					class="bi bi-folder"></i> Danh Mục Sản Phẩm
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlysanpham"> <i
					class="bi bi-file-earmark-text"></i> Sản Phẩm
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydonhang"> <i
					class="bi bi-minecart"></i> Quản Lý Đơn Hàng
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlynguoidung"> <i
					class="bi bi-people-fill"></i> Quản Lý Người Dùng
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlynhanvien"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Nhân Viên
				</a>
			</p>
			<p>
				<a class="nav-link" href="baocao"> <i
					class="bi bi-bar-chart-line"></i> Báo Cáo
				</a>
			</p>
		</div>
		<div class="col-sm-10 text-left">
				<h1 style="text-align: center">
		<b>Chỉnh sửa sản phẩm</b>
	</h1><hr>
	<form action="chinhsua" method="POST" modelAttribute="sanpham" enctype="multipart/form-data">
		<c:forEach var="edit_sanpham" items="${edit_sanpham}" varStatus="index">
		<table style="width: 60%; margin-left: 20%; height: 300px">
		<tr><td style="width: 25%"><b>Tên sản phẩm: </b></td>
		<input type="text" name="id_sp" value="${edit_sanpham[0] }" hidden/>
		<td><textarea name="ten_sp" style="resize: none;width: 100%" required>${edit_sanpham[2] }</textarea></td></tr>
		<tr><td><b>Danh mục: </b></td>
		<td><select name="id_dm" style="width: 100%; height: 30px">
				<option value="${edit_sanpham[1] }">${edit_sanpham[6] }</option>
			<c:forEach var="danhmuc" items="${danhmuc }" varStatus="index">
				<option value="${danhmuc.id_dm }">${danhmuc.ten_dm }</option>
			</c:forEach>
		</select></td></tr>
		<tr ><td><b>Giá sản phẩm: </b></td>
		<td><input type="text" name="gia" value="${edit_sanpham[3] }" style="width: 100%" required></td></tr>
		<tr><td><b>Hình sản phẩm: </b></td>
		<td><img style="width: 100px; height: 100px; border-radius: 10px" src="<c:url value= "/image/${edit_sanpham[4] }"/>"><input 
		 name="image" type="file" path="hinhanh" /></td></tr>

		<tr><td><b>Mô tả sản phẩm: </b></td>
		<td><textarea name="mota" style="resize: none; width: 100%;" required>${edit_sanpham[5] }</textarea></td></tr>
		<tr><td></td><td><button type="submit">Lưu</button></td></tr>
		</table>
		</c:forEach>
	</form>

		</div>
	</div>
</div>