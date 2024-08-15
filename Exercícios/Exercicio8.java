// Fazer um algoritimo que leia um número inteiro N e escreva a soma dos N primeiros
// números inteiros positivos. Exemplo: caso seja lido 10 escreve 55. Veja que 1+2+3+4+5+6+7+8+9+10 = 55 
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        
        System.out.println("A soma dos " + N + "primeiros números positivos é: "+ soma);
        scanner.close();
    }
}
