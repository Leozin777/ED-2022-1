
import java.util.Scanner;
public class OD {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int op;
        int [] vector = randomVector();
        do {
            System.out.println("1 - Insertion Sort");
            System.out.println("2 - Bubble Sort");
            System.out.println("3 - Shell Sort");
            System.out.println("0 - Encerrar o programa");
            op = read.nextInt();

            switch (op) {
                case 1:
                    insertionSort(vector);
                    printVector(vector);
                    exeTime();
                    break;

                case 2:
                    bubbleSort(vector);
                    printVector(vector);
                    exeTime();
                    break;

                case 3:
                    shellSort(vector);
                    printVector(vector);
                    exeTime();
                    break;
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

    public static void exeTime(){
        double endTime = System.nanoTime();
        double startTime = System.nanoTime();
        double runTime = Math.abs((endTime - startTime) / 1000000000);
        System.out.printf("\nDuração da execução do vetor: %.2f", runTime);
    }
}
