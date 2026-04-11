import java.util.Scanner;
public class ContarNumEX1
{
    // Contar até o número digitado (while) //
    
	public static void main(String[] args) {
	     Scanner sc1=new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num=sc1.nextInt();
		int i=0;
		while (i<=num) {
		    System.out.println(i); i++;
		}
	}
}