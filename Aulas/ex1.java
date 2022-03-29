public class ex1 {

    public static void main(String[] args) {

        int [] vetor = new int [10]; //inicializando um vetor
        int qtd = 0;


        qtd=add(vetor, qtd, 8);
        qtd=add(vetor, qtd, 9);
        qtd=add(vetor, qtd, 10);

        qtd=addInicio(vetor,qtd,7);

        qtd=delI(qtd, vetor);

        get(0, qtd, vetor);
        get(10, qtd, vetor);
        get(-1, qtd, vetor);

        mostraVetor(vetor, qtd);
    }

    public static void get (int p, int qtd, int v[]){
        if(p >= qtd || p < 0){
            System.out.println("erro");
        }else{
            System.out.println(v[p]);
        }
    }

    public static int delI(int qtd, int v[]){
        if (qtd > 0){
            for(int i = 0; i < qtd; i++){
                v[i] = v[i+1];
            }
            qtd--;
        } else{
            System.out.println("inválido");
        }
        return qtd;
    }

    public static int delEnd(int qtd){
       if (qtd > 0){
           qtd--;
       } else{
           System.out.println("inválido");
       }
       return qtd;
    }

    public static int addInicio(int v[], int qtd, int valor){
        if(qtd <= v.length){
            for(int i = qtd; i > 0; i--){
                v[i] = v[i-1];
            }
            v[0] = valor;
            qtd++;
        }else{
            System.out.println("vetor cheio");
        }
        return qtd;
    }

    public static int add(int v[], int qtd, int valor){
        if (qtd <= v.length){
            v[qtd] = valor;
            qtd++;
        } else{
            System.out.println("vetor cheio");
        }

        return qtd;
    }

    public static void mostraVetor(int v[], int t){
        if(t>0) {
            for (int i = 0; i < t; i++) {
                System.out.println(v[i]);
            }
        } else{
            System.out.println("vetor vazio");
        }
    }
}
