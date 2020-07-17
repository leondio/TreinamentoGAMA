package br.bobadilla.exercicio01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.bobadilla.exercicio01.dao.UserRepo;
import br.bobadilla.exercicio01.model.User;

@Component
public class UserServiceImp implements IUserService {

    @Autowired
    private UserRepo repo;

    @Override
    public User buscarUserPorId(int id) {
        return repo.findById(id).get();
    }

    @Override
    public List<User> listarTodos() {
        return (List<User>) repo.findAll();
    }

    @Override
    public User buscarUserPorNomeESenha(String nome, String senha) {
        return repo.findByNomeAndSenha(nome, senha);
    }

    

    

}