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
				<a class="nav-link" href="#"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Phản Hồi
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydonhang"> <i
					class="bi bi-bar-chart-line"></i> Báo Cáo Doanh Thu
				</a>
			</p>
		</div>
		<div class="col-sm-10 text-left">
			<div style="float: left; width: 49%; height: 100%">
				<h1>
					<b>Thêm sản phẩm</b>
				</h1>
				<hr>
				<form:form action="quanlysanpham" method="POST" modelAttribute="sanpham" enctype="multipart/form-data">
					<table style="height: 250px">
						<tr>
							<td><b>Tên sản phẩm: </b></td>
							<td><form:input type="text" path="ten_sp" /></td>
						</tr>
						<tr>
							<td><b>Danh mục sản phẩm: </b></td>
							<td><form:select path="id_dm">
									<c:forEach var="danhmuc" items="${danhmuc }" varStatus="index">
										<option value="${danhmuc.id_dm }">${danhmuc.ten_dm }</option>
									</c:forEach>
								</form:select></td>
						</tr>
						<tr>
							<td><b>Giá sản phẩm: </b></td>
							<td><form:input type="text" path="gia" /></td>
						</tr>
						<tr>
							<td><b>Hình sản phẩm: </b></td>
							<td><form:input type="file" path="hinhanh" /></td>
						</tr>
						<tr>
							<td><b>Mô tả sản phẩm: </b></td>
							<td><form:textarea type="text" path="mota" style="resize: none"></form:textarea></td>
						</tr>
						<tr>
							<td></td>
							<td><button type="submit" class="btn block">Lưu</button>
							<button type="reset" class="btn block">Reset</button></td>
						</tr>
					</table>
				</form:form>
			</div>
			<div style="float: right; width: 49%; height: 100%">


				<h1>
					<b>Thêm chi tiết sản phẩm</b>
				</h1>
				<hr>
				<form action="themchitietsanpham" method="post"
					enctype="multipart/form-data">
					<table  style="height: 150px">
						<tr>
							<td><b>Tên sản phẩm: </b></td>
							<td><input type="text" path="tensp"></td>
						</tr>
						<tr>
							<td><b>Size sản phẩm: </b></td>
							<td><input type="text" path="sizesp"></td>
						</tr>
						<tr>
							<td><b>Số lượng sản phẩm: </b></td>
							<td><input type="text" path="soluongsp"></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="Lưu"><input
								type="reset" value="Reset" style="margin-left: 10px"></td>
						</tr>
					</table>
				</form>
			</div>
			<p style="clear: both"></p>

		</div>
	</div>
</div>