import java.util.Scanner;
public class MaiorDoisNúmeros2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Primeiro número:");
	    int num1 = sc.nextInt();
	    
	    System.out.println("Segundo número:");
	    int num2 = sc.nextInt();
	    
	    if (num1 > num2){
	        System.out.println("Primeiro número é maior!");
	    }
	    else if (num1 < num2){
	        System.out.println("Segundo número é maior!");
	    }
	    else if (num1 == num2){
	        System.out.println("Eles são iguais!");
	    }
	}
}