public class Lista {
    Elemento inicio;
    int quantidade;
    Elemento fim;

       public void addInicio(Elemento e) {
           if (inicio == null) {
               inicio = e;
               quantidade++;
               fim = e;
           } else {
               inicio.ant = e;
               e.prox = inicio;
               inicio = e;
               quantidade++;
           }
       }
       public void addFim(Elemento e) {
           if (inicio == null) {
               inicio = e;
               quantidade++;
               fim = e;
           } else {
               e.ant = e;
               fim.prox = e;
               fim = e;
               quantidade++;
           }
       }

    public boolean exibir() {
        if (inicio != null ) {
            Elemento aux = inicio;
            while (aux != null) {
                aux.show();
                aux = aux.prox;
            }
            return true;
        }
        else {
            return false;
        }
    }

    public boolean exibirReverso() {
        if (fim != null ) {
            Elemento aux = fim;
            while (aux != null) {
                aux.show();
                aux = aux.prox;
            }
            return true;
        }
        else {
            return false;
        }
    }
}
