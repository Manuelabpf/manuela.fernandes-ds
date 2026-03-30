import java.util.Scanner;
public class AutorizaçãodeEmpréstimo8
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		System.out.print("Qual o seu salario?: ");
		int sal=sc1.nextInt();
		System.out.print("Quanto voce quer de emprestimo?: ");
		int em=sc1.nextInt();

		if(em>=sal*0.30) {
			System.out.println("Emprestimo aceito");
		}
		else {
			System.out.println("Emprestimo negado");
		}
	}
}