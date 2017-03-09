<%-- 
    Document   : buscaideias
    Created on : 01/03/2017, 15:47:41
    Author     : G0025381
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>

<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<form action="${linkTo[BancoIdeiaController].cadastrarideia}" method="post" style="width: 100%;">


<!--<form action="<c:url value='/bancodeideias/'/>">-->
    <div class="row"><div class="form-group">
    <input type="text" value=" ${status.colaborador}">
    <input type="text" value="${status.supervisor}">
    <input type="text" value=" ${status.equipe}">
    <input type="text" value=" ${status.titulo}">
    <input type="text" value="${status.ideia}">
    <input type="text" value="${status.implantar}">
    <input type="text" value="${status.ganhos}">
    <input type="text" value="${status.processos}">
    <input type="text"  value="${status.login}">
    <input type="text"  value="${status.status}">
</form>
<center> 
    <button type="button" class="btn btn-default" onclick="history.back(-1)" class="cancelar">Voltar</button>
</center>
</form>