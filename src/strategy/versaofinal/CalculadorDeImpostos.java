package strategy.versaofinal;

import model.Orcamento;

public class CalculadorDeImpostos {
    
    public void realizaCalculo(Orcamento orcamento, Imposto imposto){
        double icms = imposto.calcula(orcamento);
        System.out.println(icms);
    }
}