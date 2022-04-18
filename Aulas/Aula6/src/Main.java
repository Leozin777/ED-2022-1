public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(4);

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);

        fila.remove();

        fila.show();
    }
}
