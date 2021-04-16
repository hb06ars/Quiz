<!-- HEADER -->
<jsp:include page="includes/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!-- HEADER -->
<!-- MODAL -->
<!-- TABELAS COM FILTRO -->
<jsp:include page="includes/jquery/filtro.jsp" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.2.min.js"></script> 
<script type="text/javascript" src="includes/jquery/script.js"></script>
<!-- TABELAS COM FILTRO -->
<!-- DOWNLOAD EXCEL -->
<jsp:include page="includes/jquery/excel/downloadExcel.jsp" />
<!-- DOWNLOAD EXCEL -->
<!-- UPLOAD EXCEL -->
<jsp:include page="includes/modais/modalUploadExcel.jsp" />
<!-- UPLOAD EXCEL -->
<jsp:include page="includes/modais/modalInserirCliente.jsp" />

<style>
.zoom {
  transition: transform .2s;
}
.zoom:hover {
  -ms-transform: scale(1.1); /* IE 9 */
  -webkit-transform: scale(1.1); /* Safari 3-8 */
  transform: scale(1.1); 
}
.nota {
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.6);
  transition: 0.3s;
  border-radius: 10px; /* 5px rounded corners */
}
</style>



<!-- INICIANDO P�GINA -->
<div class="main-container">

<input type=hidden id="codigoSelecionado" value="" />
<input type=hidden id="valorSelecionado" value="" />
<input type=hidden id="subTotalSelecionado" value="" />


<!-- SELECIONANDO A MESAS --->		   
<div id="mesa" class="container" style="display:block">
    <div class="row">
        <div class="col text-center">
            <h5 class="subtitle">QUIZ</h5>
            <p class="text-secondary">Perguntas e Respostas</p>
        </div>
    </div>
    <div class="row text-center mt-3">
	        <div class="col-12 col-md-12" style="cursor:pointer;" >
	            <div class="card border-0 mb-4">
	                <div class="card-body">
	                    <div class="avatar avatar-60 bg-default-light rounded-circle text-default">
	                        <img src="/img/trofeu.jpg" alt="" class="w-100">
	                    </div>
	                    <p class="mt-3 mb-0 font-weight-normal" ><b>POSI��O:  ${usuarioSessao.colocacao}� LUGAR </b></p>
	                    <p class="mt-3 mb-0 font-weight-normal" style="color:white">Ocupada</p>
	                    <p class="text-dark medium"><b>SEU RECORDE: ${usuarioSessao.recorde}</b></p>
	                </div>
	            </div>
	        </div>
    </div>
</div>
<!-- SELECIONANDO A MESAS --->	

		   
<!-- SELECIONANDO O CATEGORIA --->
<div id="categoria" class="container" style="display:none">
    <div class="row">
        <div class="col text-center">
            <h5 class="subtitle">Selecione as Categorias  &nbsp <i style="cursor:pointer" onclick="inicio()" class="material-icons vm md-36 text-template">keyboard_return</i> </h5>
            <p id="txt_mesa" class="text-secondary">MESA ?</p>
        </div>
    </div>
    <div class="row text-center mt-3">
    	<c:forEach items="${categorias }" var="c">
	        <div class="col-6 col-md-3" onclick="categoria('${c.descricao }')" style="cursor:pointer">
	            <div class="card border-0 mb-4">
	                <div class="card-body">
	                    <div class="avatar avatar-100 bg-default-light rounded-circle text-default">
	                        <img src="/img/lanches.jpg" alt="" class="w-100">
	                    </div>
	                    <p class="mt-3 mb-0 font-weight-normal"><b>${c.descricao }</b></p>
	                </div>
	            </div>
	        </div>
        </c:forEach>
        
    </div>
</div>
<!-- SELECIONANDO O CATEGORIA --->





<!-- SELECIONANDO O PRODUTO --->
<div id="produto" class="container" style="display:none">
    <div class="row">
        <div class="col text-center">
            <h5 class="subtitle">Selecione o Produto <i style="cursor:pointer" onclick="voltaCategoria()" class="material-icons vm md-36 text-template">keyboard_return</i> </h5>
             <p id="txt_categoria" class="text-secondary">PRODUTO ?</p>
			<div onclick="lista()" style="cursor:pointer;background-color:#585858; color:white " class="icon icon-50 rounded-circle mb-2"><span class="material-icons">fact_check</span></div>
        </div>
		
    </div>
    <div class="row text-center mt-3" id="listaProdutos" style="cursor:pointer">
    </div>
</div>
<!-- SELECIONANDO O PRODUTO --->





<!-- SELECIONANDO A LISTA --->
<div id="lista" class="container" style="display:none">
    <div class="row">
        <div class="col text-center">
            <h5 class="subtitle">Total da Compra <i style="cursor:pointer" onclick="categoria(global_categoria)" class="material-icons vm md-36 text-template">keyboard_return</i> </h5>
            <div style="cursor:pointer;background-color:red; color:white" onclick="cancelarVenda()" class="icon icon-50 rounded-circle mb-4 "><span class="material-icons">delete_forever</span></div>
			<div style="cursor:pointer;background-color:green; color:white" onclick="finalizandoVenda()" class="icon icon-50 rounded-circle mb-4"><span class="material-icons">check_circle_outline</span></div>
			<div style="cursor:pointer;background-color:#FA8258; color:white" onclick="modalInserirCliente()" class="icon icon-50 rounded-circle mb-4"><span class="material-icons">person</span></div>
			<div style="cursor:pointer;background-color:blue; color:white" onclick="imprimirNota()" class="icon icon-50 rounded-circle mb-4"><span class="material-icons">print</span></div>
        </div>
		
		
		<div class="col-md-12 form-group">
			<div class="nota grid-container" style="background-color:#FFFFFF;">  
				<div id="geral" style="padding:10px;">
			    	<table id="notaListaProdutos" >
				    	<tr><td colspan="5">PEDIDO: <i id="numPedido">-</i> </td></tr>
				    	<tr><td colspan="5">Mesa: <i id="mesa_pedido">-</i> </td></tr>
				    	<tr><td colspan="5" id="notaData"> - </td></tr>
						<tr><td>C�d.</td><td>Descr.</td><td>Valor</td><td>Qtd.</td><td>SubTotal</td></tr>
						
						<tr><td colspan="5"><br><b>TOTAL: R$<i id="totalVenda"> ${totalinicio} </i></b></td></tr>
					</table>
					<table id="dadosCliente" >
						<tr><td colspan="5"><br><b>CLIENTE:</b> <i id="infoCliente"> Nenhum cliente selecionado. </i></b></td></tr>
					</table>
				</div>
			</div>
		</div>
	
	
</div>
<!-- SELECIONANDO A LISTA --->





			
<form action="<c:url value='/finalizarVenda'/>" id="formVenda" method="post" >
	<input type="hidden" id="finalizar" name="finalizar" value="0" />
	<input type="hidden" id="cancelar" name="cancelar" value="0" />
	<input type="hidden" id="numeroMesa" name="numeroMesa" />
	<input type="hidden" id="pedidoVenda" name="pedidoVenda" />
	<input type="hidden" id="notaDataVenda" name="notaDataVenda" />
	<input type="hidden" id="valorTotalVenda" name="valorTotalVenda" />
	<input type="hidden" id="vendas" name="vendas" value=""/>
</form>        
           
</div>
<!-- INICIANDO P�GINA -->







<!-- FOOTER -->
<jsp:include page="includes/barraFooter.jsp" />
<!-- FOOTER -->

<!-- FOOTER -->
<jsp:include page="includes/footer.jsp" />
<!-- FOOTER -->
