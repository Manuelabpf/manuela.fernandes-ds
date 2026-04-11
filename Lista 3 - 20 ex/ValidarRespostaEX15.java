import java.util.Scanner;
public class ValidarRespostaEX15
{
    // Validar resposta (while) //
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String resposta = "";

        while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
            System.out.print("Deseja continuar? (S/N): ");
            resposta = sc1.next();

            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Resposta inválida! Por favor, digite apenas S ou N.");
            }
        }

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Você escolheu CONTINUAR.");
        } else {
            System.out.println("Você escolheu SAIR.");
        }
	}
}