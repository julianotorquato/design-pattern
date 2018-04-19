package strategy.versao02;

import model.Orcamento;

public class CalculadorDeImpostos {
    
    public void realizaCalculoICMS(Orcamento orcamento){
        double icms = new ICMS().calculaICMS(orcamento);
        System.out.println(icms);
    }
    
    public void realizaCalculoISS(Orcamento orcamento){
        double iss = new ISS().calculaISS(orcamento);
        System.out.println(iss);
    }
}