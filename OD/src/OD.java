
import java.util.Scanner;
public class OD {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int op;
        int [] vector = randomVector();
        do {
            System.out.println("\n1 - Insertion Sort");
            System.out.println("2 - Bubble Sort");
            System.out.println("3 - Shell Sort");
            System.out.println("0 - Encerrar o programa");
            op = read.nextInt();

            switch (op) {
                case 1:
                    long start1 = System.currentTimeMillis();
                    insertionSort(vector);
                    printVector(vector);
                    long end1 = System.currentTimeMillis();
                    System.out.println("Tempo total de execução em milissegundos " + (end1 - start1));
                    break;

                case 2:
                    long start2 = System.currentTimeMillis();
                    bubbleSort(vector);
                    printVector(vector);
                    long end2 = System.currentTimeMillis();
                    System.out.println("Tempo total de execução em milissegundos " + (end2 - start2));
                    break;

                case 3:
                    long start3 = System.currentTimeMillis();
                    shellSort(vector);
                    printVector(vector);
                    long end3 = System.currentTimeMillis();
                    System.out.println("Tempo total de execução em milissegundos " + (end3 - start3));
                    break;

                case 0:
                    System.exit(0);
            }
        }while(op !=0);


    }

    public static void insertionSort(int [] vector){
        int x, y;
        for(int i = 2; i < vector.length; i++ ){
            x = vector[i];
            y = i - 1;
            vector[0] = x;
            while (x < vector[y]){
                vector[y+1] = vector[y];
                y--;
            }
            vector[y+1] = x;
        }
        System.out.println(vector);
    }

    public static void bubbleSort(int [] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    public static void shellSort(int[] vector) {
        int h = 1;
        int n = vector.length;

        while (h < n) {
            h = h * 3 + 1;
        }

        h = h / 3;
        int c, j;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = vector[i];
                j = i;
                while (j >= h && vector[j - h] > c) {
                    vector[j] = vector[j - h];
                    j = j - h;
                }
                vector[j] = c;
            }
            h = h / 2;
        }
    }


    public static int[] randomVector() {
        int qtd = 10000;
        System.out.println("\n---------------------------------------------------------------------------\n");
        int[]vector = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            vector[i] = (int)Math.round(Math.random() * 1000);
        }
        return vector;
    }

    public static void printVector(int [] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
    }
}
