<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<title><decorator:title default="Baixa Off Line" /></title>
<meta charset="utf-8">
<link
	href="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"
	rel="stylesheet" />

<link
	href="${pageContext.request.contextPath}/resources/custom/custom.css" rel="stylesheet" />

<script
	src="${pageContext.request.contextPath}/resources/jquery-3.1.1/jquery-3.1.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	

<decorator:head/>
</head>

	<!-- Jóvi -->
	<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/suporten2/index/">Back Office - Baixa Off Line</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
				
					<li><a href="/suporten2/baixa/backoffice/">Home</a></li>
						
							<li><a href="/suporten2/atendimento/">Registro Baixa</a></li>
							

                                                            
								<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Painel Encerramento <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li class="dropdown-header">Baixa</li>
										<li><a href="/suporten2/baixa/backoffice/backlistba/">BA</a></li>
                                                                                <li><a href="/suporten2baixa/backoffice/backlistba/">TT</a></li>
										<li role="separator" class="divider"></li>
										<li class="dropdown-header">Relatórios</li>
										<li><a href="/suporten2/index/">BA</a></li>
										<li><a href="/suporten2/index/">TT</a></li>
																			</ul>
								</li>
                                                                
                                                                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administração <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li class="dropdown-header">Relatórios</li>
										<li><a href="/suporten2/relatorio/create">Base</a></li>
										<li role="separator" class="divider"></li>
										<li class="dropdown-header">Cadastros</li>
										<li><a href="/suporten2/rede">Rede</a></li>
										<li><a href="/suporten2/macroMotivo">Motivo de Suporte</a></li>
										<li><a href="/suporten2/motivo">Defeito Encontrado</a></li>
										<li><a href="/suporten2/solucao">Solução</a></li>
									</ul>
								</li>
											
											
				</ul>
				<ul class="nav navbar-nav navbar-right">
				
					
					
				</ul>
			</div>
		</div>
	</nav>

	


</html>