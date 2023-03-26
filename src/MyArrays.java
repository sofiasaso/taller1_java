import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);

        //Declarar la variable en dos pasos
        int [] vector1; //Declarar
        vector1 = new int[10]; //Inicializar

        int [] vector2 = {30, 50, 25, 85, 12, 6, 32, 41, 23, 63};

        vector1[5] = 6;
        System.out.println(vector1[5]);

        for(int p=0; p<5; p++){
            System.out.print(vector2[p] +  " ");
        }

        for (int number:vector2) {
            System.out.print(number + " ");
        }

        int [] prueba2 = new int[5];

        lectura.close();
    }
}