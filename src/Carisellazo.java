import java.util.Random;
import java.util.Scanner;

public class Carisellazo{
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        Scanner lectura = new Scanner(System.in);

        //Esta es la primera versión del carisellazo
        //Es decir el programa sólo te va a indicar si ganaste o perdiste
        System.out.println("Bienvenido al programa Coin");
        System.out.println("Escoge cara o sello por favor");
        String respuesta;
        respuesta = lectura.nextLine();

        String opcionComputador  = random.nextBoolean() ? "cara" : "sello";
        
        System.out.println("Veamos si ganaste o perdiste");
        System.out.println("Cargando...\n");  
        
        
        if (opcionComputador.equals(respuesta)) {
            System.out.println("Lo siento, has perdido. El programa escogió " + opcionComputador + ", y tu escogiste " + respuesta);
        } else {
            System.out.println("Felicidades!!! Has ganado. El programa escogió " + opcionComputador + ", y tu escogiste " + respuesta);
        }

        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        lectura.close();
    }
}

