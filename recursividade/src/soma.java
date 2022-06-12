public class soma {

    public static void main(String[] args) {
        int [] array = {1,3,3,10,5,2};
        int m = 0;
        int tam = array.length;
        System.out.println("soma: " + sum(array, tam));
        System.out.println("o maior elemento do array: " + maior(array, tam, m));
    }

    public static int sum(int [] array, int tam){
        if(tam == 0){
            return 0;
        }
        return array[tam - 1] + sum(array, tam -1);
    }

    public static int maior(int [] array, int tam, int m){
        if(tam == 0){
            return m;
        }

        if(array[tam-1] > m){
            m = array[tam-1];
        }
        return maior(array, tam -1, m);
    }
}
