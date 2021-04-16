package brandaoti.sistema.controle.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
public class ControleController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private PerfilDao perfilDao;
	@Autowired
	private CategoriaDao categoriaDao;
	@Autowired
	private PerguntaDao perguntaDao;
	
	public static Usuario usuarioSessao;
	public static String atualizarPagina = null;
	public static String mensagem = "";
	public static String tituloMensagem = "";
	public static String tipoMensagem = "";
	public static String periodoAtual = "";
	public static String hoje = "";
	public static String itemMenuSelecionado = "home";
	public static List<Integer> questoesJogadas = new ArrayList<Integer>();
	
	// ----------------------------------------------------------------------------------------
	//Perguntas iniciais
	public void iniciar() {

		Pergunta p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a cor do cavalo branco de Napoleão?");
		p.setCorreta("Branco");
		p.setResposta1("Azul");
		p.setResposta2("Vermelho");
		p.setResposta3("Verde");
		p.setResposta4("Marrom");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00002");
		p.setQuestao("Quanto é: 2 + 2?");
		p.setCorreta("4");
		p.setResposta1("22");
		p.setResposta2("2");
		p.setResposta3("6");
		p.setResposta4("0");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00003");
		p.setQuestao("Quem descobriu o Brasil?");
		p.setCorreta("Pedro Álvares Cabral");
		p.setResposta1("Pedro de Lara");
		p.setResposta2("Dom Pedro I");
		p.setResposta3("Dom Pedro II");
		p.setResposta4("N.D.A.");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00004");
		p.setQuestao("Em que dia da semana Pelé, fez seu milésimo gol?");
		p.setCorreta("Quinta");
		p.setResposta1("Sábado");
		p.setResposta2("Quarta");
		p.setResposta3("Domingo");
		p.setResposta4("Segunda");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00005");
		p.setQuestao("Qual é a raiz quadrada de 144?");
		p.setCorreta("12");
		p.setResposta1("14");
		p.setResposta2("140");
		p.setResposta3("10");
		p.setResposta4("288");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00006");
		p.setQuestao("Como se escreve maçã em inglês?");
		p.setCorreta("apple");
		p.setResposta1("orange");
		p.setResposta2("maçã");
		p.setResposta3("pineapple");
		p.setResposta4("red");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00007");
		p.setQuestao("Quanto é: 23 + 2?");
		p.setCorreta("25");
		p.setResposta1("22");
		p.setResposta2("23");
		p.setResposta3("24");
		p.setResposta4("20");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00008");
		p.setQuestao("Qual a capital da Colômbia?");
		p.setCorreta("Bogotá");
		p.setResposta1("Santiago");
		p.setResposta2("Assunção");
		p.setResposta3("Colômbia");
		p.setResposta4("Buenos Aires");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00009");
		p.setQuestao("Quanto é: 10 + 2 X 4 - 8?");
		p.setCorreta("10");
		p.setResposta1("40");
		p.setResposta2("16");
		p.setResposta3("20");
		p.setResposta4("26");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00010");
		p.setQuestao("Qual está correto?");
		p.setCorreta("surdina");
		p.setResposta1("sudina");
		p.setResposta2("surdimha");
		p.setResposta3("Aqui tem menas mulheres.");
		p.setResposta4("Mau súbito");
		perguntaDao.save(p);
		// ----------------------------------------------------------------------------------------
		
	}
	//Perguntas iniciais ----------------------------------------------------------------------------------------
	
	public String verificaLink(String link) {
		String direcao = "deslogar";
		if(usuarioSessao != null) {
			direcao = link;
			itemMenuSelecionado = link;
		} else {
			direcao = "deslogar";
			atualizarPagina = null;
			itemMenuSelecionado = "home";
		}
		return direcao;
	}
	
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
	
	public void colocacao() {
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
	
	public ModelAndView enviaMsg(ModelAndView modelAndView) {
		modelAndView.addObject("mensagem", mensagem);
		modelAndView.addObject("tituloMensagem", tituloMensagem);
		modelAndView.addObject("tipoMensagem", tipoMensagem);
		mensagem = null;
		tituloMensagem = null;
		tipoMensagem = null;
		return modelAndView;
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
		public ModelAndView index(Model model) { 
		ModelAndView modelAndView = new ModelAndView("index");
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
				System.out.println("Erro Planilha inicial: "+e);
			}
			
		}
		
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		return modelAndView; 
	}
	
	
	
	
	/* SALVAR EXCEL */
	@Transactional
	@RequestMapping(value = "/upload/excel", method = {RequestMethod.POST, RequestMethod.GET}) // Pagina de Altera��o de Perfil
	public ModelAndView uploadExcel(Model model, String tabelaUsada, @ModelAttribute MultipartFile file) throws Exception, IOException { //Fun��o e alguns valores que recebe...
		String link = verificaLink("/pages/home"); //Session
		if(usuarioSessao.getPerfil().getAdmin()) {
			switch (tabelaUsada) {  
		       case "pergunta" :
		    	   perguntaDao.deleteAll();
		    	   processaPergunta(file);
		    	   link = verificaLink("/pages/perguntas");
		    	   atualizarPagina = "/perguntas";
		    	   break;
		       case "usuarios" :
		    	   processaUsuario(file);
		    	   link = verificaLink("/pages/usuarios");
		    	   atualizarPagina = "/usuarios";
		    	   break;
			}
			registraMsg("Excel", "Dados inseridos com sucesso..", "info");
		}
		ModelAndView modelAndView = new ModelAndView(link); //JSP que ir� acessar.
		modelAndView.addObject("atualizarPagina", atualizarPagina);
		return modelAndView; //Retorna para a p�gina
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
	public ModelAndView deslogar(Model model) {  
		String link = "/deslogar";
		usuarioSessao = null;
		ModelAndView modelAndView = new ModelAndView(link); 
		return modelAndView; 
	}
	
	
	@RequestMapping(value = "/adm/deletando/{tabela}/{id}", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE}) // Pagina de Alteração de Perfil
	public ModelAndView deletando(Model model,@PathVariable("tabela") String tabela, @PathVariable("id") Integer id) { //Função e alguns valores que recebe...
		String link = verificaLink("/deslogar");
		if(usuarioSessao.getPerfil().getAdmin()) {
			model.addAttribute("usuarioSessao", usuarioSessao);
			link = "/pages/"+tabela;
			if(tabela.equals("token")) {
				atualizarPagina = "/token";
				Usuario objeto = usuarioDao.findById(id).get();
				if(objeto != null)
					usuarioDao.deleteById(id);
				usuarioDao.flush();
				List<Usuario> tokens = usuarioDao.buscaTokens();
				model.addAttribute("atualizarPagina", atualizarPagina);
				model.addAttribute("tokens", tokens);
				model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
				registraMsg("Token", "Deletado com sucesso.", "erro");
			}
			if(tabela.equals("excluirUsuario")) {
				link = verificaLink("pages/adversario");
				atualizarPagina = "/adversario";
				Usuario objeto = usuarioDao.findById(id).get();
				if(objeto != null) {
					usuarioDao.deleteById(objeto.getId());
					usuarioDao.flush();
				}
				List<Usuario> adversario = usuarioDao.funcionario();
				model.addAttribute("adversario", adversario);
				model.addAttribute("atualizarPagina", atualizarPagina);
				model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
				registraMsg("Funcionário", "Deletado com sucesso.", "erro");
			}
			if(tabela.equals("perguntas")) {
				link = verificaLink("pages/perguntas");
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
				model.addAttribute("perguntas", perguntas);
				model.addAttribute("atualizarPagina", atualizarPagina);
				model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
				registraMsg("Pergunta", "Deletado com sucesso.", "erro");
			}
			if(tabela.equals("categoria")) {
				link = verificaLink("pages/categorias");
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
				model.addAttribute("categorias", categorias);
				model.addAttribute("atualizarPagina", atualizarPagina);
				model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
				registraMsg("Categoria", "Deletada com sucesso.", "erro");
			}
			if(tabela.equals("usuario")) {
				link = verificaLink("pages/usuarios");
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
				model.addAttribute("usuarios", usuarios);
				model.addAttribute("atualizarPagina", atualizarPagina);
				model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
				registraMsg("Usuário", "Usuário com sucesso.", "erro");
			}
			
		}
		ModelAndView modelAndView = new ModelAndView(link);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	
	

	
	
	@RequestMapping(value = "/criar", method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView criar(Model model, Usuario usuario, String codigoAcesso, String confirmaSenha) {  
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
									model.addAttribute("erro", erro);
								}
								model.addAttribute("msg", msg);
							} else {
								erro = "Login já existe.";
								model.addAttribute("erro", erro);
							}
						} else {
							erro = "Login inválido.";
							model.addAttribute("erro", erro);
						}
					}
				} else {
					erro = "Senha não confere com a confirmação";
					model.addAttribute("erro", erro);
				}
			}
		}	
		ModelAndView modelAndView = new ModelAndView(link); 
		return modelAndView; 
	}
	
	
	@RequestMapping(value = "/home", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView logar(Model model, @RequestParam(value = "usuarioVal", defaultValue = "", required=false ) String variavelUsuario, @RequestParam(value = "senhaVal", defaultValue = "", required=false ) String variavelSenha) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		Usuario usu = usuarioDao.fazerLogin(variavelUsuario, variavelSenha);
		if(usu != null)
			usuarioSessao = usu;
		if(usu != null || usuarioSessao != null) {
			colocacao();
			model.addAttribute("usuarioSessao", usuarioSessao);
		}
		List<Categoria> categorias = categoriaDao.buscarCategorias();
		List<Pergunta> pergunta = perguntaDao.buscarPerguntas();
		
		Double totalinicio = 0.0;
		
		double d = totalinicio;
        String s = String.format("%.2f", d);
        s = s.replace(",", ".");
        
        String link = verificaLink("pages/home");
		model.addAttribute("totalinicio", s);
		model.addAttribute("categorias", categorias);
		model.addAttribute("pergunta", pergunta);
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		return modelAndView; 
	}
	
	
	@RequestMapping(value = "/jogar", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView jogar(Model model, String questaoSubmit, String respostaSubmit) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		if(usuarioSessao != null) {
			
			colocacao();
			
			if( questaoSubmit != null && respostaSubmit != null ) {
				String questao = questaoSubmit;
				String resposta = respostaSubmit;
				List<Pergunta> p = perguntaDao.analisar(questao,resposta);
				if(p.size() == 0) {
					//Errou
					Integer conta = usuarioSessao.getTentativas() + 1;
					System.out.println("Tentativas de: "+usuarioSessao.getTentativas()+" para: "+conta);
					usuarioSessao.setTentativas(conta);
					usuarioDao.save(usuarioSessao);
					if(usuarioSessao.getTentativas() > 4) {
						usuarioSessao.setPontuacao(0);
						usuarioSessao.setTentativas(0);
						usuarioDao.save(usuarioSessao);
					}
					colocacao();
					usuarioDao.save(usuarioSessao);
					registraMsg("RESPOSTA", "ERRADA", "erro");
				} else {
					//Acertou
					Integer conta = usuarioSessao.getPontuacao() + 1;
					System.out.println("Pontuação de: "+usuarioSessao.getPontuacao()+" para: "+conta);
					usuarioSessao.setPontuacao(conta);
					usuarioDao.save(usuarioSessao);
					if(usuarioSessao.getPontuacao() > usuarioSessao.getRecorde()) {
						usuarioSessao.setRecorde(usuarioSessao.getPontuacao());
						usuarioDao.save(usuarioSessao);
					}
					colocacao();
					usuarioDao.save(usuarioSessao);
					registraMsg("RESPOSTA", "CORRETA", "info");
				}
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
			questoesJogadas.add(aleatorio);
			if(total <= questoesJogadas.size()) {
				questoesJogadas.clear();
			}
			
			QuestaoJogo questaoJogo = new QuestaoJogo();
			for(int i = 0; i < total; i++) {
				if(i == aleatorio) {
					questaoJogo.setQuestao(p.get(i).getQuestao());
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
			model.addAttribute("perg", questaoJogo.getQuestao());
			model.addAttribute("alt1", questaoJogo.getResposta1());
			model.addAttribute("alt2", questaoJogo.getResposta2());
			model.addAttribute("alt3", questaoJogo.getResposta3());
			model.addAttribute("alt4", questaoJogo.getResposta4());
			model.addAttribute("alt5", questaoJogo.getResposta5());
			
			
		}
		
		model.addAttribute("usuarioSessao", usuarioSessao);
		String link = verificaLink("pages/jogar");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	@RequestMapping(value = "/senha", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView senha(Model model, String confirmaSenha, String senhaAtual, String novaSenha, Usuario usuario) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
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
			model.addAttribute("usuarioSessao", usuarioSessao);
		}
		String link = verificaLink("pages/senha");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	
	
	
	
	@RequestMapping(value = "/perguntas", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView pergunta(Model model, Pergunta pergunta) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		if(usuarioSessao != null) {
			List<Pergunta> perguntas = perguntaDao.buscarPerguntas();
			List<Categoria> categorias = categoriaDao.buscarCategorias();
			
			model.addAttribute("categorias", categorias);
			model.addAttribute("perguntas", perguntas);
		}
		model.addAttribute("usuarioSessao", usuarioSessao);
		String link = verificaLink("pages/perguntas");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	
	@RequestMapping(value = "/categorias", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView categorias(Model model, Categoria categoria) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		if(usuarioSessao != null) {
			List<Categoria> categorias = categoriaDao.buscarCategorias();
			model.addAttribute("categorias", categorias);
		}
		model.addAttribute("usuarioSessao", usuarioSessao);
		String link = verificaLink("pages/categorias");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	@RequestMapping(value = "/usuarios", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView usuarios(Model model, Usuario usuario) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		if(usuarioSessao != null) {
			List<Usuario> usuarios = usuarioDao.usuarios();
			model.addAttribute("usuarios", usuarios);
		}
		model.addAttribute("usuarioSessao", usuarioSessao);
		String link = verificaLink("pages/usuarios");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	@RequestMapping(value = "/recordes", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView recordes(Model model, Usuario usuario) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		if(usuarioSessao != null) {
			List<Usuario> usuarios = usuarioDao.recordes();
			model.addAttribute("usuarios", usuarios);
		}
		model.addAttribute("usuarioSessao", usuarioSessao);
		String link = verificaLink("pages/recordes");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	@RequestMapping(value = "/token", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView token(Model model, Integer criarToken, Usuario usuario) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
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
			model.addAttribute("tokens", tokens);
			model.addAttribute("usuarioSessao", usuarioSessao);
		}
		String link = verificaLink("pages/token");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		return modelAndView; 
	}
	
	
	
	
	@RequestMapping(value = "/atualizarPergunta", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView atualizarPergunta(Model model, Integer perguntaID, Boolean alterar, Boolean salvar, Boolean pesquisar, Pergunta pergunta ) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		System.out.println("alterar: "+alterar);
		System.out.println("salvar:"+salvar);
		System.out.println("pesquisar:"+pesquisar);
		System.out.println("perguntaID:"+perguntaID);
		if(usuarioSessao != null) {
			if(pesquisar) {
				Pergunta p = perguntaDao.porCodigo(pergunta.getCodigo());
				if(p != null) {
					model.addAttribute("pergunta", p);
				} else {
					List<Pergunta> perguntas = perguntaDao.buscarPerguntas();
					model.addAttribute("perguntas", perguntas);
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
				model.addAttribute("perguntas", perguntas);
				registraMsg("Pergunta", "Alterada com sucesso.", "info");
			}
			else if (alterar) {
				System.out.println("alterar "+perguntaID);
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
				model.addAttribute("perguntas", perguntas);
				registraMsg("Pergunta", "Salva com sucesso.", "info");
			}
			
			model.addAttribute("usuarioSessao", usuarioSessao);
		}
		String link = verificaLink("pages/perguntas");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		atualizarPagina = "/perguntas";
		modelAndView.addObject("atualizarPagina", atualizarPagina);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	@RequestMapping(value = "/atualizarCategoria", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView atualizarCategoria(Model model, Integer categoriaID, Boolean alterar, Boolean salvar, Boolean pesquisar, Categoria categoria) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		if(usuarioSessao != null) {
			if(pesquisar) {
				Categoria c = categoriaDao.findById(categoriaID).get();
				if(c != null) {
					model.addAttribute("categoria", c);
				} else {
					List<Categoria> categorias = categoriaDao.buscarCategorias();
					model.addAttribute("categorias", categorias);
					registraMsg("Categoria", "Categoria não encontrada.", "erro");
				}
			} 
			else if (salvar) {
				Categoria c = new Categoria();
				c.setAtivo(true);
				c.setDescricao(categoria.getDescricao());
				categoriaDao.save(c);
								
				List<Categoria> categorias = categoriaDao.buscarCategorias();
				model.addAttribute("categorias", categorias);
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
				model.addAttribute("categorias", categorias);
				registraMsg("Categorias", "Salvo com sucesso.", "info");
			}
			
			model.addAttribute("usuarioSessao", usuarioSessao);
		}
		String link = verificaLink("pages/categorias");
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		ModelAndView modelAndView = new ModelAndView(link);
		atualizarPagina = "/categorias";
		modelAndView.addObject("atualizarPagina", atualizarPagina);
		enviaMsg(modelAndView);
		return modelAndView; 
	}
	
	
	
	@RequestMapping(value = "/atualizarUsuario", method = {RequestMethod.POST,RequestMethod.GET}) // Link do submit do form e o method POST que botou la
	public ModelAndView atualizarUsuario(Model model, Integer usuarioID, Boolean alterar, Boolean salvar, Boolean pesquisar, Usuario usuario) { // model é usado para mandar , e variavelNome está recebendo o name="nome" do submit feito na pagina principal 
		String link = verificaLink("pages/usuarios");
		ModelAndView modelAndView = new ModelAndView(link);
		if(usuarioSessao != null) {
			if(pesquisar) {
				Usuario u = usuarioDao.findById(usuarioID).get();
				if(u != null) {
					model.addAttribute("usuario", u);
				} else {
					List<Usuario> usuarios = usuarioDao.usuarios();
					model.addAttribute("usuarios", usuarios);
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
				model.addAttribute("usuarios", usuarios);
				
			}
			else if (alterar) {
				if(usuarioDao.buscaLogin(usuario.getLogin()).size() == 0) {
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
				model.addAttribute("usuarios", usuarios);
				registraMsg("Usuários", "Salvo com sucesso.", "info");
			}
			
			model.addAttribute("usuarioSessao", usuarioSessao);
		}
		model.addAttribute("itemMenuSelecionado", itemMenuSelecionado);
		enviaMsg(modelAndView);
		atualizarPagina = "/usuarios";
		modelAndView.addObject("atualizarPagina", atualizarPagina);
		return modelAndView; 
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
			System.out.println("Erro: "+e);
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
			System.out.println("Erro: "+e);
			registraMsg("Upload", "Erro: " + e, "erro");
		}
	}
	
	
	
	

}
