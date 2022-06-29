<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi Tiết</title>
</head>
<body>
	<c:forEach var="sanpham" items="${sanpham }" varStatus="index">
	<div style="float: left; width: 40%; height: 40%;">
	<img style="width: 400px; height: 400px; border-radius: 10px"
					src="<c:url value= "/assets/user/img/${sanpham.hinhanh }"/>">
	</div>
	<div style="width: 58%; float: right">
	<b>Tên sản phẩm: </b>${sanpham.ten_sp }</br>
	<b>Giá sản phẩm: </b>${sanpham.gia }<br>
	<form action="themgiohang" method="post" modelAttribute="giohang">
	<input value="${LoginInfo.id_kh}" hidden name="id_kh">
	<input value="${sanpham.id_sp }" hidden name="id_sp">
	<b>Size: </b>
	<select name="size" style="width: 50px; height: 20px;padding: 0; margin: 0;">
	<c:forEach var="chitietsanpham" items="${chitietsanpham}" varStatus="index">
	<option>${chitietsanpham.size }</option></c:forEach>
	</select></br>
	<b>Mô tả sản phẩm: </b>	${sanpham.mota }</br>
	<b>Số lượng: </b>
	
	<input type="number" name="soluong_them" min="1" value="1" style="height: 30px; padding: 0; margin: 0; border-radius: 10px">
	
	<!-- <button type="submit" style="height: 30px; padding: 0; margin: 0; background: blue; color: white; border: none; border-radius: 10px">Thêm giỏ hàng</button>
	 -->
	 <c:if test="${not empty LoginInfo }">
		<button type="submit" style="height: 30px; padding: 0; margin: 0; background: blue; color: white; border: none; border-radius: 10px">Thêm giỏ hàng</button>
		</c:if>
	<c:if test="${ empty LoginInfo }">
		<button style="height: 30px; padding: 0; margin: 0; background: blue; color: white; border: none; border-radius: 10px">
		<a href="<c:url value="/dang-nhap" />" style="color:white">Thêm giỏ hàng</a></button>
		</c:if>
	</form>
	</div>
</c:forEach>
	<p style="clear: both"></p>
</body>
</html>