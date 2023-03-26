import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);
        //Este es un programa con notas
        //Usando Arrays para calcular el promedio
        System.out.println("Bienvenido al programa de notas < 3");

        System.out.println("\nDigita la cantidad de notas para registrar y calcular promedio, por favor");
        int cantidadNotas;
        cantidadNotas = lectura.nextInt();      

        double[] nota  = new double[cantidadNotas];
        double total=0, promedio; 

        for (int x=0; x<cantidadNotas; x++) {
            System.out.println("\nIngresa tu nota obtenida: ");
            nota[x] = lectura.nextDouble();
            total= total + nota[x];
        }

        promedio = total / cantidadNotas;

        System.out.println("\nEl promedio de tus notas es de : " + promedio);

        if (promedio<3.0) {
            System.out.println("\nHaz reprobado");
            System.out.println("\tDale con toda en el siguiente corte. TÚ PUEDES!!!!");
        } else if (promedio>=3.0 && promedio<=4.0) {
            System.out.println("\nPasaste raspando");
            System.out.println("\tTÚ PUEDES!!!!");
        } else {
            System.out.println("\nPasaste con buenos resultados");
            System.out.println("\tSIGUE ASÍ!!!");
        }     
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");   
        lectura.close();
    }
}
