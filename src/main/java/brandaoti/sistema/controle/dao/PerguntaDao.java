package brandaoti.sistema.controle.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import brandaoti.sistema.controle.model.Pergunta;

public interface PerguntaDao extends JpaRepository<Pergunta, Integer> {
	
	@Query(" select v from Pergunta v where v.ativo = 1 order by v.id asc ")
	List<Pergunta> buscarPerguntas();
	
	@Query(" select v from Pergunta v where v.ativo = 1 and upper( v.codigo ) like upper( :codigo ) order by v.id asc ")
	Pergunta porCodigo(@Param("codigo") String codigo);
	
	@Query("select v from Pergunta v where v.ativo = 1 and v.id = :idQuestao and upper( v.questao) like upper( :questao ) and upper( v.correta ) like upper( :resposta )")
	List<Pergunta> analisar(@Param("questao") String questao, @Param("resposta") String resposta, @Param("idQuestao") Integer idQuestao);
	
	@Query("select v from Pergunta v where v.ativo = 1 and v.id = :idQuestao and upper( v.questao) like upper( :questao )")
	Pergunta correta(@Param("questao") String questao,@Param("idQuestao") Integer idQuestao);
}
