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
		p.setCodigo("00001");
		p.setQuestao("Normalmente, quantos litros de sangue uma pessoa tem? Em média, quantos são retirados numa doação de sangue?");
		p.setResposta1("Tem entre 2 a 4 litros. São retirados 450 mililitros");
		p.setCorreta("Tem entre 4 a 6 litros. São retirados 450 mililitros");
		p.setResposta2("Tem 10 litros. São retirados 2 litros");
		p.setResposta3("Tem 7 litros. São retirados 1,5 litros");
		p.setResposta4("Tem 0,5 litros. São retirados 0,5 litros");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("De quem é a famosa frase ''Penso, logo existo''?");
		p.setResposta1("Platão");
		p.setResposta2("Galileu Galilei");
		p.setCorreta("Descartes");
		p.setResposta3("Sócrates");
		p.setResposta4("Francis Bacon");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("De onde é a invenção do chuveiro elétrico?");
		p.setResposta1("França");
		p.setResposta2("Inglaterra");
		p.setCorreta("Brasil");
		p.setResposta3("Austrália");
		p.setResposta4("Itália");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais o menor e o maior país do mundo?");
		p.setCorreta("Vaticano e Rússia");
		p.setResposta1("Nauru e China");
		p.setResposta2("Mônaco e Canadá");
		p.setResposta3("Malta e Estados Unidos");
		p.setResposta4("São Marino e Índia");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o nome do presidente do Brasil que ficou conhecido como Jango?");
		p.setResposta1("Jânio Quadros");
		p.setResposta2("Jacinto Anjos");
		p.setResposta3("Getúlio Vargas");
		p.setResposta4("João Figueiredo");
		p.setCorreta("João Goulart");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o grupo em que todas as palavras foram escritas corretamente?");
		p.setResposta1("Asterístico, beneficiente, meteorologia, entertido");
		p.setCorreta("Asterisco, beneficente, meteorologia, entretido");
		p.setResposta2("Asterisco, beneficente, metereologia, entretido");
		p.setResposta3("Asterístico, beneficiente, metereologia, entretido");
		p.setResposta4("Asterisco, beneficiente, metereologia, entretido");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o livro mais vendido no mundo a seguir à Bíblia?");
		p.setResposta1("O Senhor dos Anéis");
		p.setCorreta("Dom Quixote");
		p.setResposta2("O Pequeno Príncipe");
		p.setResposta3("Ela, a Feiticeira");
		p.setResposta4("Um Conto de Duas Cidades");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quantas casas decimais tem o número pi?");
		p.setResposta1("Duas");
		p.setResposta2("Centenas");
		p.setCorreta("Infinitas");
		p.setResposta3("Vinte");
		p.setResposta4("Milhares");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Atualmente, quantos elementos químicos a tabela periódica possui?");
		p.setResposta1("113");
		p.setResposta2("109");
		p.setResposta3("108");
		p.setCorreta("118");
		p.setResposta4("92");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais os países que têm a maior e a menor expectativa de vida do mundo?");
		p.setCorreta("Japão e Serra Leoa");
		p.setResposta1("Austrália e Afeganistão");
		p.setResposta2("Itália e Chade");
		p.setResposta3("Brasil e Congo");
		p.setResposta4("Estados Unidos e Angola");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("O que a palavra legend significa em português?");
		p.setResposta1("Legenda");
		p.setResposta2("Conto");
		p.setResposta3("História");
		p.setCorreta("Lenda");
		p.setResposta4("Legendário");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o número mínimo de jogadores numa partida de futebol?");
		p.setResposta1("8");
		p.setResposta2("10");
		p.setResposta3("9");
		p.setResposta4("5");
		p.setCorreta("7");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais os principais autores do Barroco no Brasil?");
		p.setCorreta("Gregório de Matos, Bento Teixeira e Manuel Botelho de Oliveira");
		p.setResposta1("Miguel de Cervantes, Gregório de Matos e Danthe Alighieri");
		p.setResposta2("Padre Antônio Vieira, Padre Manuel de Melo e Gregório de Matos");
		p.setResposta3("Castro Alves, Bento Teixeira e Manuel Botelho de Oliveira");
		p.setResposta4("Álvares de Azevedo, Gregório de Matos e Bento Teixeira");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais as duas datas que são comemoradas em novembro?");
		p.setResposta1("Independência do Brasil e Dia da Bandeira");
		p.setCorreta("Proclamação da República e Dia Nacional da Consciência Negra");
		p.setResposta2("Dia do Médico e Dia de São Lucas");
		p.setResposta3("Dia de Finados e Dia Nacional do Livro");
		p.setResposta4("Black Friday e Dia da Árvore");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem pintou ''Guernica''?");
		p.setResposta1("Paul Cézanne");
		p.setCorreta("Pablo Picasso");
		p.setResposta2("Diego Rivera");
		p.setResposta3("Tarsila do Amaral");
		p.setResposta4("Salvador Dalí");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quanto tempo a luz do Sol demora para chegar à Terra?");
		p.setResposta1("12 minutos");
		p.setResposta2("1 dia");
		p.setResposta3("12 horas");
		p.setCorreta("8 minutos");
		p.setResposta4("segundos");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a tradução da frase ''Fabiano cogió su saco antes de salir''?");
		p.setResposta1("Fabiano coseu seu paletó antes de sair");
		p.setResposta2("Fabiano fechou o saco antes de sair");
		p.setCorreta("Fabiano pegou seu paletó antes de sair");
		p.setResposta3("Fabiano cortou o saco antes de cair");
		p.setResposta4("Fabiano rasgou seu paletó antes de cair");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a nacionalidade de Che Guevara?");
		p.setResposta1("Cubana");
		p.setResposta2("Peruana");
		p.setResposta3("Panamenha");
		p.setResposta4("Boliviana");
		p.setCorreta("Argentina");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais são os três predadores do reino animal reconhecidos pela habilidade de caçar em grupo, se camuflar para surpreender as presas e possuir sentidos apurados, respectivamente:");
		p.setResposta1("Tubarão branco, crocodilo e sucuri");
		p.setResposta2("Tigre, gavião e orca");
		p.setCorreta("Hiena, urso branco e lobo cinzento");
		p.setResposta3("Orca, onça e tarântula");
		p.setResposta4("Leão, tubarão branco e urso cinzento");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a altura da rede de vôlei nos jogos masculino e feminino?");
		p.setResposta1("2,4 para ambos");
		p.setResposta2("2,5 m e 2,0 m");
		p.setResposta3("1,8 m e 1,5 m");
		p.setResposta4("2,45 m e 2,15 m");
		p.setCorreta("2,43 m e 2,24 m");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que ordem surgiram os modelos atômicos?");
		p.setResposta1("Thomson, Dalton, Rutherford, Rutherford-Bohr");
		p.setResposta2("Rutherford-Bohr, Rutherford, Thomson, Dalton");
		p.setResposta3("Dalton, Rutherford-Bohr, Thomson, Rutherford");
		p.setResposta4("Dalton, Thomson, Rutherford-Bohr, Rutherford");
		p.setCorreta("Dalton, Thomson, Rutherford, Rutherford-Bohr");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual personagem folclórico costuma ser agradado pelos caçadores com a oferta de fumo?");
		p.setCorreta("Caipora");
		p.setResposta1("Saci");
		p.setResposta2("Lobisomem");
		p.setResposta3("Boitatá");
		p.setResposta4("Negrinho do Pastoreio");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que período da pré-história o fogo foi descoberto?");
		p.setResposta1("Neolítico");
		p.setCorreta("Paleolítico");
		p.setResposta2("Idade dos Metais");
		p.setResposta3("Período da Pedra Polida");
		p.setResposta4("Idade Média");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual das alternativas abaixo apenas contêm classes de palavras?");
		p.setResposta1("Vogais, semivogais e consoantes");
		p.setResposta2("Artigo, verbo transitivo e verbo intransitivo");
		p.setResposta3("Fonologia, Morfologia e Sintaxe");
		p.setResposta4("Hiatos, ditongos e tritongos");
		p.setCorreta("Substantivo, verbo e preposição");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a montanha mais alta do Brasil?");
		p.setCorreta("Pico da Neblina");
		p.setResposta1("Pico Paraná");
		p.setResposta2("Monte Roraima");
		p.setResposta3("Pico Maior de Friburgo");
		p.setResposta4("Pico da Bandeira");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a velocidade da luz?");
		p.setResposta1("300 000 000 metros por segundo (m/s)");
		p.setResposta2("150 000 000 metros por segundo (m/s)");
		p.setResposta3("199 792 458 metros por segundo (m/s)");
		p.setCorreta("299 792 458 metros por segundo (m/s)");
		p.setResposta4("30 000 000 metros por segundo (m/s)");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em qual local da Ásia o português é língua oficial?");
		p.setResposta1("Índia");
		p.setResposta2("Filipinas");
		p.setResposta3("Moçambique");
		p.setCorreta("Macau");
		p.setResposta4("Portugal");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("''It is six twenty'' ou ''twenty past six''. Que horas são em inglês?");
		p.setResposta1("12:06");
		p.setCorreta("6:20");
		p.setResposta2("2:20");
		p.setResposta3("6:02");
		p.setResposta4("12:20");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem é o autor de ''O Príncipe''?");
		p.setCorreta("Maquiavel");
		p.setResposta1("Antoine de Saint-Exupéry");
		p.setResposta2("Montesquieu");
		p.setResposta3("Thomas Hobbes");
		p.setResposta4("Rousseau");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Como é a conjugação do verbo caber na 1.ª pessoa do singular do presente do indicativo?");
		p.setCorreta("Eu caibo");
		p.setResposta1("Ele cabe");
		p.setResposta2("Que eu caiba");
		p.setResposta3("Eu cabo");
		p.setResposta4("Nenhuma das alternativas");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais destas construções famosas ficam nos Estados Unidos?");
		p.setCorreta("Estátua da Liberdade, Golden Gate Bridge e Empire State Building");
		p.setResposta1("Estátua da Liberdade, Big Ben e The High Line");
		p.setResposta2("Angkor Wat, Taj Mahal e Skywalk no Grand Canyon");
		p.setResposta3("Lincoln Memorial, Sidney Opera House e Burj Khalifa");
		p.setResposta4("30 St Mary Axe, The High Line e Residencial 148 Spruce Street");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais destas doenças são sexualmente transmissíveis?");
		p.setResposta1("Aids, tricomoníase e ebola");
		p.setResposta2("Chikungunya, aids e herpes genital");
		p.setCorreta("Gonorreia, clamídia e sífilis");
		p.setResposta3("Botulismo, cistite e gonorreia");
		p.setResposta4("Hepatite B, febre tifoide e hanseníase");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual destes países é transcontinental?");
		p.setCorreta("Rússia");
		p.setResposta1("Filipinas");
		p.setResposta2("Istambul");
		p.setResposta3("Groenlândia");
		p.setResposta4("Tanzânia");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em qual das orações abaixo a palavra foi empregada incorretamente?");
		p.setResposta1("Mais uma vez, portou-se mal.");
		p.setCorreta("É um homem mal.");
		p.setResposta2("Esse é o mal de todos.");
		p.setResposta3("Mal falou nele, o fulano apareceu.");
		p.setResposta4("É um mau vendedor.");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?");
		p.setResposta1("A Filosofia");
		p.setResposta2("A Biologia");
		p.setResposta3("A Matemática");
		p.setResposta4("A Astronomia");
		p.setCorreta("A Mitologia");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual das alternativas menciona apenas símbolos nacionais?");
		p.setResposta1("Bandeira insígnia da presidência, bandeira nacional, brasão, hinos e selo");
		p.setCorreta("Bandeira nacional, armas nacionais, hino nacional e selo nacional");
		p.setResposta2("Bandeira nacional, brasão, hino nacional e hino da independência");
		p.setResposta3("Bandeira nacional, cores nacionais, hino nacional e hino da independência");
		p.setResposta4("Bandeira insígnia da presidência, brasão flora e fauna e hinos");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais os planetas do sistema solar?");
		p.setCorreta("Terra, Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio");
		p.setResposta1("Júpiter, Marte, Mercúrio, Netuno, Plutão, Saturno, Terra, Urano, Vênus");
		p.setResposta2("Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio");
		p.setResposta3("Júpiter, Marte, Mercúrio, Netuno, Plutão, Saturno, Sol, Terra, Urano, Vênus");
		p.setResposta4("Terra, Vênus, Saturno, Júpiter, Marte, Netuno, Mercúrio");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual era o nome de Aleijadinho?");
		p.setResposta1("Alexandrino Francisco Lisboa");
		p.setResposta2("Manuel Francisco Lisboa");
		p.setResposta3("Alex Francisco Lisboa");
		p.setResposta4("Francisco Antônio Lisboa");
		p.setCorreta("Antônio Francisco Lisboa");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Júpiter e Plutão são os correlatos romanos de quais deuses gregos?");
		p.setResposta1("Ares e Hermes");
		p.setResposta2("Cronos e Apolo");
		p.setCorreta("Zeus e Hades");
		p.setResposta3("Dionísio e Deméter");
		p.setResposta4("Zeus e Ares");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o maior animal terrestre?");
		p.setResposta1("Baleia Azul");
		p.setResposta2("Dinossauro");
		p.setCorreta("Elefante africano");
		p.setResposta3("Tubarão Branco");
		p.setResposta4("Girafa");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King?");
		p.setCorreta("Igualdade das raças");
		p.setResposta1("Justiça para os menos favorecidos");
		p.setResposta2("Intolerância religiosa");
		p.setResposta3("Prêmio Nobel da Paz");
		p.setResposta4("Luta contra o Apartheid");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que líder mundial ficou conhecida como ''Dama de Ferro''?");
		p.setResposta1("Dilma Rousseff");
		p.setResposta2("Angela Merkel");
		p.setCorreta("Margaret Thatcher");
		p.setResposta3("Hillary Clinton");
		p.setResposta4("Christine Lagarde");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("O que são Acordo de Paris e Tríplice Aliança respectivamente?");
		p.setResposta1("Acordo ortográfico entre países cuja língua oficial é o francês e Acordo de cooperação financeira internacional entre as três maiores potências mundiais");
		p.setResposta2("Acordo entre países europeus acerca da imigração e Acordo econômico entre Inglaterra, Rússia a França");
		p.setResposta3("Acordo entre vários países acerca das consequências do aquecimento global e Acordo de cooperação financeira internacional entre as três maiores potências mundiais");
		p.setResposta4("Acordo de cooperação financeira internacional entre as três maiores potências mundiais e Acordo entre vários países acerca das consequências do aquecimento global");
		p.setCorreta("Acordo entre vários países acerca das consequências do aquecimento global e Acordo entre Alemanha, império Austro-Húngaro e Itália acerca de apoio em caso de guerra");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais os nomes dos três Reis Magos?");
		p.setResposta1("Gaspar, Nicolau e Natanael");
		p.setCorreta("Belchior, Gaspar e Baltazar");
		p.setResposta2("Belchior, Gaspar e Nataniel");
		p.setResposta3("Gabriel, Benjamim e Melchior");
		p.setResposta4("Melchior, Noé e Galileu");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais os principais heterônimos de Fernando Pessoa?");
		p.setCorreta("Alberto Caeiro, Ricardo Reis e Álvaro de Campos");
		p.setResposta1("Ariano Suassuna, Raul Bopp e Quincas Borba");
		p.setResposta2("Bento Teixeira, Ricardo Reis e Haroldo de Campos");
		p.setResposta3("Alberto Caeiro, Ricardo Leite e Augusto de Campos");
		p.setResposta4("Bento Teixeira, Ricardo Reis e Augusto de Campos");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a religião monoteísta que conta com o maior número de adeptos no mundo?");
		p.setResposta1("Judaísmo");
		p.setResposta2("Zoroastrismo");
		p.setResposta3("Islamismo");
		p.setCorreta("Cristianismo");
		p.setResposta4("Hinduísmo");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual desses filmes foi baseado na obra de Shakespeare?");
		p.setCorreta("Muito Barulho por Nada (2012)");
		p.setResposta1("Capitães de Areia (2011)");
		p.setResposta2("A Dama das Camélias (1936)");
		p.setResposta3("A Revolução dos Bichos (1954)");
		p.setResposta4("Excalibur (1981)");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem foi o primeiro homem a pisar na Lua? Em que ano aconteceu?");
		p.setResposta1("Yuri Gagarin, em 1961");
		p.setResposta2("Buzz Aldrin, em 1969");
		p.setResposta3("Charles Conrad, em 1969");
		p.setResposta4("Charles Duke, em 1971");
		p.setCorreta("Neil Armstrong, em 1969.");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o nome do cientista que descobriu o processo de pasteurização e a vacina contra a raiva?");
		p.setResposta1("Marie Curie");
		p.setResposta2("Blaise Pascal");
		p.setCorreta("Louis Pasteur");
		p.setResposta3("Antoine Lavoisier");
		p.setResposta4("Charles Darwin");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("As pessoas de qual tipo sanguíneo são consideradas doadores universais?");
		p.setResposta1("Tipo A");
		p.setResposta2("Tipo B");
		p.setCorreta("Tipo O");
		p.setResposta3("Tipo AB");
		p.setResposta4("Tipo ABO");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais são os cromossomos que determinam o sexo masculino?");
		p.setResposta1("Os V");
		p.setResposta2("Os X");
		p.setCorreta("Os Y");
		p.setResposta3("Os W");
		p.setResposta4("Os Z");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que estado australiano fica situada a cidade de Sydney?");
		p.setCorreta("Nova Gales do Sul");
		p.setResposta1("Victoria");
		p.setResposta2("Tasmânia");
		p.setResposta3("Queensland");
		p.setResposta4("Norfolk");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que organização juvenil foi fundado por Baden-Powell?");
		p.setResposta1("A juventude socialista");
		p.setCorreta("O escotismo");
		p.setResposta2("O clube dos aventureiros");
		p.setResposta3("A associação juvenil");
		p.setResposta4("A Organização mundial da juventude");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem amamentou os gêmeos Rômulo e Remo?");
		p.setResposta1("uma cabra");
		p.setResposta2("uma vaca");
		p.setResposta3("uma ovelha");
		p.setResposta4("uma gata");
		p.setCorreta("uma loba");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("No exterior de que famoso edifício francês foi construída uma enorme pirâmide de vidro em 1989?");
		p.setResposta1("Torre Eiffel");
		p.setResposta2("Petit Palais");
		p.setResposta3("Grand Palais");
		p.setCorreta("Museu do Louvre");
		p.setResposta4("Arco do Triunfo");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Como se chamam os vasos que transportam sangue do coração para a periferia do corpo?");
		p.setResposta1("veias");
		p.setResposta2("átrios");
		p.setResposta3("ventrículos");
		p.setCorreta("artérias");
		p.setResposta4("aurículos");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Com que dois países faz fronteira o Equador?");
		p.setResposta1("com o Brasil e com a Colômbia");
		p.setResposta2("com a Colômbia e com a Venezuela");
		p.setCorreta("com a Colômbia e com o Peru");
		p.setResposta3("com o Peru e com o Equador");
		p.setResposta4("com o Equador e o Brasil");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que animal gruguleja?");
		p.setResposta1("o pavão");
		p.setResposta2("a garça");
		p.setResposta3("o papagaio");
		p.setResposta4("a cacatua");
		p.setCorreta("o peru");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual é o maior arquipélago da Terra?");
		p.setResposta1("a Filipinas");
		p.setCorreta("a Indonésia");
		p.setResposta2("as Bahamas");
		p.setResposta3("a Finlândia");
		p.setResposta4("as Maldivas");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que substância é absorvida pelas plantas e expirada por todos os seres vivos?");
		p.setResposta1("o oxigênio");
		p.setResposta2("o nitrogênio");
		p.setResposta3("o nitrato de sódio");
		p.setResposta4("o dióxido de ferro");
		p.setCorreta("o dióxido de carbono");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que oceano fica Madagascar?");
		p.setCorreta("Oceano Índico");
		p.setResposta1("Oceano Antártico");
		p.setResposta2("Oceano Atlântico");
		p.setResposta3("Oceano Pacífico");
		p.setResposta4("Oceano Ártico");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que artista é conhecido como um dos expoentes máximos do Ready-Mades?");
		p.setResposta1("Pablo Picasso");
		p.setResposta2("Salvador Dalí");
		p.setCorreta("Marcel Duchamp");
		p.setResposta3("Van Gogh");
		p.setResposta4("Leonardo da Vinci");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o metal cujo símbolo químico é o Au?");
		p.setResposta1("Cobre");
		p.setResposta2("Prata");
		p.setResposta3("Mercúrio");
		p.setCorreta("Ouro");
		p.setResposta4("Manganês");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que século o continente europeu foi devastado pela peste bubônica?");
		p.setResposta1("No século X");
		p.setResposta2("No século XI");
		p.setResposta3("No século XII");
		p.setResposta4("No século XIII");
		p.setCorreta("No século XIV");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem viveu, segundo a bíblia, 969 anos?");
		p.setResposta1("Jesus Cristo");
		p.setResposta2("Noé");
		p.setCorreta("Matusalém");
		p.setResposta3("Benjamim");
		p.setResposta4("Abel");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que cidade ocorreu a Eco-92, a Conferência das Nações Unidas sobre ambiente e desenvolvimento?");
		p.setResposta1("Buenos Aires");
		p.setCorreta("Rio de Janeiro");
		p.setResposta2("Montevidéu");
		p.setResposta3("Assunção");
		p.setResposta4("Caracas");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem pintou o teto da capela sistina?");
		p.setCorreta("Michelangelo");
		p.setResposta1("Leonardo da Vinci");
		p.setResposta2("Rafael");
		p.setResposta3("Sandro Botticelli");
		p.setResposta4("Donatello");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quantos graus são necessários para que dois ângulos sejam complementares?");
		p.setResposta1("45");
		p.setResposta2("60");
		p.setCorreta("90");
		p.setResposta3("180");
		p.setResposta4("360");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem foi o criador da tragédia grega?");
		p.setResposta1("Homero");
		p.setResposta2("Eurípedes");
		p.setResposta3("Plutarco");
		p.setCorreta("Ésquilo");
		p.setResposta4("Sófocles");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Jim Morrison era vocalista de que grupo?");
		p.setResposta1("The Police");
		p.setCorreta("The Doors");
		p.setResposta2("Pink Floyd");
		p.setResposta3("Nirvana");
		p.setResposta4("AC/DC");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------

		
		
		
		
		
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("''O esquema funcionava através da superfaturação de obras que faziam parte de um programa que tinha como objetivo acelerar o crescimento econômico no País''. Essa descrição corresponde a uma operação criminosa no Brasil. Trata-se da:");
		p.setCorreta("Operação Navalha");
		p.setResposta1("Operação Lava Jato");
		p.setResposta2("Operação Greenfield");
		p.setResposta3("Operação Panatenaico");
		p.setResposta4("Operação Carne Fraca");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que ano e onde aconteceu o maior acidente aéreo da história do Brasil?");
		p.setCorreta("Ano 2007, em São Paulo");
		p.setResposta1("Ano 2006, no Mato Grosso");
		p.setResposta2("Ano 1982, no Ceará");
		p.setResposta3("Ano 1996, em São Paulo");
		p.setResposta4("Ano 1952, na Floresta Amazônica");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Duas das afirmações abaixo estão erradas: \nIntolerância religiosa é um crime de ódio.\nA intolerância religiosa não é crime no Brasil.\nA pena para crime de intolerância religiosa vai de 1 a 3 anos de prisão.\nIntolerância religiosa é cometer atos de vandalismo contra os templos de outras religiões.\nA liberdade de expressão garante o direito para dizer o que se quer sobre crenças ou religiões que não a nossa.\n");
		p.setCorreta("2 e 5");
		p.setResposta1("1 e 2");
		p.setResposta2("2 e 3");
		p.setResposta3("5 e 4");
		p.setResposta4("1 e 3");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual das alternativas apresenta os Presidentes do Brasil em ordem de sucessão?");
		p.setCorreta("Dilma Rousseff, Michel Temer, Jair Bolsonaro");
		p.setResposta1("Dilma Rousseff, Lula, Jair Bolsonaro");
		p.setResposta2("Fernando Henrique, Itamar Franco, Lula");
		p.setResposta3("Itamar Franco, Collor, Lula");
		p.setResposta4("Collor, Lula, Dilma Rousseff");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais destas empresas brasileiras foram incluídas no pacote de privatizações do governo Temer?\nEletrobras\nCasa da Moeda\nEmbraer\nVale S.A.\nAeroporto Internacional do Rio de Janeiro Galeão - Tom Jobim\n");
		p.setCorreta("Eletrobras e Casa da Moeda");
		p.setResposta1("Eletrobras e Embraer");
		p.setResposta2("Aeroporto de Congonhas e Vale S.A.");
		p.setResposta3("Casa da Moeda e Aeroporto Internacional do Rio de Janeiro Galeão//Tom Jobim");
		p.setResposta4("Embraer e Aeroporto Internacional do Rio de Janeiro Galeão//Tom Jobim");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual das alternativas contém apenas vacinas contra a covid-19?");
		p.setCorreta("CoronaVac e AstraZeneca");
		p.setResposta1("VIP/VOP e AstraZeneca");
		p.setResposta2("HPV e BioNTech");
		p.setResposta3("Pentavalente (DTPp.setResposta1(''e Sputnik V''");
		p.setResposta4("Rotavírus e CoronaVac");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o motivo da condenação de Luís Inácio Lula da Silva em 2018?");
		p.setCorreta("Recebimento de apartamento de luxo no Guarujá (SP) como propina na Operação Lava Jato");
		p.setResposta1("Corrupção e lavagem de dinheiro na Operação Lava Jato");
		p.setResposta2("Tráfico de influência internacional na Operação Janus");
		p.setResposta3("Obstrução da justiça na Operação Lava Jato");
		p.setResposta4("Formação de quadrilha na Operação Lava Jato");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais os quatros países que têm a maior população carcerária do mundo?");
		p.setCorreta("Estados Unidos, China, Rússia e Brasil");
		p.setResposta1("Brasil, Estados Unidos, México e Índia");
		p.setResposta2("China, Estados Unidos, Índia e Indonésia");
		p.setResposta3("Rússia, Japão, Canadá e China");
		p.setResposta4("Brasil, Estados Unidos, China e Vaticano");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais destes acontecimentos faz 20 e 30 anos em 2021?");
		p.setCorreta("Atentado de 11 de setembro e Fim da Guerra do Golfo");
		p.setResposta1("Primavera árabe e Atentados de 11 de setembro");
		p.setResposta2("Fim da Guerra no Golfo e Coroação de Dom Pedro II no Brasil");
		p.setResposta3("Fim da Guerra no Golfo e Fim da Guerra Fria");
		p.setResposta4("Primavera árabe e Atentados de 11 de setembro");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual foi a revolução que alavancou a independência do Brasil e em 2017 completou o segundo centenário?");
		p.setCorreta("Revolução Pernambucana");
		p.setResposta1("Revolução Farroupilha");
		p.setResposta2("Revolução Federalista");
		p.setResposta3("Revolução Praieira");
		p.setResposta4("Revolução Acreana");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual das alternativas traz uma das medidas do presidente Trump, anunciada em 2017, que causou polêmica?");
		p.setCorreta("Saída do Acordo de Paris");
		p.setResposta1("Construção de um muro na fronteira com o Canadá");
		p.setResposta2("Cessação de Acordo de Comércio Livre (ACL) entre os Estados Unidos e Israel");
		p.setResposta3("Saída da OTAN - Organização do Tratado do Atlântico Norte");
		p.setResposta4("Reconciliação dos EUA com Cuba");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("O que é Pix?");
		p.setCorreta("Meio de pagamento instantâneo criado pelo Banco Central do Brasil");
		p.setResposta1("Plano de investimento de baixo risco do Banco do Brasil");
		p.setResposta2("Conjunto de formas de pagamento realizados por subadquirentes");
		p.setResposta3("Forma de pagamento online");
		p.setResposta4("Produtos de investimento financeiro criados pelo Banco Central do Brasil");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que país que tem realizado testes nucleares e, em 2017, ameaçou principalmente os Estados Unidos da América?");
		p.setCorreta("Coreia do Norte");
		p.setResposta1("Síria");
		p.setResposta2("Israel");
		p.setResposta3("China");
		p.setResposta4("Paquistão");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("O que é Brexit?");
		p.setCorreta("Saída do Reino Unido da União Europeia");
		p.setResposta1("Saída do Reino Unido da Zona Euro");
		p.setResposta2("Saída da Inglaterra do Reino Unido");
		p.setResposta3("Fim da monarquia no Reino Unido");
		p.setResposta4("Mudança do sistema de governo no Reino Unido");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais os países que mais têm recebido refugiados sírios?");
		p.setCorreta("Turquia e Líbano");
		p.setResposta1("Alemanha e França");
		p.setResposta2("Jordânia e Sérvia");
		p.setResposta3("Iraque e Suécia");
		p.setResposta4("Turquia e Egito");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Sobre a personagem Mafalda, do cartunista argentino Quino (falecido em 2020), é correto afirmar.");
		p.setCorreta("Foi criada para fazer publicidades de eletrodomésticos");
		p.setResposta1("Foi criada para uma campanha de alfabetização argentina na década de 60");
		p.setResposta2("As tirinhas de Mafalda foram traduzidas apenas para português e inglês");
		p.setResposta3("Sua criação foi inspirada na filha de Quino");
		p.setResposta4("Seu maior desejo era ser igual à sua mãe");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("O que é o Acordo de Paris?");
		p.setCorreta("Acordo internacional que trata do aquecimento global");
		p.setResposta1("Acordo internacional que trata da restrição de imigrantes em Paris");
		p.setResposta2("Acordo internacional que trata da proteção da França dos atentados terroristas");
		p.setResposta3("Acordo internacional que trata do Desenvolvimento Sustentável");
		p.setResposta4("Acordo internacional que trata da poluição radioativa");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a nacionalidade do sociólogo e filósofo Durkheim?");
		p.setCorreta("Francesa");
		p.setResposta1("Alemã");
		p.setResposta2("Inglesa");
		p.setResposta3("Italiana");
		p.setResposta4("Norueguesa");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais os acontecimentos completaram 100 e 500 anos respectivamente em 2017?");
		p.setCorreta("Revolução Russa e Reforma Protestante");
		p.setResposta1("Revolução Pernambucana e Revolta da Sabinada");
		p.setResposta2("Semana da Arte Moderna e aniversário da morte de Maquiavel");
		p.setResposta3("Centenário do nascimento de Frida Khalo e Início do Classicismo");
		p.setResposta4("Centenário do nascimento de Oscar Niemeyer e Reforma Protestante");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("O que é o Amazonia 1?");
		p.setCorreta("Primeiro satélite totalmente desenvolvido pelo Brasil para monitorar a Amazônia e outros biomas brasileiros, que foi lançado no dia 28 de fevereiro de 2021 do Centro de Lançamento Satish Dhawan Space Centre, na Índia.");
		p.setResposta1("Primeiro satélite totalmente desenvolvido pelo Brasil para monitorar a Amazônia e outros biomas brasileiros, que foi lançado no dia 28 de fevereiro de 2021 do Centro de Lançamento de Alcântara (CLERRADA  - a), no Brasil.");
		p.setResposta2("Primeiro satélite brasileiro de coleta de dados, que foi lançado no dia 9 de fevereiro de 1993 do Centro de Controle de Wallops, nos Estados Unidos.");
		p.setResposta3("Plano do governo brasileiro que tem como objetivo o desenvolvimento sustentável na Amazônia.");
		p.setResposta4("Fundo de projetos sustentáveis na Amazônia, criado pelo Banco Interamericano de Desenvolvimento (BIERRADA - d).");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual dentre esses casos não foi confirmado como atentado terrorista em 2017?");
		p.setCorreta("Tiroteio em massa em Las Vegas");
		p.setResposta1("Explosão de homem bomba após show de Ariana Grande em Manchester");
		p.setResposta2("Explosão no metrô de São Petersburgo, na Rússia");
		p.setResposta3("Explosões em igrejas no Egito no Domingo de Ramos");
		p.setResposta4("Atropelamento na Ponte de Londres seguido de esfaqueamentos no Mercado Borough");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Lady Di era o apelido de qual personalidade?");
		p.setCorreta("Diana, a Princesa de Gales");
		p.setResposta1("Chiquinha Gonzaga");
		p.setResposta2("Joana d’Arc");
		p.setResposta3("Carlota Joaquina");
		p.setResposta4("Grace Kelly");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Durante quantos anos Fidel Castro, um dos governantes que esteve mais tempo no poder, esteve à frente de Cuba?");
		p.setCorreta("49 anos");
		p.setResposta1("39 anos");
		p.setResposta2("32 anos");
		p.setResposta3("40 anos");
		p.setResposta4("46 anos");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual destas frases foi dita pelo Papa Francisco?");
		p.setCorreta("''Não existe mãe solteira. Mãe não é um estado civil.''");
		p.setResposta1("''Se Deus é brasileiro, o Papa é carioca.''");
		p.setResposta2("''Brasil acima de tudo, Deus acima de todos.''");
		p.setResposta3("''Ter fé é assinar uma folha em branco e deixar que Deus nela escreva o que quiser.''");
		p.setResposta4("''Prefiro ser um homem de paradoxos que um homem de preconceitos.''");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Por que a Catalunha foi um tema de destaque em 2017?");
		p.setCorreta("Por causa da crise que provoca na Espanha quando luta pela sua independência");
		p.setResposta1("Porque quer sair da União Europeia");
		p.setResposta2("Porque o reino da Espanha quer se separar da Catalunha");
		p.setResposta3("Porque quer sair da Zona Euro e criar uma moeda própria");
		p.setResposta4("Porque a Espanha acredita que a separação será benéfica para a economia espanhola");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a função da ONU?");
		p.setCorreta("Unir as nações com o objetivo de manter a paz e a segurança mundial");
		p.setResposta1("Zelar pela cultura em todas as nações");
		p.setResposta2("Financiar países em desenvolvimento");
		p.setResposta3("Regular o funcionamento do sistema financeiro a nível internacional");
		p.setResposta4("Gerenciar acordos de comércio entre os países");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a primeira mulher a ganhar um prêmio Nobel?");
		p.setCorreta("Marie Curie");
		p.setResposta1("Madre Teresa de Calcutá");
		p.setResposta2("Elizabeth Blackweel");
		p.setResposta3("Irène Joliot-Curie");
		p.setResposta4("Valentina Tereshkova");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Eva Braun era o nome da esposa de qual dessas personalidades conhecidas pela sua crueldade?");
		p.setCorreta("Adolf Hitler");
		p.setResposta1("Vladimir Lenin");
		p.setResposta2("Benito Mussolini");
		p.setResposta3("Josef Stalin");
		p.setResposta4("Augusto Pinochet");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que governo brasileiro foi sancionada a lei das cotas para o ensino superior?");
		p.setCorreta("Governo de Dilma Rousseff");
		p.setResposta1("Governo de José Sarney");
		p.setResposta2("Governo de Fernando Henrique");
		p.setResposta3("Governo de Tancredo Neves");
		p.setResposta4("Governo de Luís Inácio Lula da Silva");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Mao Tsé-tung, Jean Jacques Dessalines e Nelson Mandela foram respectivamente os governantes de quais países?");
		p.setCorreta("China, Haiti e África do Sul");
		p.setResposta1("Japão, França e Angola");
		p.setResposta2("Índia, Alemanha e Portugal");
		p.setResposta3("Taiwan, Bélgica, Moçambique");
		p.setResposta4("Macau, Suíça, Estados Unidos da América");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Chernobyl e Césio-137 fazem parte dos maiores acidentes nucleares da história. Em que países aconteceram?");
		p.setCorreta("Ucrânia e Brasil");
		p.setResposta1("Rússia e Espanha");
		p.setResposta2("Estados Unidos e Ucrânia");
		p.setResposta3("Japão e Brasil");
		p.setResposta4("Taiwan e Alemanha");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Como morreu Saddam Hussein?");
		p.setCorreta("Enforcado");
		p.setResposta1("Vítima de câncer");
		p.setResposta2("Suicídio");
		p.setResposta3("Ataque cardíaco");
		p.setResposta4("Decapitado");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o país esteve na liderança militar da Minustah, a Missão das Nações Unidas para a Estabilização no Haiti?");
		p.setCorreta("Brasil");
		p.setResposta1("Estados Unidos");
		p.setResposta2("Argentina");
		p.setResposta3("França");
		p.setResposta4("República Dominicana");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Países Baixos, Mianmar e Irã são países que mudaram de nomes. Antes eram chamados respectivamente de:");
		p.setCorreta("Holanda, Birmânia e Pérsia");
		p.setResposta1("Holanda, Ceilão e Pérsia");
		p.setResposta2("Birmânia, Pérsia e Holanda");
		p.setResposta3("Suazilândia, Birmânia e Pérsia");
		p.setResposta4("Holanda, Birmânia e Sião");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual a doença sexualmente transmissível que virou surto no Brasil em 2017?");
		p.setCorreta("Sífilis");
		p.setResposta1("Febre amarela");
		p.setResposta2("Zika");
		p.setResposta3("Hepatite B");
		p.setResposta4("Candidíase");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Como forma de resistir às tradições do Halloween, qual a data comemorativa foi instituída no Brasil para ser celebrada no dia 31 de outubro?");
		p.setCorreta("Dia do Saci");
		p.setResposta1("Dia das bruxas");
		p.setResposta2("Dia do folclore");
		p.setResposta3("Dia da poupança");
		p.setResposta4("Dia da música popular brasileira");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em que país se localizava Auschwitz, o maior campo de concentração nazi?");
		p.setCorreta("Polônia");
		p.setResposta1("Alemanha");
		p.setResposta2("Estados Unidos");
		p.setResposta3("Áustria");
		p.setResposta4("Japão");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem é Luiz Gabriel Tiago?");
		p.setCorreta("Brasileiro indicado ao Prêmio Nobel da Paz 2018");
		p.setResposta1("Militar e político brasileiro");
		p.setResposta2("Escritor e poeta português");
		p.setResposta3("Escritor e poeta espanhol");
		p.setResposta4("Nome verdadeiro de Luiz Gonzaga, o Gonzaguinha");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que decisão de Donald Trump alarmou a comunidade internacional em dezembro de 2017?");
		p.setCorreta("Reconhecimento de Jerusalém como capital de Israel");
		p.setResposta1("Retificação da decisão sobre a importação de troféus de caça");
		p.setResposta2("Decreto contra a lei de saúde ''Obamacare''");
		p.setResposta3("Construção de muro na fronteira entre Estados Unidos e México");
		p.setResposta4("Construção de oleodutos");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em outubro de 2017 um crime em Goiânia chocou o Brasil. O que aconteceu?");
		p.setCorreta("Um adolescente disparou contra colegas em uma sala de aula, dois dos quais morreram");
		p.setResposta1("Chacina da Candelária");
		p.setResposta2("Um segurança ateou fogo em crianças de uma creche, provocando a morte de pelo menos 5");
		p.setResposta3("Crime que ficou conhecido como Massacre de Realengo");
		p.setResposta4("Um índio foi queimado enquanto dormia em um ponto de ônibus");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual o nome do líder da Coreia do Norte?");
		p.setCorreta("Kim Jong-un");
		p.setResposta1("Pak Pong-ju");
		p.setResposta2("Kim Jong-Il");
		p.setResposta3("Moon Jae-in");
		p.setResposta4("Xi Jinping");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais as consequências para o Brasil decorrentes da crise na Venezuela?");
		p.setCorreta("Sobrecarregamento no sistema público de saúde em Roraima");
		p.setResposta1("Fortalecimento do Mercosul");
		p.setResposta2("Aumento de mão-de-obra");
		p.setResposta3("Crescimento de investimentos estrangeiros");
		p.setResposta4("Melhoria nos serviços sociais a fim de atender os imigrantes venezuelanos");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em 2018, um evento que aconteceu na França completou 500 anos. Trata-se de um caso em que várias pessoas morreram após passarem dias dançando. Qual o nome desse evento?");
		p.setCorreta("Epidemia de dança");
		p.setResposta1("Peste negra");
		p.setResposta2("Gripe francesa");
		p.setResposta3("Praga de Estrasburgo");
		p.setResposta4("Esclerose múltipla");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em 2018 é o centenário da morte de que importante poeta brasileiro?");
		p.setCorreta("Olavo Bilac");
		p.setResposta1("Monteiro Lobato");
		p.setResposta2("Machado de Assis");
		p.setResposta3("Aluísio de Azevedo");
		p.setResposta4("Carlos Heitor Cony");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais destes grupos não devem tomar a vacina contra a febre amarela?");
		p.setCorreta("Transplantados, pacientes oncológicos, pessoas com alergia grave ao ovo");
		p.setResposta1("Crianças até 2 anos, grávidas, doadores de sangue");
		p.setResposta2("Pacientes com câncer, idosos acima de 75 anos");
		p.setResposta3("Mulheres que querem engravidar, lactantes, bebês com menos de 1 ano, doentes que recebam tratamento de saúde especial");
		p.setResposta4("Pessoas alérgicas, crianças até 2 anos, grávidas");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem é o autor do famoso discurso ''Eu tenho um sonho''?");
		p.setCorreta("Martin Luther King");
		p.setResposta1("Nelson Mandela");
		p.setResposta2("Zumbi dos Palmares");
		p.setResposta3("Barack Obama");
		p.setResposta4("Carlota Joaquina");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que país sediará as Olimpíadas de 2020?");
		p.setCorreta("Japão");
		p.setResposta1("Catar");
		p.setResposta2("Rússia");
		p.setResposta3("França");
		p.setResposta4("Estados Unidos");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais as respectivas cores da reciclagem do papel, do vidro, do metal e do plástico?");
		p.setCorreta("azul, verde, amarelo e vermelho");
		p.setResposta1("verde, azul, vermelho e amarelo");
		p.setResposta2("vermelho, amarelo, verde e azul");
		p.setResposta3("azul, amarelo, verde e vermelho");
		p.setResposta4("verde, amarelo, azul e vermelho");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que acontecimento importante para a história da humanidade teve lugar em 20 de julho de 1969?");
		p.setCorreta("Chegada do homem à Lua");
		p.setResposta1("Fim do Apartheid");
		p.setResposta2("Lançamento das bombas atômicas em Hiroshima e Nagasaki");
		p.setResposta3("Lançamento do álbum dos Beatles Abbey Road");
		p.setResposta4("Envio do primeiro e-mail da história");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quais as maiores pandemias da história?");
		p.setCorreta("Peste negra e covid-19");
		p.setResposta1("Gripe espanhola e câncer");
		p.setResposta2("Varíola e hipertensão");
		p.setResposta3("Cólera e colesterol");
		p.setResposta4("Asma e Gripe espanhola");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Qual das alternativas apresenta os motivos de cancelamento das Olimpíadas de 1916, 1940 e 1944?");
		p.setCorreta("Primeira e Segunda guerras mundiais");
		p.setResposta1("Atrasos nas obras dos estádios");
		p.setResposta2("Roubo da tocha olímpica");
		p.setResposta3("Primeira Guerra Mundial e coronavírus");
		p.setResposta4("Falta de financiamento");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem é Abraham Weintraub?");
		p.setCorreta("Ministro da Educação do Brasil entre 2019 e 2020");
		p.setResposta1("Compositor de origem judaica");
		p.setResposta2("Ex-agente secreto israelense");
		p.setResposta3("Sociólogo e ativista brasileiro");
		p.setResposta4("Rabino israelense");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em qual das alternativas todos são sintomas mais comuns do covid-19.");
		p.setCorreta("Febre, tosse e dificuldades para respirar");
		p.setResposta1("Febre, tosse e diarreia");
		p.setResposta2("Dor de cabeça, febre e tontura");
		p.setResposta3("Mal-estar, vômitos e diarreia");
		p.setResposta4("Perda de visão, febre e tosse");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem são os autores das seguintes frases?\n''Se queres prever o futuro, estuda o passado.''\n''Cada segundo é tempo para mudar tudo para sempre.''");
		p.setCorreta("Confúcio e Charles Chaplin");
		p.setResposta1("Augusto Cury e João Paulo II");
		p.setResposta2("Albert Camus e Albert Einstein");
		p.setResposta3("Victor Hugo e Eleanor Roosevelt");
		p.setResposta4("Madre Teresa de Calcutá e Confúcio");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("É um dos maiores nomes da literatura brasileira. Ucraniana, em 2020 faria 100 anos. De quem estamos falando?");
		p.setCorreta("Clarice Lispector");
		p.setResposta1("Lygia Fagundes Telles");
		p.setResposta2("Cecília Meireles");
		p.setResposta3("Rachel de Queiroz");
		p.setResposta4("Svetlana Aleksiévitch");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Que acontecimento histórico comemorou 30 anos em 9 de novembro de 2019?");
		p.setCorreta("Queda do muro de Berlim");
		p.setResposta1("Queda da Bastilha");
		p.setResposta2("Grande depressão");
		p.setResposta3("Transferência da soberania de Macau à China");
		p.setResposta4("Revolução cubana");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Quem é a primeira santa nascida no Brasil, canonizada em 2019?");
		p.setCorreta("Santa Dulce dos Pobres");
		p.setResposta1("Nossa Senhora Aparecida");
		p.setResposta2("Madre Teresa de Calcutá");
		p.setResposta3("Rainha Santa Isabel");
		p.setResposta4("Nossa Senhora de Guadalupe");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		p = new Pergunta();
		p.setAtivo(true);
		p.setCodigo("00001");
		p.setQuestao("Em qual das alternativas os dois filmes tem como tema a Segunda Guerra Mundial.");
		p.setCorreta("O Império do Sol, de Steven Spielberg (1987) e A vida é bela, de Roberto Benini (1997)");
		p.setResposta1("Sonho de uma Noite de Verão, de Michael Hoffman (1999) e Macbeth: Ambição e Guerra, de Justin Kurzel (2015)");
		p.setResposta2("A Batalha de Passchendaele, de Paul Gross (2008) e Cavalo de Guerra, de Steven Spielberg (2011)");
		p.setResposta3("Anti-herói, de Dito Montiel (2003) e Meia-noite em Paris, Woody Allen (2011)");
		p.setResposta4("Estrelas além do tempo, de Theodore Melfi (2016) e Pantera negra, de Ryan Coogler (2018)");
		todasPerguntas.add(p);
		// QUESTÃO ---------------------------------------------------------------------------------
		

		
		
		
		return todasPerguntas;
	}
	
	
}
