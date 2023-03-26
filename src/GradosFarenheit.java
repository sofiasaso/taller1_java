import java.util.Scanner;

public class GradosFarenheit {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa tu nombre por favor :3");
        String name;
        name = lectura.nextLine();
        System.out.println("Bienvenid@ " + name + " uwu");
        System.out.println("\nEn este programa vamos a convertir los grados Farenheit a Centigrados...,");
        System.out.print("la abuela necesita ayuda para hacer su torta");
        System.out.println("\nEntonces, ingresa por favor los grados Farenheit correspondientes");
        float Farenheit;
        Farenheit = lectura.nextFloat();
        System.out.println("\nLos grados Farenheit que ingresaste son: "+Farenheit);
        System.out.println("\nEn grados Centigrados (°C), esto equivale a "+(Farenheit - 32)/1.8);
        System.out.println("\nLa abuela debe colocar el horno a "+(Farenheit - 32)/1.8);

        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        lectura.close();

    }
}
