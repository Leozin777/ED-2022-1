public class Sp {

    private int topo;
    private int [] vetor;

    public Sp(){
        vetor = new int[10];
        topo = 0;
    }

    public void init (Sp p){
        p.topo = -1;
    }

    public void push(Sp p, int valor){
        p.topo++;
        p.vetor[p.topo] = valor;
    }

    public int pop(Sp p){
        return p.vetor[p.topo--];
    }

    public void exibir(Sp p){
        System.out.println(p.vetor[p.topo]);
    }



    public static void main(String[] args) {
        Sp pilha = new Sp();
        pilha.init(pilha);
        pilha.push(pilha, 4);
        pilha.push(pilha, 2);
        pilha.push(pilha, 5);
        pilha.push(pilha, 6);
        pilha.push(pilha, 7);
        pilha.pop(pilha);
        pilha.exibir(pilha);
    }



}
