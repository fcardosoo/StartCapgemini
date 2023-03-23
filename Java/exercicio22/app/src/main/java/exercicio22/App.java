/*
 Faça um algoritmo que receba:
- preço de custo;
- preço de venda;
De 40 produtos e mostre como resultado: 
- Se houve lucro, prejuízo ou empate para cada produto;
- Informe o valor de custo de cada produto;
- Informe o valor de venda de cada produto;
- Informe o preço médio de custo e venda de cada produto;
 */
package exercicio22;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        int i=0;
        
        for (; i < 5; i++){
            System.out.print("Informe o nome no produto "+i+": ");
            nomeProduto = leitor.next();
            System.out.print("Informe o preço de CUSTO do produto "+i+": ");
            precoCusto = leitor.nextFloat();
            System.out.print("Informe o preço de VENDA do produto "+i+": ");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("Houve empate entre o preço de custo e o preço de venda.");
            }else{
                if(precoCusto > precoVenda){
                    System.out.println("Houve PREJUÍZO");
                } else{
                    System.out.println("Houve LUCRO");
                }
            }
            System.out.println(nomeProduto + ", preço de custo = "+precoCusto+
                ", preço de venda = "+precoVenda);
        }
        System.out.println("A média do preço de CUSTO é: " + totalCusto/i);
        System.out.println("A média do preço de VENDA é: " + totalVenda/i);

    }
}
