import java.util.Scanner;
public class programa {

    public ler (){
        Scanner ler = new Scanner(System.in);
    }
    public static void main(String[] args) {

        int linha = 0;
        int coluna = 0;
        int op = 0;
        int[][] matrizTeste = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };
        do {
            System.out.print("DIGITE UM NÚMERO DE ACORDO COM A OPERAÇÃO QUE DESEJA REALIZAR\n" +
                    "1 - COMPARAR UMA MATRIZ ALEATÓRIA COM A MATRIZ TESTE\n" +
                    "2 - CRIAR UMA MATRIZ E COMPARAR COM A MATRIZ TESTE\n" +
                    "3 - EXIBIR A MATRIZ TESTE\n" +
                    "0 - FINALIZAR PROGRAMA\n" +
                    "-------------------------------------------------------------------------------\n");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    System.out.println("DIGITE QUANTAS LINHAS DEVE TER A MATRIZ");
                    linha = ler.nextInt();
                    System.out.println("DIGITE QUANTAS COLUNAS DEVE TER A MATRIZ");
                    coluna = ler.nextInt();

                    int[][] matrizAle = criaMatrizAleatoria(linha, coluna);
                    printMatriz(matrizAle, linha, coluna);
                    printMatriz(matrizTeste, 3, 3);

                    double endTime = System.nanoTime();
                    buscaPadrao(matrizAle, matrizTeste, linha, coluna);
                    double startTime = System.nanoTime();

                    System.out.print("Duracao: " + Math.abs((endTime - startTime) / 1000000) + " milisegundos\n" +
                            "-------------------------------------------------------------------------------\n");
                    break;
                case 2:
                    System.out.println("DIGITE QUANTAS LINHAS DEVE TER A MATRIZ");
                    linha = ler.nextInt();
                    System.out.println("DIGITE QUANTAS COLUNAS DEVE TER A MATRIZ");
                    coluna = ler.nextInt();

                    int[][] matrizMao = criaMatrizNaMao(linha, coluna);
                    printMatriz(matrizMao, linha, coluna);
                    printMatriz(matrizTeste, 3, 3);

                    break;
                case 3:
                    printMatriz(matrizTeste, 3, 3);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.print("OPÇÃO INVÁLIDA, ESCOLA NOVAMENTE\n" +
                            "-------------------------------------------------------------------------------\n");
                    break;
            }
        } while(op != 0);
    }

    public static int[][] criaMatrizNaMao(int linha, int coluna){
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int e = 0; e < coluna; e++) {
                int num = ler.nextInt();
                matriz[i][e] = num;
            }
        }
        return matriz;
    }

    public static int[][] criaMatrizAleatoria(int linha, int coluna) {
        int[][] matriz = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int e = 0; e < coluna; e++) {
                matriz[i][e] = (int) (Math.random() * 2);
            }
        }
        return matriz;
    }

    public static void printMatriz(int[][] matriz, int linha, int coluna) {
        System.out.println("_____________________________________________________");
        for (int i = 0; i < linha; i++) {
            for (int e = 0; e < coluna; e++) {
                System.out.print(" | " + matriz[i][e]);
            }
            System.out.println(" |");
        }
    }

    public static void buscaPadrao(int[][] matriz, int[][] padrao, int linha, int coluna) {
        int contador = 0;
        for (int i = 0; i < linha; i++) {
            for (int e = 0; e < coluna; e++) {
                if (matriz[i][e] == padrao[0][0] && e < (linha - padrao.length + 1) && i < (coluna - padrao.length + 1))
                    if(matriz[i][e + 1] == padrao[0][1])
                        if(matriz[i][e + 2] == padrao[0][2])
                            if(matriz[i + 1][e] == padrao[1][0])
                                if(matriz[i + 1][e + 1] == padrao[1][1])
                                    if(matriz[i + 1][e + 2] == padrao[1][2])
                                        if(matriz[i + 2][e] == padrao[2][0])
                                            if(matriz[i + 2][e + 1] == padrao[2][1])
                                                if(matriz[i + 2 ][e + 2 ] == padrao[2][2])
                                                    contador++;
            }
        }
        System.out.println("Vezes que o padrao foi encontrado: " + contador);
    }
}
