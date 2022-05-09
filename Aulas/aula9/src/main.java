import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Lista numeros = new Lista();
        int op;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("DIGITE UMA OPÇÃO");
            System.out.println("1. PARA ADD");
            System.out.println("2. PARA ADD FIM");
            System.out.println("3. PARA EXIBIR A LISTA");
            System.out.println("4. PARA EXIBIR O PRIMEIRO ELEMENTO DA LISTA");
            System.out.println("5. PARA EXIBIR O ULTIMO ELEMENTO DA LISTA");
            System.out.println("6. PARA REMOVER O ULTIMO ELEMENTO DA LISTA");
            System.out.println("6. PARA REMOVER O ULTIMO ELEMENTO DA LISTA");
            System.out.println("7. PARA REMOVER O PRIMEIRO ELEMENTO DA LISTA");
            System.out.println("8. PARA REMOVER UMA POSIÇÃO DA LISTA");
            System.out.println("9. PARA REMOVER UM VALOR DA LISTA");
            System.out.println("10. PARA PESQUISAR UM ELEMENTO NA LISTA");
            System.out.println("99. PARA ENCERRAR O PROGRAMA");
            op = tc.nextInt();

            switch (op){
                case 1:{
                    System.out.println("Digite o valor");
                    int value= tc.nextInt();
                    Elemento e= new Elemento(value);
                    numeros.addInicio(e);
                    break;
                }
                case 2:{
                    System.out.println("Digite um valor");
                    int value2 = tc.nextInt();
                    Elemento e1= new Elemento(value2);
                    numeros.addFim(e1);

                    break;
                }
                case 3:{
                    if(!numeros.exibir())
                        System.out.println("Lista vazia");
                    break;
                }
                case 4:{
                    if(!numeros.getInicio())
                        System.out.println("Lista vazia");
                    break;
                }
                case 5:{
                    if(!numeros.getFim())
                        System.out.println("Lista vazia");
                    break;
                }
                case 6:{
                    if(!numeros.delFim())
                        System.out.println("Lista vazia");
                    break;
                }
                case 7:{
                    if(!numeros.delInicio())
                        System.out.println("Lista vazia");
                }
            }


        }while (op != 99);

    }
}
