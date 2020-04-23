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
public class Fisica extends Pessoa {
    private String cpf;
    private ParaPessoaFisica paraPessoaFisica;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ParaPessoaFisica getParaPessoaFisica() {
        return paraPessoaFisica;
    }

    public void setParaPessoaFisica(ParaPessoaFisica paraPessoaFisica) {
        this.paraPessoaFisica = paraPessoaFisica;
    }

    public Fisica(String cpf, ParaPessoaFisica paraPessoaFisica, 
            String nome, Endereco endereco) {
        super(nome, endereco);
        this.cpf = cpf;
        this.paraPessoaFisica = paraPessoaFisica;
    }
    
    public String toString(){
        return "\n ********************"+
                    "\n P E S S O A - F Í S I C A"+
               "\n ********************"+
                "\n Nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Endereço: "+getEndereco()+
                "\n Declaração de Imposto: "+getParaPessoaFisica();
                
    }
}
