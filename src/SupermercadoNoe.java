import java.util.Random;
import java.util.Scanner;

public class SupermercadoNoe {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);
        
        //Esta es la segunda versión de Supermercado Noé
        //Aplicamos un acumulador para añadir en el subtotal
        //Más adelante saca el total y el descuento dependiendo de la pelotica

        System.out.println("Digita tu nombre antes de iniciar, por favor");
        String name;
        name = lectura.nextLine();
        System.out.println("Bienvenid@ "+ name);
        System.out.println("En supermercados Noé, estamos de aniversario!!!\n");
        System.out.println("Por ello, te vamos a obsequiar un descuento en el valor de tu compra");
        System.out.println("Sólo si esta es mayor a $ 50.000 y dependiendo de tu suerte");
        System.out.println("Buena suerte " + name);

        int total, registrar=1, acumulador=0, cantidad, valorU, pago, cambio;

        while (registrar==1) {
            System.out.println("\nDigita el precio del producto");
            valorU = lectura.nextInt();
            System.out.println("Digita la cantidad del producto");
            cantidad = lectura.nextInt();
            System.out.println("¿Deseas ingresar más productos? Digita 1 para Si o 2 para No");
            registrar = lectura.nextInt();
            total = valorU * cantidad;
            acumulador += total;
        } 
        System.out.println("El valor de tu compra fue de " + acumulador);

        if (acumulador<50000) {
            System.out.println("Digita el precio del dinero a pagar por favor");
            pago = lectura.nextInt();
            cambio = pago - acumulador;
            System.out.println("Tu cambio es de " + cambio);
            System.out.println("Gracias por tu compra!");
            System.out.println("Esperamos verte nuevamente :)"); 

        } else {
            Random ballons = new Random();
            String[] ballonsColors = {"white", "yellow", "blue", "red"};
            int pelotasNumberCase = ballons.nextInt(ballonsColors.length);
            String balloonColor = ballonsColors[pelotasNumberCase];
            switch (balloonColor) {
                case "red":
                    System.out.println("Obtuviste la pelota de color rojo...");
                    System.out.println("Vas a obtener un 10% de descuento en el total de tu compra");
                    acumulador = acumulador - (acumulador * 10)/100; 
                    System.out.println("El total de tu compra ahora resulta ser de " + acumulador);
                    System.out.println("Digita el precio del dinero a pagar ");
                    pago = lectura.nextInt();
                    cambio = pago - acumulador;
                    System.out.println("Tu cambio es de " + cambio);
                    System.out.println("Gracias por tu compra!");
                    System.out.println("Esperamos verte nuevamente :)");         
                    break;
                    
                case "blue":
                    System.out.println("Obtuviste la pelota de color azul...");
                    System.out.println("Vas a obtener un 30% de descuento en el total de tu compra");
                    acumulador = acumulador - (acumulador * 30)/100;
                    System.out.println("El total de tu compra ahora resulta ser de " + acumulador);
                    System.out.println("Ahora por favor ingresa el valor a pagar");
                    pago = lectura.nextInt();
                    cambio = pago - acumulador;
                    System.out.println("Tu cambio es de " + cambio);
                    System.out.println("Gracias por tu compra!");
                    System.out.println("Esperamos verte nuevamente :)");         
                    break;

                case "yellow":
                    System.out.println("Obtuviste la pelota de color amarillo...");
                    System.out.println("Vas a obtener un 50% de descuento en el total de tu compra");
                    acumulador = acumulador - (acumulador * 50)/100;
                    System.out.println("El total de tu compra ahora resulta ser de " + acumulador);
                    System.out.println("Ahora por favor ingresa el valor a pagar");
                    pago = lectura.nextInt();
                    cambio = pago - acumulador;
                    System.out.println("Tu cambio es de " + cambio);
                    System.out.println("Gracias por tu compra!");
                    System.out.println("Esperamos verte nuevamente :)");         
                    break;

                case "white":
                    System.out.println("Obtuviste la pelota de color blanco...");
                    System.out.println("Vas a obtener tu compra gratis!!!");
                    acumulador = 0;
                    System.out.println("Gracias por tu compra!");
                    System.out.println("Esperamos verte nuevamente :)");         
                    break;
            }
        }
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        lectura.close();
    }
}
