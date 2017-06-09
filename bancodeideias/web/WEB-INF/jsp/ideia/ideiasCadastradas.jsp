<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<%-- 
    Document   : create
    Created on : 20/02/2017, 15:59:44
    Author     : G0025381
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="alert alert-success" role="alert">Idéias cadastradas</div>

<div class="row">
    <c:forEach items="${ideias}" var="i">
        <div class="col-lg-4">
            <h2>${i.titulo}</h2>
            <p class="text-danger">${i.descricao}</p>
            <p><a class="btn btn-primary" href="${linkTo[IdeiaController].view(i.id)}" role="button">Mais detalhes</a></p>
        </div>
    </c:forEach>
</div>