<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="data_list">
    <form action="${pageContext.request.contextPath}/employee/askLeavesave" method="post">
        <div class="data_form">
            <table align="center">
<%--                <tr>--%>
<%--                    <td><span style="color: red; ">*</span>员工号：</td>--%>
<%--                    <td><input type="text" id="eno" name="eno"--%>
<%--                               style="margin-top:5px;height:30px;" required/></td>--%>
<%--                </tr>--%>
                <tr>
                    <td><span style="color: red; ">*</span>开始时间：</td>
                    <td><input type="text" id="leavedate" name="leavedate"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>截止时间：</td>
                    <td><input type="text" id="backdate" name="backdate"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>原因：</td>
                    <td><input type="text" id="reason" name="reason"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>状态：</td>
                    <td><input type="text" id="state" name="state"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>

            </table>
            <div align="center">
                <input type="submit" class="btn btn-primary" value="保存"/>
                &nbsp;<button class="btn btn-primary" type="button" onclick="javascript:history.back()">返回</button>
            </div>
            <div align="center">
                <span id="error" name="error" style="color: red; ">${error }</span>
            </div>
        </div>
    </form>
</div>