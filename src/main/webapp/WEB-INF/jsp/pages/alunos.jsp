<!-- HEADER -->
<jsp:include page="includes/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!-- HEADER -->
<!-- MODAL -->
<jsp:include page="includes/modais/modalAluno.jsp" />
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
<jsp:include page="includes/modais/modalDeletarTudo.jsp" />
<!-- UPLOAD EXCEL -->

<div class="card mb-4">

<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
	<h1 class="h4">&nbsp&nbsp Alunos</h1>
	<div>
		<c:if test="${usuarioSessao.perfil.admin}">
			<button class="shadow btn btn-sm btn-outline-dark" onclick="modalNovoAluno()"><span class="material-icons icon">person_add</span></button>
		</c:if>
		<button class="shadow btn btn-sm btn-outline-dark" onclick="tableToExcel('tabela', 'Documento')"><span class="material-icons icon">save</span></button>
		<c:if test="${usuarioSessao.perfil.admin}">
			<button class="shadow btn btn-sm btn-outline-dark" onclick="modalUploadExcel('alunos')"><span class="material-icons icon">publish</span></button>
			<button class="shadow btn btn-sm btn-outline-dark" onclick="limparTudo('ALUNOS')"><span class="material-icons icon">delete</span></button>
		</c:if>
		&nbsp&nbsp
	</div>
</div>


<div class="card" >
<div class="card-body p-0 border-0" style="overflow: auto; width: 100%">
	<table id="tabela" class="table table-striped table-bordered table-sm">
		<thead>
		<tr>
		<c:if test="${ usuarioSessao.perfil.admin}">
			<th>Editar </th>
		</c:if> 
		<c:if test="${ !usuarioSessao.perfil.admin}">
			<th></th>
		</c:if> 
		
		<th>ID</th> <th>Nome</th> <th>Perfil</th> <th>S�rie</th> <th>Turma</th>
		<c:if test="${usuarioSessao.perfil.admin}">
			<th>Endereco</th> <th>Bairro</th> <th>Cep</th> <th>Cidade</th> <th>Estado</th> <th>Telefone</th> <th>Ativo</th> <th>Email</th> <th>RA</th> <th>RG</th> <th>Cpf</th> <th>Data de Nascimento</th> <th>Responsavel</th> <th>CPF Respons�vel</th> <th>Suspensao</th>
		</c:if>
		
		<c:if test="${usuarioSessao.perfil.admin}">
			<th>Excluir</th> 
		</c:if>
		
		<tr>
		<th><span class="material-icons icon">edit</span></th>
		<th><input style="min-width:40px;max-width:40px" type="text" id="filtro1"/></th>
		<th><input type="text" id="filtro2"/></th>
		<th><input type="text" id="filtro3"/></th>
		<th><input type="text" id="filtro4"/></th>
		<th><input type="text" id="filtro5"/></th>
		<c:if test="${usuarioSessao.perfil.admin}">
			<th><input type="text" id="filtro6"/></th>
			<th><input type="text" id="filtro7"/></th>
			<th><input type="text" id="filtro8"/></th>
			<th><input type="text" id="filtro9"/></th>
			<th><input type="text" id="filtro10"/></th>
			<th><input type="text" id="filtro11"/></th>
			<th><input type="text" id="filtro12"/></th>
			<th><input type="text" id="filtro13"/></th>
			<th><input type="text" id="filtro14"/></th>
			<th><input type="text" id="filtro15"/></th>
			<th><input type="text" id="filtro16"/></th>
			<th><input type="text" id="filtro17"/></th>
			<th><input type="text" id="filtro18"/></th>
			<th><input type="text" id="filtro19"/></th>
			<th><input type="text" id="filtro20"/></th>
		</c:if>
		
		<th></th>
		</tr>
		
		
		</thead>
		<tbody>
		<tr>
		
		
		
		<c:forEach items="${alunos}" var="a">
			<c:if test="${usuarioSessao.perfil.admin}">
				<td><span class="material-icons icon" style="cursor:pointer" onclick="modalEditarAluno(${a.id}, '${a.nome}', '${a.perfil.nome}', '${a.endereco}', '${a.bairro}', '${a.cep}', '${a.cidade}', '${a.estado}', '${a.telefone}',  ${a.ativo}, '${a.email}', '${a.ra}', '${a.rg}', '${a.cpf}', '${a.dataNascimento}', '${a.serie}', '${a.turma}', '${a.responsavel}', '${a.cpfResponsavel}', ${a.suspensao})">edit</span></td>
			</c:if>
			<c:if test="${!usuarioSessao.perfil.admin}">
				<td></td>
			</c:if>
			<td>${a.id}  
			<td>${a.nome}
			<td>${a.perfil.nome}
			<td>${a.serie}
			<td>${a.turma}
			
			<c:if test="${usuarioSessao.perfil.admin}">
				<td>${a.endereco}
				<td>${a.bairro}
				<td>${a.cep}
				<td>${a.cidade}
				<td>${a.estado}
				<td>${a.telefone}
				<td><c:if test="${a.ativo}">Sim</c:if> <c:if test="${!a.ativo}">N�o</c:if>
				<td>${a.email}
				<td>${a.ra}
				<td>${a.rg}
				<td>${a.cpf}
				<td>${a.dataNascimento}
				<td>${a.responsavel}
				<td>${a.cpfResponsavel}
				<td><c:if test="${a.suspensao}">Sim</c:if> <c:if test="${!a.suspensao}">N�o</c:if>
			</c:if>
						  
			<c:if test="${usuarioSessao.perfil.admin}">
				<td><span class="material-icons icon" style="cursor:pointer" onclick="modalDeletar('alunos', ${a.id})" >delete</span></td>
			</c:if>
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

