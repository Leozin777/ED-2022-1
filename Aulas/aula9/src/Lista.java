public class Lista {
    //descreve a lista
    Elemento inicio;
    int quantidade;
    Elemento fim;

    public void esvaziar(){
        inicio = null;
        quantidade = 0;
        fim = null;
    }

    public void addInicio(Elemento e) {
        if (inicio == null) {
            inicio = e;
            quantidade++;
            fim = e;
        } else {
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
            fim.prox = e;
            fim = e;
            quantidade++;
        }
    }

    public void showFullList(){
        if (inicio == null){
            System.out.println("Lista vazia");
        }else{
            for (int i = 0; i < quantidade; i++){
                System.out.println(this.inicio.prox);

            }
        }
    }
}
