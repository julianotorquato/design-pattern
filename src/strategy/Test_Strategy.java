package strategy;

import model.Orcamento;
import strategy.versaofinal.CalculadorDeImpostos;
import strategy.versaofinal.ICMS;
import strategy.versaofinal.ISS;
import strategy.versaofinal.Imposto;

public class Test_Strategy {

    
    /**
     * O padrão Strategy é muito útil quando temos um conjunto de algoritmos similares, 
     * e precisamos alternar entre eles em diferentes pedaços da aplicação. 
     * No exemplo do vídeo, temos diferentes maneira de calcular o imposto,
     * e precisamos alternar entre elas.
     * O Strategy nos oferece uma maneira flexível para escrever diversos algoritmos diferentes, 
     * e de passar esses algoritmos para classes clientes que precisam deles. 
     * Esses clientes desconhecem qual é o algoritmo "real" que está sendo executado, 
     * e apenas manda o algoritmo rodar. Isso faz com que o código da classe cliente 
     * fique bastante desacoplado das implementações concretas de algoritmos, 
     * possibilitando assim com que esse cliente consiga trabalhar com N diferentes 
     * algoritmos sem precisar alterar o seu código.
     * 
     */
    
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(100.0);
        
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        
        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
        
        //ICSM
        calculadorDeImpostos.realizaCalculo(orcamento, icms);
        //ISS
        calculadorDeImpostos.realizaCalculo(orcamento, iss);
     }
}
