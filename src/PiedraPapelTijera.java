import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) throws Exception{
        int yourScore = 0;
        int theProgramScore = 0;

        Scanner PiedraPapelTijera = new Scanner(System.in);
        Random programChoise = new Random();

        String[] options = {"piedra", "papel", "tijeras"};


        while (true) {
            System.out.println("Bienvenido al programa de Piedra, Papel o Tijeras");
            System.out.println("Escoge piedra, papel o tijeras");
            String userOption;
            userOption = PiedraPapelTijera.nextLine();
            
            System.out.println("Haz escogido "+ userOption);
            String programOption = options[programChoise.nextInt(3)];
            System.out.println("El programa ha escogido "+ programOption);

            if (userOption.equals(programOption)) {
                System.out.println("Empate");
            }else if (userOption.equals("tijeras")) {
                if (programOption.equals("papel")) {
                    System.out.println("Haz ganado! ");
                    yourScore = yourScore + 1;
                }else{
                System.out.println("El programa ha ganado! ");
                theProgramScore = theProgramScore + 1;
                }
            }else if (userOption.equals("piedra")) {
                if (programOption.equals("tijeras")) {
                    System.out.println("Haz ganado! ");
                    userOption = userOption + 1;
                }else{
                    System.out.println("El programa ha ganado! ");
                    theProgramScore = theProgramScore + 1;
                }
            }else if (userOption.equals("papel")) {
                if (programOption.equals("piedra")) {
                    System.out.println("Haz ganado! ");
                    userOption = userOption + 1;
                }else{
                    System.out.println("El programa ha ganado! ");
                    theProgramScore = theProgramScore + 1;
                }
            }else {
                System.out.println("El programa ha ganado! ");
                theProgramScore = theProgramScore + 1;
            }
            System.out.println("Tu puntuación fue de " + yourScore + ", y el del programa fue de " + theProgramScore);             
            System.out.print("¿Quieres jugar otra vez?, presiona S para Sí o N para No ");
            String jugarOtraVez = PiedraPapelTijera.nextLine();
            if (!jugarOtraVez.equalsIgnoreCase("S")) {
                break;
            }
        }
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        PiedraPapelTijera.close();
    }   
}