package br.bobadilla.exercicio01.dao;

import org.springframework.data.repository.CrudRepository;

import br.bobadilla.exercicio01.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{
    public User findByNomeAndSenha(String nome, String senha);
}