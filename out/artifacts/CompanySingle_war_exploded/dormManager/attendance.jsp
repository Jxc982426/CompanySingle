<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript">
$(document).ready(function(){
	$("ul li:eq(2)").addClass("active");
	$('.form_date').datetimepicker({
	    language:  'en',
	    weekStart: 1,
	    todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
	});
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
	$("#DataTables_Table_0_wrapper .row-fluid").remove();
});

window.onload = function(){ 
	$("#DataTables_Table_0_wrapper .row-fluid").remove();
};
</script>

<div class="data_list">
		<div class="data_list_title">
			考勤查看
		</div>
	<form name="myForm" class="form-search" method="post" action="${pageContext.request.contextPath}/employee/attendanceselect">
		<span class="data_search">
					员工号:&nbsp;&nbsp;<input id="select" name="select" type="text"  style="width:120px;height: 30px;" class="input-medium search-query">
					&nbsp;<button type="submit" class="btn btn-info">搜索</button>
				</span>
	</form>
		<div>
			<table class="table table-striped table-bordered table-hover datatable">
				<thead>
					<tr>
						<th >员工号</th>
						<th >部门号</th>
						<th >月份</th>
						<th >日期</th>
						<th >上班时间</th>
						<th >下班时间</th>
						<th>迟到</th>
						<th>早退</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach  varStatus="i" var="record" items="${recordList }">
					<tr>
						<td>${record.eno }</td>
						<td>${record.dno }</td>
						<td><fmt:formatDate value="${record.checkmonth }" pattern="yyyy-MM"/></td>
						<td><fmt:formatDate value="${record.checkdate }" pattern="dd"/></td>
						<td><fmt:formatDate value="${record.startwork }" pattern="HH:mm:ss"/></td>
						<td><fmt:formatDate value="${record.endwork }" pattern="HH:mm:ss"/></td>
						<td>${record.late }</td>
						<td>${record.leaveearly }</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<div align="center"><font color="red">${error }</font></div>
</div>