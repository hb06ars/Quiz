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
<jsp:include page="includes/modais/modalPresenca.jsp" />
<jsp:include page="includes/modais/modalProfessor.jsp" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.2.min.js"></script> 
<script type="text/javascript" src="includes/jquery/script.js"></script>
<!-- TABELAS COM FILTRO -->
<!-- DOWNLOAD EXCEL -->
<jsp:include page="includes/jquery/excel/downloadExcel.jsp" />
<!-- DOWNLOAD EXCEL -->
<!-- UPLOAD EXCEL -->
<jsp:include page="includes/modais/modalUploadExcel.jsp" />
<!-- UPLOAD EXCEL -->

	
	
	
<div class="card mb-4" >

<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
	<h1 class="h4">&nbsp ${periodoAtual} - ${diaDaSemanaAtual }</h1>
	<div>
		<button class="shadow btn btn-sm btn-outline-dark" onclick="tableToExcel('tabela', 'Documento')"><span class="material-icons icon">save</span></button>
		&nbsp
	</div>
</div>


<form action="<c:url value='/filtrarMeusHorarios'/>" id="form" method="post" enctype="multipart/form-data" accept-charset="UTF-8">
	<div class="d-flex pt-3 pb-2 mb-3">
		<div>&nbsp&nbsp</div>
	  	<div> 
	  		<select class="form-control" id="periodo" name="periodo" required aria-describedby="inputGroup-sizing-default">
	  			<c:forEach items="${periodos}" var="p">
	  				<option value="${p.id }" <c:if test="${p.nome eq periodoAtual}">selected="selected"</c:if> >${p.nome }</option>
	  			</c:forEach>
			</select>
		</div>
		<div>&nbsp&nbsp</div>
		<div>
	  		<select class="form-control" id="semana" name="semana" required aria-describedby="inputGroup-sizing-default">
				<option value="seg" <c:if test="${diaDaSemanaAtual eq 'Segunda'} ">selected="selected"</c:if> >Segunda</option>
				<option value="ter" <c:if test="${diaDaSemanaAtual eq 'Ter�a'}">selected="selected"</c:if> >Ter�a</option>
				<option value="qua" <c:if test="${diaDaSemanaAtual eq 'Quarta'}">selected="selected"</c:if> >Quarta</option>
				<option value="qui" <c:if test="${diaDaSemanaAtual eq 'Quinta'}">selected="selected"</c:if> >Quinta</option>
				<option value="sex" <c:if test="${diaDaSemanaAtual eq 'Sexta'}">selected="selected"</c:if> >Sexta</option>
				<option value="sab" <c:if test="${diaDaSemanaAtual eq 'S�bado'}">selected="selected"</c:if> >S�bado</option>
				<option value="dom" <c:if test="${diaDaSemanaAtual eq 'Domingo'}">selected="selected"</c:if> >Domingo</option>
			</select>
		</div>
		<div>&nbsp&nbsp</div>
		<div>
	  		<input type="submit" id="pesquisar" class="form-control btn btn-secondary" value="Pesquisar" >
		</div>
	</div>
</form>



<div class="card" >
<div class="card-body p-0 border-0" style="overflow: auto; width: 100%">
	<table id="tabela" class="table table-striped table-bordered table-sm">
		<thead>
		<tr>
			<th colspan="5" style="background-color:#8EAAB9; vertical-align: middle;">Hor�rio</th>
		</tr>
		</thead>
		<tbody>
		<tr>
		<td style="background-color:#A6C6FB; vertical-align: middle;">Professor</td>
		<td style="background-color:#A6C6FB; vertical-align: middle;">In�cio</td>
		<td style="background-color:#A6C6FB; vertical-align: middle;">Sala</td>
		<td style="background-color:#A6C6FB; vertical-align: middle;">Turma</td>
		<td style="background-color:#A6C6FB; vertical-align: middle;">Disciplina</td>
		
		<tr>
		<c:forEach items="${horarios }" var="h">
			<td>${h.usuario.nome }</td>
			<td>${h.horarioDaAula}</td>
			<td>${h.sala}</td>
			<td>${h.serie}�${h.turma} </td>
			<td>${h.disciplina}</td>
			<tr>
		</c:forEach>
		
		</tbody>
	</table>
</div>
</div>
</div>


<!-- FOOTER -->
<jsp:include page="includes/barraFooter.jsp" />
<!-- FOOTER -->
<!-- FOOTER -->
<jsp:include page="includes/footer.jsp" />
<!-- FOOTER -->

