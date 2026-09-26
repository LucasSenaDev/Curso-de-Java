package EstruturaSequencial.Aula3FuncoesMatematicasExercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int result = X + Y;

        System.out.println("SOMA = " + result);

        sc.close();
    }
}
