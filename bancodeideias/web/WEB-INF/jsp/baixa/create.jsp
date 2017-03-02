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
        <h1>Cadastro Baixa Off Line</h1>
    </div>
    <div class="form-group">
        <div class="row">
            <div class="col-md-8">
                    <thead>
                        <tr>
                            <th><a href="${linkTo[BaixaController].addBA()}" class="btn btn-success">BA</a></th>
                            <th><a href="${linkTo[BaixaController].addTT()}" class="btn btn-warning">TT</a></th>
                            <th><a href="${linkTo[BaixaController].listar()}" class="btn btn-info">Consultar</a></th>
                        </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>

</div>


