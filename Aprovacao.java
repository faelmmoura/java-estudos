import java.util.Scanner;

public class Aprovacao {

    public static boolean FoiAprovado(double nota, int idade) {

        return nota >= 7 && idade >= 18;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        boolean resultado = FoiAprovado(nota, idade);

        if (resultado) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}