package Materia2EstruturaCondicional.Aula1ifElse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        if (codigo == 1) {
            double total = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codigo == 2) {
            double total = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codigo == 3) {
            double total = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codigo == 4) {
            double total = quantidade * 2.00;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codigo == 5) {
            double total = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f%n", total);
        }

        sc.close();
    }
}
