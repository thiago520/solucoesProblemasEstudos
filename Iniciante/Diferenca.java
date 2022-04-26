package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int D = leitor.nextInt();
        int dif = (A * B - C * D);
        
        System.out.println("DIFERENCA = "+dif);
        
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
    
}
