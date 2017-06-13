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
                    <div class="row">
                        <div class="col-md-4">
                            <a class="btn btn-primary" alin="left" href="${linkTo[IdeiaController].view(i.id)}" role="button">Mais detalhes</a>
                        </div>
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <c:choose>
                                <c:when test="${i.status eq 'NEGADO'}">
                                    <span class="label label-danger"> ${i.status}</span>
                                </c:when>
                                <c:when test="${i.status eq 'DIVULGADO'}">
                                    <span class="label label-success"> ${i.status}</span>
                                </c:when>
                                <c:when test="${i.status eq 'ANALISE'}">
                                    <span class="label label-warning"> ${i.status}</span>
                                </c:when>                                
                                <c:otherwise>
                                    <span class="label label-info"> ${i.status}</span>
                                </c:otherwise>
                            </c:choose>
                        </div>                                            
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
