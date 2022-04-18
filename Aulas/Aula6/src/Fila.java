public class Fila {
    //atributos

    int inicio;
    int fim;
    int [] vetor;
    int pos = 0;

    public Fila(int tam){
        vetor = new int[tam];
        fim = -1;
        inicio = 0;
    }

    //métodos
    public void add(int e){
       fim++;
       vetor[fim] = e;
    };
    public void remove(){
        vetor[inicio] =
    };
    public void show(){

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + ", ");
        }
    };
    void init(){};
}
