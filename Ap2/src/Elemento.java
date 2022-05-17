public class Elemento {
    int dado;
    Elemento prox;

    public Elemento(int value){
        dado = value;
    }

    public void show(){
        System.out.println("Valor: " + dado);
    }

}
