package br.bobadilla.sample02.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="tblproduto")
public class Produto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="cod")
        private int cod;

        @Column(name="nome", length = 100)
        private String nome;

        @Column(name="preco")
        private double preco;

        @JsonIgnoreProperties("listaProdutos")
        @JoinColumn(name="departamento")
        @ManyToOne()
        private Departamento departamento;

        public int getCod() {
            return cod;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setCod(int cod) {
            this.cod = cod;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public Departamento getDepartamento() {
            return departamento;
        }

        public void setDepartamento(Departamento departamento) {
            this.departamento = departamento;
        }
        
}