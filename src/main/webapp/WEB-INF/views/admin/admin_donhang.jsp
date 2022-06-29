<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*,java.text.*" %>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

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
				<a class="nav-link" href="quanlynhanvien"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Nhân Viên
				</a>
			</p>
			<p>
				<a class="nav-link" href="#"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Phản Hồi
				</a>
			</p>
			<p>
				<a class="nav-link" href="baocao"> <i class="bi bi-bar-chart-line"></i>
					Báo Cáo
				</a>
			</p>
		</div>
		<div class="col-sm-10 text-left">

			<h1 style="text-align: center"><b>Danh sách đơn hàng</b></h1><hr>
				<table>
					<tr>
						<th style="text-align: center">ID Đơn hàng</th>
						<th style="text-align: center">Khách hàng</th>
						<th style="text-align: center">Thời gian đặt hàng</th>
						<th style="text-align: center">Tổng số tiền</th>
						<th style="text-align: center" colspan="2">Trạng thái đơn hàng</th>
					</tr>
					<c:forEach var="donhang" items="${donhang}" varStatus="index" >
					<tr>
						<td style="text-align: center">${donhang.id_dh }</td>
						<td style="text-align: center">${donhang.ten_kh }</td>
						<td style="text-align: center">${donhang.thoigian_mua}</td>
						<td style="text-align: center">${donhang.tongtien }</td>
						<td>${donhang.trangthai }
						<c:if test="${donhang.trangthai eq 'Chờ xác nhận'}">
						<a href="xacnhan?don=${donhang.id_dh }"><button>Xác nhận</button></a></c:if>
						</td>
						<td><a href="chitietdonhang?don=${donhang.id_dh }">Chi Tiết</a></td>
					</tr>
	</c:forEach>

				</table>
			

		</div>
	</div>
</div>