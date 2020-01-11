<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript">

$(document).ready(function(){
	$("ul li:eq(2)").addClass("active");
	$('.datatable').dataTable( {        				
		 "oLanguage": {
				"sUrl": "/DormManage/media/zh_CN.json"
		 },
		"bLengthChange": false, //改变每页显示数据数量
		"bFilter": false, //过滤功能
		"aoColumns": [
			null,
			null,
			null,
			null,
			null,
			{ "asSorting": [ ] },
			{ "asSorting": [ ] }
		]
	});
});

window.onload = function(){ 
	$("#DataTables_Table_0_wrapper .row-fluid").remove();
};
	function studentDelete(studentId) {
		if(confirm("您确定要删除这个学生吗？")) {
			window.location="${pageContext.request.contextPath}/mana/businessdelete?id="+studentId;
		}
	}
</script>
<style type="text/css">
	.span6 {
		width:0px;
		height: 0px;
		padding-top: 0px;
		padding-bottom: 0px;
		margin-top: 0px;
		margin-bottom: 0px;
	}

</style>
<div class="data_list">
		<div class="data_list_title">
			业务管理
		</div>
		<form name="myForm" class="form-search" method="post" action="${pageContext.request.contextPath}/mana/businessselect" style="padding-bottom: 0px">
				<button class="btn btn-success" type="button" style="margin-right: 50px;" onclick="javascript:window.location='${pageContext.request.contextPath}/mana/businessadd'">添加</button>
				<span class="data_search">
					<select id="selectop" name="selectop" style="width: 80px;">
					<option value="bno">业务号</option>
					<option value="eno">员工号</option>
					<option value="dno">部门号</option>
					</select>
					&nbsp;<input id="select" name="select" type="text"  style="width:120px;height: 30px;" class="input-medium search-query">
					&nbsp;<button type="submit" class="btn btn-info">搜索</button>
				</span>
		</form>
		<div>
			<table class="table table-striped table-bordered table-hover datatable">
				<thead>
					<tr>
					<!-- <th>编号</th> -->
					<th>业务号</th>
					<th>业务名</th>
					<th>部门号</th>
					<th>员工号</th>
					<th>业务描述</th>
					<th>操作</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach  varStatus="i" var="business" items="${businessList }">
					<tr>
						<%-- <td>${i.count+(page-1)*pageSize }</td> --%>
						<td>${business.bno}</td>
						<td>${business.bname}</td>
						<td>${business.dno}</td>
						<td>${business.eno}</td>
						<td>${business.customer}</td>
						<td><button class="btn btn-mini btn-info" type="button" onclick="javascript:window.location='businessupdate?id=${business.bno }'">修改</button>&nbsp;
							<button class="btn btn-mini btn-danger" type="button" onclick="studentDelete(${business.bno })">删除</button></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="pagination pagination-centered">
			<ul>
				${pageCode }
			</ul>
		</div>
</div>

<div align="center"><span style="color: red; ">${error }</span></div>