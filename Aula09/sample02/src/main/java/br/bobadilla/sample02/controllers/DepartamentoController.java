package br.bobadilla.sample02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.bobadilla.sample02.model.Departamento;
import br.bobadilla.sample02.services.IDepartamentoService;

@RestController
@CrossOrigin("*")
public class DepartamentoController {

    //Autowired é utilizado para utilizar parameto de forma não explicita
    @Autowired
    private IDepartamentoService servico;

    @GetMapping("/departamento/{id}")
    public ResponseEntity<Departamento> buscarDepartamentoPorId(@PathVariable int id){
        Departamento depto = servico.buscarDeptoPorId(id);

        if(depto != null){
            return ResponseEntity.ok(depto);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/departamentos")
    public ResponseEntity<List<Departamento>> mostrarTodos(){
        return ResponseEntity.ok(servico.listarTodosDepartamentos());
    }

}