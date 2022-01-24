package brandaoti.sistema.controle.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import brandaoti.sistema.controle.dao.CategoriaDao;
import brandaoti.sistema.controle.dao.PerfilDao;
import brandaoti.sistema.controle.dao.PerguntaDao;
import brandaoti.sistema.controle.dao.UsuarioDao;
import brandaoti.sistema.controle.excel.Tabela;
import brandaoti.sistema.controle.model.Categoria;
import brandaoti.sistema.controle.model.Perfil;
import brandaoti.sistema.controle.model.Pergunta;
import brandaoti.sistema.controle.model.QuestaoJogo;
import brandaoti.sistema.controle.model.Usuario;


@Controller
public class ControleController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private PerfilDao perfilDao;
	@Autowired
	private CategoriaDao categoriaDao;
	@Autowired
	private PerguntaDao perguntaDao;
	
	public static String mensagem = "";
	public static String tituloMensagem = "";
	public static String tipoMensagem = "";
	public static String periodoAtual = "";
	public static String hoje = "";
	//public static List<Integer> questoesJogadas = new ArrayList<Integer>();
	//public static Integer questaoAnterior = 0;
	
	// ----------------------------------------------------------------------------------------
	//Perguntas iniciais
	public void iniciar() {
		PerguntasInicio pi = new PerguntasInicio();
		List<Pergunta> pergunta_temp = pi.iniciarPerguntas();
		for(Pergunta ptemp : pergunta_temp) {
			Pergunta p = new Pergunta();
			p.setAtivo(true);
			p.setCodigo(ptemp.getCodigo());
			p.setQuestao(ptemp.getQuestao());
			p.setCorreta(ptemp.getCorreta());
			p.setResposta1(ptemp.getResposta1());
			p.setResposta2(ptemp.getResposta2());
			p.setResposta3(ptemp.getResposta3());
			p.setResposta4(ptemp.getResposta4());
			perguntaDao.save(p);
		}
	}
	//Perguntas iniciais ----------------------------------------------------------------------------------------
	
	
	
	public List<Integer> gerarAleatorios(){
		Boolean valido = true;
        List<Integer> numeros = new ArrayList<Integer>();
        Random radom  = new Random();
		int numeroTmp = 0;
		numeroTmp = radom.nextInt(5);
		for(int i=0;i<5; i++) {
		    while(!valido){
		        numeroTmp = radom.nextInt(5);
		        if(numeros.contains(numeroTmp)){
		            valido = false;
		        } else{
		            valido = true;
		        }
		    }
		    if(valido){
		        numeros.add(numeroTmp);
		        valido = false;   
		    }	
		}
		return numeros;
	}
	
	public void colocacao(Usuario usuarioSessao) {
		//Colocação: ------------------------
		List<Usuario> u = usuarioDao.recordes();
		Integer colocacao = 1;
		for(Usuario users : u) {
			if(users.getId() == usuarioSessao.getId()) {
				break;
			} else {
				colocacao++;
			}
		}
		usuarioSessao.setColocacao(colocacao);
		usuarioDao.save(usuarioSessao);
		//Colocação: ------------------------
	}
	
	
	public void registraMsg(String titulo, String msg, String tipo) {
		tituloMensagem = titulo;
		mensagem = msg;
		tipoMensagem = tipo;
	}
	
	public HttpServletRequest enviaMsg(HttpServletRequest request) {
		request.setAttribute("mensagem", mensagem);
		request.setAttribute("tituloMensagem", tituloMensagem);
		request.setAttribute("tipoMensagem", tipoMensagem);
		mensagem = null;
		tituloMensagem = null;
		tipoMensagem = null;
		return request;
	}
	
	
	
	public String diaDaSemana() {
		Date d = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(d);
		String nome = "";
		int dia = c.get(c.DAY_OF_WEEK);
		switch(dia){
		case Calendar.SUNDAY: nome = "Domingo";
			break;
		case Calendar.MONDAY: nome = "Segunda";
			break;
		case Calendar.TUESDAY: nome = "Terça";
			break;
		case Calendar.WEDNESDAY: nome = "Quarta";
			break;
		case Calendar.THURSDAY: nome = "Quinta";
			break;
		case Calendar.FRIDAY: nome = "Sexta";
			break;
		case Calendar.SATURDAY: nome = "Sábado";
			break;
		}
		return nome;
	}
	
	public void hoje() {
		Calendar c = Calendar.getInstance();
		int ano = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH);
		m++;
		String mes = ""+m;
		if(m < 10){
		    mes = "0"+m;
		}
		int d = c.get(Calendar.DAY_OF_MONTH);
        String dia=""+d;
		if(d < 10){
		    dia = "0"+d;
		}
		hoje = ano+"-"+mes+"-"+dia;
	}
	
		@GetMapping({"/","/index"}) 
		public void index(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();
		Boolean logado = false;
		if(session.getAttribute("logado") != null) {
			logado = true;
			response.sendRedirect("/home");
		} else {
			List<Usuario> usuarios = usuarioDao.findAll();
			List<Perfil> perfis = perfilDao.findAll();
			hoje();
			if(perfis.size() == 0) {
				Perfil p = new Perfil();
				p.setAtivo(true);
				p.setNome("Admnistrador");
				p.setCodigo("1");
				p.setAdmin(true);
				p.setFuncionario(true);
				perfilDao.save(p);
				
				p = new Perfil();
				p.setAtivo(true);
				p.setNome("Usuário");
				p.setCodigo("2");
				p.setAdmin(false);
				p.setFuncionario(true);
				perfilDao.save(p);

			}
			if(usuarios.size() == 0) {
				Usuario u = new Usuario();
				u.setAtivo(true);
				u.setTelefone("(11)99999-9999");
				u.setPerfil(perfilDao.buscarAdm().get(0));
				u.setLogin("adm");
				u.setNome("Admnistrador");
				u.setSenha("adm");
				usuarioDao.save(u);
			}
			
			
			List<Pergunta> perguntas = perguntaDao.buscarPerguntas();
			if(perguntas.size() == 0) {
				try {
					iniciar();
				} catch (Exception e) {
				}
				
			}
			request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
		}
		
	}
	
	
	
	
	/* SALVAR EXCEL */
	@Transactional
	@RequestMapping(value = "/upload/excel", method = {RequestMethod.POST, RequestMethod.GET}) // Pagina de Altera��o de Perfil
	public void uploadExcel(HttpServletRequest request, HttpServletResponse response,  String tabelaUsada, @ModelAttribute MultipartFile file) throws Exception, IOException { //Fun��o e alguns valores que recebe...
		String atualizarPagina = "";
		String link = "/pages/home"; //Session
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao.getPerfil().getAdmin()) {
			switch (tabelaUsada) {  
		       case "pergunta" :
		    	   perguntaDao.deleteAll();
		    	   processaPergunta(file);
		    	   link = "/pages/perguntas";
		    	   atualizarPagina = "/perguntas";
		    	   break;
		       case "usuarios" :
		    	   processaUsuario(file);
		    	   link = "/pages/usuarios";
		    	   atualizarPagina = "/usuarios";
		    	   break;
			}
			registraMsg("Excel", "Dados inseridos com sucesso..", "info");
		}
		 //JSP que ir� acessar.
		request.setAttribute("atualizarPagina", atualizarPagina);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); //Retorna para a p�gina
	}
	
	
	
