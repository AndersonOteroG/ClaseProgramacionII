import java.util.Scanner;

public class Calculadora {
    static void mostrarResultado(double resultado) {
    if (resultado % 1 == 0) { // quitar decimales
        System.out.println("Resultado: " + (long) resultado); 
    } else {
        System.out.println("Resultado: " + resultado);
    }
}
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Calculadora ===");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
        if (opcion == 0) break;

            System.out.print("Ingresa el primer número: ");
            double a = sc.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double b = sc.nextDouble();

        switch (opcion) {
             case 1 -> mostrarResultado(a + b);
             case 2 -> mostrarResultado(a - b);
             case 3 -> mostrarResultado(a * b);
             case 4 -> {
                 if (b == 0) {
                        System.out.println("Error: división por cero");
                 } else {
                        mostrarResultado(a / b);
                    }
                }
                default -> System.out.println("Opción no válida");
            }
        }
        sc.close();
        System.out.println("¡Hasta pronto!");
      }
   }
