<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="data_list">
    <form action="${pageContext.request.contextPath}/mana/attendancesave" method="post">
        <div class="data_form">
            <table align="center">
                <tr>
                    <td><span style="color: red; ">*</span>员工号：</td>
                    <td><input type="text" id="eno" name="eno" value="${attendanceupdate.eno }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>部门号：</td>
                    <td><input type="text" id="dno" name="dno" value="${attendanceupdate.dno }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>月份：</td>
                    <td><input type="text" id="checkmonth" name="checkmonth" value="${attendanceupdate.checkmonth }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>日期：</td>
                    <td><input type="text" id="checkdate" name="checkdate" value="${attendanceupdate.checkdate }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>上班时间：</td>
                    <td><input type="text" id="startwork" name="startwork" value="${attendanceupdate.startwork }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>下班时间：</td>
                    <td><input type="text" id="endwork" name="endwork" value="${attendanceupdate.endwork }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>迟到：</td>
                    <td><input type="text" id="late" name="late" value="${attendanceupdate.late }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>早退：</td>
                    <td><input type="text" id="leaveearly" name="leaveearly" value="${attendanceupdate.leaveearly }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
            </table>
            <div align="center">
                <input type="submit" class="btn btn-primary" value="保存"/>
                &nbsp;<button class="btn btn-primary" type="button" onclick="javascript:history.back()">返回</button>
            </div>
            <div align="center">
                <span id="error" style="color: red; ">${error }</span>
            </div>
        </div>
    </form>
</div>
<div align="center"><span style="color: red; ">${error }</span></div>
