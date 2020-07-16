package br.bobadilla.sample02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.bobadilla.sample02.model.Produto;
import br.bobadilla.sample02.services.IProdutoService;

//Definição do ponto de acesso
@RestController
//Define quem pode acessar
@CrossOrigin("*")
public class ProdutoController {
    
    @Autowired
    private IProdutoService servico;

    @GetMapping("/produto/{cod}")
    public ResponseEntity<Produto> buscarProdutoPorCod(@PathVariable int cod){
        Produto prod = servico.buscarProdutoPorCod(cod);

        if(prod != null){
            return ResponseEntity.ok(prod);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/produto")
    public ResponseEntity<List<Produto>> mostrarTodos(){
        return ResponseEntity.ok(servico.buscarTodos());

    }

}