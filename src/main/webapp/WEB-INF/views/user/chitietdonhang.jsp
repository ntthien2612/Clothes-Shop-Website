<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head><title>Chi Tiết Đơn Hàng</title></head>
<div class="container-fluid text-center" style="border: 1px solid black">
	<div class="row content">
		
		<div style="text-align: left;">
			<h1>
				<b>Chi Tiết Đơn Hàng</b>
			</h1>
			
			</table><hr></br>
<p><b>Thông tin mua hàng:</b></p>
	<table style="width: 100%;margin-left:1%" border="1">
              <thead>
                <tr >
                  <th style="width: 15%">Hình ảnh</th>
                  <th style="width: 25%">Tên Sản Phẩm</th>
                  <th style="width: 15%">Size</th>
                  <th style="width: 15%">Giá bán</th>
                  <th style="width: 15%">Số lượng </th>
                  <th style="width: 15%">Tổng tiền</th>
				</tr>
              </thead>
              <tbody>
				<c:forEach var="chitietdonhang" items="${ chitietdonhang }">
					<tr>
					<td><img style="width: 100%; height: 100%;"
						src="<c:url value= "/image/${chitietdonhang[4] }"/>"></td>
	                  <td>${chitietdonhang[8] }</td>
	                  <td>${chitietdonhang[6] }</td>
	                  <td>${chitietdonhang[7] }</td>
	                  <td>${chitietdonhang[5] }</td>
	                  <td><fmt:formatNumber type="number" groupingUsed="true"
										value="${chitietdonhang[7] * chitietdonhang[5] }" /> ₫ </td>
	               
	                </tr>
				</c:forEach>
				</tbody>
            </table><br/>
            
            <b style="float:right; margin-right: 20%">Tổng cộng: <fmt:formatNumber type="number" groupingUsed="true"
										value="${tongtien}" /> ₫ </b>
            
		</div>
	</div>
</div>