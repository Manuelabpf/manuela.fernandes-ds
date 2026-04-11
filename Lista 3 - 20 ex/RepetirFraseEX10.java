import java.util.Scanner;
public class RepetirFraseEX10 
{
    // Repetir frase (for) //
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Entre com a frase: ");
		String frase = sc1.nextLine();
		System.out.print("Quantas vezes a frase deve ser repetida: ");
		int rep = sc1.nextInt();
		for (int i = 0 ; i<= rep ; i++)
		{
		    System.out.println(frase);
		}
	}
}