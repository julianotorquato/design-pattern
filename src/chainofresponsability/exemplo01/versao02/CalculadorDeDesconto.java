package chainofresponsability.exemplo01.versao02;

import model.Orcamento;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento){
     // vai chamando os descontos na ordem até que algum deles dê diferente de zero...
        double desconto = new DescontoPorMaisDeCincoItens().desconta(orcamento);
        if(desconto == 0) 
          desconto = new DescontoPorMaisQuinhentosReais().desconta(orcamento);
        if(desconto == 0) 
          desconto = new ProximoDesconto().desconta(orcamento);
        // ...
        return desconto;
    }
    
}
