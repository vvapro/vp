package dao;

import java.util.List;

import javax.persistence.Query;

import model.Aluguel_produtos;

public class Aluguel_produtosDao<E> extends DaoGenerico<Aluguel_produtos> {
	public List<Aluguel_produtos> pesquisarPeloNome(String campoPesquisa) {
		Query query = super.getEntityManager().createQuery("from Usuario where nomeCompleto like '%"+campoPesquisa+"%' order by nomeCompleto asc");
		return query.getResultList();
	}

}
