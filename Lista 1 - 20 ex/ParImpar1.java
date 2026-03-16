import java.util.Scanner;
public class ParImpar1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite um némero: ");
	    int num = sc.nextInt();
	    
	    int r;
	    r = num % 2;
	    if (r == 0){
	        System.out.println("O número é par!");
	    }else{
	        System.out.println("O número é impar!");
	    }
	}
}