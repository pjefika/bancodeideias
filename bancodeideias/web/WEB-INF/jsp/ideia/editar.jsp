<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="page-header">
    <h2>Editar Idéia</h2>
</div>

<form action="${linkTo[IdeiaController].updateStatus}" method="post"  style="width: 100%;"> 
    <input type="hidden" name="i.id" value="${i.id}"/>
    <div class="row">
        <div class="col-xs-12">
            <div>
                <label class="control-label">
                    Titulo.
                </label>
                <br>
                <span>${i.titulo}</span>
            </div>
            <br><br>
            <div>
                <label class="control-label">
                    Descreva sua idéia detalhadamente.
                </label>
                <br>
                <span>${i.descricao}</span>
            </div>
            <br><br>
            <div>
                <label class="control-label">
                    O que deverá ser realizado para que a sua idéia seja implantada?
                </label>
                <br>
                <span>${i.realizar}</span>
            </div>
            <br><br>
            <div>
                <label>
                    A sua idéia irá proporcionar ganhos nos indicadores operacionais do CO? Detalhe quais são:
                </label>
                <br>
                <span>${i.ganhos}</span>
            </div>
            <br><br>
            <div>
                <label>
                    Será necessário alteração nos processos e ferramentas de atendimento? Descreva quais?
                </label>
                <br>
                <span>${i.descComo}</span>

            </div>
            <br><br>
            <div class="form-group">
                <div class="form-inline">
                    <select class="form-control" name="i.status" id="novostatus">
                        <c:forEach items="${StatusIdeia}" var="StatusIdeia">
                            <option  <c:if test="${StatusIdeia == i.status}">selected </c:if> >${StatusIdeia}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

        </div>

    </div>
    <button type="submit" class="btn btn-default">Alterar</button>
</form>