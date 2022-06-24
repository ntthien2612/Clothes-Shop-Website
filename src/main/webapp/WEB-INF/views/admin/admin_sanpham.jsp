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
<<<<<<< HEAD
				<form:form action="themsanpham" method="POST" modelAttribute="sanpham" enctype="multipart/form-data">
					<table style="height: 250px">
						<tr>
							<td><b>Tên sản phẩm: </b></td>
							<td><form:input type="text" path="ten_sp" style="width: 100%; height: 30px"/></td>
						</tr>
						<tr>
							<td><b>Danh mục sản phẩm: </b></td>
							<td><form:select path="id_dm" style="width: 100%; height: 30px">
=======
				<form:form action="quanlysanpham" method="POST" modelAttribute="sanpham" enctype="multipart/form-data">
					<table style="height: 250px">
						<tr>
							<td><b>Tên sản phẩm: </b></td>
							<td><form:input type="text" path="ten_sp" /></td>
						</tr>
						<tr>
							<td><b>Danh mục sản phẩm: </b></td>
							<td><form:select path="id_dm">
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
									<c:forEach var="danhmuc" items="${danhmuc }" varStatus="index">
										<option value="${danhmuc.id_dm }">${danhmuc.ten_dm }</option>
									</c:forEach>
								</form:select></td>
						</tr>
						<tr>
							<td><b>Giá sản phẩm: </b></td>
<<<<<<< HEAD
							<td><form:input type="text" path="gia" style="width: 100%; height: 30px"/></td>
=======
							<td><form:input type="text" path="gia" /></td>
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
						</tr>
						<tr>
							<td><b>Hình sản phẩm: </b></td>
							<td><input name="image" type="file" path="hinhanh" /></td>
						</tr>
						<tr>
							<td><b>Mô tả sản phẩm: </b></td>
<<<<<<< HEAD
							<td><form:textarea type="text" path="mota" style="resize: none; width: 100%; height: 30px"></form:textarea></td>
=======
							<td><form:textarea type="text" path="mota" style="resize: none"></form:textarea></td>
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
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
				<form action="themchitietsanpham" method="POST" modelAttribute="chitietsanpham">
					<table style="height: 150px; width: 100%">
						<tr>
							<td style="width: 150px;"><b>Tên sản phẩm: </b></td>
							<td><select name="id_sp" style="width: 100%; height: 30px">
							<c:forEach var="tensanpham" items="${tensanpham}" varStatus="index">
								<option value="${tensanpham.id_sp }" >${tensanpham.ten_sp }</option>
							</c:forEach>
							</select></td>
						</tr>
						<tr>
							<td><b>Size sản phẩm: </b></td>
							<td><select style="width: 100%; height: 30px" name="size">
								<option value="S" >S</option>
								<option value="M" >M</option>
								<option value="L" >L</option>
							</select></td>
						</tr>
						<tr>
							<td><b>Số lượng sản phẩm: </b></td>
							<td><input type="Number" name="soluong" style="width: 100%; height: 30px" min="1" value="1" /></td>
						</tr>
						<tr>
							<td></td>
							<td><button type="submit" class="btn block">Lưu</button>
							<button type="reset" class="btn block">Reset</button></td>
						</tr>
					</table>
				</form>
			</div>
			<c:forEach var="ctsp" items="${ctsp }" varStatus="index">
				<p>${ctsp.soluong }</p>
				<p>${ctsp.id_sp }</p>
				<p>${ctsp.size }</p>
			</c:forEach>
			<p style="clear: both"></p>

		</div>
	</div>
</div>