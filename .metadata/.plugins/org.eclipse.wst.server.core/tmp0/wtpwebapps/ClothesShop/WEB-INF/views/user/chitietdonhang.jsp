<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
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
=======
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang thanh toán</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<h1 style="text-align: center"><b>Đơn hàng</b></h1>
<p>Người nhận: </p>
<p>Số điện thoại: </p>
<p>Địa chỉ nhận hàng: </p>
<div class="container">
  <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo">Thay đổi</button>
  <div id="demo" class="collapse">
   <form action="/doithongtin/" method="post">
       <input type="text" name="tenup" value="" placeholder="Cập nhật tên người nhận">
       <input type="text" name="sdtup" value="" placeholder="Cập nhật số điện thoại ">
       <input type="text" name="diachiup" value="" placeholder="Cập nhật địa chỉ nhận">
       <button type="submit" class="collapsible">Lưu</button>
     </form>
  </div>
</div>
</body>
</html>
>>>>>>> 7eec99238d933f9b96258fa63ed27dbec064ad08
