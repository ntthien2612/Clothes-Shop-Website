<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid text-center" style="border: 1px solid black">    
  <div class="row content">
    <div class="col-sm-2 sidenav" style="text-align: left">
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
            <p><a class="nav-link" href="#">
              <i class="bi bi-question-circle-fill"></i>
              Quản Lý Phản Hồi
            </a></p>
<<<<<<< HEAD
            <p><a class="nav-link" href="baocao">
              <i class="bi bi-bar-chart-line"></i>
              Báo Cáo
=======
            <p><a class="nav-link" href="quanlydonhang">
              <i class="bi bi-bar-chart-line"></i>
              Báo Cáo Doanh Thu
>>>>>>> 7eec99238d933f9b96258fa63ed27dbec064ad08
            </a></p>
    </div>
    <div class="col-sm-10 text-left"> 
    <h1 style="text-align: center"><b>Danh sách sản phẩm</b></h1><hr>
    <a href="./themsanpham"><button style="margin-bottom: 1%;">Thêm sản phẩm</button></a>
    <form action="timsp" method="get" style="margin-bottom: 10px">
    <input type="text" name="ten_sp" placeholder="Vui lòng nhập tên sản phẩm" style="width: 300px" onchange="this.form.submit()">
    <button type="submit">Tìm</button>
    </form>
    <div style="width: 101%;height: 300px;overflow-y: scroll;scroll-behavior: smooth;">
    <table border="1" style="width: 100%">
<tr><th style="text-align: center">Tên sản phẩm</th>
<th style="text-align: center">Danh mục</th>
<th style="text-align: center">Giá</th>
<th style="text-align: center">Hình ảnh</th>
<th style="text-align: center">Mô tả</th>
<th colspan="2" style="text-align: center">Tùy chọn</th>
</tr>

<c:forEach var="danhsachsanpham" items="${danhsachsanpham}" varStatus="index">
<tr>
<td style="width: 20%"><textarea style="width: 100%; height: 100%; border: none; resize: none">${danhsachsanpham[2] }</textarea></td>
<td style="width: 10%;text-align: center">${danhsachsanpham[6] }</td>
<td style="width: 10%;text-align: center">${danhsachsanpham[3] }</td>
<td style="width: 10%"><img style="width: 100%; height: 65px;"
src="<c:url value= "/assets/user/img/${danhsachsanpham[4] }"/>"></td>
<td><textarea style="width: 100%; height: 100%; border: none; resize: none">${danhsachsanpham[5] }</textarea></td>
<td style="width: 10%; text-align: center"><a href="<c:url value='chinhsua_sp?id_chinhsua=${danhsachsanpham[0] }' />">Chỉnh sửa</a></td>
<td style="width: 10%; text-align: center"><a href="<c:url value='xoa_sp?id_xoa=${danhsachsanpham[0] }' />">Xóa</a></td></tr>
</c:forEach>

<c:forEach var="sanphamtim" items="${sanphamtim}" varStatus="index">
<tr>
<td style="width: 20%"><textarea style="width: 100%; height: 100%; border: none; resize: none">${sanphamtim[2] }</textarea></td>
<td style="width: 10%;text-align: center">${sanphamtim[6] }</td>
<td style="width: 10%;text-align: center">${sanphamtim[3] }</td>
<td style="width: 10%"><img style="width: 100%; height: 65px;"
src="<c:url value= "/assets/user/img/${sanphamtim[4] }"/>"></td>
<td><textarea style="width: 100%; height: 100%; border: none; resize: none">${sanphamtim[5] }</textarea></td>
<td style="width: 10%; text-align: center"><a href="<c:url value='chinhsua_sp?id_chinhsua=${sanphamtim[0] }' />">Chỉnh sửa</a></td>
<td style="width: 10%; text-align: center"><a href="<c:url value='xoa_sp?id_xoa=${sanphamtim[0] }' />">Xóa</a></td></tr>
</c:forEach>
</table>
    </div>
    </div>
  </div>
</div>