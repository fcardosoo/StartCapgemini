/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio15;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    
    /*
    Faça um algoritmo que receba um número e diga se o número
    está entre 100 e 200.
    */
    
    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        numero = leitorScanner.nextInt();
        
        if(numero>=100 && numero <=200){
            System.out.println("Número NO intervalo!");
        } else {
            System.out.println("Número FORA do intervalo!");
        }
    }
}