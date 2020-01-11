<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript">
    function checkForm() {
        var newPassword = document.getElementById("newPassword").value;
        var rPassword = document.getElementById("rPassword").value;
        if (newPassword !== rPassword) {
            document.getElementById("error").innerHTML = "密码填写不一致！";
            return false;
        }
        return true;
    }

    $(document).ready(function () {
        $("ul li:eq(5)").addClass("active");
    });
</script>
<div class="data_list">
    <div class="data_list_title">
        修改密码
    </div>
    <form action="${pageContext.request.contextPath}/mana/passwordchange" method="post" onsubmit="return checkForm()">
        <div class="data_form">
            <input type="hidden" id="mid" name="mid"/>
            <input type="hidden" id="mname" name="mname"/>
            <input type="hidden" id="dno" name="dno"/>
            <input type="hidden" id="job" name="job"/>
            <table align="center">
                <tr>
                    <td><span style="color: red; ">*</span>原密码：</td>
                    <td><input type="password" id="oldPassword" name="oldPassword" style="margin-top:5px;height:30px;"/>
                    </td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>新密码：</td>
                    <td><input type="password" id="newPassword" name="newPassword" style="margin-top:5px;height:30px;"/>
                    </td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>重复密码：</td>
                    <td><input type="password" id="rPassword" name="rPassword" style="margin-top:5px;height:30px;"/>
                    </td>
                </tr>
            </table>
            <div align="center">
                <input type="submit" class="btn btn-primary" value="提交"/>
            </div>
            <div align="center">
                <span id="error" style="color: red; ">${error }</span>
            </div>
        </div>
    </form>
</div>