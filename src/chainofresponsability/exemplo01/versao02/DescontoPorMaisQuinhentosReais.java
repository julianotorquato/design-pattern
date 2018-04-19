package chainofresponsability.exemplo01.versao02;

import model.Orcamento;

public class DescontoPorMaisQuinhentosReais {

    public double desconta(Orcamento orcamento){
        if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }
        return 0;
    }
}
