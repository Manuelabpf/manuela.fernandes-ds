import java.util.Scanner;
public class TempodeViagem7
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
	    
	     System.out.print("Qual a distancia?: ");
	     Double km=sc1.nextDouble();
	     System.out.print("Quantos km/h vc esta indo? ");
	     Double velo=sc1.nextDouble();
	     
	     Double temp=km/velo;
	     System.out.print("Voce levara "+velo+" horas para chegar la");
         }
}
	    