<%-- 
    Document   : buscaideias
    Created on : 01/03/2017, 15:47:41
    Author     : G0025381
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<div class="row">
    <div class="col-md-6" > 
        <h1>Baixa de BA</h1>
        <table class="table table-bordered">
            <thead>
            <form action="<c:url value='/baixa/listastatus/'/>">
                <tr>
                    <th>Instancia</th>
                    <th>Status</th>

                </tr>
                </thead>
                <tbody>

                    <c:forEach items="${listastatus}" var="status">

                    <td> ${status.instancia} </td>
                    <td>${status.status} </td>
                    </tr>
                </c:forEach>
            </form>    
            </tbody>

        </table>
    </div>
    <div class="col-md-6">
        <h1>Baixa de TT</h1>
        <table class="table table-bordered">
            <thead>
            <form action="<c:url value='/baixa/listastatus/'/>">
                <tr>
                    <th>Ordem</th>
                    <th>Status</th>

                </tr>
                </thead>
                <tbody>

                    <c:forEach items="${listastatus1}" var="status">

                    <td> ${status.ss} </td>
                    <td>${status.status} </td>
                    </tr>
                </c:forEach>
            </form>    
            </tbody>

        </table>
    </div>

</div>

<center>
    <button type="button" onclick="history.back(-1)" class="cancelar">Voltar</button>
</center>