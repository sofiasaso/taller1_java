import java.util.Scanner;

public class HombresYMujeres {
    public static void main(String[] args) {
        Scanner HombresYMujeres = new Scanner (System.in);
        System.out.println("Bienvenido a ejercicio 5");
        System.out.println("\nVamos a contar cuantos hombres y mujeres hay en tu grupo");
        int cantidadMujeres = 0, cantidadHombres = 0, genero;

        for (int x=1; x<=10; x++) {
            System.out.println("\nDigita por favor si eres mujer (1), si eres hombre digita (2)");
            genero = HombresYMujeres.nextInt();
            if(genero==1){
                cantidadMujeres = cantidadMujeres + 1;
            }else{
                cantidadHombres = cantidadHombres + 1;
            }
        }
        System.out.println("\nCantidad de mujeres en el grupo: " + cantidadMujeres);
        System.out.println("\nCantidad de hombres en el grupo: " + cantidadHombres);       

        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        HombresYMujeres.close();
    }
}
