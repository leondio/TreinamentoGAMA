package br.bobadilla.sample02.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.bobadilla.sample02.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{
    //select * from tblProduto where nome = nome
    public Produto findByNome(String nome);

    @Query(value = "select tblproduto.* from tblproduto where preco < ?1", nativeQuery = true)
    public List<Produto> findMenoresPrecos(double valor);
}