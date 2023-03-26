import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception{

        System.out.println("Bienvenido a Login <3, primero debo revisar tus datos");

        String validUser = "admin";
        String validPassword = "1234";

        Scanner Login = new Scanner(System.in);
        System.out.print("\nIngresa tu usuario, por favor: ");
        String user = Login.nextLine();

        System.out.print("\nIngresa tu contraseña, por favor: ");
        String password = Login.nextLine();

        if (user.equals(validUser) && password.equals(validPassword)) {
            System.out.println("\nBienvenido al sistema");
        } else if (user.equals(validUser) && !password.equals(validPassword)) {
            System.out.println("\nParece que has olvidado tu contraseña");
        } else if (!user.equals(validUser) && password.equals(validPassword)) {
            System.out.println("\nRevisa por favor tus credenciales");
        } else {
            System.out.println("\nACCESO DENEGADO!");
        }
        System.out.println("\n© Programa Diseñado por Laura Sofía Sánchez");
        System.out.println("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO");
        Login.close();
    }
}
