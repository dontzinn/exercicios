import java.util.Scanner;

public class Main{
    public static final Scanner sc = new Scanner(System.in);
    public static int option;
    public static BankAccount contaBancaria = new BankAccount(344,"Pedro", 1000);
    public static double value;


    public static void main(String[] args){

        //System.out.println(nova.getSaldo());
        do{
            System.out.println("===== Escolha uma opção =====");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar um Boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            option = sc.nextInt();
            System.out.println("=============================");


            switch (option){
                case 1 -> checkBalance();
                case 2 -> checkSpecialLimit();
                case 3 -> depositMoney();
                case 4 -> withdrawal();
                /*case 5 -> checkShampoo();
                case 6 -> checkHasAPet();
                case 0 -> System.exit(0);*/
                default -> System.out.println("Opção inválida");
            }
        } while(true);
    }

    private static void depositMoney() {
        //contaBancaria.

    }

    private static void withdrawal() {
        value = sc.nextDouble();
        contaBancaria.withdrawal(value);
    }

    public static void checkSpecialLimit() {
        System.out.printf("Seu limite especial: %s\n", contaBancaria.getSpecialCheck());
    }

    public static void checkBalance() {
        System.out.printf("Seu saldo: %s\n", contaBancaria.getBalance());
    }
}