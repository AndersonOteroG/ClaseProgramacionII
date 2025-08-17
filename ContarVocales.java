import java.util.Scanner;

public class ContarVocales {
    private static boolean esVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra en minúsculas que no contenga ni acentos, ni numeros, ni caracteres especiales y sin espacios: ");
        String palabra = sc.nextLine().trim();

        int vocales = 0, consonantes = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                if (esVocal(letra)) vocales++; else consonantes++;
            }
        }
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        sc.close();
    }
}