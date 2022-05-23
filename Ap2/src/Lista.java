public class Lista {
    //descreve a lista
    Elemento inicio;
    int quantidade;
    Elemento fim;

    /*public void esvaziar() {
        inicio = null;
        quantidade = 0;
        fim = null;
    }*/

    public void addInicio(Elemento e) {
        if (inicio == null) {
            inicio = e;
            quantidade++;
            fim = e;
        }
        else {
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

    public boolean getInicio() {
        if (inicio != null) {
            inicio.show();
            return true;
        } else {
            return false;
        }
    }

    public boolean getFim() {
        if (fim != null) {
            fim.show();
            return true;
        } else {
            return false;
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

    public boolean showInvertList() {
        Elemento before = reverseList();
        if (before != null) {
            Elemento aux = before;
            while (aux != null) {
                aux.show();
                aux = aux.prox;
            }
            return true;
        } else{
            return false;
        }
    }

    public Elemento reverseList() {
        Elemento before = null;
        Elemento next;
        Elemento start = inicio;

        while (start != null) {
            next = start.prox;
            start.prox = before;
            before = start;
            start = next;
        }

        return before;
    }

    public boolean delFim() {
        if (inicio != null) {
            Elemento aux = inicio;
            Elemento pena = inicio;
            while (aux.prox != null) {
                pena = aux;
                aux = aux.prox;
            }
            if (inicio == fim) {
                inicio = null;
            }
            pena.prox = null;
            fim = pena;
            quantidade--;
            return true;
        } else {
            return false;
        }
    }

    public boolean delInicio() {
        if (inicio != null) {
            Elemento aux = inicio;
            if (inicio == fim) {
                fim = null;
            }
            inicio = aux.prox;
            quantidade--;
            return true;
        } else {
            return false;
        }
    }

    public int buscar(String b) {
        int pos = -1;
        if (inicio != null) {
            Elemento aux = inicio;
            while (aux != null) {
                pos++;
                if (aux.dado.equals(b)) {
                    return pos;
                }
                aux = aux.prox;
            }
            return -1;
        } else
            return -1;
    }

    public boolean removerVal(String v) {
        int p = buscar(v);
        return removerPos(p);
    }

    public boolean removerPos(int p) {
        if (p > quantidade)
            return false;
        else {
            if (p == -1)
                return false;
            else {
                if (p == 0)
                    return delInicio();
                else if (p == quantidade - 1)
                    return delFim();
                else {
                    Elemento aux = inicio;
                    Elemento ant = inicio;
                    for (int i = 0; i < p; i++) {
                        ant = aux;
                        aux = aux.prox;
                    }
                    ant.prox = aux.prox;
                    quantidade--;
                    return true;
                }
            }
        }
    }

    public int count(String b) {
        int c = 0;
        Elemento aux = inicio;
        do {
            if (aux.dado.equals(b))
                c++;
            aux = aux.prox;
        } while (aux.prox != null);

        if (c > 0)
            return c + 1;
        return -1;
    }

    public void removeS(String b) {
        if(inicio != null){
            Elemento aux = inicio;
            while (aux != null) {
                if (aux.dado.equals(b)) {
                    removerVal(b);
                }
                aux = aux.prox;
            }
        }
    }
}
