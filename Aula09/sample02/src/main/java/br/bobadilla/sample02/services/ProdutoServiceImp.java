package br.bobadilla.sample02.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.bobadilla.sample02.dao.ProdutoRepo;
import br.bobadilla.sample02.model.Produto;

@Component
public class ProdutoServiceImp implements IProdutoService {

    @Autowired
    private ProdutoRepo repo;

    @Override
    public Produto buscarProdutoPorCod(int cod) {
        return repo.findById(cod).get();
    }

    @Override
    public List<Produto> buscarTodos() {
        return (List<Produto>)repo.findAll();
    }

}