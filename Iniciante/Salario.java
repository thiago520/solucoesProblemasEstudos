package Iniciante;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();
        int hor = leitor.nextInt();
        double valor = leitor.nextDouble();

        double salario = hor * valor;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f", salario);
        
    }

    


    
}
