<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title><decorator:title default="BaixaOffLine"/></title>
        <meta charset="utf-8">

        <!-- import CSS -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet" />

        <!-- import JavaScript -->
        <script src="${pageContext.request.contextPath}/resources/jquery-3.1.1/jquery-3.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

        <decorator:head/>
    </head>


    <!-- Jóvi -->
    <!-- Fixed navbar -->
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                    </button>
                    <a class="navbar-brand" href="${linkTo[HomeController].index}">Banco de Idéias CO</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <c:if test="${sessionUsuarioEfika.logado}">
                        <ul class="nav navbar-nav">
                            <li><a href="${linkTo[HomeController].index()}">Home</a></li>

                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cadastro de Idéias<span class="caret"></span></a>
                                <ul class="dropdown-menu" >
                                    <li><a href="${linkTo[IdeiaController].form}">Cadastre sua Ideia</a></li>
                                    <li><a href="${linkTo[IdeiaController].minhasIdeias}">Minhas Ideias</a></li>
                                </ul>
                            <li><a href="${linkTo[IdeiaController].ideiasCadastradas}">Ideias Cadastradas</a></li>



                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administração<span class="caret"></span></a>
                                <ul class="dropdown-menu" >
                                    <li><a href="${linkTo[IdeiaController].painel}">Análise de Idéias</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="${linkTo[RelatorioController].create()}"> Relatórios</a></li>
                                </ul>
                            </li>

                        </c:if>
                        <ul class="nav navbar-nav navbar-right">

                            <c:choose>
                                <c:when test="${empty sessionUsuarioEfika.usuario.login}">
                                    <li><a href="${linkTo[UsuarioController].create}">Login</a></li>
                                    </c:when>
                                    <c:otherwise>
                                    <li>
                                        <a href="${linkTo[UsuarioController].logout}">${sessionUsuarioEfika.usuario.login}, Logout</a>
                                    </li>
                                </c:otherwise>
                            </c:choose>

                        </ul>
                </div>
            </div>

        </nav>

        <div class="container">
            <br/>
            <br/>
            <br/>
            <br/>
            <c:if test="${not empty mensagem}">
                <span class="alert alert-success" role="alert"> <span
                        class="glyphicon glyphicon glyphicon-ok" aria-hidden="true"></span>
                    ${mensagem}
                </span>
            </c:if>
            <c:if test="${not empty mensagemFalha}">
                <span class="alert alert-danger" role="alert">
                    <span class="glyphicon glyphicon glyphicon-remove" aria-hidden="true"></span>
                    ${mensagemFalha}
                </span>
            </c:if>
            <decorator:body />
        </div>
        <!-- /container -->

    </body>
</html>