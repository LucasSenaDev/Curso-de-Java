package EstruturaSequencial;

import java.util.Locale;

public class Aula1SaidaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Olá mundo!");
        System.out.println("Bom dia!");


        System.out.println("---------------");
        int idade = 21;
        double altura = 1.68;
        double pi = 3.14159;

        System.out.println("idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println(pi);
        System.out.printf("%.2f%n", pi);
        System.out.printf("pi %.5f altura %.2f%n", pi, altura);
    }
}
