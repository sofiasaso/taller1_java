import java.util.Scanner;

public class Natacion {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido al programa de competencia de natación < 3");
        
        System.out.println("\nIngresa por favor la cantidad de competidores");
        int cantidadCompetidores;
        cantidadCompetidores = lectura.nextInt();

        String[] nombres = new String[cantidadCompetidores];
        double[] tiempos = new double[cantidadCompetidores];

        //En esta línea, solicita que ingrese los nombres de los competidores del torneo
        for (int x=0; x<cantidadCompetidores; x++) {
            System.out.println("\nIngresa el nombre del competidor " + (x+1));
            nombres[x] = lectura.next();
            System.out.println("\nIngresa el tiempo que registré el competidor " + (x+1));
            tiempos[x] = lectura.nextDouble();
        }
        //En esta línea, se muestran los valores ingresados (nombres y tiempos)
        for (int x = 0; x < cantidadCompetidores; x++) {
            System.out.println("\nEl competidor: " + nombres[x] + ", con el número " + (x+1) + 
            ", tuvo un tiempo registrado de: " + tiempos[x]);
        }
        
        //Aquí, con ayuda del atributo Max Value, se quiere hayar el tiempo menor 
        //Para determinar quien ha ganado el torneo 
        double menorTiempo = Double.MAX_VALUE;

        //Se quiere ser más específico en quien ganó, usando su número
        //Por ello, se iguala a cero el número ganador, mientras se comparan los valores obtenidos  
        int numeroGanador = 0;
        
        //Usando el for, se van a comparar los valores obtenidos
        //Y aquí, se va a igualar el menor tiempo a los registrados 
        for (int x = 0; x < cantidadCompetidores; x++) {
            if (tiempos[x] < menorTiempo) {
                menorTiempo = tiempos[x];
                numeroGanador = x;
            }
        }
        
        System.out.println("\nEl ganador es: " + nombres[numeroGanador] + ". Con un tiempo de: " + tiempos[numeroGanador]);
        System.out.println("FELICIDADES!!!");

        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        lectura.close();
    }
}
