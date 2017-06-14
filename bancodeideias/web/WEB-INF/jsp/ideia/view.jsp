<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="page-header">
    <h2>Detalhes Ideia</h2>
</div>
<div>
    <p>
        <a class="btn btn-primary" onclick="history.back(-1)" class="cancelar" role="button">Voltar</a>
    </p>

</div>

<div class="row">
    <div class="col-xs-12">
        <div>
            <label class="control-label">Titulo:</label>
            <br>
            <span>${i.titulo}</span>
        </div>
        <br><br>
        <div>
            <label class="control-label">
                Descreva sua ideia detalhadamente:
            </label>
            <br>
            <span>${i.descricao}</span>
        </div>
        <br><br>
        <div>
            <label class="control-label">
                O que deverá ser realizado para que a sua ideia seja implantada?
            </label>
            <br>
            <span>${i.realizar}</span>
        </div>
        <br><br>
        <div>
            <label>
                A sua ideia irá proporcionar ganhos nos indicadores operacionais do CO? Detalhe quais são:
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

            <br><br>

        </div>
    </div>
    <a class="glyphicon glyphicon-thumbs-up btn-lg" href="" id=addCount alue="Adicionar Count" role="button btn"></a><span class="badge">$votosP</span>
    <br>
    <a class="glyphicon glyphicon-thumbs-down btn-lg" href="" role="button btn-lg"></a><span class="badge"></span>

    
    
    <input type=button id=addCount value="Adicionar Count">

<script>
var count = 0;
$('#addCount').click(function(){
  span class="badge";
  count++;
});


</script>
