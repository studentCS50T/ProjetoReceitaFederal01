/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receitaFederal;

import java.text.DecimalFormat;

/**
 *
 * @author timoteodimapereira
 */
public class Atendente extends Funcionario {
    private String setor;
    private Fisica fisica;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }
DecimalFormat df = new DecimalFormat("R$: #,##0.00");
    public Atendente(String setor, Fisica fisica, 
            String nome, int matricula, Double salario, Endereco endereco) {
        super(nome, matricula, salario, endereco);
        this.setor = setor;
        this.fisica = fisica;
    }

    public Double calculaSalario(){
        return getSalario()+(getSalario()*Auditor.gratificacao)+Auditor.gratificacao;
    }
    public String toString(){
        return "\n ********************"+
                    "\n A T E N D E N T E"+
               "\n ********************"+
                "\n Nome: "+getNome()+
                "\n Matrícula: "+getMatricula()+
                "\n Salário: "+df.format(getSalario())+
                "\n Endereço: "+getEndereco()+
                "\n Dados da P_Física: "+getFisica();
                
    }
}
