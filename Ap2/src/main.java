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
            System.out.println("4. PARA EXIBIR O PRIMEIRO ELEMENTO DA LISTA");
            System.out.println("5. PARA EXIBIR O ULTIMO ELEMENTO DA LISTA");
            System.out.println("6. PARA REMOVER O ULTIMO ELEMENTO DA LISTA");
            System.out.println("7. PARA REMOVER O PRIMEIRO ELEMENTO DA LISTA");
            System.out.println("8. PARA REMOVER UMA POSIÇÃO DA LISTA");
            System.out.println("9. PARA REMOVER UM VALOR DA LISTA");
            System.out.println("10. PARA PESQUISAR UM VALOR NA LISTA");
            System.out.println("11. MOSTRAR QUANTAS VEZES UM VALOR APARECE NA LISTA");
            System.out.println("12. REMOVER TODOS OS VALORES COM BASE EM UMA STRING PASSADA");
            System.out.println("13. EXIBIR A LISTA EM ORDEM INVERSA");
            System.out.println("99. PARA ENCERRAR O PROGRAMA");
            op = tc.next();

            switch (op){
                case "1":{
                    System.out.println("Digite o valor");
                    String value= tc.next();
                    Elemento e = new Elemento(value);
                    list.addInicio(e);
                    break;
                }
                case "2" :{
                    System.out.println("Digite um valor");
                    String value2 = tc.next();
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
                    if(!list.getInicio())
                        System.out.println("Lista vazia");
                    break;
                }
                case "5":{
                    if(!list.getFim())
                        System.out.println("Lista vazia");
                    break;
                }
                case "6":{
                    if(!list.delFim())
                        System.out.println("Lista vazia");
                    break;
                }
                case "7":{
                    if(!list.delInicio())
                        System.out.println("Lista vazia");
                    break;
                }
                case "8":{
                    System.out.println("Digte a posição que deseja remover");
                    int value4 = tc.nextInt();
                    System.out.println(list.removerPos(value4));
                }
                case "9":{
                    System.out.println("Digite o valor que deseja remover");
                    String value3 = tc.next();
                    System.out.println(list.removerVal(value3));
                    break;
                }
                case "10":{
                    System.out.println("Digite o elemento que deseja buscar");
                    String value2 = tc.next();
                    int pos = list.buscar(value2);
                    if(pos != -1)
                        System.out.println("O Elemento está na posição: " + pos);
                    else
                        System.out.println("O Elemento não existe :/");
                    break;
                }

                case "11":{
                    System.out.println("Digite o valor que deseja buscar");
                    String value4 = tc.next();
                    int count = list.count(value4);
                    if(count != -1)
                        System.out.println("O valor aparece " + count);
                    else
                        System.out.println("O Elemento não existe :/");
                    break;
                }

                case "12":{
                    System.out.println("Digite o valor que deseja remover:");
                    String value5 = tc.next();
                    list.removeS(value5);
                    break;
                }

                case "13":{
                    if(!list.showInvertList())
                        System.out.println("Lista vazia");
                    break;
                }

                case "99":{
                    System.exit(0);
                }
            }


        }while (op != "99");

    }
}
