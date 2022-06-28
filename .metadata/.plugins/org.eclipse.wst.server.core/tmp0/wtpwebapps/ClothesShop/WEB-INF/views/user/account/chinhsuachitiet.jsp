<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chỉnh Sửa Chi Tiết Khách Hàng</title>
</head>
<body>
	<c:if test="${ not empty LoginInfo }">
		<c:forEach var="khachhang" items="${khachhang}" varStatus="index">
			<div
				style="float: left; width: 300px; height: 300px; margin-left: 10%;">
				<img style="border-radius: 50%"
					src="<c:url value= "https://kenh14cdn.com/thumb_w/600/2016/f2-1453528942693.jpg"/>">
			</div>

			<div
				style="width: 45%; float: right; height: 450px; font-size: 20px; margin-right: 5%;">
				<h2 style="color: blue; text-align: center;">THÔNG TIN KHÁCH
					HÀNG</h2>
				<h2 style="color: blue; text-align: center;">${khachhang.ten_kh }</h2>
				<form action="luuchinhsuachitietkhachhang" method="POST" modelAttribute="khachhang">
					<c:if test="${not empty notification}">
						<p style="color: red; font-size: 16px; text-align: center;"><i>${notification }</i></p>
						<%session.setAttribute("notification", null); %>
					</c:if>		
					<b>Tên Khách Hàng:
						<td><input type="text" name="ten_kh" 
							value="${khachhang.ten_kh }" style="width: 400px" /></td>
					<br> <b>Email: <br>
							<td><input type="text" name="email_kh" disabled="disabled"
								value="${khachhang.email_kh }" style="width: 400px" /></td>
						<br> <b>Địa Chỉ: <br>
								<td><input type="text" name="diachi"
									value="${khachhang.diachi }" style="width: 400px" /></td>
							<br> <b>Số Điện Thoại: <br>
									<td><input type="text" name="sdt"
										value="${khachhang.sdt }" style="width: 400px" /></td>
								<br>
									<tr>
										<td><input type="text" name="id_kh"
											value="${khachhang.id_kh}" style="visibility: hidden; width: 280px;" /></td>
									
									
								<td><button type="submit" class="btn block">Lưu</button>
										<button type="reset" class="btn block">Reset</button></td></tr>
				</form>
			</div>
		</c:forEach>
	</c:if>
	
	<p style="clear: both"></p>
</body>
</html>