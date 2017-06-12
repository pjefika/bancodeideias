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

<div class="page-header">
    <h2>Minhas Idéias</h2>
</div>

<div class="row">
    <c:forEach items="${ideias}" var="i">
        <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <div class="caption">
                    <h3>${i.titulo}</h3>
                    <p class="text-justify">${i.descricao}</p>
                    <p><a class="btn btn-primary" href="${linkTo[IdeiaController].view(i.id)}" role="button">Mais detalhes</a></p>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
