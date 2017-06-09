<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>



    <div class="alert alert-success" role="alert">Status da Ideia - ${i.status}</div>

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

        
        <br><br>

    </div>
</div>

<script>

    function limpa() {

    }


    $(document).ready(function () {

//        $("#guruLogin").change(function() {
//            var login = $(this).val();
//            $.ajax({
//                type: 'GET',
//                data: 'login=' + login,
//                url: 'http://efika/web/services/colaborador/',
//                dataType: 'xml',
//                success: function(xml) {
//                    $(xml).find('colaborador').each(function() {
//                        var nome = $(this).find('nome').text();
//                        var cargo = $(this).find('cargo').text();
//                        var supervisor = $(this).find('supervisor').text();
//                        var area = $(this).find('area').text();
//                        var pabx = $(this).find('pabx').text();
//
//                        if (nome === 'Colaborador não encontrado!') {
//                            //$("#nomeOperadorGuru").hide();
//                            $("#nomeOperadorGuru").text("Login não encontrado.");
//                        } else {
//                            $("#nomeOperadorGuru").text(nome + ' - Gestor: ' + supervisor);
//                            $("#nomeOperadorGuru").show();
//                        }
//                        if (login === '') {
//                            $("#nomeOperadorGuru").hide();
//                        }
//                    });
//                }
//            });
//        });
    });
</script>