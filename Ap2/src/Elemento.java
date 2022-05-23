public class Elemento {
    String dado;
    Elemento prox;

    public Elemento(String value){
        dado = value;
    }

    public void show(){
        System.out.println("Valor: " + dado);
    }

}
