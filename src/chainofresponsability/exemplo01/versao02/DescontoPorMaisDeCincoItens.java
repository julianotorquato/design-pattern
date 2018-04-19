package chainofresponsability.exemplo01.versao02;

import model.Orcamento;

public class DescontoPorMaisDeCincoItens {

    public double desconta(Orcamento orcamento){
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }
        return 0;
    }
    
    
}
