import java.util.Scanner;
public class IMCsimplificada13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5)
            System.out.println("Abaixo do peso");
        else if(imc <= 25)
            System.out.println("Peso normal");
        else
            System.out.println("Acima do peso");
    }
}
