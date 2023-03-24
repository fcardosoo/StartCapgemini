/*
A concessionária de veículos 'Carango Velho' está vendendo os seus veículos com
desconto. Faça um algoritmo que calcule e exiba o valor do desconto a ser pago
pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o 
ano do veículo. 
Até 2000 - 12%
Acima de 2000 7%
O sistema deverá perguntar se deseja continuar calculando o desconto até que a 
resposta seja: "(N) Não". Informar total de carros com ano até 2000 e geral.
*/


package Exercicio20;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float percentDesconto = 0.00f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 'S';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            
            //Entrada de dados
            System.out.print("Digite o ano de fabricação do veículo: ");
            anoFabricacao = leitor.nextInt();
            System.out.print("Digite o valor do veículo: ");
            valorCarro = leitor.nextFloat();
            
            if (anoFabricacao <= 2000){
                percentDesconto = 0.12f;
            } else {
                percentDesconto = 0.07f;
                totalCarrosSemiNovos++;                        
            }
            
            totalCarros++;
            
            valorDesconto = valorCarro * percentDesconto;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("O valor do Carro é: R$"+valorCarro);
            System.out.println("O valor do desconto é: R$"+valorDesconto);
            System.out.println("O valor a pagar é: R$"+valorPagar);
            
            System.out.println("Deseja continuar? [S: sim] / [N: não]");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("O total de semi-novos é: "+totalCarrosSemiNovos++);
        System.out.println("O total GERAL de carros é: "+totalCarros);
    }
}
