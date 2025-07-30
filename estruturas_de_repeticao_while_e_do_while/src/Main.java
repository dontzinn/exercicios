import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = "";

        /*
        while(!name.equalsIgnoreCase("exit")){
            System.out.println("Informe um nome");
            name = sc.next();
        }
        */


        //System.out.println("Outro While");

        /*
        do{
            System.out.println("Informe um nome");
            name = sc.next();
        }
        while(!name.equalsIgnoreCase("exit"));
        */

        int i = 0;

        while(args.length > i){
            System.out.println(i);
            i++;
        }



        System.out.println("Outro While");
        i = 0;

        do{
            System.out.println(i);
            i++;
        }
        while(args.length > i);
    }

}