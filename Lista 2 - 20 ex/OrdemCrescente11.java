import java.util.Scanner;
public class OrdemCrescente11 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 3 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b){int t=a;a=b;b=t;}
        if(a > c){int t=a;a=c;c=t;}
        if(b > c){int t=b;b=c;c=t;}

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
    }
}
