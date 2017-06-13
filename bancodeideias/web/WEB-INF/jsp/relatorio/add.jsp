<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
    response.setContentType("application/vnd.ms-excel");
    response.setHeader("Content-Disposition", "inline; filename=" + "excel.xls");
%>

<c:if test="${not empty relato}">
    <table>
        <thead>
            <tr>
                <th>Periodo Inicial da Inscri��o</th>
                <th>Login</th>
                <th>T�tulo</th>
                <th>Descri��o</th>
                <th>Implementa��o</th>
                <th>Ganhos</th>
                <th>Altera��es</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${relato}" var="at">
                <tr class="leline">
                    <td><fmt:formatDate type="both"  dateStyle="short" timeStyle="short" value="${at.datacadastro.time}"/></td>
                    <td>${at.logincriador}</td>
                    <td>${at.titulo}</td>
                    <td>${at.descricao}</td>
                    <td>${at.descomo}</td>
                    <td>${at.realizar}</td>
                    <td>${at.descomo}</td>
                    <td>${at.status}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table> 
</c:if>