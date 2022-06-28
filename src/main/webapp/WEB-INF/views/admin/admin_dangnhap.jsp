<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<div>
	<div class="panel panel-primary"
		style="width: 390px; margin: 0px auto; margin-top: 50px; background-color: white; padding: 10px; border-radius: 5px; box-shadow: 2px 2px gray;">
		<div class="panel-heading">
			<h2 class="text-center">Đăng Nhập</h2>
			<h5 style="color: red;" class="text-center">
				<?=$msg?>
			</h5>
		</div>
		<div class="panel-body" style="margin-left: 20px">
			<form action="dang-nhap" method="GET" modelAttribute="admin">
				<div class="form-group">
					<label for="email">Email:</label> <input required="true"
						type="email" class="form-control" id="email" name="taikhoan"
						value="" style="margin-left: 20px" placeholder="Nhập email" />
				</div>
				<div class="form-group">
					<label for="pwd">Mật Khẩu:</label> <input required="true"
						type="password" class="form-control" id="pwd" name="pass"
						minlength="6" style="margin-left: 20px"
						placeholder="Nhập mật khẩu" />
				</div>
				<p style="height: 30px; color: red" >${ statusLogin }</p>
				<button type="submit" class="btn btn-success"
					style="display: block; margin: auto">Đăng Nhập</button>
			</form>
		</div>
	</div>
</div>