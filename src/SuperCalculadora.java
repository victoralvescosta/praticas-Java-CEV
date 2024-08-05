import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = captura.nextInt();

        //RESTO DA DIVISAO POR 2
        int r = numero % 2;
        System.out.println("O resto da divisão por 2 é: " + r);

        //ELEVADO AO CUBO
        double c = Math.pow(numero, 3);
        System.out.println("Elevado ao cubo é: " + c);

        //RAIZ QUADRADA
        double rq = Math.sqrt(numero);
        System.out.println("A raiz quadrada é: " + rq);

        //RAIZ CUBICA
        double rc = Math.cbrt(numero);
        System.out.println("A raiz cúbica é: " + rc);

        //VALOR ABSOLUTO
        int abs = Math.abs(numero);
        System.out.println("O valor absoluto é: " + abs);



    }
}
