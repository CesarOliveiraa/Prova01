import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = entrada.nextDouble();

        System.out.print("Digite o estado de destino(MG, SP, RJ, MS ou outros estados): ");
        String destino = entrada.next();

        if(destino.equals("MG")) {
            valorProduto = (valorProduto * 0.7) + valorProduto;
            System.out.println("O valor total do produto é: " + valorProduto);
  
        }else if(destino.equals("SP")){
            valorProduto = (valorProduto * 0.12) + valorProduto;
            System.out.println("O valor total do produto é: " + valorProduto + " reais");

        }else if(destino.equals("RJ")){
            valorProduto = (valorProduto * 0.15) + valorProduto;
            System.out.println("O valor total do produto é: " + valorProduto + " reais");
        
        }else if(destino.equals("MS")){
            valorProduto = (valorProduto * 0.8) + valorProduto;
            System.out.println("O valor total do produto é: " + valorProduto + " reais");
        
        }else if(destino.equals("outros")){
            valorProduto = (valorProduto * 0.9) + valorProduto;
            System.out.println("O valor total do produto é: " + valorProduto + " reais");
            
        }else{
            System.out.println("Estado digitado não válido");
        }
            


    }    
}
