import java.util.Random;
import java.util.Scanner;

public class AniversarioSupermercado {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);

        //Esta es la primera versión de Supermercado Noe
        //Es decir, sólo ingresa el valor de la compra y saca la pelotica
        
        
        System.out.println("Digita tu nombre antes de iniciar, por favor");
        String name;
        name = lectura.nextLine();
        System.out.println("Bienvenid@ "+ name);
        System.out.println("En supermercados Noé, estamos de aniversario!!!\n");
        System.out.println("Por ello, te vamos a obsequiar un descuento en el valor de tu compra");
        System.out.println("Sólo si esta es mayor a $ 50.000 y dependiendo de tu suerte");
        System.out.println("Buena suerte " + name);

        int compra, pago, cambio;

        System.out.println("\nDigita el total de la compra ");
        compra = lectura.nextInt();

        if (compra<50000) {
            System.out.println("\nDigita el precio del dinero a pagar por favor");
            pago = lectura.nextInt();
            cambio = pago - compra;
            System.out.println("Tu cambio es de " + cambio);
            System.out.println("\nGracias por tu compra!");
            System.out.println("Esperamos verte nuevamente :)"); 

        } else {
            Random ballons = new Random();
            String[] ballonsColors = {"white", "yellow", "blue", "red"};
            int pelotasNumberCase = ballons.nextInt(ballonsColors.length);
            String balloonColor = ballonsColors[pelotasNumberCase];
            switch (balloonColor) {
                case "red":
                    System.out.println("\nObtuviste la pelota de color rojo...");
                    System.out.println("Vas a obtener un 10% de descuento en el total de tu compra");
                    compra = compra - (compra * 10)/100; 
                    System.out.println("El total de tu compra ahora resulta ser de " + compra);
                    System.out.println("\nDigita el precio del dinero a pagar ");
                    pago = lectura.nextInt();
                    cambio = pago - compra;
                    System.out.println("\nTu cambio es de " + cambio);
                    System.out.println("Gracias por tu compra!");
                    System.out.println("Esperamos verte nuevamente :)");         
                    break;
                    
                case "blue":
                    System.out.println("\nObtuviste la pelota de color azul...");
                    System.out.println("Vas a obtener un 30% de descuento en el total de tu compra");
                    compra = compra - (compra * 30)/100;
                    System.out.println("\nEl total de tu compra ahora resulta ser de " + compra);
                    System.out.println("Ahora por favor ingresa el valor a pagar");
                    pago = lectura.nextInt();
                    cambio = pago - compra;
                    System.out.println("\nTu cambio es de " + cambio);
                    System.out.println("Gracias por tu compra!");
                    System.out.println("Esperamos verte nuevamente :)");         
                    break;

                case "yellow":
                    System.out.println("\nObtuviste la pelota de color amarillo...");
                    System.out.println("Vas a obtener un 50% de descuento en el total de tu compra");
                    compra = compra - (compra * 50)/100;
                    System.out.println("\nEl total de tu compra ahora resulta ser de " + compra);
                    System.out.println("Ahora por favor ingresa el valor a pagar");
                    pago = lectura.nextInt();
                    cambio = pago - compra;
                    System.out.println("\nTu cambio es de " + cambio);
                    System.out.println("Gracias por tu compra!");
                    System.out.println("Esperamos verte nuevamente :)");         
                    break;

                case "white":
                    System.out.println("\nObtuviste la pelota de color blanco...");
                    System.out.println("Vas a obtener tu compra gratis!!!");
                    System.out.println("\nGracias por tu compra!");
                    System.out.println("Esperamos verte nuevamente :)");         
                    break;
            }
        }
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        lectura.close();
    }
}
