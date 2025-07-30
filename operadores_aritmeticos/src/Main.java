import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        int value1 = sc.nextInt();
        System.out.println("Informe o segundo número:");
        int value2 = sc.nextInt();

        //Realiza soma entre dois valores - Por soma
        System.out.println("Realiza soma entre dois valores");
        System.out.printf("%s + %s = %s\n\n", value1, value2, value1 + value2);

        //Concatena os dois valores
        System.out.println("Concatena os dois valores");
        System.out.println(value1 + " + " + value2 + " = " + value1 + value2);
        System.out.println();

        //Realiza a soma com precedência - Por soma
        System.out.println("Realizando a soma por precedência");
        System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
        System.out.println();

        //Realiza a subtração
        System.out.println("Realizando a subtração");
        System.out.printf("%s - %s = %s\n\n", value1, value2, value1 - value2);

        //Realiza por divisão
        System.out.println("Realizando a divisão");
        System.out.printf("%s / %s = %s\n\n", value1, value2, value1 / value2);

        //Realiza divisão por Float
        System.out.println("----------------------------");
        System.out.println("Realizando por Divisão por Float");
        System.out.println("Informe o primeiro número:");
        float v1 = sc.nextFloat();
        System.out.println("Informe o segundo número:");
        float v2 = sc.nextFloat();
        System.out.printf("%s / %s = %s\n\n", v1, v2, v1 / v2);

        //Pega o resto da divisão de dois números
        System.out.println("Pegando o resto da divisão");
        System.out.printf("%s %% %s = %s\n\n", v1, v2, v1 % v2);

        //Realiza por multiplicação
        System.out.println("Realizando por multiplicação");

        System.out.printf("%s * %s = %s\n\n", value1, value2, value1 * value2);

        //Realiza por Precedência
        int valueSemPre = 5 + 9 * 10 - 5 / 2;
        int value = (5 + 9) * (10 - 5) / 2;
        System.out.printf("Sem precedência: %s \nCom Precedência: %s \n\n", valueSemPre, value);

        //Realiza por raíz quadrada
        System.out.println("----------------------------");
        System.out.println("Realizando por raíz quadrada");
        System.out.println("Informe o primeiro número:");
        value1 = sc.nextInt();
        System.out.printf("A raiz quadrada de %s é %s\n\n", value1, Math.sqrt(value1));

        //Realiza por potência quadrada
        System.out.println("Realizando por potência quadrada");
        System.out.printf("A potência de %s é %s\n\n", value1, Math.pow(value1, 2));

        //Realiza por incremento
        System.out.println("Realizando por incremento");
        System.out.printf("Incremento   pós: %s -> %s\n", value1++, value1);
        System.out.printf("Incremento antes: %s\n\n",++value1);

        //Realiza por decremento
        System.out.println("Realizando por decremento");
        System.out.printf("Incremento   pós: %s -> %s\n", value1--, value1);
        System.out.printf("Incremento antes: %s\n\n",--value1);
        sc.close();
    }
}