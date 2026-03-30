import java.util.Scanner;
public class DiferençaAbsoluta10
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
	    
	     System.out.print("Qual o seu primeiro numero?: ");
	     int num1=sc1.nextInt();
	     System.out.print("Qual seu segundo numero?: ");
	     int num2=sc1.nextInt();
	     
	     System.out.println("Seu numero absoluto é: "+(num1-num2));
    }
}
