import java.util.Scanner;
public class Compara3Strings19 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 3 palavras: ");
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        String maior = s1;

        if(s2.length() > maior.length())
            maior = s2;

        if(s3.length() > maior.length())
            maior = s3;

        System.out.print("Maior palavra: " + maior);
    }
}
