package brandaoti.sistema.controle.controller;

import java.util.ArrayList;
import java.util.List;

import brandaoti.sistema.controle.model.Pergunta;

public class PerguntasInicio {
	
	public List<Pergunta> iniciarPerguntas (){
		List<Pergunta> todasPerguntas = new ArrayList<Pergunta>();
		Pergunta p = new Pergunta();
		
		
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00002");
		p.setQuestao("Quanto é: 2 + 2?");
		p.setCorreta("4");
		p.setResposta1("22");
		p.setResposta2("2");
		p.setResposta3("6");
		p.setResposta4("0");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00003");
		p.setQuestao("Quem descobriu o Brasil?");
		p.setCorreta("Pedro Álvares Cabral");
		p.setResposta1("Pedro de Lara");
		p.setResposta2("Dom Pedro I");
		p.setResposta3("Dom Pedro II");
		p.setResposta4("N.D.A.");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00004");
		p.setQuestao("Em que dia da semana Pelé, fez seu milésimo gol?");
		p.setCorreta("Quinta");
		p.setResposta1("Sábado");
		p.setResposta2("Quarta");
		p.setResposta3("Domingo");
		p.setResposta4("Segunda");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00005");
		p.setQuestao("Qual é a raiz quadrada de 144?");
		p.setCorreta("12");
		p.setResposta1("14");
		p.setResposta2("140");
		p.setResposta3("10");
		p.setResposta4("288");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00006");
		p.setQuestao("Como se escreve maçã em inglês?");
		p.setCorreta("apple");
		p.setResposta1("orange");
		p.setResposta2("maçã");
		p.setResposta3("pineapple");
		p.setResposta4("red");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00007");
		p.setQuestao("Quanto é: 23 + 2?");
		p.setCorreta("25");
		p.setResposta1("22");
		p.setResposta2("23");
		p.setResposta3("24");
		p.setResposta4("20");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00008");
		p.setQuestao("Qual a capital da Colômbia?");
		p.setCorreta("Bogotá");
		p.setResposta1("Santiago");
		p.setResposta2("Assunção");
		p.setResposta3("Colômbia");
		p.setResposta4("Buenos Aires");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00009");
		p.setQuestao("Quanto é: 10 + 2 X 4 - 8?");
		p.setCorreta("10");
		p.setResposta1("40");
		p.setResposta2("16");
		p.setResposta3("20");
		p.setResposta4("26");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00010");
		p.setQuestao("Qual está correto?");
		p.setCorreta("surdina");
		p.setResposta1("sudina");
		p.setResposta2("surdimha");
		p.setResposta3("Aqui tem menas mulheres.");
		p.setResposta4("Mau súbito");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		
		
		
		return todasPerguntas;
	}
	
	
}
