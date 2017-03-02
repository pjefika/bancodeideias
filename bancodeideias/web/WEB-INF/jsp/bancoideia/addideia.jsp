<%-- 
    Document   : cadideia
    Created on : 01/03/2017, 10:50:48
    Author     : G0025381
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<form action="${linkTo[BancoIdeiaController].addideia}" method="post" style="width: 100%;">

<!--<form action="<c:url value='/bancodeideias/addideia/'/>">-->
    <div class="row">
        <div class="col-md-6" > 

            <table class="table table-bordered">
                <thead>
                <label>
                    Nome do Colaborador
                </label>
                <div class="form-group">
                    <input type="text"
                           class="form-control" 
                           id="nome" 
                           placeholder="Colaborador"
                           name="BancoDeIdeias.nome">
                </div>
        </div> 

        <div class="form-group">
            <label>
                Nome do Supervisor
            </label>
            <input type="text"
                   class="form-control" 
                   id="supervisor" 
                   placeholder="Nome do Supervisor"
                   name="BancoDeIdeias.supervisor">
        </div>

        <div class="form-group">
            <label>
                Descreva sua idéia detalhadamente.
            </label>
            <textarea cols="76" rows="10" id="ideia" class="form-control" placeholder="Descreva sua idéia detalhadamente." name="BancoDeIdeias.ideia"></textarea>

        </div>
        <div class="form-group">
            <label>
                O que deverá ser realizado para que a sua idéia seja implantada?
            </label>
            <textarea cols="76" rows="4" id="implantar" class="form-control" placeholder="O que deverá ser realizado para que a sua idéia seja implantada?" name="BancoDeIdeias.implantar"></textarea>

        </div>
        <div class="form-group">
            <label>
                A sua idéia irá proporcionar ganhos nos indicadores operacionais do CO? Detalhe quais são:
            </label>
            <textarea cols="76" rows="4" id="ganhos" class="form-control" placeholder="A sua idéia irá proporcionar ganhos nos indicadores operacionais do CO? Detalhe quais são:" name="BancoDeIdeias.ganhos"></textarea>

        </div>
        <div class="form-group">
            <label>
                Será necessário alteração nos processos e ferramentas de atendimento? Descreva quais?
            </label>
            <textarea cols="76" rows="4" id="processos" class="form-control" placeholder="Será necessário alteração nos processos e ferramentas de atendimento? Descreva quais?" name="BancoDeIdeias.processos"></textarea>

        </div>



    </div> 


</table>
</div>
<div class="col-md-3">

    <div class="form-group">
        <label>
            Login.
        </label>
        <input type="text"
               class="form-control" 
               id="login" 
               placeholder="Login"
               name="m.login">
    </div>
</div>
<div class="col-md-3">

    <div class="form-group">
        <label>
            Equipe de atuação.
        </label>
        <input type="text"
               class="form-control" 
               id="equipe" 
               placeholder="Equipe de atuação"
               name="m.equipe">
    </div>

</div>
<img src='http://efika/web/img_material/Banco de Ideias_Material_45/Banco de Ideias_6.png' style='width:50%'>
</div>
<center> 
    <button type="submit" class="btn btn-default">Registrar</button>
    <button type="button" class="btn btn-default" onclick="history.back(-1)" class="cancelar">Voltar</button>
</center>
</form>
