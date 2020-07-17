package br.bobadilla.sample02.services;

import java.util.List;

import br.bobadilla.sample02.model.Departamento;

public interface IDepartamentoService {
    public Departamento buscarDeptoPorId(int id);
    public List<Departamento> listarTodosDepartamentos();
}