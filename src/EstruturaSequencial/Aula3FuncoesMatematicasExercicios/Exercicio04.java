package EstruturaSequencial.Aula3FuncoesMatematicasExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hours = sc.nextInt();
        double valuePerHour = sc.nextDouble();

        double salary = hours * valuePerHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = %.2f", salary);


        sc.close();
    }
}
