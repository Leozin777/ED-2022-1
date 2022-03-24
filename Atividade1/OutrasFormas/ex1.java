package OutrasFormas;

import java.util.Scanner;

/*
Escreva uma classe que Leia 5 nomes e notas de uma turma, calcula e exibe a média das notas da turma
e em seguida exibe a relação de nomes cuja nota é superior a esta média. Utilize vetores para armazenar as notas.
 */
public class ex1 {
    static class Aluno{
        double nota [] = new double[5];
        String nome [] = new String[5];
    }

    public static double leitura(Aluno[] tam){
        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            Aluno aluno[] = new Aluno[i];
            System.out.println("Digite o nome do aluno: ");
            aluno.nome[i] = tc.nextLine();
            System.out.println("Digite a nota do/da " + aluno.nome[i]);
            aluno.nota[i] = tc.nextDouble();
        }

        return
    }

    public static void main(String[] args) {

    }
}
