import java.util.Scanner;
public class ConversãoSegundos18 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        int total = sc.nextInt();

        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        System.out.println(horas+"h "+minutos+"m "+segundos+"s");
    }
}