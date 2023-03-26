import java.util.Scanner;

public class MaquinaExpendedora {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);

        System.out.println("Bienvenido al programa de máquina expendedora < 3");
   
        int cantidad, total, pago, cambio;


        String[][] codigosProducto = {{"00", "01", "02"}, 
        {"10", "11", "12"}, 
        {"20", "21", "22"},
        {"30", "31", "32"}, 
        {"40", "41", "42"}};         
        
        //Productos de la máquina expendedora
        String[][] nombreProducto = {{"Papas Margarita", "Galletas Wafer", "Chocolatina Jet"},
        {"Chiclets Adams", "Manimoto", "Chocoramo"},
        {"Agua Cristal", "Coca-Cola", "Jugo Hit"},
        {"Jumbo", "Barra de Cereal", "Galletas Integrales"},
        {"Ponque Gala", "Gansito", "Galletas Oreo"}};
             
        //Precio de los productos
        int[][] precioProducto = {{1500, 800, 800}, 
        {600, 800, 1300},
        {1500, 1700, 1200},
        {1200, 700, 1600}, 
        {2000, 1800, 1000}};

        //Disponibilidad productos
        int[][] cantidadProductos = {{4, 2, 2},
        {1, 5, 10}, 
        {1, 3, 3}, 
        {4, 1, 3},
        {3, 4, 2}};

        //Mostrar lista productos
        System.out.println("\nLa lista de los productos, es la siguiente: ");

        //Primer for: para las filas
        for (int fila = 0; fila < nombreProducto.length; fila++) {
            System.out.println("\nEn la sección " + (fila+1) + ", están:\n");

        //Segundo for: para las columnas
            for (int columna = 0; columna < nombreProducto[fila].length; columna++) {
                System.out.println(codigosProducto[fila][columna] + "\n" + nombreProducto[fila][columna] + 
                " \nPrecio: " + precioProducto[fila][columna] + " \nDisponibilidad: " + 
                cantidadProductos[fila][columna] + "\n\t");
            }
        }
        

        //Solicitar que ingrese el código correspondiente
        System.out.println("Ahora, ingresa el codigo del producto que deseas por favor");
        String codigoProducto;
        codigoProducto = lectura.next();

        //Declarar fila y columna como enteras para registrar codigo deseado
        int fila=0, columna=0;

        //Después de ingresar el código, obtener número de fila y columna a partir de este
        //Reorrer las filas y columnas con un for 
        for (int f = 0; f < codigosProducto.length; f++) {
            for (int c = 0; c < codigosProducto[f].length; c++) {
                //Si deseamos un producto en especifico, debe ser igual a alguno 
                //de los productos mostrados anteriormente (desde 00 hasta 42)
                //Usamos un if y comparamos números ingresados (especificar filas y columnas)
                if (codigoProducto.equals(codigosProducto[f][c])) {
                    //Las filas serán los valores de f (es lo mismo)
                    fila = f;
                    //Las columnas serán los valores de c (es lo mismo)
                    columna = c;
                }
            }
        }

        //Ahora el usuario deberá ingresar la cantidad de productos que desea
        System.out.println("\nCuántas unidades deseas?");
        cantidad = lectura.nextInt();

        //Calcular el precio total (con las especificaciones necesarias)
        total = precioProducto[fila][columna] * cantidad;
        System.out.println("\nEl precio total de tu compra sería de " + total);
        
        //Verificar unidades pedidas disponibles en la máquina
        if (cantidadProductos[fila][columna] < cantidad) {
            System.out.println("\nLo siento, pero no hay suficientes unidades disponibles");
            return;
        }
        
        //Ingresa el valor con el que vas a pagar
        System.out.println("\nIngresa el valor del dinero que vas a ingresar, por favor :");
        pago = lectura.nextInt();

        //Valor a pagar alcanza para lo solicitado
        if (pago < total) {
            System.out.println("\nLo siento, pero no te alcanza para comprar. \nRevisa nuevamente");
            return;
        }

        //Darle el cambio al usuario
        cambio = pago - total;
        System.out.println("\nTu cambio es de " + cambio + " pesitos");
        
        //Después, resulta necesario actualizar cantidad en la máquina expendedora
        cantidadProductos[fila][columna]-= cantidad;

        System.out.println("\nSe ha actualizado la cantidad de productos disponibles en la máquina");
        //Se van a mostrar nuevamente los productos de acuerdo a los cambios realizacos anteriormente
        //Para ello se va a usar un for nuevamente
        //Pero sólo se va a desear ver la cantidad de Productos y su nombre
        for (int row = 0; row < nombreProducto.length; row++) {
            System.out.println("\nEn la sección " + (row+1) + ", están:\n");
        //Segundo for: para las columnas
            for (int column = 0; column < nombreProducto[row].length; column++) {
                System.out.println(nombreProducto[row][column] + " \nDisponibilidad: " + cantidadProductos[row][column] + "\n\t");
            }
        }

        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");

        lectura.close();
        
    } 
}
