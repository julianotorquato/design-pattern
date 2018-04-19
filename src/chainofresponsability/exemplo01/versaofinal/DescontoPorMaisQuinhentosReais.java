package chainofresponsability.exemplo01.versaofinal;

import model.Orcamento;

public class DescontoPorMaisQuinhentosReais implements Desconto{
    
    private Desconto proximo;
    
    public double desconta(Orcamento orcamento){
        if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
    
    
}
