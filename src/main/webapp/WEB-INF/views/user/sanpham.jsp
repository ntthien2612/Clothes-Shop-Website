<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sản Phẩm</title>
</head>
<body>

	<div style="margin-bottom: 300px">

			<div class="well well-small">
			<form action="sanpham" method="get">
			<select name="id" onchange="this.form.submit()">
				
				<c:forEach var="tendanhmuc" items="${tendanhmuc}"
									varStatus="index">
									<option value="${tendanhmuc.id_dm }">${tendanhmuc.ten_dm }</option>
								</c:forEach>
								<c:forEach var="danhmuc" items="${danhmuc }" varStatus="index">
				<option value="${danhmuc.id_dm }">${danhmuc.ten_dm }</option>
				</c:forEach>
				
				</select>
				</form>
				
			</div>

		<c:forEach var="sanpham" items="${sanpham }" varStatus="index">
			<div>
				<ul style="list-style: none;">
					<li
						style="width: 150px; height: 320px; float: left; margin: 10px; border: 1px solid blue; border-radius: 10px">
						<img style="width: 100%; height: 170px; border-radius: 10px"
						src="<c:url value= "image/${sanpham.hinhanh}"/>">
						<p
							style="color: #000; text-align: center; font-size: 12px; height: 50px; margin-top: 15px">
							<b> ${sanpham.ten_sp } </b>
						</p>
						<p style="color: red; text-align: center; height: 30px;">
							<b>Giá: ${sanpham.gia } VND</b>
						</p>
						<p style="text-align: center;">
							<a href="./chitietsanpham?id=${sanpham.id_sp }"><button
									style="border: none; width: 100px; font-weight: border; border-radius: 10px; background: #02b702; color: white">Chi tiết</button></a>
						</p>
					</li>
				</ul>
			</div>
		</c:forEach>
		<p style="clear: both"></p>

	</div>


</body>
</html>