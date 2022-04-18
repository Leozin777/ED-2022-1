import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int line;
        int col;
        int op;

        int[][] testMatrix = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };

        do {
            System.out.print("DIGITE UM NÚMERO DE ACORDO COM A OPERAÇÃO QUE DESEJA REALIZAR.\n" +
                    "1 - COMPARAR UMA MATRIZ ALEATÓRIA COM A MATRIZ TESTE.\n" +
                    "2 - CRIAR UMA MATRIZ E COMPARAR COM A MATRIZ TESTE.\n" +
                    "3 - EXIBIR A MATRIZ TESTE.\n" +
                    "0 - FINALIZAR PROGRAMA.");
            System.out.println("\n---------------------------------------------------------------------------");

            op = read.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite a quantidade de linhas que deseja na matriz:");
                    line = read.nextInt();
                    System.out.println("Digite a quantidade de colunas que deseja na matriz:");
                    col = read.nextInt();

                    int[][] rdmMtx = randomMatrix(line, col);
                    printMatrix(rdmMtx, line, col);
                    System.out.println("\n---------------------------------------------------------------------------\n");
                    printMatrix(testMatrix, 3, 3);
                    System.out.println("\n---------------------------------------------------------------------------");

                    double endTime = System.nanoTime();
                    patternFinder(rdmMtx, testMatrix, line, col);
                    double startTime = System.nanoTime();

                    System.out.print("Duração da execução da matriz: " + Math.abs((endTime - startTime) / 1000000) + " milisegundos.");
                    System.out.println("\n---------------------------------------------------------------------------\n");
                    System.out.println("---------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Digite a quantidade de linhas que deseja na matriz:");
                    line = read.nextInt();
                    System.out.println("Digite a quantidade de colunas que deseja na matriz:");
                    col = read.nextInt();

                    int[][] manualMatrix = inputMatrix(line, col);
                    System.out.println("\n---------------------------------------------------------------------------\n");
                    printMatrix(manualMatrix, line, col);
                    System.out.println("\n---------------------------------------------------------------------------\n");
                    System.out.println("Matriz teste:\n");
                    printMatrix(testMatrix, 3, 3);
                    System.out.println("\n---------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("\n---------------------------------------------------------------------------\n");
                    printMatrix(testMatrix, 3, 3);
                    System.out.println("\n---------------------------------------------------------------------------\n");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.print("OPÇÃO INVÁLIDA, ESCOLHA UMA OPÇÃO VÁLIDA\n");
                    System.out.println("\n---------------------------------------------------------------------------\n");
                    break;
            }
        } while(op != 0);
    }

    // Gerador de Matriz manual
    public static int[][] inputMatrix(int line, int col) {
        int num = 0;

        Scanner read = new Scanner(System.in);
        int[][] matrix = new int[line][col];

        for (int i = 0; i < line; i++) {
            for (int e = 0; e < col; e++) {
                do {
                    System.out.println("Digite o numero da posição matriz[" + i + "][" + e + "]:");
                    num = read.nextInt();
                    matrix[i][e] = num;
                    if (num != 0 && num != 1){
                        System.out.println("\nNúmero inválido, os números válidos são 0 e 1.\n");
                    }
                } while (num != 0 && num != 1);
            }
        }
        return matrix;
    }

    // Gera matriz aleatória
    public static int[][] randomMatrix(int line, int col) {

        System.out.println("\n---------------------------------------------------------------------------\n");

        int[][] matrix = new int[line][col];

        for (int i = 0; i < line; i++) {
            for (int e = 0; e < col; e++) {
                    matrix[i][e] = (int) (Math.random() * 2);
                }
            }
        return matrix;
    }

    // Imprime matriz
    public static void printMatrix(int[][] matrix, int line, int col) {
        for (int i = 0; i < line; i++) {
            for (int e = 0; e < col; e++) {
                System.out.print(" | " + matrix[i][e]);
            }
            System.out.println(" |");
        }
    }

    // Buscador de padrão na matriz
    public static void patternFinder(int[][] matrix, int[][] pattern, int line, int col) {
        int counter = 0;
        for (int i = 0; i < line; i++)
            for (int e = 0; e < col; e++)
                if (matrix[i][e] == pattern[0][0] && e < (line - pattern.length + 1) && i < (col - pattern.length + 1))
                    if (matrix[i][e + 1] == pattern[0][1])
                        if (matrix[i][e + 2] == pattern[0][2])
                            if (matrix[i + 1][e] == pattern[1][0])
                                if (matrix[i + 1][e + 1] == pattern[1][1])
                                    if (matrix[i + 1][e + 2] == pattern[1][2])
                                        if (matrix[i + 2][e] == pattern[2][0])
                                            if (matrix[i + 2][e + 1] == pattern[2][1])
                                                if (matrix[i + 2][e + 2] == pattern[2][2])
                                                    counter++;
        System.out.println("Vezes que o padrão foi encontrado: " + counter + ".");
    }
}
