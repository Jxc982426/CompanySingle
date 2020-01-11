<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript">
    $(document).ready(function () {
        $("ul li:eq(4)").addClass("active");
        $('.form_date').datetimepicker({
            language: 'en',
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 0
        });
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
        $("#DataTables_Table_0_wrapper .row-fluid").remove();
    });

    window.onload = function () {
        $("#DataTables_Table_0_wrapper .row-fluid").remove();
    };

    function recordDelete(askLeave) {
        if (confirm("您确定要拒绝这条记录吗？")) {
            window.location = "${pageContext.request.contextPath}/mana/recorddelete?recordId=" + askLeave;
        }
    }

    function agree(askLeave) {
        if (confirm("您确定要同意这条记录吗？")) {
            window.location = "${pageContext.request.contextPath}/mana/recordagree?recordId=" + askLeave;
        }
    }

</script>

<div class="data_list">
    <div class="data_list_title">
        请假批准
    </div>
    <form name="myForm" class="form-search" method="post" action="${pageContext.request.contextPath}/mana/askLeaveselect"
          style="padding-bottom: 0px">
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
                <th>请假号</th>
                <th>员工号</th>
                <th>部门号</th>
                <th>开始时间</th>
                <th>截止时间</th>
                <th>状态</th>
                <th>理由</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach varStatus="i" var="askLeave" items="${askLeaveList }">
                <tr>
                    <td>${askLeave.lno }</td>
                    <td>${askLeave.eno }</td>
                    <td>${askLeave.dno }</td>
                    <td>
                        <fmt:formatDate value="${askLeave.leavedate }" pattern="yyyy-MM-dd"/>
                    </td>
                    <td>
                        <fmt:formatDate value="${askLeave.backdate }" pattern="yyyy-MM-dd"/>
                    </td>
                    <td>${askLeave.state }</td>
                    <td>${askLeave.reason }</td>
                    <td>
                        <button class="btn btn-mini btn-success" type="button" onclick="agree(${askLeave.lno })">同意
                        </button>
                        <button class="btn btn-mini btn-danger" type="button" onclick="recordDelete(${askLeave.lno })">
                            拒绝
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