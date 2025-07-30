import java.util.Scanner;


public class Main {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome:";
    public static void main(String args[]){
        //não vai parar o breakpoint

        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE );
        String name = scanner.next();

        System.out.println("Olá, informe a sua idade");
        int age = scanner.nextInt();

        System.out.printf("Bem vindo %s, sua idade é %s", name, age);

        var scannerVar = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        var nameVar = scanner.next();

        System.out.println("Olá, informe a sua idade:");
        var ageVar = scanner.nextInt();

        System.out.printf("Bem vindo %s, sua idade é %s", name, age);
    }

}