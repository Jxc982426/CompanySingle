<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="data_list">

    <form action="${pageContext.request.contextPath}/mana/businesssave" method="post">
        <div class="data_form">

            <input type="hidden" id="bno" name="bno" value="${businessupdate.bno }">
            <table align="center">
                <tr>
                    <td><span style="color: red; ">*</span>业务名：</td>
                    <td><input type="text" id="bname" name="bname" value="${businessupdate.bname }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>部门号：</td>
                    <td><input type="text" id="dno" name="dno" value="${businessupdate.dno }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>员工号：</td>
                    <td><input type="text" id="eno" name="eno" value="${businessupdate.eno }"
                               style="margin-top:5px;height:30px;" required/>
                    </td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>描述：</td>
                    <td><input type="text" id="customer" name="customer" value="${businessupdate.customer }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
            </table>
            <div align="center">
                <input type="submit" class="btn btn-primary" value="保存"/>
                &nbsp;<button class="btn btn-primary" type="button" onclick="javascript:window.location='business'">返回
            </button>
            </div>
            <div align="center">
                <span id="error" style="color: red; ">${error }</span>
            </div>
        </div>
    </form>
</div>
