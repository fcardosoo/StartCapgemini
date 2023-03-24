/*
 Criar uma classe chamada 'Invoice' que possa ser utilizado por uma loja de
suprimentos de informática para representar uma fatura de um item vendido na
loja. Uma fatura deve incluir as seguintes informações como atributos:

a. o número do item faturado;
b. a descrição do item;
c. a quantidade comprada do item;
d. o preço unitário do item;

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quan-
tidade não for positiva, ela deve ser configurada como 0. Se o preço por item
for positivo ele deve ser configurado como 0.0. Forneça um método set e um méto-
do get para cada variável de instância.
 */
package Exercicio04POO;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "Mousepad", 10, 50.0f);        
        System.out.println("Valor total = "+inv.getInvoiceAmount());
        
    }
}
