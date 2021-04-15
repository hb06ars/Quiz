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
<jsp:include page="includes/modais/modalDeletarTudo.jsp" />
<jsp:include page="includes/modais/modalUploadExcel.jsp" />
<!-- UPLOAD EXCEL -->



<div class="card mb-4" >

<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
	<h1 class="h4">&nbsp Cadastrar Hor�rio</h1>
	<div>
		<button class="shadow btn btn-sm btn-outline-dark" onclick="tableToExcel('tabela', 'Documento')"><span class="material-icons icon">save</span></button>
		<c:if test="${usuarioSessao.perfil.admin}">
			<button class="shadow btn btn-sm btn-outline-dark" onclick="modalUploadExcel('cadHorarios')"><span class="material-icons icon">publish</span></button>
			<button class="shadow btn btn-sm btn-outline-dark" onclick="limparTudo('HOR�RIOS')"><span class="material-icons icon">delete</span></button>
		</c:if>
		&nbsp
	</div>
</div>



<div class="card" >
<div class="card-body p-0 border-0" style="overflow: auto; width: 100%">

	<table id="tabela" class="table table-striped table-bordered table-sm" >
		<thead>
		<tr>
		
		<th>Dia</th> <th>Per�odo</th> <th>Hor�rio</th> <th>Sala</th> <th>Turma</th> <th>S�rie</th> <th>Disciplina</th> <th>Professor</th>
		
		<tr>
		<th><input style="min-width:80px;max-width:80px" type="text" id="filtro1"/></th>
		<th><input style="min-width:80px;max-width:80px" type="text" id="filtro2"/></th>
		<th><input style="min-width:60px;max-width:60px" type="text" id="filtro3"/></th>
		<th><input style="min-width:60px;max-width:60px"type="text" id="filtro4"/></th>
		<th><input style="min-width:60px;max-width:60px"type="text" id="filtro5"/></th>
		<th><input style="min-width:60px;max-width:60px"type="text" id="filtro6"/></th>
		<th><input style="min-width:160px;max-width:160px"type="text" id="filtro7"/></th>
		<th><input type="text" id="filtro8"/></th>
		</tr>
		
		</thead>
		<tbody>
		<tr>
		
		
		<c:forEach items="${horarios}" var="h">
			<td>${h.diaDaSemana}
			<td>${h.periodo.nome}
			<td>${h.horarioDaAula}
			<td>${h.sala}
			<td>${h.turma}
			<td>${h.serie}
			<td>${h.disciplina}
			<td>${h.usuario.nome}
			<tr>	
		</c:forEach>
		</tbody>
	</table>
	</div>
</div>
<br>
</div>

<!-- FOOTER -->
<jsp:include page="includes/barraFooter.jsp" />
<!-- FOOTER -->

<!-- FOOTER -->
<jsp:include page="includes/footer.jsp" />
<!-- FOOTER -->

