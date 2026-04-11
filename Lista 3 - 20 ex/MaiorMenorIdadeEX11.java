import java.util.Scanner;
public class MaiorMenorIdadeEX11 
{
    // Maior ou menor de idade (if) //
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Entre com a sua idade: ");
		int id = sc1.nextInt();
		
		if (id<18)
		{
		    System.out.println("Voçê é menor de idade!");
		}
		else 
		{
		    System.out.println("Voçê é maior de idade!");
		}
	}
}