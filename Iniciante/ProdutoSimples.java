package Iniciante;
import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ProdutoSimples {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int PROD = A * B;
        
        System.out.println("PROD = "+PROD);
        
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}