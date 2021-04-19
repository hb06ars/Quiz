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
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.2.min.js"></script> 
<script type="text/javascript" src="includes/jquery/script.js"></script>
<!-- TABELAS COM FILTRO -->


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

<script>
window.history.forward();

function desabilitaF5(e) { 
	  if ((e.which || e.keyCode) == 116) 
	    e.preventDefault(); 
	};
	$(document).on("keydown", desabilitaF5); // com jQuery
	//document.addEventListener("keydown", desabilitaF5); // com JavaScript


var repeticoes = 0;

function vermelho(valor){
	document.getElementById(valor).style.color = "white";
	document.getElementById(valor).style.background = "#084B8A";
	document.getElementById(valor).style.borderColor = "#084B8A";
}
function normal(valor){
	document.getElementById(valor).style.color = "black";
	document.getElementById(valor).style.background = "#E6E6E6";
	document.getElementById(valor).style.borderColor = "#E6E6E6";
}

function escolher(alternativa){
	repeticoes = repeticoes+1;
	if(repeticoes <= 1){
		var resposta = document.getElementById(alternativa).innerHTML;
		resposta = resposta.replace("A) ","").replace("B) ","").replace("C) ","").replace("D) ","").replace("E) ","").substr(1);
		var questao = document.getElementById("questao").innerHTML;
		document.getElementById("questaoSubmit").value = questao;
		document.getElementById("respostaSubmit").value = resposta;
		document.getElementById("formJogar").submit();	
	}
}





</script>

<!-- INICIANDO PÁGINA -->
<div class="main-container">


<!-- QUESTOES --->		   
<div id="mesa" class="container" style="display:block">
    <div class="row">
        <div class="col text-center">
            <p class="subtitle"><b>
            PONTUAÇÃO ATUAL: ${usuarioSessao.pontuacao } PONTOS <br> 
            TENTATIVAS: ${usuarioSessao.tentativas } DE 5</b>
            </p>
        </div>
    </div>
    <form action="/jogar" id="formJogar" method="post" enctype="multipart/form-data" accept-charset="UTF-8">
	    <div class="row text-center mt-3">
			<div class="col-12 col-md-12" style="cursor:pointer;" >
		        <div class="card border-0 mb-4">
		        	<div class="card-body">
		            	<h6 class="text-left" id="questao" >${perg}</h6>
		                <p>&nbsp</p>
		                <p style="border: 12px solid #E6E6E6; border-radius: 10px;background-color:#E6E6E6" class="text-left" id="alt1" onmouseup="escolher('alt1')" onmouseover="vermelho('alt1')" onmouseout="normal('alt1')"> A) ${alt1}</p>
		                <p style="border: 12px solid #E6E6E6; border-radius: 10px;background-color:#E6E6E6" class="text-left" id="alt2" onmouseup="escolher('alt2')" onmouseover="vermelho('alt2')" onmouseout="normal('alt2')"> B) ${alt2}</p>
		                <p style="border: 12px solid #E6E6E6; border-radius: 10px;background-color:#E6E6E6" class="text-left" id="alt3" onmouseup="escolher('alt3')" onmouseover="vermelho('alt3')" onmouseout="normal('alt3')"> C) ${alt3}</p>
		                <p style="border: 12px solid #E6E6E6; border-radius: 10px;background-color:#E6E6E6" class="text-left" id="alt4" onmouseup="escolher('alt4')" onmouseover="vermelho('alt4')" onmouseout="normal('alt4')"> D) ${alt4}</p>
		                <p style="border: 12px solid #E6E6E6; border-radius: 10px;background-color:#E6E6E6" class="text-left" id="alt5" onmouseup="escolher('alt5')" onmouseover="vermelho('alt5')" onmouseout="normal('alt5')"> E) ${alt5}</p>
		            </div>
		    	</div>
		    </div>
	    </div>
	    <input type=hidden id="idQuestao" name="idQuestao" value="${idQuestao}" />
	    <input type=hidden id="questaoSubmit" name="questaoSubmit" value="" />
	    <input type=hidden id="respostaSubmit" name="respostaSubmit" value="" />
	</form>
</div>
<!-- QUESTOES --->	

		   



 
           
</div>
<!-- INICIANDO PÁGINA -->







<!-- FOOTER -->
<jsp:include page="includes/barraFooter.jsp" />
<!-- FOOTER -->

<!-- FOOTER -->
<jsp:include page="includes/footer.jsp" />
<!-- FOOTER -->

