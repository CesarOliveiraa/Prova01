import java.math.MathContext;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();

        double valor1 = valor % 2;

        if(valor1 == 0){
            System.out.println(valor + " é par.");
            System.out.println("Para verificar se o número digitado é par, o programa verificou se o valor digitado pelo úsuario é divisível por 2, que é o caso de " + valor);
        }else{
            System.out.println(valor + " é impar.");
            System.out.println("Para verificar se o número digitado é ímpar, o programa verificou se o valor digitado pelo úsuario é divisível por 2, que não é o caso de " + valor);
        }


        
        

        
    }
    
}

//socorro deus
