import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = captura.nextInt();

        //RESTO DA DIVISAO POR 2
        int r = numero % 2;
        System.out.println("O resto da divisão por 2 é: " + r);



    }
}
