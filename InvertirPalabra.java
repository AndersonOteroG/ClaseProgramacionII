import java.util.Scanner;

public class InvertirPalabra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra que desees invertir: ");
        String palabra = sc.nextLine();

        StringBuilder sb = new StringBuilder(palabra);
        String invertida = sb.reverse().toString();
        System.out.println("Palabra invertida: " + invertida);
        sc.close();
    
   }
}