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
        <h1>Cadastro Baixa Off Line BA</h1>
    </div>

    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Cidade</th>
                <th>Instancia</th>
                <th>Ordem</th>
                <th>Fechamento 1</th>
                <th>Fechamento 2</th>
                <th>Fechamento 3</th>
            </tr>
        </thead>   

        <tbody>

        <form action="<c:url value='/baixa/adicionar/ba/'/>">
            <tr>

                <td> <input type="text" class="form-control" name="baixaba.cidade"></></td>
                <td><input type="text" class="form-control" name="baixaba.instancia"></></td>
                <td><input type="text" class="form-control" name="baixaba.ordem"></></td>
                <td><select name="baixaba.fechamento1" class="form-control">            
                        <option>A</option>
                        <option>B</option>
                        <option>C</option>        
                    </select></td>

                <td><select name="baixaba.fechamento2" class="form-control">
                        <option>A</option>
                        <option>B</option>
                        <option>C</option>
                    </select></td>
                <td> <select name="baixaba.fechamento3" class="form-control">
                        <option>A</option>
                        <option>B</option>
                        <option>C</option>
                    </select></td>


                </td>
            </tr>
            </tbody>
    </table>
    <center>
        <button type="submit" class="salvar_blocos">Salvar</button>
        <button type="button" onclick="history.back(-1)" class="cancelar">Cancelar</button>
    </center>
</form>

</div>
