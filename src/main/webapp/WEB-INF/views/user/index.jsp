<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<title>Trang Chủ</title>
<body>
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
				<c:forEach var="danhmuc" items="${danhmuc }" varStatus="index">
<<<<<<< HEAD
					<li><a href="products.html"><span
=======
					<li><a href="./sanpham?id=${danhmuc.id_dm }"><span
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
							class="icon-chevron-right"></span>${danhmuc.ten_dm }</a></li>
				</c:forEach>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img
					src="<c:url value="/assets/user/img/paypal.jpg"/>"
					alt="payment method paypal"></a>
			</div>

		</div>
		<div class="span9">
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">
					<div class="carousel-inner">
					<c:forEach var="sanpham" items="${sanpham }" varStatus="index">
					<c:if test="${index.first }">
						<div class="item active">
					</c:if>
						<c:if test="${not index.first }">
						<div class="item">
					</c:if>
							<img style="width: 100%"
								src="<c:url value= "${sanpham.hinhanh }"/>"
								alt="bootstrap ecommerce templates">
						</div>
						</c:forEach>
					</div>
					<a class="left carousel-control" href="#myCarousel"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#myCarousel" data-slide="next">&rsaquo;</a>
				</div>
			</div>
			
		</div>
	</div>
</body>
</html>

