package chainofresponsability.exemplo01.versaofinal;

import model.Orcamento;


public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) { }

}
