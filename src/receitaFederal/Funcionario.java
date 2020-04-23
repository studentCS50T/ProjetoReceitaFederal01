/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receitaFederal;

/**
 *
 * @author timoteodimapereira
 */
public abstract class Funcionario {
    private String nome;
    private int matricula;
    private Double salario;
    private Endereco endereco;

    
    
 public abstract Double calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Funcionario(String nome, int matricula, Double salario, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.endereco = endereco;
    }
    
  }

    

