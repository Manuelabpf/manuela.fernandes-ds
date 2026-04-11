import java.util.Scanner;
public class ClassificaçãoPorNotaEX18
{
    // Classificação por nota (if) //
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = sc1.nextDouble();
        
        if (nota >= 9) {
            System.out.println("Classificação: Excelente (A)");
        } else if (nota >= 7) {
            System.out.println("Classificação: Bom (B)");
        } else if (nota >= 5) {
            System.out.println("Classificação: Regular (C)");
        } else {
            System.out.println("Classificação: Insuficiente (D)");
        }
	}
}