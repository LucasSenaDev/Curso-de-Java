package Materia2EstruturaCondicional.Aula1ifElse;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt();
        int inputB = sc.nextInt();

        if(inputA%inputB == 0 || inputB%inputA == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }


        sc.close();
    }
}
