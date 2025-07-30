/*
    0 = false
    1 = true
*/

import java.net.Inet4Address;

public class Main {
    public static void main(String[] args){

        int value1 = 8;
        String binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro Número da operação %s (Representação binária %s)\n", value1, binary1);
        int value2 = 3;
        String binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s) ----> Se Estiver usando o shift left, desconsiderar esses números\n", value2, binary2);
        //Realiza por or
        int result = value1 | value2;

        System.out.printf("%s | %s = %s\n", value1, value2, result);
        System.out.printf("\n");

        //Realiza por and
        result = value1 & value2;

        System.out.printf("%s & %s = %s\n", value1, value2, result);

        //Realiza por XOR
        result = value1 ^ value2;
        System.out.printf("%s ^ %s = %s\n\n", value1, value2, result);

        //Ver o tamanho máximo de um Integer
        System.out.println();
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

        //Complement -> É a negação do bit
        /*result = ~value1;
        System.out.println(Integer.toBinaryString(value1));
        System.out.println(Integer.toBinaryString(result));
        System.out.printf("%s = %s", value1, result);*/

        //Shift Left -> Deslocamento de bits
        result = value1 << value2;
        System.out.printf("%s << %s = %s (Representação binária %s)\n\n", value1, value2, result,Integer.toBinaryString(result));

        //Right Left -> Deslocamento de bits para direita
        result = value1 >> value2;
        System.out.printf("%s << %s = %s (Representação binária %s)\n\n", value1, value2, result,Integer.toBinaryString(result));

        //Right shift assignment -> Sempre deslocará o zeros a esquerda
        result = value1 >>> value2;
        System.out.printf("%s >>> %s = %s (Representação binária %s)\n\n", value1, value2, result,Integer.toBinaryString(result));
    }
}