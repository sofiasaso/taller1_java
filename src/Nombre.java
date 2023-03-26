import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner Nombre = new Scanner(System.in);
        System.out.println("Bienvenido al programa de tu nombre\n");
        System.out.println("Espero te encuentres bien :3");
        System.out.println("Digita tu nombre por favor");
        String name;
        name = Nombre.nextLine();
        System.out.println("\nAhora digita tu apellido por favor");
        String apellido;
        apellido = Nombre.nextLine();

        System.out.println("\nLa longitud de tu nombre es de " + (name.length()));
        System.out.println("\nY la longitud de tu apellido es de " + (apellido.length()));

        System.out.println("\nTu nombre en letras mayúsculas sale así: " + name.toUpperCase());
        System.out.println("\nTu apellido en letras minúsculas sale así: " + apellido.toLowerCase());

        String nombrecompleto;
        nombrecompleto = name + " " + apellido;
        System.out.println("\nTu nombre completo es: " + nombrecompleto);
        System.out.println("\nLas dos primeras letras de tu nombre junto con tu apellido son: " + name.substring(0, 2) + apellido);

        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        Nombre.close();
    }
}
