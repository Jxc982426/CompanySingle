<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript">
    $(document).ready(function () {
        $("ul li:eq(2)").addClass("active");
    });
</script>

<form action="${pageContext.request.contextPath}/mana/salarysave" method="post" onsubmit="return checkForm()">
    <div class="data_form">
        <table align="center">
            <input type="hidden" id="sno" name="sno" value="${salaryupdate.sno }"/>
            <input type="hidden" id="dno" name="dno" value="${salaryupdate.dno }"/>
            <input type="hidden" id="sgrade" name="sgrade" value="${salaryupdate.sgrade }"/>
            <tr>
                <td><span style="color: red; ">*</span>员工号：</td>
                <td><input type="text" id="eno" name="eno" value="${salaryupdate.eno }"
                           style="margin-top:5px;height:30px;"/></td>
            </tr>
            <tr>
                <td><span style="color: red; ">*</span>每月工资：</td>
                <td><input type="text" id="msal" name="msal" value="${salaryupdate.msal }"
                           style="margin-top:5px;height:30px;"/></td>
            </tr>
            <tr>
                <td><span style="color: red; ">*</span>奖金：</td>
                <td><input type="text" id="award" name="award" value="${salaryupdate.award }"
                           style="margin-top:5px;height:30px;"/></td>
            </tr>
            <tr>
                <td><span style="color: red; ">*</span>年薪：</td>
                <td><input type="text" id="ysal" name="ysal" value="${salaryupdate.ysal }"
                           style="margin-top:5px;height:30px;"/>
                </td>
            </tr>

        </table>
        <div align="center">
            <input type="submit" class="btn btn-primary" value="保存"/>
            &nbsp;<button class="btn btn-primary" type="button" onclick="javascript:history.back()">返回
        </button>
        </div>
        <div align="center">
            <font id="error" color="red">${error }</font>
        </div>
    </div>
</form>
</div>