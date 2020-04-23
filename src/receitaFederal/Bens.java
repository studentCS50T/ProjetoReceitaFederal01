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
public class Bens {
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
    public Bens(int codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        Bens.valor = valor;
    }
    public static Double calculaTarifa(){
        return Bens.valor*0.15;
    }
    public String toString(){
        return "\n Código dos Bens: "+getCodigo()+
                "\n Descrição do Bens: "+getDescricao()+
                "\n Valor: "+df.format(Bens.valor)+
                    "\n Calculo de Tarifa: "+df.format(Bens.calculaTarifa());
        
    }
}
