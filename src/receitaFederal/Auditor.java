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
public class Auditor extends Funcionario {
    protected static Double gratificacao;
    private Auditoria auditoria;

DecimalFormat df = new DecimalFormat("R$: #,##0.00");

    public Auditor(Double gratificacao, String nome, int matricula, 
            Double salario, Endereco endereco, Auditoria auditoria) {
        super(nome, matricula, salario, endereco);
        Auditor.gratificacao = gratificacao;
        this.auditoria = auditoria;
    }
    
   
    public Double calculaSalario(){
        return getSalario()+(getSalario()*Auditor.gratificacao)+Auditor.gratificacao;
    }
    public String toString(){
        return "\n ********************"+
                    "\n  A U D I T O R "+
               "\n ********************"+
                "\n Nome: "+getNome()+
                "\n Matrícula: "+getMatricula()+
                "\n Endereço: "+getEndereco()+
                "\n Salário: "+df.format(getSalario())+
                "\n Gratificação: "+df.format(Auditor.gratificacao);
    }

    public Auditoria getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }
}
