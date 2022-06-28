<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<div class="container-fluid text-center" style="border: 1px solid black">
	<div class="row content">
		<div class="col-sm-2 sidenav" style="text-align: left">
			<p>
				<a class="nav-link active" href="./"> <i
					class="bi bi-house-fill"></i> Trang Chủ
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydanhmucSP"> <i
					class="bi bi-folder"></i> Danh Mục Sản Phẩm
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlysanpham"> <i
					class="bi bi-file-earmark-text"></i> Sản Phẩm
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydonhang"> <i
					class="bi bi-minecart"></i> Quản Lý Đơn Hàng
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlynguoidung"> <i
					class="bi bi-people-fill"></i> Quản Lý Người Dùng
				</a>
			</p>
			<p>
				<a class="nav-link" href="#"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Phản Hồi
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydonhang"> <i
					class="bi bi-bar-chart-line"></i> Báo Cáo Doanh Thu
				</a>
			</p>
		</div>

		<div class="panel panel-primary"
			style="width: 390px; margin: 0px auto; margin-top: 50px; background-color: white; padding: 10px; border-radius: 5px; box-shadow: 2px 2px gray;">
			<div class="panel-heading">
				<h2 class="text-center">Tạo tài khoản admin</h2>
				<h5 style="color: red;" class="text-center">
					<?=$msg?>
				</h5>
			</div>
			<div class="panel-body" style="margin-left: 10px">
				<form action="dangkyadmin" method="POST" modelAttribute="admin">
					<div class="form-group">
						<label for="email">Email:</label> <input required="true"
							type="email" class="form-control" id="email" name="taikhoan"
							value="" style="margin-left: 10px" placeholder="Nhập email" />
					</div>
					<div class="form-group">
						<label for="pwd">Mật Khẩu:</label> <input required="true"
							type="password" class="form-control" id="pwd" name="pass"
							minlength="6" style="margin-left: 20px"
							placeholder="Nhập mật khẩu" />
					</div>
					<div class="form-group">
						<label for="pwd">Tên:</label> <input required="true" type="text"
							class="form-control" id="pwd" name="hoten" minlength="6"
							style="margin-left: 10px" placeholder="Nhập tên" />
					</div>
					<p style="height: 30px; color: red">${ statusLogin }</p>
					<button type="submit" class="btn btn-success"
						style="display: block; margin: auto">Đăng Ký</button>
				</form>
			</div>
		</div>
	</div>
</div>