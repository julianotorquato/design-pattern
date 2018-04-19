package chainofresponsability.exemplo02.versaofinal;

import model.Conta;
import model.Formato;
import model.Requisicao;

public class RespostaEmPorcento implements Resposta{

    private Resposta outraResposta;
    
    public RespostaEmPorcento() { 
        this.outraResposta = null;
    }
    
    public RespostaEmPorcento(Resposta outraResposta){
        this.outraResposta = outraResposta;
    }
    
    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.PORCENTO) {
            System.out.println(conta.getTitular() + '%' + conta.getSaldo());
        } else if (outraResposta != null) {
            outraResposta.responde(req, conta);
        } else {
            // n�o existe pr�xima na corrente, e ningu�m atendeu a requisi��o!
            // poder�amos n�o ter feito nada aqui, caso n�o fosse necess�rio!
            throw new RuntimeException("Formato de resposta n�o encontrado");
        }
        
    }

    @Override
    public void setProxima(Resposta resposta) {
        // TODO Auto-generated method stub
        
    }

}
