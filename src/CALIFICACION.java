import java.util.Scanner;

public class CALIFICACION {
    public static double promedio(double nota1, double nota2, double nota3){
        double totalPromedio = (nota1 + nota2 + nota3)/3;
        return totalPromedio;
    }
    public static String mensajeAprobacion( double totalPromedio){
        if (totalPromedio >= 60){
            return "Aprobado";
        }else {
            return "No aprobó";
        }
    }
    public static void mensajeFinal(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa la nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingresa la nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingresa la nota 3: ");
        double nota3 = scanner.nextDouble();

        double totalPromedio = promedio(nota1, nota2, nota3);
        String mensajeAprobacion = mensajeAprobacion(totalPromedio);
        System.out.printf("Su promedio es : %.2f\n", totalPromedio );
        System.out.println("Su estado es: " + mensajeAprobacion);

    }

}
