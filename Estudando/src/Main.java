import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, sexo, cpf;
        int idade;
        String escolha;

        // Tudo
        int quantidade = 20;


        char igual = '=';
        char[] arrayDeIgual = new char[quantidade];
        String stringArrayDeIgual = new String(arrayDeIgual);

        ListaDeContas listaDeContas = new ListaDeContas();

        while (true) {
            System.out.println("================================");
            System.out.println("1 - Criar conta\n2 - Consulta\n3 - Sair");
            String answer = sc.nextLine();
            answer = answer.toLowerCase();


            if (answer.equals("1") || answer.equals("criar conta")) {
                System.out.println("Qual seu nome?");
                nome = sc.nextLine();

                System.out.println("Qual seu sexo?(Homem/Mulher)");
                sexo = sc.nextLine();

                if(!sexo.toLowerCase().equals("homem")){
                    System.out.println("Você digitou seu genêro incorretamente\nDigite novamente seu sexo:");
                    sexo = sc.nextLine();
                    while (!sexo.toLowerCase().equals("Mulher")) {
                        break;
                    }
                } else if(!sexo.toLowerCase().equals("Mulher")){
                    System.out.println("Você digitou seu genêro incorretamente\nDigite novamente seu sexo:");
                    sexo = sc.nextLine();
                    while (!sexo.toLowerCase().equals("Mulher")){
                        break;
                    }
                }

                System.out.println("Qual seu CPF?");
                cpf = sc.nextLine();

                System.out.println("Qual sua idade?");
                idade = sc.nextInt();

                Inicia conta = new Inicia(nome, idade, sexo, cpf);
                listaDeContas.adicionarConta(conta);

            } else if (answer.equals("2") || answer.equals("consulta")) {
                System.out.println("Digite seu CPF");
                cpf = sc.nextLine();
                /*try{
                    Inicia consultaConta = listaDeContas.buscarConta(cpf);
                    System.out.println("Saldo:%f\nNome:%s\nSexo:%");
                }*/
            } else if (answer.equals("3") || answer.equals("sair")) {
                break;
            }
        }

    }
}