public class programa {
    public static void main(String[] args) {

        int[][] matrizOriginal = {
                {0,0,1,0,0,0,0,1,0},
                {0,1,1,1,1,1,1,0,0},
                {0,0,1,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,0,1,0,0},
                {0,0,0,0,0,1,0,0,0},
                {1,1,1,0,1,0,1,0,0},
                {1,0,1,0,0,0,0,0,0},
                {1,1,1,0,0,1,1,1,0}
        };

        int[][] matrizTeste = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };

        int linha = 100;
        int coluna = 100;



        int[][] matrizAle = criaMatriz(linha, coluna);
        printMatriz(matrizAle, linha, coluna); //altere a "matrizAle" para "matrizOriginal" para testar aquela matriz
        printMatriz(matrizTeste, 3, 3); //altere a "matrizAle" para "matrizOriginal" para testar aquela matriz

        double endTime = System.nanoTime();
        buscaPadrao(matrizAle, matrizTeste, linha, coluna);
        double startTime = System.nanoTime();

        System.out.println("Duracao: " + Math.abs((endTime - startTime)/1000000) + " milisegundos");
    }

    public static int[][] criaMatriz(int linha, int coluna) {
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
