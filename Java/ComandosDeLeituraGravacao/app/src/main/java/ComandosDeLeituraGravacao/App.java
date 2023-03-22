package ComandosDeLeituraGravacao;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    
    public static void main(String[] args) {
        
        int media = 10;
        
        if (media >=7){
            if (media==10){
                System.out.println("Parabéns");
            } else {
                System.out.println("Aprovado");
            } 
            }else {
                System.out.println("Reprovado");
        }
    }
}
