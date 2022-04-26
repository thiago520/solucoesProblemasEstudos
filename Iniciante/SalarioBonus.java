
package Iniciante;

import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome = leitor.nextLine();
        double salario = leitor.nextDouble();
        double vendas = leitor.nextDouble();

        double total = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
    
}
