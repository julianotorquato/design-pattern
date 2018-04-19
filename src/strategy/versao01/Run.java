package strategy.versao01;

import model.Orcamento;

public class Run {

    public static void main(String[] args) {
       Orcamento orc = new Orcamento(100.0);
       
       new CalculadorDeImpostos().realizaCalculo(orc, "ICMS");
       
       new CalculadorDeImpostos().realizaCalculo(orc, "ISS");
    }
    
}
