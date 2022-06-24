<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="topNav">
			<div class="container">
				<div class="alignR">
					<div class="pull-left socialNw">
						<a href="#"><span class="icon-twitter"></span></a> <a href="#"><span
							class="icon-facebook"></span></a> <a href="#"><span
							class="icon-youtube"></span></a> <a href="#"><span
							class="icon-tumblr"></span></a>
					</div>
<<<<<<< HEAD
					<a class="" href="./"> <span class="icon-home"></span>
						Trang chủ
					</a> 
					<c:if test="${ empty LoginInfo }">
					<a href="<c:url value="/dang-ky" />"><span class="icon-edit"></span>
						Đăng ký </a>
					</c:if>
					<c:if test="${ empty LoginInfo }">
					<a href="<c:url value="/dang-nhap" />"><span class="icon-edit"></span>
						Đăng nhập </a>
					</c:if>
					<c:if test="${ not empty LoginInfo }">
					<a href="./chi-tiet-khach-hang?id_kh=${LoginInfo.id_kh}"><span class="icon-user"></span> ${ LoginInfo.ten_kh }</a>
					<a href="<c:url value="/dang-xuat/" />"> <span
						class="icon-edit"></span> Đăng xuất
					</a>
					<script>
				function abc(){
		              document.getElementById("item").submit();
		          }
				</script>
				<span class="btn btn-mini" onclick="return abc()"><span class="icon-shopping-cart" onclick="return abc()" style="color: red"> ${count} sản phẩm</span>
				</span>
				<form action="giohang" method="get" id="item" modelAttribute="giohang">
				<input name="id_kh" value="${LoginInfo.id_kh}" hidden>
				</form>
				</c:if>
					
=======
					<a class="active" href="./"> <span class="icon-home"></span>
						Trang chủ
					</a> <a href="#"><span class="icon-user"></span> My Account</a>
					 <a href="cart.html"><span class="icon-shopping-cart"></span> 2 Item(s)</a>
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
				</div>
			</div>
		</div>
	</div>
<header id="header">
	<div class="row">
		<div class="span4">
			<h1
<<<<<<< HEAD
				style="color: Blue; text-shadow: yellow 2px -1px 3px, white -2px 1px 2px; position: relative; font-size: 50px; padding-top: 3%;">
=======
				style="color: #ee4d2d; text-shadow: yellow 2px -1px 3px, white -2px 1px 2px; position: relative; font-size: 50px; padding-top: 3%;">
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
				ClothesShop</h1>
		</div>
		<div class="span4">
			<div>
				<marquee
					style="padding: 10px;height: 50px; font-size: 30px;margin-top: 5%; color: Blue; text-shadow: yellow 2px -1px 3px, white -2px 1px 2px; position: relative;">ClothesShop
					mang sự tự tin, thoải mái cho phái mạnh</marquee>
			</div>
		</div>
		<div class="span4 alignR">
			<p>
<<<<<<< HEAD
				<br> <strong> Support (24/7) : 0800 1234 678 </strong><br>
=======
				<br> <strong>Nhóm 05 </strong><br>
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
				<br>
			</p>
			<span class="btn btn-mini">[ 2 ] <span
				class="icon-shopping-cart"></span></span> <span
				class="btn btn-warning btn-mini">$</span> <span class="btn btn-mini">&pound;</span>
			<span class="btn btn-mini">&euro;</span>
		</div>
	</div>
</header>

<!--
Navigation Bar Section 
-->
<div class="navbar">
	<div class="navbar-inner">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="nav-collapse">
				<ul class="nav">
<<<<<<< HEAD
					<li class=""><a href="./">Trang chủ </a></li>
					<li class=""><a href="./sanpham">Sản phẩm</a></li>
					<c:if test="${ not empty LoginInfo }">
					<li class=""><a href="./donhang">Đơn hàng</a></li>
					</c:if>
				</ul>
				
				<form action="timkiem" method="GET" modelAttribute="sanpham" class="navbar-search pull-left" style="margin-left: 25%;">
					<input type="text" placeholder="Search" class="search-query span2" name="ten_sp" />
					<button type="submit">Tìm</button>
				</form>
				
				
=======
					<li class="active"><a href="./">Trang chủ </a></li>
					<li class=""><a href="./sanpham">Sản phẩm</a></li>
				</ul>
				<!--Tìm kiếm sản phẩm -->
				<form action="sanpham" class="navbar-search pull-left" style="margin-left: 20%; " modelAttribute="sanpham">
					<input type="text" placeholder="Search" class="search-query span2" name="noidung">
					<input type="submit" value="Tìm" style="padding: 3px">
				</form>
				
				<ul class="nav pull-right"style="float: right;">
				<li><a href="./dang-ky"><span class="fa fa-sign-in"></span>
							Đăng ký </a></li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"><span class="icon-lock"></span>
							Đăng nhập <b class="caret"></b></a>
						<div class="dropdown-menu">
							<form class="form-horizontal loginFrm">
								<div class="control-group">
									<input type="text" class="span2" id="inputEmail"
										placeholder="Email">
								</div>
								<div class="control-group">
									<input type="password" class="span2" id="inputPassword"
										placeholder="Password">
								</div>
								<div class="control-group">
									<label class="checkbox"> <input type="checkbox">
										Remember me
									</label>
									<button type="submit" class="shopBtn btn-block">Sign
										in</button>
								</div>
							</form>
						</div></li>
				</ul>
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
			</div>
		</div>
	</div>
</div>
