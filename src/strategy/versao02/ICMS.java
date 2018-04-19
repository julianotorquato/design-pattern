package strategy.versao02;

import model.Orcamento;

public class ICMS {

    public double calculaICMS(Orcamento orcamento){
        return orcamento.getValor() * 0.1;
    }
}
