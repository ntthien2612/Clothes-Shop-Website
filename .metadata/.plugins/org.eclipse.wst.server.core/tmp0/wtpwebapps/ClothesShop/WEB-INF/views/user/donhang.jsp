<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="javax.servlet.*,java.text.*"%>
<head>
<title>Đơn hàng</title>
</head>
<body>
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


	<div class="container-fluid text-center"
		style="border: 1px solid black">
		<div class="row content">
			<div class="col-sm-10 text-left">

				<h2>Danh sách đơn hàng</h2>
				<table>
					<tr>
						<th>Mã đơn hàng</th>
						<th>Thời gian đặt hàng</th>
						<th>Tổng số tiền</th>
						<th >Trạng thái đơn hàng</th>
						<th>Chi tiết</th>
					</tr>
					<c:forEach var="donhang" items="${donhang}" varStatus="index">
						<tr>
							<td>${donhang.id_dh }</td>
							<td>${donhang.thoigian_mua}</td>
							<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${donhang.tongtien}" /> ₫</td>
							<td>${donhang.trangthai }</td>
							<td><a href="chitietdonhang?id=${donhang.id_dh }&tongtien=${donhang.tongtien}">Chi
									Tiết</a></td>
						</tr>
					</c:forEach>

				</table>


			</div>
		</div>
	</div>
</body>