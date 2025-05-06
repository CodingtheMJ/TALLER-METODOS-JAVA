import java.util.Scanner;

public class CALCULADORA {
 public static double suma (double num1, double num2) {
     return (num1 + num2);
 }
 public static double resta (double num1, double num2) {
     return (num1 - num2);
    }

    public static double multiplicacion (double num1, double num2) {
        return (num1 * num2);
    }

    public static double division (double num1, double num2) {
            if (num2 == 0){
                System.out.println("Error no se puede dividir por 0");
                return 0;}

                return (num1/num2);

    }

    public static double potencia (double base, double exponente) {
     return Math.pow(base, exponente);
    }

    public static void calculo() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese una de las siguientes opciones:\n" +
                    "1.Suma\n" +
                    "2.Resta\n" +
                    "3.Multiplicación\n" +
                    "4.División\n" +
                    "5.Potencia\n" +
                    "6. Salir de la caluladora");

            opcion = scanner.nextInt();

            double num1 = 0;
            double num2 = 0;

            if (opcion != 6) {
                System.out.println("Ingrese el primer número para el calculo: ");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número para el calculo: ");
                num2 = scanner.nextDouble();
            }

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + multiplicacion(num1, num2));
                    break;
                case 4:
                    System.out.println("El resultado de la division es: " + division(num1, num2));
                    break;
                case 5:
                    System.out.println("El resultado de la potencia es: " + potencia(num1, num2));
                    break;
                case 6:
                    System.out.println("Saliendo de la calculadora... Adiós :)");
                    break;

                default:
                    System.out.println("No ingresó un dato válido");
            }
        } while (opcion != 6);

        scanner.close();
    }
}