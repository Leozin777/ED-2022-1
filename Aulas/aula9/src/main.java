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
                    numeros.showFullList();
                    break;
                }
                case 3:{

                    break;
                }
                case 4:{

                    break;
                }
                case 5:{

                    break;
                }
            }


        }while (op != 99);

    }
}
