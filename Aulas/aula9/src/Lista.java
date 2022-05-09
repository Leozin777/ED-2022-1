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

    public void add(Elemento e){
        if(inicio == null){
            inicio = e;
            quantidade++;
            fim = e;
        } else{
            inicio.prox = e;
            quantidade++;
        }
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
        Elemento aux = inicio;
        if (inicio == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println(inicio);
        }
    }

    public boolean getInicio(){
        if(inicio != null){
            inicio.show();
            return true;
        }else{
            return false;
        }
    }
    public boolean getFim(){
        if(fim != null){
            fim.show();
            return true;
        }else{
            return false;
        }
    }

    public boolean exibir(){
        if(inicio != null){
            Elemento aux = inicio;
            while(aux != null){
                aux.show();
                aux = aux.prox;
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean delFim(){
        if(inicio != null){
            Elemento aux = inicio;
            Elemento pena = inicio;
            while(aux.prox != null){
                pena = aux;
                aux = aux.prox;
            }
            if(inicio == fim){
                inicio = null;
            }
            pena.prox = null;
            fim=pena;
            quantidade--;
            return true;
        }else{
            return false;
        }
    }

    public boolean delInicio(){
        if(inicio != null){
            Elemento aux = inicio;
            if(inicio == fim){
                fim = null;
            }
            inicio = aux.prox;
            quantidade--;
            return true;
        }else{
            return false;
        }
    }



}
