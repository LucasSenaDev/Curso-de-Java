package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula2EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println();
        System.out.println("dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /*
        System.out.print("Nome: ");
        String name = sc.next();

        System.out.print("Número: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Gênero: ");
        char genero = sc.next().charAt(0);


        System.out.println("Nome digitado: " + name);
        System.out.println("Idade digitado: " + idade);
        System.out.println("Altura digitada: " + altura);
        System.out.println("Gênero digitado: " + genero);
         */


        sc.close();
    }
}
