import java.util.Scanner;
public class SomaAmbosPositivos17 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > 0 && b > 0)
            System.out.println("Soma: " + (a + b));
        else
            System.out.println("Valores inválidos");
    }
}
