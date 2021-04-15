<!-- HEADER -->
<jsp:include page="includes/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!-- HEADER -->
<link href="script.js" rel="stylesheet" id="style">
<!-- HEADER -->
<jsp:include page="includes/modais/modalUsuario.jsp" />
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


<div class="card mb-4">
	<div
		class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-1 border-bottom">
		<h1 class="h4">&nbsp&nbsp Recordes</h1>
		
	</div>
	<div class="card" >
		<div class="card-body p-4 border-0" style="overflow: auto; width: 100%">
			<div class="input-group mb-1">
				<table id="tabela" class="table table-striped table-bordered table-sm">
					<c:if test="${usuarioSessao.perfil.admin}">
					<thead>
					<tr>
						<th>Ranking</th><th>Nome</th><th>Perfil</th><th>Recorde</th>
					<tr>
					<th><input type="text" id="filtro1"/></th>
					<th><input type="text" id="filtro2"/></th>
					<th><input type="text" id="filtro3"/></th>
					<th><input type="text" id="filtro4"/></th>
					</tr>
					</thead>
					<tbody>
						<tr>
						<c:set var = "pos" value = "0"/>
						<c:forEach items="${usuarios}" var="u">
							<c:set var = "pos" value = "${pos + 1}"/>
							<td>${pos }
							<td>${u.nome}
							<td>${u.perfil.nome}
							<td>${u.recorde}
							<tr>	
						</c:forEach>
					</tbody>
					</c:if>		
				</table>
			</div>
		</div>
	</div>
</div>








<!-- FOOTER -->
<jsp:include page="includes/barraFooter.jsp" />
<!-- FOOTER -->
<!-- FOOTER -->
<jsp:include page="includes/footer.jsp" />
<!-- FOOTER -->


