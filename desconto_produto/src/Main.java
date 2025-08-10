import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia o valor original do produto:
        double originalValue = scanner.nextDouble();

        // TODO: Leia a porcentagem de desconto:
        double percentCoupon = scanner.nextDouble();

        // TODO: Verifique se o desconto está dentro de um intervalo válido:
        if(percentCoupon < 0 || percentCoupon > 100){
            System.out.println("Desconto invalido");
        } else {
            // TODO: Calcule o valor final do produto:
            double result = originalValue - ((percentCoupon/100) * originalValue);
            // Formata e exibe o valor com duas casas decimais
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(result));
        }

        scanner.close();
    }
}