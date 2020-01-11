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
        打卡记录
    </div>
    <form name="myForm" class="form-search" method="post" action="${pageContext.request.contextPath}/employee/sign?action=search" style="padding-bottom: 0px">
        <button class="btn btn-success" type="button" style="margin-right: 50px;"
                onclick="javascript:window.location='${pageContext.request.contextPath}/employee/signadd'">上班打卡
        </button>
        <button class="btn btn-success" type="button" style="margin-right: 50px;"
                onclick="javascript:window.location='${pageContext.request.contextPath}/employee/signadd2'">下班打卡
        </button>
<%--        <span class="data_search">--%>
<%--					<select id="searchType" name="searchType" style="width: 80px;">--%>
<%--					<option value="name">姓名</option>--%>
<%--					<option value="number" ${searchType eq "number"?'selected':'' }>学号</option>--%>
<%--					<option value="dorm" ${searchType eq "dorm"?'selected':'' }>寝室</option>--%>
<%--					</select>--%>
<%--					&nbsp;<input id="s_studentText" name="s_studentText" type="text" style="width:120px;height: 30px;"--%>
<%--                                 class="input-medium search-query" value="${s_studentText }">--%>
<%--					&nbsp;<button type="submit" class="btn btn-info" onkeydown="if(event.keyCode==13) myForm.submit()">搜索</button>--%>
<%--				</span>--%>
    </form>
    <div>
        <table class="table table-striped table-bordered table-hover datatable">
            <thead>
            <tr>
                <!-- <th>编号</th> -->
                <th>打卡号</th>
                <th>员工名</th>
                <th>日期</th>
                <th>星期</th>
                <th>迟到</th>
                <th>早退</th>
                <th>上班打卡时间</th>
                <th>下班打卡时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach varStatus="i" var="student" items="${studentList }">
                <tr>
                        <%-- <td>${i.count+(page-1)*pageSize }</td> --%>
                    <td>${student.id}</td>
                    <td>${student.eno}</td>
<%--                    <td>${student.signdate}</td>--%>
                    <td><fmt:formatDate value="${student.signdate}" pattern="yyyy-MM-dd"/></td>
                    <td>${student.signweek}</td>
                    <td>${student.late}</td>
                    <td>${student.leaveearly}</td>
<%--                    <td>${student.firstsign}</td>--%>
<%--                    <td>${student.lastsign}</td>--%>
                    <td><fmt:formatDate value="${student.firstsign}" pattern="HH:mm:ss"/></td>
                    <td><fmt:formatDate value="${student.lastsign}" pattern="HH:mm:ss"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div align="center"><span style="color: red; ">${error }</span></div>
</div>