/*
Crie um vetor capaz de armazenar 50 números inteiros.
Em seguida faça o seu preenchimento automático com os números de 101 a 150, ou seja,
na posição número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente.
Em seguida, exiba os valores deste vetor.

 */
public class ex5 {
    public static void main(String[] args) {
        int [] numero = new int[50];
        int n = 101;

        for (int i = 0; i < 50; i++){
            numero[i] = n;
            System.out.println(numero[i]);
            n++;
        }


    }
}