@SuppressWarnings("deprecation")
public List<Tabela> uploadExcelFile(@ModelAttribute MultipartFile file) throws Exception {
		
		List<Tabela> tabelas = new ArrayList<Tabela>();
		int linha = 1;
		int coluna = 0;
		try {
			InputStream in = file.getInputStream();
		    XSSFWorkbook workbook = new XSSFWorkbook(in);
		    XSSFSheet sheet = workbook.getSheet("Sheet1");
		    if(sheet == null) {
				sheet = workbook.getSheet("Plan1");
			}
		    if(sheet == null) {
				sheet = workbook.getSheet("Planilha1");
			}
			Iterator<Row> rowIterator = sheet.rowIterator();
			while (rowIterator.hasNext()) {
				coluna = 0;
				Row row = rowIterator.next();
				if (row.getRowNum() == 0) {
					continue;
				}
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
						if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
							Tabela tabela = new Tabela();
							tabela.setLinha(linha);
							tabela.setConteudo(cell.getStringCellValue());
							tabela.setColuna(coluna);
							tabelas.add(tabela);
						}
						else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
							Tabela tabela = new Tabela();
							tabela.setLinha(linha);
							tabela.setConteudo(cell.getNumericCellValue() + "");
							tabela.setColuna(coluna);
							tabelas.add(tabela);
						}
					coluna++;
				}
				linha++;
			}
		    in.close();
		    workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return tabelas;
	}


	
	
	@GetMapping(value = "/deslogar")
	public void deslogar(HttpServletRequest request, HttpServletResponse response) throws IOException {  
		String link = "/deslogar";
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect(link);
	}
	
	
	@RequestMapping(value = "/adm/deletando/{tabela}/{id}", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE}) // Pagina de Alteração de Perfil
	public void deletando(HttpServletRequest request, HttpServletResponse response, @PathVariable("tabela") String tabela, @PathVariable("id") Integer id) throws ServletException, IOException { //Função e alguns valores que recebe...
		String link = "/deslogar";
		String atualizarPagina = "";
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao.getPerfil().getAdmin()) {
			request.setAttribute("usuarioSessao", usuarioSessao);
			link = "/pages/"+tabela;
			if(tabela.equals("token")) {
				atualizarPagina = "/token";
				Usuario objeto = usuarioDao.findById(id).get();
				if(objeto != null)
					usuarioDao.deleteById(id);
				usuarioDao.flush();
				List<Usuario> tokens = usuarioDao.buscaTokens();
				request.setAttribute("atualizarPagina", atualizarPagina);
				request.setAttribute("tokens", tokens);
				
				registraMsg("Token", "Deletado com sucesso.", "erro");
			}
			if(tabela.equals("excluirUsuario")) {
				link = "pages/adversario";
				atualizarPagina = "/adversario";
				Usuario objeto = usuarioDao.findById(id).get();
				if(objeto != null) {
					usuarioDao.deleteById(objeto.getId());
					usuarioDao.flush();
				}
				List<Usuario> adversario = usuarioDao.funcionario();
				request.setAttribute("adversario", adversario);
				request.setAttribute("atualizarPagina", atualizarPagina);
				
				registraMsg("Funcionário", "Deletado com sucesso.", "erro");
			}
			if(tabela.equals("perguntas")) {
				link = "pages/perguntas";
				atualizarPagina = "/perguntas";
				Pergunta objeto = perguntaDao.findById(id).get();
				if(objeto != null) {
					try {
						perguntaDao.deleteById(objeto.getId());
						perguntaDao.flush();
					} catch(Exception e) {
						Pergunta p = perguntaDao.findById(objeto.getId()).get();
						p.setAtivo(false);
						perguntaDao.save(p);
					}
					
				}
				List<Pergunta> perguntas = perguntaDao.buscarPerguntas();
				request.setAttribute("perguntas", perguntas);
				request.setAttribute("atualizarPagina", atualizarPagina);
				
				registraMsg("Pergunta", "Deletado com sucesso.", "erro");
			}
			if(tabela.equals("categoria")) {
				link = "pages/categorias";
				atualizarPagina = "/categorias";
				Categoria objeto = categoriaDao.findById(id).get();
				if(objeto != null) {
					try {
						categoriaDao.deleteById(objeto.getId());
						categoriaDao.flush();
					} catch(Exception e) {
						Categoria p = categoriaDao.findById(objeto.getId()).get();
						p.setAtivo(false);
						categoriaDao.save(p);
					}
					
				}
				List<Categoria> categorias = categoriaDao.buscarCategorias();
				request.setAttribute("categorias", categorias);
				request.setAttribute("atualizarPagina", atualizarPagina);
				
				registraMsg("Categoria", "Deletada com sucesso.", "erro");
			}
			if(tabela.equals("usuario")) {
				link = "pages/usuarios";
				atualizarPagina = "/usuarios";
				Usuario objeto = usuarioDao.findById(id).get();
				if(objeto != null) {
					try {
						usuarioDao.deleteById(objeto.getId());
						usuarioDao.flush();
					} catch(Exception e) {
						Usuario p = usuarioDao.findById(objeto.getId()).get();
						p.setAtivo(false);
						usuarioDao.save(p);
					}
					
				}
				List<Usuario> usuarios = usuarioDao.usuarios();
				request.setAttribute("usuarios", usuarios);
				request.setAttribute("atualizarPagina", atualizarPagina);
				
				registraMsg("Usuário", "Usuário com sucesso.", "erro");
			}
			
		}
		
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	
	

	
	
	@RequestMapping(value = "/criar", method = {RequestMethod.POST,RequestMethod.GET})
	public void criar( HttpServletRequest request, HttpServletResponse response,  Usuario usuario, String codigoAcesso, String confirmaSenha) throws ServletException, IOException {  
		String link = "/criar";
		String erro="";
		String msg="";
		if(codigoAcesso != null && confirmaSenha != null) {
			if(!codigoAcesso.equals("") && !confirmaSenha.equals("")) {
				if(confirmaSenha.equals(usuario.getSenha())) {
					if(usuario.getLogin() != null) {
						if(!usuario.getLogin().replace(" ", "").equals("") && !usuario.getLogin().replace(" ", "").equals(" ")) {
							List<Usuario> u = usuarioDao.buscaLogin(usuario.getLogin());
							if(u.size() == 0) {
								Usuario user = usuarioDao.buscaAcesso(codigoAcesso);
								if(user != null) {
									user.setAtivo(true);
									user.setLogin(usuario.getLogin().replace(" ", ""));
									user.setNome(usuario.getNome());
									user.setPerfil(perfilDao.buscarFuncionario().get(0));
									if(usuario.getSenha() == null) {
										user.setSenha(usuario.getLogin().replace(" ", ""));
									} else {
										user.setSenha(usuario.getSenha());
									}	
									user.setTelefone(usuario.getTelefone());
									usuarioDao.save(user);
									msg = "Usuário "+usuario.getLogin()+" cadastrado com sucesso!";
								} else {
									erro = "Código de acesso inválido!";
									request.setAttribute("erro", erro);
								}
								request.setAttribute("msg", msg);
							} else {
								erro = "Login já existe.";
								request.setAttribute("erro", erro);
							}
						} else {
							erro = "Login inválido.";
							request.setAttribute("erro", erro);
						}
					}
				} else {
					erro = "Senha não confere com a confirmação";
					request.setAttribute("erro", erro);
				}
			}
		}	
		 
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	@RequestMapping(value = "/home", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void logar(HttpServletRequest request, HttpServletResponse response,  @RequestParam(value = "usuarioVal", defaultValue = "", required=false ) String variavelUsuario, @RequestParam(value = "senhaVal", defaultValue = "", required=false ) String variavelSenha) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		HttpSession session = request.getSession();
		String link = "deslogar";
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		} else {
			usuarioSessao = usuarioDao.fazerLogin(variavelUsuario, variavelSenha);
		}
		String itemMenuSelecionado = "";
		if(usuarioSessao != null) {
			session.setAttribute("usuarioSessao",usuarioSessao);
			usuarioSessao.setPontuacao(0);
			usuarioSessao.setTentativas(0);
			usuarioDao.save(usuarioSessao);
			if(usuarioSessao != null) {
				colocacao(usuarioSessao);
				request.setAttribute("usuarioSessao", usuarioSessao);
			}
			List<Categoria> categorias = categoriaDao.buscarCategorias();
			List<Pergunta> pergunta = perguntaDao.buscarPerguntas();
			
			Double totalinicio = 0.0;
			
			double d = totalinicio;
	        String s = String.format("%.2f", d);
	        s = s.replace(",", ".");
	        
	        if(session.getAttribute("itemMenuSelecionado") != null) {
	        	itemMenuSelecionado = (String) session.getAttribute("itemMenuSelecionado");
			}
	        
	        link = "pages/home";
			request.setAttribute("totalinicio", s);
			request.setAttribute("categorias", categorias);
			request.setAttribute("pergunta", pergunta);
			
			
		}
		
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/jogar", method = {RequestMethod.POST,RequestMethod.GET})
	public void jogar(HttpServletRequest request, HttpServletResponse response,  String questaoSubmit, String respostaSubmit, Integer idQuestao) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		HttpSession session = request.getSession();
		List<Integer> questoesJogadas = new ArrayList<Integer>();
		Integer questaoAnterior = 0;
		
		if(session.getAttribute("questoesJogadas") != null) {
			questoesJogadas = (List<Integer>) session.getAttribute("questoesJogadas");
		}
		if(session.getAttribute("questaoAnterior") != null) {
			questaoAnterior = (Integer) session.getAttribute("questaoAnterior");
		}
		
		Boolean trapaceou = false;
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			
			colocacao(usuarioSessao);
			
			if(idQuestao == questaoAnterior) {
				trapaceou = true;
				usuarioSessao.setPontuacao(0);
				usuarioSessao.setTentativas(0);
				usuarioDao.save(usuarioSessao);
			} else {
				questaoAnterior = idQuestao;
			}
			System.out.println("Trapaceou: "+trapaceou);
			
			
			if( questaoSubmit != null && respostaSubmit != null && idQuestao != null && !trapaceou) {
				String questao = questaoSubmit;
				String resposta = respostaSubmit;
				List<Pergunta> p = perguntaDao.analisar(questao,resposta,idQuestao);
				if(p.size() == 0) {
					//Errou
					Integer conta = usuarioSessao.getTentativas() + 1;
					usuarioSessao.setTentativas(conta);
					usuarioDao.save(usuarioSessao);
					if(usuarioSessao.getTentativas() > 4) {
						usuarioSessao.setPontuacao(0);
						usuarioSessao.setTentativas(0);
						usuarioDao.save(usuarioSessao);
					}
					colocacao(usuarioSessao);
					usuarioDao.save(usuarioSessao);
					String corretaResp = "";
					Pergunta pCorreta = perguntaDao.correta(questao,idQuestao);
					registraMsg("RESPOSTA", "ERRADA!<br><br> <b>Resposta correta:</b><br><br> "+pCorreta.getCorreta()+" ", "erro");
				} else {
					//Acertou
					Integer conta = usuarioSessao.getPontuacao() + 1;
					usuarioSessao.setPontuacao(conta);
					usuarioDao.save(usuarioSessao);
					if(usuarioSessao.getPontuacao() > usuarioSessao.getRecorde()) {
						usuarioSessao.setRecorde(usuarioSessao.getPontuacao());
						usuarioDao.save(usuarioSessao);
					}
					colocacao(usuarioSessao);
					usuarioDao.save(usuarioSessao);
					registraMsg("RESPOSTA", "CORRETA", "info");
				}
				usuarioSessao.setQuestaoAtual(0);
				usuarioDao.save(usuarioSessao);
			}
			
			if(trapaceou) {
				registraMsg("ATUALIZAÇÃO", "SEM ATUALIZAR A PÁGINA!", "erro");
			}
			
			// Gerar pergunta aleatória.
			List<Pergunta> p = perguntaDao.buscarPerguntas();
			Integer total = p.size();
			Random random = new Random();
			int aleatorio = random.nextInt(total);
			if(questoesJogadas.size() > 0) {
				while(questoesJogadas.contains(aleatorio) && total > questoesJogadas.size()) {
					aleatorio = random.nextInt(total);
					if(questoesJogadas.contains(aleatorio)) {
						aleatorio++;
					}
					if(aleatorio >= total) {
						aleatorio = 0;
					}
				}
			}
			if(usuarioSessao.getQuestaoAtual() > 0) {
				aleatorio = usuarioSessao.getQuestaoAtual();
			}
			//Questao atual para nao trapacear. Para nao clicar em voltar no navegador.
			usuarioSessao.setQuestaoAtual(aleatorio);
			usuarioDao.save(usuarioSessao);
			questoesJogadas.add(aleatorio);
			
			if(total <= questoesJogadas.size()) {
				questoesJogadas.clear();
				usuarioSessao.setPontuacao(0);
				usuarioSessao.setQuestaoAtual(0);
				usuarioDao.save(usuarioSessao);
				registraMsg("FINALIZADO", "PARABÉNS VOCÊ FINALIZOU TODAS!", "info");
			}
			
			QuestaoJogo questaoJogo = new QuestaoJogo();
			for(int i = 0; i < total; i++) {
				if(i == aleatorio) {
					questaoJogo.setQuestao(p.get(i).getQuestao());
					questaoJogo.setIdquestao(p.get(i).getId());
					//Gerando aleatório:
					List<Integer> numerosAleatorios = gerarAleatorios();
			        for(int j = 0; j < 5; j++) {
			        	if (j == 0) {
			        		if(numerosAleatorios.get(j) == 0) {
				        		questaoJogo.setResposta1(p.get(i).getCorreta());
				        	}
				        	if(numerosAleatorios.get(j) == 1) {
				        		questaoJogo.setResposta2(p.get(i).getCorreta());
				        	}
				        	if(numerosAleatorios.get(j) == 2) {
				        		questaoJogo.setResposta3(p.get(i).getCorreta());
				        	}
				        	if(numerosAleatorios.get(j) == 3) {
				        		questaoJogo.setResposta4(p.get(i).getCorreta());
				        	}
				        	if(numerosAleatorios.get(j) == 4) {
				        		questaoJogo.setResposta5(p.get(i).getCorreta());
				        	}
			        	}
			        	
			        	if (j == 1) {
			        		if(numerosAleatorios.get(j) == 0) {
				        		questaoJogo.setResposta1(p.get(i).getResposta1());
				        	}
				        	if(numerosAleatorios.get(j) == 1) {
				        		questaoJogo.setResposta2(p.get(i).getResposta1());
				        	}
				        	if(numerosAleatorios.get(j) == 2) {
				        		questaoJogo.setResposta3(p.get(i).getResposta1());
				        	}
				        	if(numerosAleatorios.get(j) == 3) {
				        		questaoJogo.setResposta4(p.get(i).getResposta1());
				        	}
				        	if(numerosAleatorios.get(j) == 4) {
				        		questaoJogo.setResposta5(p.get(i).getResposta1());
				        	}
			        	}
			        	
			        	if (j == 2) {
			        		if(numerosAleatorios.get(j) == 0) {
				        		questaoJogo.setResposta1(p.get(i).getResposta2());
				        	}
				        	if(numerosAleatorios.get(j) == 1) {
				        		questaoJogo.setResposta2(p.get(i).getResposta2());
				        	}
				        	if(numerosAleatorios.get(j) == 2) {
				        		questaoJogo.setResposta3(p.get(i).getResposta2());
				        	}
				        	if(numerosAleatorios.get(j) == 3) {
				        		questaoJogo.setResposta4(p.get(i).getResposta2());
				        	}
				        	if(numerosAleatorios.get(j) == 4) {
				        		questaoJogo.setResposta5(p.get(i).getResposta2());
				        	}
			        	}
			        	
			        	
			        	if (j == 3) {
			        		if(numerosAleatorios.get(j) == 0) {
				        		questaoJogo.setResposta1(p.get(i).getResposta3());
				        	}
				        	if(numerosAleatorios.get(j) == 1) {
				        		questaoJogo.setResposta2(p.get(i).getResposta3());
				        	}
				        	if(numerosAleatorios.get(j) == 2) {
				        		questaoJogo.setResposta3(p.get(i).getResposta3());
				        	}
				        	if(numerosAleatorios.get(j) == 3) {
				        		questaoJogo.setResposta4(p.get(i).getResposta3());
				        	}
				        	if(numerosAleatorios.get(j) == 4) {
				        		questaoJogo.setResposta5(p.get(i).getResposta3());
				        	}
			        	}
			        	
			        	
			        	if (j == 4) {
			        		if(numerosAleatorios.get(j) == 0) {
				        		questaoJogo.setResposta1(p.get(i).getResposta4());
				        	}
				        	if(numerosAleatorios.get(j) == 1) {
				        		questaoJogo.setResposta2(p.get(i).getResposta4());
				        	}
				        	if(numerosAleatorios.get(j) == 2) {
				        		questaoJogo.setResposta3(p.get(i).getResposta4());
				        	}
				        	if(numerosAleatorios.get(j) == 3) {
				        		questaoJogo.setResposta4(p.get(i).getResposta4());
				        	}
				        	if(numerosAleatorios.get(j) == 4) {
				        		questaoJogo.setResposta5(p.get(i).getResposta4());
				        	}
			        	}
			        	
			        	
			        	
			        }
					
					
				}
			}
			
			request.setAttribute("perg", questaoJogo.getQuestao());
			request.setAttribute("idQuestao", questaoJogo.getIdquestao());
			request.setAttribute("alt1", questaoJogo.getResposta1());
			request.setAttribute("alt2", questaoJogo.getResposta2());
			request.setAttribute("alt3", questaoJogo.getResposta3());
			request.setAttribute("alt4", questaoJogo.getResposta4());
			request.setAttribute("alt5", questaoJogo.getResposta5());
			
			
		}
		
		request.setAttribute("usuarioSessao", usuarioSessao);
		String link = "pages/jogar";
		
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	@RequestMapping(value = "/senha", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void senha(HttpServletRequest request, HttpServletResponse response,  String confirmaSenha, String senhaAtual, String novaSenha, Usuario usuario) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(usuarioSessao != null) {
			session.setAttribute("usuarioSessao",usuarioSessao);
		}
		if(usuarioSessao != null) {
			if(confirmaSenha != null) {
				if(!confirmaSenha.equals("")) {
					if(confirmaSenha.equals(novaSenha)) {
						if(usuarioSessao.getSenha().equals(senhaAtual)) {
							Usuario u = usuarioDao.findById(usuarioSessao.getId()).get();
							u.setSenha(novaSenha);
							usuarioDao.save(u);
							registraMsg("Senha", "Senha alterada com sucesso!.", "info");
						} else {
							registraMsg("Senha", "Senha inválida.", "erro");
						}
					} else {
						registraMsg("Senha", "Confirmação de senha não confere.", "erro");
					}
				}
			}
			request.setAttribute("usuarioSessao", usuarioSessao);
		}
		String link = "pages/senha";
		
		
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	
	
	
	
	@RequestMapping(value = "/perguntas", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void pergunta(HttpServletRequest request, HttpServletResponse response,  Pergunta pergunta) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			List<Pergunta> perguntas = perguntaDao.buscarPerguntas();
			List<Categoria> categorias = categoriaDao.buscarCategorias();
			
			request.setAttribute("categorias", categorias);
			request.setAttribute("perguntas", perguntas);
		}
		request.setAttribute("usuarioSessao", usuarioSessao);
		String link = "pages/perguntas";
		
		
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	
	@RequestMapping(value = "/categorias", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void categorias(HttpServletRequest request, HttpServletResponse response,  Categoria categoria) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			List<Categoria> categorias = categoriaDao.buscarCategorias();
			request.setAttribute("categorias", categorias);
		}
		request.setAttribute("usuarioSessao", usuarioSessao);
		String link = "pages/categorias";
		
		
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	@RequestMapping(value = "/usuarios", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void usuarios(HttpServletRequest request, HttpServletResponse response,  Usuario usuario) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			List<Usuario> usuarios = usuarioDao.usuarios();
			request.setAttribute("usuarios", usuarios);
		}
		request.setAttribute("usuarioSessao", usuarioSessao);
		String link = "pages/usuarios";
		
		
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	@RequestMapping(value = "/recordes", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void recordes(HttpServletRequest request, HttpServletResponse response,  Usuario usuario) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			List<Usuario> usuarios = usuarioDao.recordes();
			request.setAttribute("usuarios", usuarios);
		}
		request.setAttribute("usuarioSessao", usuarioSessao);
		String link = "pages/recordes";
		
		
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	@RequestMapping(value = "/token", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void token(HttpServletRequest request, HttpServletResponse response,  Integer criarToken, Usuario usuario) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			if(criarToken != null) {
				if(criarToken == 1) {
					Usuario u = new Usuario();
					u.setAcesso(usuario.getAcesso());
					u.setAtivo(false);
					u.setNome(usuario.getNome());
					usuarioDao.save(u);
				}
			}
			List<Usuario> tokens = usuarioDao.buscaTokens();
			request.setAttribute("tokens", tokens);
			request.setAttribute("usuarioSessao", usuarioSessao);
		}
		String link = "pages/token";
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	
	
	@RequestMapping(value = "/atualizarPergunta", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void atualizarPergunta(HttpServletRequest request, HttpServletResponse response,  Integer perguntaID, Boolean alterar, Boolean salvar, Boolean pesquisar, Pergunta pergunta ) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		String atualizarPagina = "";
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			if(pesquisar) {
				Pergunta p = perguntaDao.porCodigo(pergunta.getCodigo());
				if(p != null) {
					request.setAttribute("pergunta", p);
				} else {
					List<Pergunta> perguntas = perguntaDao.buscarPerguntas();
					request.setAttribute("perguntas", perguntas);
					registraMsg("Pergunta", "Nenhuma pergunta encontrada.", "erro");
				}
			} 
			else if (salvar) {
				Pergunta p = new Pergunta();
				p.setAtivo(true);
				p.setCodigo(pergunta.getCodigo());
				p.setCorreta(pergunta.getCorreta());
				p.setTempo(pergunta.getTempo());
				p.setQuestao(pergunta.getQuestao());
				p.setResposta1(pergunta.getResposta1());
				p.setResposta2(pergunta.getResposta2());
				p.setResposta3(pergunta.getResposta3());
				p.setResposta4(pergunta.getResposta4());
				perguntaDao.save(p);
								
				List<Pergunta> perguntas = perguntaDao.buscarPerguntas();
				request.setAttribute("perguntas", perguntas);
				registraMsg("Pergunta", "Alterada com sucesso.", "info");
			}
			else if (alterar) {
				Pergunta p = perguntaDao.findById(perguntaID).get();
				if(p != null) {
					p.setAtivo(true);
					p.setCodigo(pergunta.getCodigo());
					p.setCorreta(pergunta.getCorreta());
					p.setTempo(pergunta.getTempo());
					p.setQuestao(pergunta.getQuestao());
					p.setResposta1(pergunta.getResposta1());
					p.setResposta2(pergunta.getResposta2());
					p.setResposta3(pergunta.getResposta3());
					p.setResposta4(pergunta.getResposta4());
					perguntaDao.save(p);
				} else {
					registraMsg("Pergunta", "Pergunta não encontrado.", "erro");
				}
				List<Pergunta> perguntas = perguntaDao.buscarPerguntas();
				request.setAttribute("perguntas", perguntas);
				registraMsg("Pergunta", "Salva com sucesso.", "info");
			}
			
			request.setAttribute("usuarioSessao", usuarioSessao);
		}
		String link = "pages/perguntas";
		
		
		atualizarPagina = "/perguntas";
		request.setAttribute("atualizarPagina", atualizarPagina);
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	@RequestMapping(value = "/atualizarCategoria", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void atualizarCategoria(HttpServletRequest request, HttpServletResponse response,  Integer categoriaID, Boolean alterar, Boolean salvar, Boolean pesquisar, Categoria categoria) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		String atualizarPagina = "";
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			if(pesquisar) {
				Categoria c = categoriaDao.findById(categoriaID).get();
				if(c != null) {
					request.setAttribute("categoria", c);
				} else {
					List<Categoria> categorias = categoriaDao.buscarCategorias();
					request.setAttribute("categorias", categorias);
					registraMsg("Categoria", "Categoria não encontrada.", "erro");
				}
			} 
			else if (salvar) {
				Categoria c = new Categoria();
				c.setAtivo(true);
				c.setDescricao(categoria.getDescricao());
				categoriaDao.save(c);
								
				List<Categoria> categorias = categoriaDao.buscarCategorias();
				request.setAttribute("categorias", categorias);
				registraMsg("Categoria", "Alterada com sucesso.", "info");
			}
			else if (alterar) {
				Categoria c = categoriaDao.findById(categoriaID).get();
				if(c != null) {
					c.setAtivo(true);
					c.setDescricao(categoria.getDescricao());
					categoriaDao.save(c);
				} else {
					registraMsg("Categoria", "Categoria não encontrada.", "erro");
				}
				List<Categoria> categorias = categoriaDao.buscarCategorias();
				request.setAttribute("categorias", categorias);
				registraMsg("Categorias", "Salvo com sucesso.", "info");
			}
			
			request.setAttribute("usuarioSessao", usuarioSessao);
		}
		String link = "pages/categorias";
		
		
		atualizarPagina = "/categorias";
		request.setAttribute("atualizarPagina", atualizarPagina);
		enviaMsg(request);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	
	@RequestMapping(value = "/atualizarUsuario", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public void atualizarUsuario(HttpServletRequest request, HttpServletResponse response,  Integer usuarioID, Boolean alterar, Boolean salvar, Boolean pesquisar, Usuario usuario) throws ServletException, IOException { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		String link = "pages/usuarios";
		String atualizarPagina = "";
		
		HttpSession session = request.getSession();
		Usuario usuarioSessao = new Usuario();
		if(session.getAttribute("usuarioSessao") != null) {
			usuarioSessao = (Usuario) session.getAttribute("usuarioSessao");
		}
		if(usuarioSessao != null) {
			if(pesquisar) {
				Usuario u = usuarioDao.findById(usuarioID).get();
				if(u != null) {
					request.setAttribute("usuario", u);
				} else {
					List<Usuario> usuarios = usuarioDao.usuarios();
					request.setAttribute("usuarios", usuarios);
					registraMsg("Usuário", "Usuário não encontrado.", "erro");
				}
			} 
			else if (salvar) {
				if(usuarioDao.buscaLogin(usuario.getLogin()).size() == 0) {
					Usuario u = new Usuario();
					u.setAtivo(true);
					u.setLogin(usuario.getLogin());
					u.setNome(usuario.getNome());
					u.setPerfil(perfilDao.buscarFuncionario().get(0));
					if(usuario.getSenha() == null) {
						u.setSenha(usuario.getLogin());
					} else {
						u.setSenha(usuario.getSenha());
					}	
					u.setTelefone(usuario.getTelefone());
					usuarioDao.save(u);
					registraMsg("Usuário", "Salvo com sucesso.", "info");
				} else {
					registraMsg("Usuário", "Já existe usuário com este Login.", "erro");
				}
				List<Usuario> usuarios = usuarioDao.usuarios();
				request.setAttribute("usuarios", usuarios);
				
			}
			else if (alterar) {
				if(usuarioDao.buscaLogin(usuario.getLogin()).size() > 0) {
					Usuario u = usuarioDao.findById(usuarioID).get();
					if(u != null) {
						u.setAtivo(true);
						u.setAtivo(true);
						u.setLogin(usuario.getLogin());
						u.setNome(usuario.getNome());
						u.setPerfil(perfilDao.buscarFuncionario().get(0));
						u.setTelefone(usuario.getTelefone());
						usuarioDao.save(u);
						registraMsg("Usuário", "Alterado com sucesso.", "info");
					} else {
						registraMsg("Usuário", "Usuário não encontrado.", "erro");
					}
				} else {
					registraMsg("Usuário", "Já existe usuário com este Login.", "erro");
				}
				List<Usuario> usuarios = usuarioDao.usuarios();
				request.setAttribute("usuarios", usuarios);
				registraMsg("Usuários", "Salvo com sucesso.", "info");
			}
			
			request.setAttribute("usuarioSessao", usuarioSessao);
		}
		
		enviaMsg(request);
		atualizarPagina = "/usuarios";
		request.setAttribute("atualizarPagina", atualizarPagina);
		request.getRequestDispatcher("/WEB-INF/jsp/"+link+".jsp").forward(request, response); 
	}
	
	
	
	
	public void processaPergunta(@ModelAttribute MultipartFile file) throws Exception {
		int coluna = 0;
		int finalLinha = 0;
		String conteudo = "";
		Pergunta p = new Pergunta();
		List<Tabela> tabela = uploadExcelFile(file);
		try {
		for(int i=0; i<tabela.size(); i++) {
			coluna = tabela.get(i).getColuna();
			conteudo = tabela.get(i).getConteudo();
			// ::: Aqui varia de tabela pra tabela pra popular os campos :::
			if(coluna == 0) p.setCodigo(conteudo.replace(".0", ""));
			if(coluna == 1) p.setQuestao(conteudo);
			if(coluna == 2) p.setCorreta(conteudo);
			if(coluna == 3) p.setResposta1(conteudo);
			if(coluna == 4) p.setResposta2(conteudo);
			if(coluna == 5) p.setResposta3(conteudo);
			if(coluna == 6) p.setResposta4(conteudo);
			if(finalLinha >= 6) {
				finalLinha = -1;
				perguntaDao.save(p);
				p = new Pergunta();
			}
			finalLinha++;
		}
		} catch(Exception e) {
			registraMsg("Upload", "Erro: " + e, "erro");
		}
	}
	
	
	
	
	public void processaUsuario(@ModelAttribute MultipartFile file) throws Exception {
		int coluna = 0;
		int finalLinha = 0;
		String conteudo = "";
		Usuario p = new Usuario();
		List<Tabela> tabela = uploadExcelFile(file);
		try {
		for(int i=0; i<tabela.size(); i++) {
			coluna = tabela.get(i).getColuna();
			conteudo = tabela.get(i).getConteudo();
			// ::: Aqui varia de tabela pra tabela pra popular os campos :::
			if(coluna == 0) p.setLogin(conteudo);
			if(coluna == 1) p.setNome(conteudo);
			if(coluna == 2) p.setTelefone(conteudo);
			if(coluna == 3){ try{ p.setPerfil(perfilDao.buscarNome(conteudo.toUpperCase()).get(0));} catch(Exception e){} }
			if(finalLinha >= 3) {
				finalLinha = -1;
				p.setAtivo(true);
				p.setSenha("mudar@123");
				usuarioDao.save(p);
				p = new Usuario();
			}
			finalLinha++;
		}
		} catch(Exception e) {
			registraMsg("Upload", "Erro: " + e, "erro");
		}
	}
	
	
	
	

}
