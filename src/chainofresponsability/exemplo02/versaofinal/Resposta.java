package chainofresponsability.exemplo02.versaofinal;

import model.Conta;
import model.Requisicao;

public interface Resposta {


    void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);
}
