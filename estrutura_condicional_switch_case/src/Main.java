import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número de 1 até 7");
        var option = sc.nextInt();

        //Switch com case e break
        switch (option){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        //Switch sem Break
        /*switch (option){
            case 1:
                System.out.print("Domingo\n");

            case 2:
                System.out.print("Segunda\n");

            case 3:
                System.out.print("Terça\n");

            case 4:
                System.out.print("Quarta\n");

            case 5:
                System.out.print("Quinta\n");

            case 6:
                System.out.print("Sexta\n");

            case 7:
                System.out.print("Sábado\n");

        }*/

        //Switch com Arrow Function
        switch (option){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
        }

        //Arrow function com dois valores dentro do case, ele irá executar tanto o 1 quanto o 7
        switch (option){
            case 1, 7-> System.out.println("FIM DE SEMANAAAAAAAAAAAA");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            //case 7 -> System.out.println("Sábado");
        }

        //Switch no formato de variável
        var message = switch (option){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Opção Inválida";
        };
        System.out.println(message);


        var message2 = switch (option){
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana uhullllll \\o/",day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção Inválida";
        };
        System.out.println(message2);
    }
}