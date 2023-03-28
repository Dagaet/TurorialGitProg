import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int numero = teclado.nextInt();
        System.out.println("Tu numero es: \n" + numero);
    }
}