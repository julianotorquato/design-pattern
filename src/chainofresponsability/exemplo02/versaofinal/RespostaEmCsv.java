package chainofresponsability.exemplo02.versaofinal;

import model.Conta;
import model.Formato;
import model.Requisicao;


public class RespostaEmCsv implements Resposta {

    private Resposta outraReposta;

    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.CSV) {
            System.out.println(conta.getTitular() + "," + conta.getSaldo());
        } else {
            outraReposta.responde(req, conta);
        }
    }

    public void setProxima(Resposta resposta) {
        this.outraReposta = resposta;
    }

}
