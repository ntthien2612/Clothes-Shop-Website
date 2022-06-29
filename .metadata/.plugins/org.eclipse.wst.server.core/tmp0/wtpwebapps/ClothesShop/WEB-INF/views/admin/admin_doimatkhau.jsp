<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<div class="container-fluid text-center" style="border: 1px solid black">
	<div class="row content">
		<div class="col-sm-2 sidenav" style="text-align: left">
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
		<b>Chỉnh sửa mật khẩu</b>
	</h1><hr>
	<form action="xulydoimatkhau" method="get" modelAttribute="admin">
		<table style="margin-left: 25%; height: 100px">
		<tr>
		<td><b>Nhập mật khẩu cũ: </b></td>
		<td><input type="password" name="pass_cu"></td></tr>
		<tr>
		<td><b>Nhập mật khẩu mới: </b></td>
		<td><input type="password" name="pass_moi"></td></tr>
		<c:forEach var="layid" items="${layid}" varStatus="index">
		<tr><td><input type="text" name="id" value="${layid.id_ad }" hidden></td>
		</c:forEach>
		<td><input type="submit" value="Lưu"></td></tr>
		</table>
	</form>
		</div>
	</div>
</div>