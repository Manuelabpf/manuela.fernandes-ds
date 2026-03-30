import java.util.Scanner;
public class ParidadeDivisibilidade6
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
	    
	     System.out.print("Digite seu numero: ");
	     int num=sc1.nextInt();
	     
	     if(num%2==0){
	         System.out.println("Seu numero é par");
	     }
	     else{
	         System.out.println("Seu numero é impar");
	     } 
	     if (num%5==0){
	         System.out.println("Seu numero é divisivel por 5");
	     } 
	     else{
	         System.out.println("Seu numero não é divisivel por 5");
	     }
    }
    
}