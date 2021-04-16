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



<!-- INICIANDO PÁGINA -->
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
	                    <p class="mt-3 mb-0 font-weight-normal" ><b>POSIÇÃO:  ${usuarioSessao.colocacao}º LUGAR </b></p>
	                    <p class="mt-3 mb-0 font-weight-normal" style="color:white">Ocupada</p>
	                    <p class="text-dark medium"><b>SEU RECORDE: ${usuarioSessao.recorde}</b></p>
	                </div>
	            </div>
	        </div>
    </div>
</div>
<!-- SELECIONANDO A MESAS --->	

		


     
           
</div>
<!-- INICIANDO PÁGINA -->







<!-- FOOTER -->
<jsp:include page="includes/barraFooter.jsp" />
<!-- FOOTER -->

<!-- FOOTER -->
<jsp:include page="includes/footer.jsp" />
<!-- FOOTER -->

