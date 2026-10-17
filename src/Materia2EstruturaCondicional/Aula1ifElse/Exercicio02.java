package Materia2EstruturaCondicional.Aula1ifElse;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if(input%2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("INPAR");
        }


        sc.close();
    }
}
