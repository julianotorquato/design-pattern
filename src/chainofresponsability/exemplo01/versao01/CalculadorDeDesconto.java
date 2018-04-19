package chainofresponsability.exemplo01.versao01;

import model.Orcamento;

public class CalculadorDeDesconto {
    
    public double calcula(Orcamento orcamento){
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }else if(orcamento.getValor()> 500.0){
            return orcamento.getValor() * 0.7;
        }
        return 0;
    }
}
