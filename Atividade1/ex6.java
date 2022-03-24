import java.util.Random;

/*
Crie um vetor capaz de armazenar 50 números inteiros.
Em seguida faça o seu preenchimento automático de forma randômica.
Em seguida, exiba os valores deste vetor.
 */
public class ex6 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numero = new int[50];

        for(int i = 0; i < 50; i++){
            numero[i] = random.nextInt(100) + 1;
            System.out.println(numero[i]);
        }
    }
}
