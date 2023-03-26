import java.util.Scanner;


//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");
        System.out.println("Kim Namjoon mi varón");*/
        Scanner  lectura = new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        int numberOne;
        numberOne = lectura.nextInt();
        System.out.println("El número ingresado es " + numberOne);


        System.out.println("\nIngrese otro número: ");
        int numberTwo;
        numberTwo = lectura.nextInt();
        System.out.println("El número ingresado es " + numberTwo);

        lectura.nextLine();

        System.out.println("********************************************");
        System.out.println("Ingresa tu nombre");
        String name;
        name = lectura.nextLine();
        System.out.println("El nombre ingresado es " + name);

        System.out.println("Hola " + name + ", ingresaste los números "+ numberOne + " y 1" + numberTwo + 
        ", la suma de ambos números es " + (numberOne + numberTwo));
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");

        lectura.close();
    }
}
