package empresa;

import java.util.Scanner;

public class Principal {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // leitura de entrada do usuário
        Cofrinho cofre = new Cofrinho(); // instancia o cofrinho
        int opcao = 0; // controle do menu

        while (opcao != 5){
            // menu Cofrinho
            System.out.println("\n========= MENU COFRINHO =========");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Total convertido para Real");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt(); // lê a opção digitada

            switch (opcao){
                case 1:
                    // adiciona Moedas
                    System.out.println("\nEscolha a moeda:");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    System.out.print("Moeda selecionada: ");
                    int tipoMoeda = sc.nextInt(); // tipo da moeda

                    System.out.print("Digite o valor: ");
                    double valorMoeda = sc.nextDouble(); // valor da moeda

                    // verifica o tipo da moeda e adciona ao cofrinho
                    if (tipoMoeda == 1){
                        cofre.adicionar(new Dolar(valorMoeda));
                    } else if (tipoMoeda == 2) {
                        cofre.adicionar(new Euro(valorMoeda));
                    } else if (tipoMoeda == 3){
                        cofre.adicionar(new Real(valorMoeda));
                    } else {
                        System.out.println("Opção inválida!");
                    }

                    break;

                case 2:
                    // remove Moedas
                    System.out.println("\nEscolha a moeda para remover:");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    System.out.print("Moeda selecionada: ");
                    int remMoeda = sc.nextInt(); // tipo da moeda para remover

                    double valorRem;

                    // garante que o valor informado seja maior que zero
                    while(true){
                        System.out.print("Digite o valor: ");
                         valorRem = sc.nextDouble();

                         if(valorRem>0){
                             break;
                         }
                        System.out.println("Valor inválido! Digite um valor maior que zero.");

                    }

                    // Remove conforme o tipo da moeda
                    if(remMoeda == 1){
                        cofre.remover(new Dolar(valorRem));
                    } else if (remMoeda == 2){
                        cofre.remover(new Euro(valorRem));
                    } else if (remMoeda == 3){
                        cofre.remover(new Real(valorRem));
                    } else {
                        System.out.println("Opção inválida!");
                    }

                    break;

                case 3:
                    // listagem das Moedas
                    System.out.println("\nMoedas no cofrinho:");
                    cofre.listagemMoedas();
                    break;

                case 4:
                    // total Convertido
                    System.out.println("\nValor total convertido em Real:");
                    System.out.println(cofre.totalConvertido());
                    break;

                case 5:
                    // encerra o programa
                    System.out.println("Finalizando programa...");
                    break;

                    // tratamento de exceções fora do range 1 - 5
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}