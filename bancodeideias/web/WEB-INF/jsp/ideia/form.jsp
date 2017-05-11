<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="page-header">
    <h2>Cadastre sua Ideia</h2>
</div>
<div class="row">
    <div class="col-xs-7">
        <form action="${linkTo[IdeiaController].add}" method="post">

            <div class="form-group <c:if test="${not empty errors.from('i.titulo')}">has-error</c:if>">
                    <label class="control-label" for="inputSuccess1">Título</label>
                    <input type="text"
                           class="form-control" id="titulo"
                           placeholder="Título" name="i.titulo"/>
                    <span id="helpBlock2" class="help-block">${errors.from('i.titulo')}</span>
            </div>

            <div class="form-group <c:if test="${not empty errors.from('i.descricao')}">has-error</c:if>">
                    <label class="control-label" for="inputSuccess1">Descrição:</label>
                    <textarea
                        class="form-control" id="descricao"
                        placeholder="Descrição" name="i.descricao"/>
                    <span id="helpBlock2" class="help-block">${errors.from('i.descricao')}</span>
            </div>

            <div class="form-group <c:if test="${not empty errors.from('i.ganhos')}">has-error</c:if>">
                    <label class="control-label" for="inputSuccess1">Ganhos:</label>
                    <textarea
                        class="form-control" id="ganhos"
                        placeholder="Ganhos" name="i.ganhos"/>
                    <span id="helpBlock2" class="help-block">${errors.from('i.ganhos')}</span>
            </div>

            <div class="form-group <c:if test="${not empty errors.from('i.descComo')}">has-error</c:if>">
                    <label class="control-label" for="inputSuccess1">Como:</label>
                    <textarea
                        class="form-control" id="descComo"
                        placeholder="descComo" name="i.descComo"/>
                    <span id="helpBlock2" class="help-block">${errors.from('i.descComo')}</span>
            </div>

            <button type="submit" class="btn btn-default">Registrar</button>
        </form>
    </div>

</div>
<script>

    function limpa() {

    }


    $(document).ready(function() {

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