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
        return (List<Produto>) repo.findAll();
    }

    @Override
    public void gravarProduto(Produto produto) {
        repo.save(produto);
    }

    @Override
    public Produto buscarPorNome(String nome) {
        return repo.findByNome(nome);
    }

    @Override
    public List<Produto> buscarBaratos(double valor) {
        return repo.findMenoresPrecos(valor);
    }

    @Override
    public void apagarProduto(int idProduto) {
        repo.deleteById(idProduto);
    }

    

}