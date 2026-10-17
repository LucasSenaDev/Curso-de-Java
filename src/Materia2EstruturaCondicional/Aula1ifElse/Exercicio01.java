package Materia2EstruturaCondicional.Aula1ifElse;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();


        if (input < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÂO NEGATIVO");
        }

        sc.close();
    }
}
