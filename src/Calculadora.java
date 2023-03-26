import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora");
        double numberOne, numberTwo;
        System.out.println("\nIngresa un número por favor");
        numberOne = lectura.nextDouble();
        System.out.println("\nIngresa otro número por favor");
        numberTwo = lectura.nextDouble();
        System.out.println("\nLos números que ingresaste fueron " + numberOne + " y " + numberTwo);

        System.out.println("\nIngresa una opción por favor: ");
        System.out.println("\nSi deseas sumar los números, presiona 1");
        System.out.println("\nSi deseas restar los números, presiona 2");
        System.out.println("\nSi deseas multiplicar los números, presiona 3");
        System.out.println("\nSi deseas dividir los números, presiona 4");
        System.out.println("\nSi deseas potenciar los números, presiona 5");
        System.out.println("\nSi deseas radicar los números, presiona 6");
        int ope;
        ope = lectura.nextInt();
        
        switch(ope){
            case 1:
            System.out.println("\nElegiste la operación de suma");
            System.out.println("El total de la suma es de " + (numberOne + numberTwo));
            break;

            case 2:
            System.out.println("\nElegiste la operación de resta");
            System.out.println("El total de la resta es de " + (numberOne - numberTwo));
            break;

            case 3:
            System.out.println("\nElegiste la operación de multiplicación");
            System.out.println("El total de la multiplicación es de " + (numberOne * numberTwo));
            break;

            case 4:
            System.out.println("\nElegiste la operación de división");
            System.out.println("El total de la división es de " + (numberOne / numberTwo));    
            break;

            case 5:
            double potenciacion;
            potenciacion = Math.pow(numberOne, numberTwo);
            System.out.println("\nEscogiste la operación de potenciación");
            System.out.println("El resultado de ello es " + potenciacion);
            break;

            case 6:
            double raizNumberOne, raizNumberTwo;
            raizNumberOne = Math.sqrt(numberOne);
            System.out.println("\nLa raiz cuadrada del número "+ numberOne + " es " + raizNumberOne);
            raizNumberTwo = Math.sqrt(numberTwo);
            System.out.println("\nLa raiz cuadrada del número "+ numberTwo + " es " + raizNumberTwo);
            break;

            default:
            System.out.println("\nLo siento, intenta nuevamente");
            break;
        }
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        lectura.close();
    }
}
