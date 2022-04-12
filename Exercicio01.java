import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        double valor1 = entrada.nextDouble();

        System.out.print("Digite o 2º número: ");
        double valor2 = entrada.nextDouble();

        System.out.print("Selecione a operação: ");
    

        char operacao = entrada.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+' :
                resultado = valor1 + valor2; 
                System.out.println("O resultado é: " + resultado);
                break;
            case '-' :
                resultado = valor1 - valor2; 
                System.out.println("O resultado é: " + resultado);
                break;
            case '*' : 
                resultado = valor1 * valor2; 
                System.out.println("O resultado é: " + resultado);
                break;
            case '/' : 
                resultado = valor1 / valor2;
                System.out.println("O resultado é: " + resultado);
                break;
            }

    }
}

//médio