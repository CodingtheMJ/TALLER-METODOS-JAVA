import java.util.Scanner;

public class CONVERSOR {
    public static double convertirMetrosCentimetros(double metros){
        return metros*100.0;
    }

    public static double convertirKilogramosLibras(double kilogramos){
        return kilogramos*2.20462;
    }

    public static double convertirCelciusFahrenheit(double celcius){
        return (celcius * ((double) 9 /5))+32;
    }

    public static void conversion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una de las siguientes opciones:\n" +
                "1.Convertir de metros a centímetros\n" +
                "2.Convertir de kilogramos a libras\n" +
                "3.Convertir de Celsius a Fahrenheit.");
        int opcion = scanner.nextInt();
        System.out.println("Ingrese el dato a convertir:");
        double dato = scanner.nextDouble();
        switch (opcion){
            case 1:
                System.out.println("La conversion de metros a centimetros de tu dato es: "+convertirMetrosCentimetros(dato));
                break;
            case 2:
                System.out.println("La conversion de kilogramos a libras de tu dato es: "+convertirKilogramosLibras(dato));
                break;
            case 3:
                System.out.println("La conversion de Celsius a Fahrenheit de tu dato es: "+convertirCelciusFahrenheit(dato));
                break;
        }

    }

}
