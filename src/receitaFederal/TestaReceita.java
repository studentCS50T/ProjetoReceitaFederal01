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
public class TestaReceita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Auditor auditor = new Auditor(10000.00, "João Auditor", 002, 20000.00, 
                new Endereco("Rua Bolívia", 300), 
                new Auditoria(002, "02/03/2015"));
        System.out.println(auditor);
        
        
        
        Atendente atendente = new Atendente("Comércio", 
                new Fisica("3445555555-65", 
                        new ParaPessoaFisica(200.00, 
                                new Dependente("Dependente Tim", 01, 38), 12, 2019, 5000.00, 
                                new Deducao(02, "Educacional", 2000.00), 
                                new Pagamento(002, "Mensalidade", 5000.00), 
                                new Bens(001, "Casa, carros, comércio", 50000.00)), "Tomas", 
                        new Endereco("Rua 4", 4)), "Armando", 02, 10000.00, 
                new Endereco("Rua 5", 5));
        System.out.println(atendente);
        
        
        Juridica juridica = new Juridica("4495958686866-55", 
                new ParaPessoaJuridica(01, 2018, 40000.00, 
                        new Deducao(021, "Saúde", 2000.00), 
                        new Pagamento(010, "Mensalidade", 15000.00), 
                        new Bens(01, "Emprese de Telecomunicação", 5000000.00),"Autoridades locais"), "Eguitel Comunicações", 
                new Endereco("Rua 2", 2));
        System.out.println(juridica);
        
     

    }
    
}
