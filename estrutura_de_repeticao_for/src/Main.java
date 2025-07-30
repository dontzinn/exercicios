import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //For -> Infinito
        for(;;){
            System.out.println("Digite um nome:");

            String name = sc.next();

            if(name.equalsIgnoreCase("exit")){
                break;
            }

            System.out.println(name);
        }

        //For -> Finito
        for(int i = 1; i<= 100;i++){
            System.out.println(i);
            if(i == 99){
                System.out.println("Fim da Execução");
                break;
            }
        }

        //For -> Com continue
        for(int i = 1; i<= 100;i++){

            if(i % 2 == 0){
                continue;
            }

            System.out.println(i);
        }

        for(int i = 1; i< args.length;i++){
            System.out.println(args[i]);
        }

        for(var arg : args){
            System.out.println(arg);
        }
    }
}