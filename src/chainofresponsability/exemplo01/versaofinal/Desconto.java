package chainofresponsability.exemplo01.versaofinal;

import model.Orcamento;

public interface Desconto {

    public double desconta(Orcamento orcamento);
    
    public void setProximo(Desconto proximo);
    
}
