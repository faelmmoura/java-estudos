import java.util.Scanner;

public class Acesso {
    public static boolean ehmaiordeIdade(int idade) {
        return idade >= 18;
    }

    public static String verificarAcesso(boolean maiorDeIdade) {
        if (maiorDeIdade) {
            return "Acesso é permitido.";
        } else {
            return "Acesso negado.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        String resultado = verificarAcesso(ehmaiordeIdade(idade));
        System.out.println(resultado);
        scanner.close();
    }

}
