import java.util.Scanner;
public class DobroTriplo1
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
	    
      System.out.print("Digite seu numero: ");
      int num=sc1.nextInt();
      int dobro = num*2;
      int triplo=num*3;
      
      System.out.println("O dobro de "+num+" é "+dobro+" e o triplo é "+triplo+".");
	}
}