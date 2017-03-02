<%-- 
    Document   : create
    Created on : 20/02/2017, 15:59:44
    Author     : G0025381
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>


<div class="container" id="form" >

    <div class="page-header">
        <h1>Cadastro Baixa Off Line TT</h1>
    </div>
    <table class="table table-bordered">

        <thead>
            <tr>
                <th>Código da SS</th>
                <th>Data da Abertura</th>
                <th>Data do Fechamaneto</th>
                <th>Código do Fechamento</th>
            </tr>
        </thead>
        <tbody>  
        <form action="<c:url value='/baixa/adicionar/tt/'/>">
            <tr>
                <td> <input type="text" class="form-control" name="baixatt.ss"/></td>
                <td> <input type="text" class="form-control" name="baixatt.dabertura"/></td>
                <td><input type="text" class="form-control" name="baixatt.dfechamento"/></td>
                <td> <input type="text" class="form-control" name="baixatt.codfechamento"/></td>

        </tbody>
        </table>

            <center>
                <button type="submit" class="salvar_blocos">Salvar</button>
                <button type="button" onclick="history.back(-1)" class="cancelar">Cancelar</button>
            </center>
        </form>

</div>




