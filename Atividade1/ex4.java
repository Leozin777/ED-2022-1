import java.util.Scanner;

/*
Leia um conjunto de valores inteiros e em seguida os exiba-os na ordem inversa do que foram digitados.
 */
public class ex4 {
    public static void main(String[] args) {
        int n;
        Scanner tc = new Scanner(System.in);
        System.out.println("Quantos valores você vai precisar ?");
        n = tc.nextInt();
        int [] Numeros = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o " + (i + 1) + "° valor");
            Numeros[i] = tc.nextInt();
        }

        System.out.println("Ordem inversa:");
        for (int i = n - 1; i >= 0; i--){
            System.out.print(Numeros[i] + " - ");
        }
    }
}
