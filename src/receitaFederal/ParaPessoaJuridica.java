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
public class ParaPessoaJuridica extends DeclaracaoImposto {
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ParaPessoaJuridica(int numero, 
            int ano, Double valorDeclarado, Deducao deducao, 
            Pagamento pagamento, Bens bens, String observacao) {
        super(numero, ano, valorDeclarado, deducao, pagamento, bens);
        this.observacao = observacao;
    }
   
    public static Double calculaParcial(){
        return DeclaracaoImposto.valorDeclarado+(Bens.valor*2)+Bens.calculaTarifa();
    }
    public static Double calculaImpostoPessoaJuridica(){
        return ParaPessoaJuridica.calculaParcial()+Pagamento.valor+DeclaracaoImposto.valorDeclarado;
    }
    
    public String toString(){
        return "\n **************************"+
                "\n DECLARAÇÃO DE IMPOSTO "+
                "\n **************************"+
                "\n Número: "+getNumero()+
                "\n Ano: "+getAno()+
                "\n Valor Declarado: "+df.format(DeclaracaoImposto.valorDeclarado)+
                "\n Dedução: "+getDeducao()+
                "\n Pagamento: "+getPagamento()+
                "\n Bens: "+getBens()+
                "\n Parcial: "+df.format(ParaPessoaJuridica.calculaParcial())+
                "\n Valor do Imposto P_Jurídica: "+df.format(ParaPessoaJuridica.calculaImpostoPessoaJuridica());
        
    }
}
