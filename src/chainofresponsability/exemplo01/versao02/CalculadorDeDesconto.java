package chainofresponsability.exemplo01.versao02;

import model.Orcamento;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento){
     // vai chamando os descontos na ordem at� que algum deles d� diferente de zero...
        double desconto = new DescontoPorMaisDeCincoItens().desconta(orcamento);
        if(desconto == 0) 
          desconto = new DescontoPorMaisQuinhentosReais().desconta(orcamento);
        if(desconto == 0) 
          desconto = new ProximoDesconto().desconta(orcamento);
        // ...
        return desconto;
    }
    
}
