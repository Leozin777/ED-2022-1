public class Pilha {
    //Atributos
    private int top;
    private int [] vetor;
    //construtor //métodos especiais
    public Pilha(int t){
        vetor = new int[t];
        top = -1;
    }

    //métodos //LIFO
    public boolean push(int e){ // add elementos na pilha
        if(isFull())
            return false;
        else {
            top++;
            vetor[top] = e;
            return true;
        }
    }
    public boolean pop(){ //remove elementos
        if(isEmpty()) {
            top--;
            return true;
        }
        else
            return false;
    }
    public int size(){
        return vetor.length;
    }
    public void init(){
    }
    public int top(){
        if(isEmpty())
            return vetor[top];
        else
            return -1;
    }
    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(size() == top)
            return true;
        else
            return false;

    }

}
