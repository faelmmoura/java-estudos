import java.util.Scanner;

public class Main {

    public static boolean ehMaiorDeIdade(int idade) {

        if (idade >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        boolean resultado = ehMaiorDeIdade(idade);

        if (resultado) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

    }
}