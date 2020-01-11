<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<form action="${pageContext.request.contextPath}/mana/transfersave" method="post">
    <div class="data_form">
        <table align="center">
            <tr>
                <td><span style="color: red; ">*</span>员工号：</td>
                <td><input type="text" id="eno" name="eno" value="${transferupdate.eno }"
                           style="margin-top:5px;height:30px;"/></td>
            </tr>
            <tr>
                <td><span style="color: red; ">*</span>旧部门号：</td>
                <td><input type="text" id="olddno" name="olddno" value="${transferupdate.olddno }"
                           style="margin-top:5px;height:30px;"/></td>
            </tr>
            <tr>
                <td><span style="color: red; ">*</span>新部门号：</td>
                <td>
                    <input type="text" id="newdno" name="newdno" value="${transferupdate.newdno }"
                           style="margin-top:5px;height:30px;"/>
                </td>
                <input type="hidden" id="tno" name="tno" value="${transferupdate.tno }">
            </tr>

        </table>
        <div align="center">
            <input type="submit" class="btn btn-primary" value="保存"/>
            &nbsp;<button class="btn btn-primary" type="button" onclick="javascript:history.back()">返回</button>
        </div>
        <div align="center">
            <font id="error" color="red">${error }</font>
        </div>
    </div>
</form>
</div>