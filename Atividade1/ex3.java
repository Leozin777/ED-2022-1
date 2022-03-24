import java.util.Scanner;

/*
Leia um conjunto de alunos, cada uma com o nome e a nota.
Em seguida exiba o nome dos alunos que possuem a nota maior do que a média da turma

 */
public class ex3 {
    public static void main(String[] args) {
        int n;
        double media, soma = 0;
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        System.out.println("Quantos alunos você deseja registrar ?");
        n = tc.nextInt();
        double [] Nota = new double[n];
        String [] Nome = new String[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o nome do aluno: ");
            Nome[i] = tc2.nextLine();
            System.out.println("Qual a nota do aluno/aluna " + Nome[i] + " ?");
            Nota[i] = tc.nextDouble();
            soma += Nota[i];
        }
        media = soma/n;


        System.out.println("Alunos que possuem a nota maior do que a média " + media + ", são:");
        for (int i = 0; i < n; i++){
            if (Nota[i] > media){
                System.out.println(Nome[i]);
            }
        }
    }
}
