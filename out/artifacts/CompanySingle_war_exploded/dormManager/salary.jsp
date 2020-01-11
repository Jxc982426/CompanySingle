<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript">

    $(document).ready(function () {
        $("ul li:eq(1)").addClass("active");
        $('.datatable').dataTable({
            "oLanguage": {
                "sUrl": "/DormManage/media/zh_CN.json"
            },
            "bLengthChange": false, //改变每页显示数据数量
            "bFilter": false, //过滤功能
            "aoColumns": [
                null,
                null,
                null,
                {"asSorting": []},
                null,
                {"asSorting": []},
            ]
        });
    });

    window.onload = function () {
        $("#DataTables_Table_0_wrapper .row-fluid").remove();
    };
</script>
<style type="text/css">
    .span6 {
        width: 0px;
        height: 0px;
        padding-top: 0px;
        padding-bottom: 0px;
        margin-top: 0px;
        margin-bottom: 0px;
    }

</style>
<div class="data_list">
    <div class="data_list_title">
        工资查看
    </div>
    <form name="myForm" class="form-search" method="post" action="${pageContext.request.contextPath}/employee/salaryselect" style="padding-bottom: 0px">
        <span class="data_search">
					<select id="selectop" name="selectop" style="width: 80px;">
					<option value="sno">工资号</option>
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
                <th>员工号</th>
                <th>部门号</th>
                <th>每月工资</th>
                <th>奖金</th>
                <th>年薪</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach varStatus="i" var="student" items="${studentList }">
                <tr>
                        <%-- <td>${i.count+(page-1)*pageSize }</td> --%>

                    <td>${student.eno}</td>
                    <td>${student.dno}</td>
                    <td>${student.msal}</td>
                    <td>${student.award}</td>
                    <td>${student.ysal}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div align="center"><font color="red">${error }</font></div>
</div>