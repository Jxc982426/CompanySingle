<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript">
    function employeeDelete(employeeId) {
        if (confirm("您确定要删除这个员工吗？")) {
            javascript:window.location = "${pageContext.request.contextPath}/mana/delete?id=" + employeeId;
            // window.location="dormManager?action=delete&dormManagerId="+dormManagerId;
        }
    }

    // function select() {
    //     var select = document.getElementsByName("select");
    //     var selectop = document.getElementsByName("selectop");
    //     javascript:window.location = "select?value=" + select + "&selectop=" + selectop;
    //     // window.location="dormManager?action=delete&dormManagerId="+dormManagerId;
    //
    // }
</script>
<div class="data_list">
    <div class="data_list_title">
        员工管理
    </div>
    <form name="myForm" class="form-search" method="post" action="${pageContext.request.contextPath}/mana/select">
        <button class="btn btn-success" type="button" style="margin-right: 50px;"
                onclick="javascript:window.location='${pageContext.request.contextPath}/mana/addEmployee'">添加
        </button>
        <span class="data_search">
					<select id="selectop" name="selectop" style="width: 80px;">
					<option value="eno">员工号</option>
					<option value="ename">姓名</option>
					</select>
					&nbsp;<input id="select" name="select" type="text" style="width:120px;height: 30px;"
                                 class="input-medium search-query">
<%--					&nbsp;<button type="submit" class="btn btn-info" onkeydown="if(event.keyCode==13) myForm.submit()">搜索</button>--%>
					&nbsp;<button type="submit" class="btn btn-info">搜索</button>
				</span>
    </form>
    <div>
        <table class="table table-hover table-striped table-bordered">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>职位</th>
                <th>日期</th>
                <th>操作</th>
            </tr>
            <c:forEach varStatus="i" var="employee" items="${employeeList }">
                <tr>
                        <%--						<td>${i.count+(page-1)*pageSize }</td>--%>
                    <td>${employee.eno }</td>
                    <td>${employee.ename }</td>
                    <td>${employee.job }</td>
                    <td>
                        <fmt:formatDate value="${employee.hiredate }" pattern="yyyy-MM-dd"/>
                    </td>
                    <td>
                        <button class="btn btn-mini btn-info" type="button"
                                onclick="javascript:window.location='${pageContext.request.contextPath}/mana/employeeupdate?id=${employee.eno }'">修改
                        </button>&nbsp;
                        <button class="btn btn-mini btn-danger" type="button"
                                onclick="employeeDelete(${employee.eno})">删除
                        </button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div align="center"><span style="color: red; ">${error }</span></div>
    <div class="pagination pagination-centered">
        <ul>
            ${pageCode }
        </ul>
    </div>
</div>