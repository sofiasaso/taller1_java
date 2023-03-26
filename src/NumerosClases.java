import java.util.Scanner;

public class NumerosClases {
    public static void main(String[] args) {
        Scanner NumerosClases = new Scanner(System.in);
        System.out.println("Bienvenido al programa de clases de números");
        System.out.println("\nIngresa un número por favor");
        int num;
        num = NumerosClases.nextInt();

        if (num>0) {
            System.out.println("\nEl número que ingresaste fue " + num);
            System.out.println("\nEl número es positivo");
        } else if (num<0) {
            System.out.println("\nEl número que ingresaste fue " + num);
            System.out.println("\nEl número es negativo");
        }else{
            System.out.println("\nEl número que ingresaste fue " + num);
            System.out.println("\nEl número es neutro"); 
        }
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        NumerosClases.close();
    }
}
