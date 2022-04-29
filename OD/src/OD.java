public class OD {

    public static void main(String[] args) {
        System.out.println("bora fi");
    }

    public void InsertionSort(int [] vetor){
        int x, y;
        for(int i = 2; i < vetor.length; i++ ){
            x = vetor[i];
            y = i - 1;
            vetor[0] = x;
            while (x < vetor[y]){
                vetor[y+1] = vetor[y];
                y--;
            }
            vetor[y+1] = x;
        }
    }
}
