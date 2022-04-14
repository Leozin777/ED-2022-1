public class Fila {
    //atributos

    int last;
    int [] vetor;

    public Fila(int tam){
        vetor = new int[tam];
        last = -1;
    }

    //métodos
    public void add(int e){

    };
    public void remove(int e){

    };
    public void show(int tam){

        for (int i = 0; i < tam; i++){
            System.out.print(vetor[i] + ", ");
        }
    };
    void init(){};
}
