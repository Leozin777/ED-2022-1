public class soma {

    public static void main(String[] args) {
        int [] array = {5, 10, 15};
        int soma = 0;
        int tam = 3;
        ad(array, tam);
    }
    public static int ad(int array[], int tam){
        if(tam == 0){
            return 0;
        }
        return array[tam - 1]
    }
}
