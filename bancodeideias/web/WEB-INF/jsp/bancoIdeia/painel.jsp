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

        <div class="page-header">
        <h1>IDEIAS ENVIADAS</h1>
    </div>
  
            <c:forEach items="${status}" var="s">

            <div class="panel panel-default">
                <div class="panel-heading">Panel heading without title</div>
                <div class="panel-body">
                  <strong>ideias </strong>${s.ideia}
                </div>
                <span class="text-right">
                    <a href="${pageContext.request.contextPath}/bancoIdeia/paineledit/${s.id}"
                       class="btn btn-warning btn-sm"> 
                        <span
                            class="glyphicon glyphicon-pencil" aria-hidden="true">
                        </span>
                    </a>
                </span>
            </div>            
            
        </c:forEach>
        
        

<center>
    <button type="button" onclick="history.back(-1)" class="cancelar">Voltar</button>
</center>
        