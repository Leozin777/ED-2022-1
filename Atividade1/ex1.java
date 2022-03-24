import java.util.Scanner;

/*
Escreva uma classe que Leia 5 nomes e notas de uma turma, calcula e exibe a média das notas da turma
e em seguida exibe a relação de nomes cuja nota é superior a esta média. Utilize vetores para armazenar as notas.
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        String Nomes [] = new String[5];
        double Notas [] = new double[5];
        double media, soma = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o nome do aluno: ");
            Nomes[i] = tc.nextLine();
            System.out.println("Digite a nota do aluno: ");
            Notas[i] = tc2.nextDouble();
            soma += Notas[i];
        }

        media = soma/Notas.length;
        System.out.println(media);

        for (int i = 0; i < 5; i++){
            if(Notas[i] > media){
                System.out.println(Nomes[i] + " foi aprovado/aprovada, nota: " + Notas[i]);
            }
        }
    }
}
