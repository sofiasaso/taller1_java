import  java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner lectura = new Scanner  (System.in);
        
      String [][]nombres={{"Juan","Victor","Santiago"},{"David","Daniela","Juan R."},{"Shirley","María","Saira"}};
      
      for(int f=0;f<=2;f++){
        for(int c=0 ;c<=2;c++){
            System.out.println(nombres [f][c]+"\t");
      }
    System.out.println(" ");
}

lectura.close();
    }
}