import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Lista list = new Lista();
        String op;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("DIGITE UMA OPÇÃO");
            System.out.println("1. PARA ADD");
            System.out.println("2. PARA ADD FIM");
            System.out.println("3. PARA EXIBIR A LISTA");
            System.out.println("4. PARA EXIBIR LISTA INVERSA");
            op = tc.next();

            switch (op){
                case "1":{
                    System.out.println("Digite o valor");
                    int value= tc.nextInt();
                    Elemento e = new Elemento(value);
                    list.addInicio(e);
                    break;
                }
                case "2" :{
                    System.out.println("Digite um valor");
                    int value2 = tc.nextInt();
                    Elemento e1= new Elemento(value2);
                    list.addFim(e1);

                    break;
                }

                case "3":{
                    if(!list.exibir())
                        System.out.println("Lista vazia");
                    break;
                }

                case "4":{
                    if(!list.exibirReverso()){
                        System.out.println("Lista vazia");
                    }
                }
            }


        }while (op != "99");

    }
}