package chainofresponsability;

import chainofresponsability.exemplo01.versaofinal.CalculadorDeDesconto;
import chainofresponsability.exemplo01.versaofinal.Desconto;
import chainofresponsability.exemplo01.versaofinal.DescontoPorMaisDeCincoItens;
import model.Item;
import model.Orcamento;

/**
 * @author Juliano Torquato
 */
public class Test_ChainOfResponsability {
    /**
     * 
     * O padr�o Chain of Responsibility cai como uma luva quando temos uma lista de 
     * comandos a serem executados de acordo com algum cen�rio em espec�fico, 
     * e sabemos tamb�m qual o pr�ximo cen�rio que deve ser validado, 
     * caso o anterior n�o satisfa�a a condi��o.
     * Nesses casos, o Chain of Responsibility nos possibilita a separa��o de responsabilidades 
     * em classes pequenas e enxutas, e ainda prov� uma maneira flex�vel e desacoplada de 
     * juntar esses comportamentos novamente.
     */
    
    public static void main(String[] args) {
        CalculadorDeDesconto calculador = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.addItem(new Item("CANETA", 250.0));
        orcamento.addItem(new Item("LAPIS", 250.0));

        double desconto = calculador.calcula(orcamento);

        System.out.println(desconto);
    }
    
}
