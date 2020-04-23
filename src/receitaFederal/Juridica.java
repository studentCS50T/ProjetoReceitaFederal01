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
public class Juridica  extends Pessoa {
   private String cnpj;
   private ParaPessoaJuridica paraPessoaJuridica;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ParaPessoaJuridica getParaPessoaJuridica() {
        return paraPessoaJuridica;
    }

    public void setParaPessoaJuridica(ParaPessoaJuridica paraPessoaJuridica) {
        this.paraPessoaJuridica = paraPessoaJuridica;
    }

    public Juridica(String cnpj, ParaPessoaJuridica paraPessoaJuridica, 
            String nome, Endereco endereco) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.paraPessoaJuridica = paraPessoaJuridica;
    }

   public String toString(){
       return "\n ********************"+
                    "\n P E S S O A - J U R Í D I C A"+
               "\n ********************"+
               "\n Nome: "+getNome()+
               "\n CNPJ: "+getCnpj()+
               "\n Endereço: "+getEndereco()+
               "\n Cálculo de Imposto: "+getParaPessoaJuridica();
   }
   
    
    
}
