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
public class Dependente {
    private int codigo;
    private String nome;
    private int idade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Dependente(String nome,int codigo,  int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }
    public String toString(){
        return "\n ***DADOS DO DEPENDENTE***"+
                "\n Nome do Dependente: "+getNome()+
                "\n Código: "+getCodigo()+
                "\n Idade: "+getIdade();
    }
    
    
}
