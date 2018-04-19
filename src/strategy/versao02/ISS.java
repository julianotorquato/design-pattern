package strategy.versao02;

import model.Orcamento;

public class ISS {

    public double calculaISS(Orcamento orcamennto){
        return orcamennto.getValor() * 0.06;
    }
    
}
