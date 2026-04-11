import java.util.Scanner;
public class ImparsDe1ao30EX19
{
    // Imprimir ímpares entre 1 e 30 (for) //
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Numeros impares entre 1 e 30: ");
		for (int i=0 ; i<=30;i++)
		{
		   if(i%2 !=0)
		   {
		       System.out.println(i);
		   }
		}
	}
}