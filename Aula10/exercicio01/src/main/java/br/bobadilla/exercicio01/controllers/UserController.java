package br.bobadilla.exercicio01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.bobadilla.exercicio01.model.User;
import br.bobadilla.exercicio01.services.IUserService;

@RestController
@CrossOrigin
public class UserController {
    
    @Autowired
    private IUserService servico;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> buscarUserPorId(@PathVariable int id){
        User user = servico.buscarUserPorId(id);

        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> listarTodos(){
        return ResponseEntity.ok(servico.listarTodos());
    }

    @PostMapping("/user/find")
    public ResponseEntity<User> buscarPorNomeESenha(@RequestBody User username){
        User user = servico.buscarUserPorNomeESenha(username.getNome(), username.getSenha());

        if(user != null){
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }
}