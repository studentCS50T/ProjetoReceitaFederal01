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
public class Deducao {
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
    public Deducao(int codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        Deducao.valor = valor;
    }
    
    public static Double calculaDeducao(){
        return Deducao.valor*0.012;
    }
    public String toString (){
        return "\n Código da dedução: "+getCodigo()+
                "\n Descrição da dedução: "+getDescricao()+
                "\n Valor: "+df.format(Deducao.valor)+
                "\n Valor de dedução: "+df.format(Deducao.calculaDeducao());
        
    }
}
