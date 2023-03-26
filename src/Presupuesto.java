import java.util.Scanner;

public class Presupuesto {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        
        int presupuesto = 100000, gasto, contador=0, seguir=1, acumulador=0;
        
                while (seguir==1 && contador <3){
                   
                        System.out.println("\nIngrese el valor del gasto");
                        gasto = lectura.nextInt();
                        System.out.println("\nRegistraste un gasto de " + gasto);
                        presupuesto -= gasto;
                        System.out.println("\nTienes un presupuesto actual de " + presupuesto + " pesitos");
                        System.out.println("\nDesea registrar otro gasto? digita 1) Si o 2) No");
                        seguir = lectura.nextInt();
                        contador = contador + 1;
                        acumulador = acumulador + gasto;
                    if (contador==3) {
                        System.out.println("Ya no puedes agregar más gastos");
                    }
                    
            }
            System.out.println("\nTienes un presupuesto total de " + presupuesto + " pesitos");
            System.out.println("\nEl valor total de tus gastos fue de: " + acumulador + " pesitos");
            System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
            System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");    
            lectura.close();      
        }
    }

