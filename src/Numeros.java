import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
    Scanner Numeros = new Scanner(System.in);
    System.out.println("Bienvenido al programa de numeros");
    System.out.println("\nIngresa un número por favor");
    int num1;
    num1 = Numeros.nextInt();
    System.out.println("\nIngresa otro número por favor");
    int num2;
    num2 = Numeros.nextInt();

    if (num1>num2) {
        System.out.println("\nIngresaste " + num1 + " y " + num2);
        System.out.println("\nEl número 1 es mayor que el número 2");
        System.out.println("\nPor ende, se van a sumar ambos números");
        System.out.println("\nEl resultado es de " + (num1 + num2));
    } else if (num1<num2) {
        System.out.println("\nIngresaste " + num1 + " y " + num2);
        System.out.println("\nEl número 2 es mayor que el número 1");
        System.out.println("\nPor ende, se van a restar ambos números");
        System.out.println("\nEl resultado es de " + (num2 - num1));
    }else{
        System.out.println("\nIngresaste " + num1 + " y " + num2);
        System.out.println("\nEl número 1 es igual que el número 2");
        System.out.println("\nPor ende, se van a multiplicar ambos números");
        System.out.println("\nEl resultado es de " + (num2 * num1));
    }
    System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
    System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
    Numeros.close();    
    }
}
