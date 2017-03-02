<body>
	<!-- Jóvi -->
	<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/suporten2/">SuporteN2</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
				
					<li><a href="/suporten2/">Home</a></li>
						
							<li><a href="/suporten2/atendimento/">Atendimento</a></li>
							
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
				
					
					        
					    
					        <li>
					        	<a href="/suporten2/usuario/logout">G0025381, Logout</a>
				        	</li>
					    
					
					
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<br>
		<br>
		<br>
		<br>
		
		
		

<script type="text/javascript" src="/suporten2/resources/dataTable/js/ledataTable.min.js"></script>
<link rel="stylesheet" href="/suporten2/resources/dataTable/css/dataTables.bootstrap.min.css">
<link rel="stylesheet" href="/suporten2/resources/dataTable/css/jquery.dataTables.min.css">
<div class="page-header">
	<h2>Listar Motivo de Suporte</h2>
</div>

<a class="row" href="/suporten2/macroMotivo/create">Adicionar</a>

<div id="listaMacro_wrapper" class="dataTables_wrapper no-footer"><div class="dataTables_length" id="listaMacro_length"><label>Mostrar <select name="listaMacro_length" aria-controls="listaMacro" class=""><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select> resultados</label></div><div id="listaMacro_filter" class="dataTables_filter"><label>Buscar:<input type="search" class="" placeholder="" aria-controls="listaMacro"></label></div><table class="table table-bordered dataTable no-footer" id="listaMacro" style="font-size: 12px;" role="grid" aria-describedby="listaMacro_info">
	<thead>
		<tr role="row"><th class="sorting_asc" tabindex="0" aria-controls="listaMacro" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Nome: ative para ordenar em ordem decrescente" style="width: 284px;">Nome</th><th class="sorting" tabindex="0" aria-controls="listaMacro" rowspan="1" colspan="1" aria-label="Rede: ative para ordenar em ordem ascendente" style="width: 74px;">Rede</th><th class="sorting" tabindex="0" aria-controls="listaMacro" rowspan="1" colspan="1" aria-label="Ativo: ative para ordenar em ordem ascendente" style="width: 72px;">Ativo</th><th class="sorting" tabindex="0" aria-controls="listaMacro" rowspan="1" colspan="1" aria-label="Ações: ative para ordenar em ordem ascendente" style="width: 93px;">Ações</th></tr>
	</thead>
	<tbody>
		
			
		
			
		
			
		
			
		
			
		
			
		
			
		
			
		
			
		
			
		
			
		
	<tr role="row" class="odd">
				<td class="sorting_1">Alteração de Perfil</td>
				<td>Metálico</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/14" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="14" data-nome="Alteração de Perfil" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="even">
				<td class="sorting_1">Baixa velocidade Download/Upload</td>
				<td>FTTx</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/10" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="10" data-nome="Baixa velocidade Download/Upload" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="odd">
				<td class="sorting_1">Defeito de Vídeo</td>
				<td>FTTx</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/11" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="11" data-nome="Defeito de Vídeo" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="even">
				<td class="sorting_1">Lentidão</td>
				<td>Metálico</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/15" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="15" data-nome="Lentidão" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="odd">
				<td class="sorting_1">Medição</td>
				<td>Metálico</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/18" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="18" data-nome="Medição" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="even">
				<td class="sorting_1">Não Conecta / Não Navega</td>
				<td>Metálico</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/17" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="17" data-nome="Não Conecta / Não Navega" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="odd">
				<td class="sorting_1">Não Conecta/Não Navega</td>
				<td>FTTx</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/12" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="12" data-nome="Não Conecta/Não Navega" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="even">
				<td class="sorting_1">Sem Sincronismo</td>
				<td>FTTx</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/13" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="13" data-nome="Sem Sincronismo" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="odd">
				<td class="sorting_1">Sem Sincronismo</td>
				<td>Metálico</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/16" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="16" data-nome="Sem Sincronismo" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr><tr role="row" class="even">
				<td class="sorting_1">VoIP</td>
				<td>FTTx</td>
				<td>
					
					    
					        Sim
					        
					    
					
				</td>
				
				<td>
					<a href="/suporten2/macromotivo/edit/19" class="btn btn-warning btn-sm"> 
						<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span>
					</a>
					<button class="btn btn-danger btn-sm deletar" data-id="19" data-nome="VoIP" data-toggle="modal" data-target=".bs-example-modal-sm">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					</button>
				</td>
			</tr></tbody>
</table><div class="dataTables_info" id="listaMacro_info" role="status" aria-live="polite">Mostrando 1 a 10 de 11 resultados</div><div class="dataTables_paginate paging_simple" id="listaMacro_paginate"><a class="paginate_button previous disabled" aria-controls="listaMacro" data-dt-idx="0" tabindex="0" id="listaMacro_previous">Anterior</a><a class="paginate_button next" aria-controls="listaMacro" data-dt-idx="1" tabindex="0" id="listaMacro_next">Próxima</a></div></div>

<script>
	setTimeout(function(){
		$('#listaMacro').DataTable({
			  "pagingType": "simple"
		});
	});
	
	
	$('.deletar').click(function () {
		
		botao = $(this);
		
		var id = botao.data("id");
		var nome = botao.data("nome");
	
		$("#idRef").val(id);
		$("#nomeRef").text(nome);
		
	});

</script>

<div class="modal fade bs-example-modal-sm" id="modalDeletaRede" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
	<div class="modal-dialog modal-sm" role="document">
		<form action="/suporten2/macroMotivo/delete" method="post">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Confirmação</h4>
				</div>
				
				<input type="hidden" name="id" id="idRef">
				<div class="modal-body">
					Remover Motivo de Suporte <b id="nomeRef"></b>?
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
					<button type="submit" class="btn btn-danger">Confirmar</button>
				</div>
			</div>
		</form>
	</div>
</div>
	</div>
	<!-- /container -->


</body>