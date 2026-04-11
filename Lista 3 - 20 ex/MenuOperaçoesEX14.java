import java.util.Scanner;
public class MenuOperaçoesEX14 
{
    // 	Menu de operações (switch) //
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc1.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc1.nextDouble();

        System.out.println("--- Escolha a Operação ---");
        System.out.println("1 - Somar (+)");
        System.out.println("2 - Subtrair (-)");
        System.out.println("3 - Multiplicar (*)");
        System.out.println("4 - Dividir (/)");
        int opcao = sc1.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado: " + (n1 / n2));
                } else {
                    System.out.println("Erro: Não é possível dividir por zero!");
                }
                break;
        }
	}
}