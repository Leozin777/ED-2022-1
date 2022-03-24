import java.util.Scanner;

/*
Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário.
Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada.
Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).Utilize vetores
 */
public class ex2 {
    public static void main(String[] args) {
        int n;
        double media, soma = 0;
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        System.out.println("Quantas notas você vai precisar no conjunto ?");
        n =  tc.nextInt();
        double [] Notas = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite a " + (i + 1) + "° nota");
            Notas[i] = tc2.nextDouble();
            soma += Notas[i];
        }

        media = soma/n;
        System.out.println(media);

        System.out.println("Notas maiores do que a média: ");
        for(int i = 0; i < n; i++){
            if (Notas[i] > media){
                System.out.println(Notas[i]);
            }
        }

        System.out.println("Notas menores do que a média: ");
        for(int i = 0; i < n; i++){
            if (Notas[i] < media){
                System.out.println(Notas[i]);
            }
        }

    }
}
