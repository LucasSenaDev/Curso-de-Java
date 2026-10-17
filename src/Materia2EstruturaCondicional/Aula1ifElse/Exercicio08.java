package Materia2EstruturaCondicional.Aula1ifElse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;


        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("RS %.2f%n", imposto);
        } else if (salario <= 4500) {
            imposto = 80 + (salario - 3000) * 0.18;
            System.out.printf("RS %.2f%n", imposto);
        } else {
            imposto = 80 + 270 + (salario - 4500) * 0.28;
            System.out.printf("RS %.2f%n", imposto);
        }


        sc.close();
    }
}
