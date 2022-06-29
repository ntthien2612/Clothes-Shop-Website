<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<meta charset="UTF-8">
<title>thanh toán</title>
</head>
<body>
	<form action="thanhtoan" method="POST" modelAttribute="donhang">
		<div class="row" style="margin-top: 20px; margin-left: 0px">
			<div class="col-md-12">
				<h3>Chi Tiết Đơn Hàng</h3>
			</div>
			<div class="col-md-8 table-responsive">
				<table class="table table-bordered table-hover"
					style="margin-top: 20px;">
					<thead>
						<tr>

							<th>Hình Sản Phẩm</th>
							<th>Tên Sản Phẩm</th>
							<th>Giá</th>
							<th>Số Lượng</th>
							<th>Tổng Giá</th>
						</tr>
					</thead>
					<tbody>

						<%
						int i =0;%>
						<c:forEach var="hienthithanhtoan" items="${ hienthithanhtoan }">

							<tr>
								<td style="width: 15%">
								<img
										style="width: 100%; height: 100%;"
										src="<c:url value= "/image/${hienthithanhtoan[2] }"/>"></td>
								<td >${hienthithanhtoan[3] }</td>
								<input name="soluong<%out.print(i); %>" value="${hienthithanhtoan[5] }" hidden/>
								<input name="id_sp<%out.print(i); %>" value="${hienthithanhtoan[7] }" hidden/>
								<input name="size<%out.print(i); %>" value="${hienthithanhtoan[8] }" hidden/>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${hienthithanhtoan[4]}" /> ₫</td>
								<th>${hienthithanhtoan[5]}</th>
								<th><fmt:formatNumber type="number" groupingUsed="true"
										value="${hienthithanhtoan[6]}" /> ₫</th>
							</tr>
							<% i++;%>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<div class="col-md-4">
				<table class="table " style="margin-top: 20px;">
					<tr>
						<th style="width: 100px">Họ & Tên:</th>
						<td><input name="ten_kh" path="ten_kh"
							style="width: 99%; margin: 0;" type="text"
							value="${LoginInfo.ten_kh }"></td>
						<input name="id_kh" path="id_kh" value="${LoginInfo.id_kh }"
							hidden />
					</tr>
					<tr>
						<th>Email:</th>
						<td><input name="email_kh" path="email_kh"
							style="width: 99%; margin: 0;" type="text"
							value="${LoginInfo.email_kh }"></td>
					</tr>
					<tr>
						<th>Địa Chỉ:</th>
						<td><input name="diachi" path="diachi"
							style="width: 99%; margin: 0;" type="text"
							value="${LoginInfo.diachi}"></td>
					</tr>
					<tr>
						<th>Phone:</th>
						<td><input name="sdt" path="sdt"
							style="width: 99%; margin: 0;" type="text"
							value="${LoginInfo.sdt }"></td>
					</tr>
				</table>
			</div>
			<div>
				<c:forEach var="tongtien" items="${ tongtien }">
					<b>Tổng Tiền: </b>
					<b><fmt:formatNumber type="number" groupingUsed="true"
							value="${tongtien[0] }" /> ₫</b>
					<input name="tongtien" path="tongtien" value="${tongtien[0] }"
							hidden />
				</c:forEach>
				<button type="submit" class="shopBtn btn-large pull-right">
					Thanh Toán <span class="icon-arrow-right"></span>
				</button>
			</div>

		</div>
	</form>
</body>
