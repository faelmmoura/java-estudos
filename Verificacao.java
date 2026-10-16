import java.util.Scanner;

public class Verificacao {

    public static boolean podeEntrar (int idade) {
        return idade >= 18;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (podeEntrar(idade)) {
            System.out.println("Entrada permitida.");
        } else {
            System.out.println("Entrada não permitida.");
        }
        scanner.close();
    }
}
