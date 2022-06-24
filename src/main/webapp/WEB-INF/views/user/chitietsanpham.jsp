<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<<<<<<< HEAD

<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
=======
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chi Tiết</title>
</head>
<body>
	<c:forEach var="sanpham" items="${sanpham }" varStatus="index">
	<div style="float: left; width: 40%; height: 40%;">
	<img style="width: 400px; height: 400px; border-radius: 10px"
					src="<c:url value= "${sanpham.hinhanh }"/>">
	</div>
	<div style="width: 58%; float: right">
	<b>Tên sản phẩm: </b>${sanpham.ten_sp }</br>
	<b>Giá sản phẩm: </b>${sanpham.gia }<br>
<<<<<<< HEAD
	<form action="themgiohang" method="post" modelAttribute="giohang">
	<input value="${LoginInfo.id_kh}" hidden name="id_kh">
	<input value="${sanpham.id_sp }" hidden name="id_sp">
=======
	<form action="themgiohang" method="get">
	<input value="${sanpham.id_sp }" hidden name="id_them">
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
	<b>Size: </b>
	<select name="size" style="width: 50px; height: 20px;padding: 0; margin: 0;">
	<c:forEach var="chitietsanpham" items="${chitietsanpham}" varStatus="index">
	<option>${chitietsanpham.size }</option></c:forEach>
	</select></br>
	<b>Mô tả sản phẩm: </b>	${sanpham.mota }</br>
	<b>Số lượng: </b>
<<<<<<< HEAD
	<input type="number" name="soluong_them" min="1" value="1" style="height: 30px; padding: 0; margin: 0; border-radius: 10px">
=======
	<input type="number" name="soluongthem" min="1" value="1" style="height: 30px; padding: 0; margin: 0; border-radius: 10px">
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
	<input type="submit" value="Thêm giỏ hàng" style="height: 30px; padding: 0; margin: 0; background: blue; color: white; border: none; border-radius: 10px">
	</form>
	</div>
</c:forEach>
	<p style="clear: both"></p>
</body>
</html>