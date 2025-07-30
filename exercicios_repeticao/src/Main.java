import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Tabuada

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("---- Tabuada -----");
        System.out.println("Digite um número:");
        int number = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.printf("%s * %s = %s\n", i, number, i*number);
        }*/

        // Calculo de IMC
        /*System.out.println("Qual sua altura?");
        double height = sc.nextDouble();
        System.out.println("Qual seu peso?");
        double weight = sc.nextDouble();

        double resultImc = weight/(Math.pow(height,2));
        DecimalFormat formato = new DecimalFormat("#,##");
        resultImc = Double.valueOf(formato.format(resultImc));
        System.out.printf("Seu IMC é: %s\n", resultImc);

        if(resultImc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (resultImc >= 18.6 && resultImc <= 24.9){
            System.out.println("Peso ideal");
        } else if (resultImc >= 25.0 && resultImc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (resultImc >= 30.0 && resultImc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (resultImc >= 35.0 && resultImc <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }*/
        /*
        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();


        while(n1 > n2){
            System.out.println("O primeiro número não pode ser maior ou igual que o segundo");
            System.out.println("Digite o primeiro número:");
            n1 = sc.nextInt();
        }

        System.out.println("Par ou Ímpar (p/i)");
        String parOrImpar = sc.next();

        while((!parOrImpar.equalsIgnoreCase("p")) && (!parOrImpar.equalsIgnoreCase("i"))){
            System.out.println("Você digitou errado, coloque p (para par) ou i (para impar)");
            parOrImpar = sc.next();
        }

        if(parOrImpar.equalsIgnoreCase("p")){
            for(int i = n2; i >= n1; i --){
                if(i % 2 == 0){
                    System.out.printf("Número Par: %s \n", i);
                }
            }
        }

        if(parOrImpar.equalsIgnoreCase("i")){
            for(int i = n2; i >= n1; i --){
                if(i % 2 == 1){
                    System.out.printf("Número Ímpar: %s \n", i);
                }
            }
        }*/
        System.out.println("Digite o primeiro número:");
        int number = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int number2 = sc.nextInt();
        do{
            if(number2 % number == 1 ){
                System.out.println("O resto da divisão não deu zero, digite outro número");
                number2 = sc.nextInt();
            } else if (number > number2) {
                System.out.println("O primeiro número não pode ser maior que o segundo, digite outro número");
                number2 = sc.nextInt();
            } else if (number2 % number != 0){
                System.out.println("O resultado deu diferente de 0, digite outro número: ");
                number2 = sc.nextInt();
            }

        } while (number2 % number != 0);
        System.out.println("O resultado deu zero, parabéns!!!! Saiu do loop");
    }
}