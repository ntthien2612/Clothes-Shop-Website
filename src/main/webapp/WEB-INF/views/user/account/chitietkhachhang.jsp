<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi Tiết Khách Hàng</title>
</head>
<body>
	<c:if test="${ not empty LoginInfo }">
		<c:forEach var="khachhang" items="${khachhang}" varStatus="index">
			<div
				style="; float: left; width: 300px; height: 300px; margin-left: 10%;">
				<img style="border-radius: 50%"
					src="<c:url value= "https://kenh14cdn.com/thumb_w/600/2016/f2-1453528942693.jpg"/>">
			</div>

			<div
				style="width: 45%; float: right; height: 400px; font-size: 20px; margin-right: 5%;">
				<h2 style="color: blue; text-align: center;">THÔNG TIN KHÁCH HÀNG</h2>
				<h2 style="color: blue; text-align: center;">${khachhang.ten_kh }</h2>
				<c:if test="${not empty notification}">
						<p style="color: red; font-size: 16px; text-align: center;"><i>${notification }</i></p>
						<%session.setAttribute("notification", null); %>
					</c:if>
				<b>Tên Khách Hàng: </b>${khachhang.ten_kh}</br> <b>Email: </b>${khachhang.email_kh }<br>
				<b>Địa Chỉ: </b> ${khachhang.diachi }</br> <b>Số Điện Thoại: </b>${khachhang.sdt }</br> 
				<a href="./chinh-sua-chi-tiet?id_kh=${LoginInfo.id_kh}"><button style="margin-bottom: 10%; width: 80px; height: 30px; padding: 0; margin: 0; background: blue; color: white; border: none; border-radius: 10px">Chỉnh sửa</button></a>
			
			</div>
		</c:forEach>
	</c:if>
	<p style="clear: both"></p>
</body>
</html>