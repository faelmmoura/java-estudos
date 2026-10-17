import java.util.Scanner;

public class Desconto {

    public static boolean calcularDesconto(double valor) {
        if (valor >= 100) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        if (calcularDesconto(valor)) {
            System.out.println("Desconto aplicado.");
        } else {
            System.out.println("Sem desconto.");
        }
        scanner.close();
    }
}
