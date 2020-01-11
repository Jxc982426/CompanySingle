<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="data_list">

    <form action="${pageContext.request.contextPath}/mana/save" method="post">
        <div class="data_form">

            <table align="center">
                <tr>
                    <td><span style="color: red; ">*</span>用户名：</td>
                    <td><input type="text" id="ename" name="ename" value="${employeeupdate.ename }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>密码：</td>
                    <td><input type="password" id="epassword" name="epassword" value="${employeeupdate.epassword }"
                               style="margin-top:5px;height:30px;" required/></td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>部门：</td>
                    <td>

<%--                        <input type="text" id="dno" name="dno" value="${employeeupdate.dno }" style="margin-top:5px;height:30px;" required/>--%>
                    <select name="dno" id=dno"" >
                        <c:forEach items="${dept}" var="dept">
                            <option value="${dept.dno}">${dept.dname}</option>
                        </c:forEach>

                    </select>

                    </td>
                </tr>
                <tr>
                    <td><span style="color: red; ">*</span>职位：</td>
                    <td>
                        <input type="text" id="job" name="job" value="${employeeupdate.job }"
                               style="margin-top:5px;height:30px;" required/>
                        <input type="hidden" id="eno" name="eno" value="${employeeupdate.eno }">
                        <%--                        <input type="hidden" id="hiredate" name="hiredate">--%>
                        <%--                        <input type="hidden" id="serialVersionUID" name="">--%>
                    </td>
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