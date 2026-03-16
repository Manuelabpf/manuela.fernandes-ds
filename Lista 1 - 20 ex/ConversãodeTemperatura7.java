import java.util.Scanner;
public class ConversãodeTemperatura7
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double convertido;
	    
	    System.out.println("digite a temperatura em c°: ");
	    double temperatura = sc.nextDouble();
	    
	    convertido = (temperatura * 9/5) + 32;
	    
	    System.out.println(convertido);
	}
}