<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="page-header">
    <h2>Tratativa da Baixa Ba</h2>
</div>




<div class="page-header">
    <h1>Baixas enviadas - BA</h1>
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
            <th>Novo Status</th>
        </tr>
    </thead>
    <tr><form action="${linkTo[BaixaController].update}" method="post"  style="width: 50%;"> 
        <input type="hidden" name="m.id" value="${resultado.id}" /> 
        <td>${resultado.cidade}</td>
        <td>${resultado.instancia}</td>
        <td>${resultado.ordem}</td>
        <td>${resultado.fechamento1}</td>
        <td>${resultado.fechamento2}</td>
        <td>${resultado.fechamento3}</td>
        <td>	<div class="form-group">
                <div class="form-inline">

                    <select class="form-control" name="m.status" id="novostatus">
                        <c:forEach items="${StatusBaixa}" var="StatusBaixa">
                            <option <c:if test="${StatusBaixa == resultado.status}">selected </c:if> >${StatusBaixa}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
        </td>

        </tr>         
        <div class="form-group">

        </div>
        <td>
            <button type="submit" class="btn btn-default">Alterar</button>
        </td>


    </form>
</tr>
</tbody>
</table>




<button type="button" onclick="history.back(-1)" class="cancelar">Voltar</button>



