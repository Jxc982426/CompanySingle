<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript">
    $(document).ready(function () {
        $("ul li:eq(2)").addClass("active");
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
                null,
                null,
                {"asSorting": []},
                {"asSorting": []}
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
        请假
    </div>
    <form name="myForm" class="form-search" method="post" action="askLeaveselect" style="padding-bottom: 0px">

        <button class="btn btn-success" type="button" style="margin-right: 50px;"
                onclick="javascript:window.location=' askLeaveadd'">添加
        </button>
				<span class="data_search">

					<select id="selectop" name="selectop" style="width: 80px;">
					<option value="lno">请假号</option>
					<option value="eno">员工号</option>
					<option value="dno">部门号</option>
					</select>
					&nbsp;<input id="select" name="select" type="text" style="width:120px;height: 30px;"
                                 class="input-medium search-query" required>
					&nbsp;<button type="submit" class="btn btn-info">搜索</button>
				</span>
    </form>
    <div>
        <table class="table table-striped table-bordered table-hover datatable">
            <thead>
            <tr>
                <!-- <th>编号</th> -->
                <th>请假号</th>
                <th>员工号</th>
                <th>部门号</th>
                <th>开始时间</th>
                <th>截止时间</th>
                <th>状态</th>
                <th>理由</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach varStatus="i" var="askLeave" items="${askleaveList}">
                <tr>
                        <%-- <td>${i.count+(page-1)*pageSize }</td> --%>
                    <td>${askLeave.lno }</td>
                    <td>${askLeave.eno }</td>
                    <td>${askLeave.dno }</td>
                    <td><fmt:formatDate value="${askLeave.leavedate }" pattern="yyyy-MM-dd"/></td>
                    <td><fmt:formatDate value="${askLeave.backdate }" pattern="yyyy-MM-dd"/></td>
                    <td>${askLeave.state }</td>
                    <td>${askLeave.reason }</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div align="center"><span style="color: red; ">${error }</span></div>
    <%-- <div class="pagination pagination-centered">
        <ul>
            ${pageCode }
        </ul>
    </div> --%>
</div>