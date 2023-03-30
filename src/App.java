import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número:");
            num = sc.nextInt();
            System.out.println("O número é: " + num);
        } catch (Exception e) {
            System.out.println("Caracter invalido.");
            System.exit(0);
        }
    }
}
