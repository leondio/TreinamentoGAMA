package br.bobadilla.exercicio01.services;

import java.util.List;

import br.bobadilla.exercicio01.model.User;

public interface IUserService {
    public User buscarUserPorId(int id);
    public List<User> listarTodos();
    public User buscarUserPorNomeESenha(String nome, String senha);
}