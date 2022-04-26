package Iniciante;

import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {
/* 
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble(); */
        double A = 5.0;
        double B = 6.0;
        double C = 7.0;
        double media = ((A * 2) + (B * 3) + (C * 5)) / (2+3+5);

        System.out.printf("MEDIA = %.1f\n", media);

    }
    
}
