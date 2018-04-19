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
     * O padrão Chain of Responsibility cai como uma luva quando temos uma lista de 
     * comandos a serem executados de acordo com algum cenário em específico, 
     * e sabemos também qual o próximo cenário que deve ser validado, 
     * caso o anterior não satisfaça a condição.
     * Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades 
     * em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de 
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
