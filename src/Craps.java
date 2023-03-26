import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Random dados = new Random();
        Scanner Craps = new Scanner(System.in); 
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a craps!!!");
        System.out.println("************************************");
        System.out.println("Las reglas son las siguientes:");
        System.out.println("Ganas si obtienes un par de unos en los dados");
        System.out.println("Ganas si obtienes un total de tres en los dados");
        System.out.println("Ganas si obtienes un total de once en los dados");
        System.out.println("Ganas si obtienes un dos o doce en los dados");
        System.out.println("Ganas si obtienes un total de siete en los dados");

        boolean jugarNuevamente = true;
        while (jugarNuevamente) {
            System.out.println("Empiezas con 50000 pesitos, si ganas obtendrás otros 50000 pesitos, si sigues jugando irás aumentando tu fortuna uwu");
            System.out.println("De lo contrario, perderás todo");
            System.out.println("Buena suerte!!!");
            System.out.println("Presiona enter para lanzar los dados :)");
            sc.nextLine();
            int puntaje = 50000;
            int dado1 = dados.nextInt(6) + 1;
            int dado2 = dados.nextInt(6) + 1;
            int total = dado1 + dado2;
            System.out.println("Has obtenido un puntaje de: " + dado1 + " en el primer dado, en el segundo, has obtenido un valor de: " + dado2);
            System.out.println("Haz obtenido un total de: " + total);
            if (dado1==1 && dado2==1) {
                System.out.println("Haz ganado! Felicidades");
                puntaje = puntaje + 50000;
                System.out.println("Obtuviste un total de: " + puntaje + " pesitos");
            } else if (total==3) {
                System.out.println("Haz ganado! Felicidades");
                puntaje = puntaje + 50000;
                System.out.println("Obtuviste un total de: " + puntaje + " pesitos");                
            } else if (total==11 || total==12) {
                System.out.println("Haz ganado! Felicidades");
                puntaje = puntaje + 50000;
                System.out.println("Obtuviste un total de: " + puntaje + " pesitos"); 
            }else if (total==7) {
                System.out.println("Haz ganado! Felicidades");
                puntaje = puntaje + 50000;
                System.out.println("Obtuviste un total de: " + puntaje + " pesitos"); 
            } else {
                System.out.println("Lo siento, haz perdido");
                puntaje -= puntaje;
                System.out.println("Obtuviste un total de: " + puntaje + " pesitos"); 
            } 
            System.out.println("Deseas jugar nuevamente? Presiona s para continuar");
            String respuesta = Craps.nextLine();
            jugarNuevamente = respuesta.equals("s");                
        }
        System.out.println("Gracias por jugar!");
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        Craps.close();
        sc.close();
    }
}
