<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<div class="container-fluid text-center" style="border: 1px solid black">    
  <div class="row content">
    <div class="col-sm-2 sidenav" style="text-align: left;height:150%">
      <p><a class="nav-link active" href="./">
              <i class="bi bi-house-fill"></i>
              Trang Chủ
            </a></p>
      <p><a class="nav-link" href="quanlydanhmucSP">
              <i class="bi bi-folder"></i>
              Danh Mục Sản Phẩm
            </a></p>
      <p><a class="nav-link" href="quanlysanpham">
              <i class="bi bi-file-earmark-text"></i>
              Sản Phẩm
            </a></p>
            <p><a class="nav-link" href="quanlydonhang">
              <i class="bi bi-minecart"></i>
              Quản Lý Đơn Hàng
            </a></p>
            <p><a class="nav-link" href="quanlynguoidung">
              <i class="bi bi-people-fill"></i>
              Quản Lý Người Dùng
            </a></p>
            <p>
				<a class="nav-link" href="quanlynhanvien"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Nhân Viên
				</a>
			</p>
            <p><a class="nav-link" href="baocao">
              <i class="bi bi-bar-chart-line"></i>
              Báo Cáo
            </a></p>
    </div>
    <div class="col-sm-10 text-left" > 
    <h1 style="text-align: center"><b>Danh sách khách hàng</b></h1>
    <form action="timkiem" method="GET">
    <input type="text" placeholder="Nhập tên khách hàng" name="tenkh" style="width: 40%; margin-left: 10%; margin-bottom: 1%;" onchange="this.form.submit()">
    <button type="submit">Tìm</button>
    </form>
    <table border="1" style="width: 80%; margin-left: 10%;">
    <tr ><th  style="text-align:center">ID</th><th  style="text-align:center">Tên khách hàng</th><th  style="text-align:center">Email</th><th style="text-align:center">Số điện thoại</th><th style="text-align:center">Địa chỉ</th></tr>
    
    <c:forEach var="nguoidung" items="${nguoidung}" varStatus="index">
    <tr><td style="text-align:center">${nguoidung.id_kh }</td><td>${nguoidung.ten_kh }</td><td>${nguoidung.email_kh }</td><td>${nguoidung.sdt }</td><td>${nguoidung.diachi }</td></tr>
    </c:forEach>
    
    <c:forEach var="khachhang" items="${khachhang}" varStatus="index">
    <tr><td  style="text-align:center">${khachhang.id_kh }</td><td>${khachhang.ten_kh }</td><td>${khachhang.email_kh }</td><td>${khachhang.sdt }</td><td>${khachhang.diachi }</td></tr>
    </c:forEach>
    
    </table>
    </div>
  </div>
</div>