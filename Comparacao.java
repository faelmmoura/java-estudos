import java.util.Scanner;

public class Comparacao {

    public static String compararNumeros(int num1, int num2) {

        if (num1 > num2) {
            return "O primeiro número é maior.";
        } else if (num1 < num2) {
            return "O segundo número é maior.";
        } else {
            return "Os números são iguais.";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        String resultado = compararNumeros(num1, num2);

        System.out.println(resultado);

        scanner.close();
    }
}
