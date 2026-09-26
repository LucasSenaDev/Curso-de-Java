package EstruturaSequencial;

import java.util.Scanner;

public class Aula3FuncoesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número para saber a raiz quadrada:");
        double raiz = sc.nextDouble();

        System.out.println();
        System.out.println("Escolha um número para elevar por outro número");
        double numero = sc.nextDouble();
        double elevado = sc.nextDouble();
        double resultadoElevado = Math.pow(numero, elevado);

        System.out.println();
        System.out.println("Escolha um número para saber o seu resultado absoluto:");
        double absoluto = Math.abs(sc.nextDouble());


        System.out.println();
        System.out.printf("Raiz quadrada: %.2f%n", raiz);
        System.out.printf("Elevação: %.2f%n", resultadoElevado);
        System.out.printf("Número absoluto: %.2f%n", absoluto);




        sc.close();
    }
}
