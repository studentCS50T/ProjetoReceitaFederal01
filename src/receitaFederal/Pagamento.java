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
public class Pagamento {
    private int codigo;
    private String descricao;
    protected static Double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    DecimalFormat df = new DecimalFormat("R$: #,##0.00");

    public Pagamento(int codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        Pagamento.valor= valor;
    }

public static double calculaTaxa(){
    return Pagamento.valor*0.03;
    }
    public String toString(){
        return "\n Código do Pagamento: "+getCodigo()+
                "\n Descrição do Pagamento: "+getDescricao()+
                "\n Valor: "+df.format(Pagamento.valor)+
                "\n Taxa: "+df.format(Pagamento.calculaTaxa());
    }
}
