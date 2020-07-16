package br.bobadilla.sample02.services;

import java.util.List;

import br.bobadilla.sample02.model.Produto;

public interface IProdutoService {
    public Produto buscarProdutoPorCod(int cod);
    public List<Produto> buscarTodos();
}