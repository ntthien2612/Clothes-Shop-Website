<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp" %>   
<head>
<title>Thanh Toán</title>
</head>
<body>
<div class="row">
	<div class="span12">
	<div class="well well-small">
	<hr class="soften"/>	
<h1 style="text-align: center"><b>Chi Tiết Đơn Hàng</b></h1>
<p><b>Thông tin khách hàng:</b></p>
 <table class="table table-bordered table-hover" style="margin-top: 20px;">
			<tr>
				<th style="width: 150px">Họ & Tên: </th>
				<td>${LoginInfo.ten_kh}</td>
			</tr>
			<tr>
				<th>Email: </th>
				<td>${LoginInfo.email_kh}</td>
			</tr>
			<tr>
				<th>Địa Chỉ: </th>
				<td>${LoginInfo.diachi}</td>
			</tr>
			<tr>
				<th>Phone: </th>
				<td>${LoginInfo.sdt}</td>
			</tr>
		</table>
<p><b>Thông tin mua hàng:</b></p>
	<table class="table table-bordered table-condensed">
              <thead>
                <tr>
                  <th style="width: 70px">Hình ảnh</th>
                  <th>Tên Sản Phẩm</th>
                  <th>Size</th>
                  <th>Giá bán</th>
                  <th>Số lượng </th>
                  <th>Tổng tiền</th>
				</tr>
              </thead>
              <tbody>
              <form action="muahang" method="get" modelAttribute="donhang">
				<c:forEach var="giohang" items="${ giohang }">
					<tr>
					<td><img style="width: 70px; height: 70px;"
						src="<c:url value= "/assets/user/img/${giohang[4] }"/>"></td>
	                  <td>${giohang[2] }</td>
	                  <td>${giohang[6] }</td>
	                  <td>${giohang[3] }</td>
	                  <td>${giohang[7] }</td>
	                  <td>${giohang[7] * giohang[3] } ₫</td>
	               
	                </tr>
				</c:forEach>
				</tbody>
            </table><br/>
</div>
</div>
</div>
</body>
