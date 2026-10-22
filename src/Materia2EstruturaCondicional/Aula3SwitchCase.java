package Materia2EstruturaCondicional;

import java.util.Scanner;

public class Aula3SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        String dia = null;

        switch (valor) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "O valor digitado não é válido!!!";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
