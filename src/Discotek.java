import java.util.Scanner;

public class Discotek {
    public static void main(String[] args) {
        Scanner Discotek = new Scanner(System.in);

        System.out.println("Bienvenido a la Discoteca Club Octava uwu");
        System.out.println("\nAntes de ello, por favor ingresa tu edad");
        int edad;
        edad = Discotek.nextInt();
        
        if (edad>=18) {
            System.out.println("\nTienes " + edad + " años");
            System.out.println("Puedes ingresar al Club");
            System.out.println("Disfruta tu noche!!!");
        } else {
            System.out.println("\nTienes " + edad + " años");
            System.out.println("Lo siento, no puedes ingresar ya que eres menor de edad");
        }

        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        Discotek.close();
    }
}