import java.util.Scanner;
public class ValidaçãodeIdade5
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
	     System.out.print("Qual a sua idade?: ");
	     int idade=sc1.nextInt();
	     
	     if(idade<18)
	     {
	         System.out.print("você é menor de idade");
	     }
	     else if (idade>=18){
	         System.out.print("você é de maior");
	     } 
	}
}