<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="page-header">
    <h2>Ideias Cadastradas</h2>
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
                                                   
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
