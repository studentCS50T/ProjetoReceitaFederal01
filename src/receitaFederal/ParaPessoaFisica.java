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
public class ParaPessoaFisica extends DeclaracaoImposto {
    private Double multa;
    private Dependente dependente;

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public ParaPessoaFisica(Double multa, 
            Dependente dependente, int numero, int ano, 
            Double valorDeclarado, Deducao deducao, Pagamento pagamento, Bens bens) {
        super(numero, ano, valorDeclarado, deducao, pagamento, bens);
        this.multa = multa;
        this.dependente = dependente;
    }
 public static Double calculaParcial(){
        return 
                DeclaracaoImposto.valorDeclarado+Bens.valor+Bens.calculaTarifa();
    }
    public static Double calculaDesconto(){
        return DeclaracaoImposto.valorDeclarado-Pagamento.calculaTaxa()
                -Deducao.calculaDeducao();
    }
    public static Double calculaImpostoPessoaFisica(){
        return DeclaracaoImposto.valorDeclarado+ParaPessoaFisica.calculaParcial()
                -ParaPessoaFisica.calculaDesconto();
    }
    public String toString(){
        return  "\n **************************"+
                "\n DECLARAÇÃO DE IMPOSTO "+
                "\n **************************"+
                "\n Multa: "+df.format(getMulta())+
                "\n Número: "+getNumero()+
                "\n Ano: "+getAno()+
                "\n Valor declarado: "+df.format(DeclaracaoImposto.valorDeclarado)+
                "\n Pagamento: "+getPagamento()+
                "\n Bens: "+getBens()+
                "\n Dedução: "+getDeducao()+
                "\n Dependente: "+getDependente()+
                "\n Valor  Parcial: "+df.format(ParaPessoaFisica.calculaParcial())+
                "\n Valor do Desconto: "+df.format(ParaPessoaFisica.calculaDesconto())+
                "\n Valor do Imposto da Pessoa Física: "+df.format(ParaPessoaFisica.calculaImpostoPessoaFisica());
                
    }
   
   
    }