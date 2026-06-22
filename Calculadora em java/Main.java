import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        operaçoes op = new operaçoes();

        System.out.println("CALCULADORA");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = op.somar(num1, num2);
                break;
            case 2:
                resultado = op.subtrair(num1, num2);
                break;
            case 3:
                resultado = op.multiplicar(num1, num2);
                break;
            case 4:
                resultado = op.dividir(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}