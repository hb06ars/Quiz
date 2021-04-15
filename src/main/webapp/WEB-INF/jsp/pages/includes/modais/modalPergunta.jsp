<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>




<!--  EDITAR Pergunta -->
<script>
function modalEditarPergunta(perguntaID, codigo, pergunta, correta, resposta1, resposta2, resposta3, resposta4){
	document.getElementById("form").action = "/atualizarPergunta";
	var index = 1;
	document.getElementById("codigo").readOnly = true;
	document.getElementById("codigo").value = codigo;
	document.getElementById("codigo").required = true;
	document.getElementById("questao").value = pergunta;
	document.getElementById("questao").required = true;
	document.getElementById("correta").value = correta;
	document.getElementById("correta").required = true;
	document.getElementById("resposta1").value = resposta1;
	document.getElementById("resposta1").required = true;
	document.getElementById("resposta2").value = resposta2;
	document.getElementById("resposta2").required = true;
	document.getElementById("resposta3").value = resposta3;
	document.getElementById("resposta3").required = true;
	document.getElementById("resposta4").value = resposta4;
	document.getElementById("resposta4").required = true;
	document.getElementById("perguntaID").value = perguntaID;
	document.getElementById("alterarPergunta").value = "1";
	document.getElementById("salvarPergunta").value = "0";
	document.getElementById("pesquisarPergunta").value = "0";
	$("#modalEditarPergunta").modal().show();
}

function modalNovoPergunta(){
	document.getElementById("form").action = "/atualizarPergunta";
	document.getElementById("codigo").value = '';
	document.getElementById("codigo").readOnly = false;
	document.getElementById("codigo").required = true;
	document.getElementById("questao").value = '';
	document.getElementById("questao").readOnly = false;
	document.getElementById("questao").required = true;
	
	document.getElementById("correta").value = '';
	document.getElementById("correta").readOnly = false;
	document.getElementById("correta").required = true;
	
	document.getElementById("resposta1").value = '';
	document.getElementById("resposta1").readOnly = false;
	document.getElementById("resposta1").required = true;
	
	document.getElementById("resposta2").value = '';
	document.getElementById("resposta2").readOnly = false;
	document.getElementById("resposta2").required = true;
	
	document.getElementById("resposta3").value = '';
	document.getElementById("resposta3").readOnly = false;
	document.getElementById("resposta3").required = true;
	
	document.getElementById("resposta4").value = '';
	document.getElementById("resposta4").readOnly = false;
	document.getElementById("resposta4").required = true;
	
	document.getElementById("alterarPergunta").value = "0";
	document.getElementById("salvarPergunta").value = "1";
	document.getElementById("pesquisarPergunta").value = "0";
	$("#modalEditarPergunta").modal().show();
}


function modalPesquisarPergunta(){
	document.getElementById("form").action = "/pesquisarPergunta";
	document.getElementById("codigo").readOnly = false;
	document.getElementById("codigo").required = false;
	document.getElementById("codigo").value = '';
	document.getElementById("questao").value = '';
	document.getElementById("questao").readOnly = false;
	document.getElementById("questao").required = false;
	
	document.getElementById("correta").value = '';
	document.getElementById("correta").readOnly = false;
	document.getElementById("correta").required = false;
	
	document.getElementById("resposta1").value = '';
	document.getElementById("resposta1").readOnly = false;
	document.getElementById("resposta1").required = false;
	
	document.getElementById("resposta2").value = '';
	document.getElementById("resposta2").readOnly = false;
	document.getElementById("resposta2").required = false;
	
	document.getElementById("resposta3").value = '';
	document.getElementById("resposta3").readOnly = false;
	document.getElementById("resposta3").required = false;
	
	document.getElementById("resposta4").value = '';
	document.getElementById("resposta4").readOnly = false;
	document.getElementById("resposta4").required = false;
	

	document.getElementById("alterarPergunta").value = "0";
	document.getElementById("salvarPergunta").value = "0";
	document.getElementById("pesquisarPergunta").value = "1";
	$("#modalEditarPergunta").modal().show();
}
</script>


<form action="<c:url value='/atualizarPergunta'/>" id="formAtualizarProd" method="post" enctype="multipart/form-data" accept-charset="UTF-8" >
<div class="modal fade" id="modalEditarPergunta" tabindex="-1" role="dialog" aria-labelledby="TituloModalCentralizado" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="TituloModalCentralizado">Pergunta</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body input-group mb-3">
      	<div class="input-group mb-3">
  			<div>
  			Código:
  			</div>
  			<div class="input-group mb-3">
  				<input class="form-control" id="codigo" name="codigo" type="text" required aria-describedby="inputGroup-sizing-default">
			</div>
		</div>
		<div class="input-group mb-3">
  			<div>
  			Pergunta:
  			</div>
  			<div class="input-group mb-3">
  				<input class="form-control" id="questao" name="questao" type="text" required aria-describedby="inputGroup-sizing-default">
			</div>
		</div>
		<div class="input-group mb-3">
  			<div>
  			Resposta Correta:
  			</div>
  			<div class="input-group mb-3">
  				<input class="form-control" id="correta" name="correta" type="text" required aria-describedby="inputGroup-sizing-default">
			</div>
		</div>
		<div class="input-group mb-3">
  			<div>
  			Resposta Errada:
  			</div>
  			<div class="input-group mb-3">
  				<input class="form-control" id="resposta1" name="resposta1" type="text" required aria-describedby="inputGroup-sizing-default">
			</div>
		</div>
		<div class="input-group mb-3">
  			<div>
  			Resposta Errada:
  			</div>
  			<div class="input-group mb-3">
  				<input class="form-control" id="resposta2" name="resposta2" type="text" required aria-describedby="inputGroup-sizing-default">
			</div>
		</div>
		<div class="input-group mb-3">
  			<div>
  			Resposta Errada:
  			</div>
  			<div class="input-group mb-3">
  				<input class="form-control" id="resposta3" name="resposta3" type="text" required aria-describedby="inputGroup-sizing-default">
			</div>
		</div>
		<div class="input-group mb-3">
  			<div>
  			Resposta Errada:
  			</div>
  			<div class="input-group mb-3">
  				<input class="form-control" id="resposta4" name="resposta4" type="text" required aria-describedby="inputGroup-sizing-default">
			</div>
		</div>
		
      </div>
      <div class="modal-footer">
      	<input type="hidden" name="alterar" id="alterarPergunta" value="0">
      	<input type="hidden" name="salvar" id="salvarPergunta" value="0">
      	<input type="hidden" name="pesquisar" id="pesquisarPergunta" value="0">
      	<input type="hidden" name="perguntaID" id="perguntaID">
      	<input type="submit" name="submit" class="btn btn-primary" value="Ok">
        <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
      </div>
    </div>
  </div>
</div>
</form>
<!--  EDITAR Pergunta -->


