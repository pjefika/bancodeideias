<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="page-header">
    <h2>Ideias Cadastradas aguardando Análise</h2>
</div>

<div class="row">
    <c:forEach items="${ideias}" var="i">
        <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <div class="caption">
                    <h3>${i.titulo}</h3>
                    <p class="text-justify">${i.descricao}</p>
                    <p><a class="btn btn-primary" href="${linkTo[IdeiaController].editar(i.id)}" role="button">Editar</a></p>
                </div>
            </div>
        </div>
    </c:forEach>
</div>







