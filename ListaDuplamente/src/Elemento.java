public class Elemento {
    int dado;
    Elemento prox;
    Elemento ant;

    public Elemento(int value){
        dado = value;
    }

    public void show(){
        System.out.println("Valor: " + dado);
    }

}