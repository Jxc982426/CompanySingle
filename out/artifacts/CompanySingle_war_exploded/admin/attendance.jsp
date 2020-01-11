<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript">
    function dormBuildDelete(attendanceId) {
        if (confirm("您确定要删除这条记录吗？")) {
            window.location = "${pageContext.request.contextPath}/mana/attendancedelete?id=" + attendanceId;
        }
    }

    $(document).ready(function () {
        $("ul li:eq(3)").addClass("active");
    });
</script>
<div class="data_list">
    <div class="data_list_title">
        考勤管理
    </div>
    <form name="myForm" class="form-search" method="post" action="${pageContext.request.contextPath}/mana/attendanceselect">
        <button class="btn btn-success" type="button" style="margin-right: 50px;"
                onclick="javascript:window.location='${pageContext.request.contextPath}/mana/attendanceadd'">添加
        </button>
        <span class="data_search">
					员工号:&nbsp;&nbsp;<input id="select" name="select" type="text" style="width:120px;height: 30px;"
                                           class="input-medium search-query">
					&nbsp;<button type="submit" class="btn btn-info">搜索</button>
				</span>
    </form>
    <div>
        <table class="table table-striped table-bordered table-hover datatable">
            <thead>
            <tr>
                <th>员工号</th>
                <th>部门号</th>
                <th>月份</th>
                <th>日期</th>
                <th>上班时间</th>
                <th>下班时间</th>
                <th>迟到</th>
                <th>早退</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach varStatus="i" var="attendance" items="${attendanceList }">
                <tr>
                    <td>${attendance.eno }</td>
                    <td>${attendance.dno }</td>
                    <td>
                        <fmt:formatDate value="${attendance.checkmonth}" pattern="yyyy-MM"/></td>
                    <td>
                        <fmt:formatDate value="${attendance.checkdate }" pattern="dd"/></td>
                    <td>
                        <fmt:formatDate value="${attendance.startwork }" pattern="HH:mm:ss"/></td>
                    <td>
                        <fmt:formatDate value="${attendance.endwork }" pattern="HH:mm:ss"/></td>
                    <td>${attendance.late }</td>
                    <td>${attendance.leaveearly }</td>
                    <td>
                            <%--						<button class="btn btn-mini btn-info" type="button" onclick="javascript:window.location='dormBuild?action=manager&dormBuildId=${dormBuild.eno }'">管理员</button>&nbsp;--%>
                        <button class="btn btn-mini btn-info" type="button"
                                onclick="javascript:window.location='${pageContext.request.contextPath}/mana/attendanceupdate?id=${attendance.eno }'">修改
                        </button>&nbsp;
                        <button class="btn btn-mini btn-danger" type="button"
                                onclick="dormBuildDelete(${attendance.eno})">删除
                        </button>
                    </td>
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
    <div align="center"><span style="color: red; ">${error }</span></div>

</div>