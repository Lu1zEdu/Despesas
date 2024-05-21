package Test;

import Models.Alimentacao;
import Models.Diaria;
import Models.Transporte;

import java.util.Scanner;

public class Principal {

    public static void exibirSubMenu() {
        System.out.println("Você deseja:" +
                "\n1 - Cadastrar despesa" +
                "\n2 - Calcular despesa" +
                "\n3 - Apresentar despesa" +
                "\n4 - Incluir despesa para analise" +
                "\n0 - voltar para o menu inicial" +
                "\nDigite a opção desejada: ");
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);

        // Instanciar um objeto do tipo Alimentacao chamado refeicoes.
        Alimentacao refeicoes = new Alimentacao();

        // Instanciar um objeto do tipo Transporte chamado veiculos.
        Transporte veiculos = new Transporte();

        // Instanciar um objeto do tipo Diaria chamado diarias.
        Diaria diarias = new Diaria();

        /*
         * Apresentar um menu com as opções:
         * 1 – Alimentação
         * 2 – Transporte
         * 3 – Diaria
         * 4 – Apresenta analise de despesas
         * 0 – Sair
         */
        int opcao = 1; // inicializar a variavel de teste da condição
        int opcaoSubMenu;
        while (opcao != 0) // opcao>0 CONDICAO
        {
            System.out.println("Sistemas de Gerenciamento de Despesas" +
                    "\n-----------------------------------------" +
                    "\nEscolha a despesa:" +
                    "\n1 – Alimentação" +
                    "\n2 – Transporte" +
                    "\n3 – Diária" +
                    "\n4 – Analise de despesas" +
                    "\n0 – Sair" +
                    "\n.: ");
            opcao = leitorNumero.nextInt(); // Precisa ocorrer a mudança do valor da variável de teste
            // switch
            switch (opcao) {
                case 1:
                    do {
                        exibirSubMenu();
                        opcaoSubMenu = leitorNumero.nextInt();
                        switch (opcaoSubMenu) {
                            case 1:
                                refeicoes.cadastrarDespesa();
                                break;
                            case 2:
                                refeicoes.calcularDespesa();
                                break;
                            case 3:
                                refeicoes.listarDespesa();
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Voltando para o menu principal ....");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    } while (opcaoSubMenu != 0);
                    break; // break do case 1 opcao
                case 2:
                    // transporte
                    do {
                        exibirSubMenu();
                        opcaoSubMenu = leitorNumero.nextInt();
                        switch (opcaoSubMenu) {
                            case 1:
                                veiculos.cadastrarDespesa();
                                break;
                            case 2:
                                veiculos.calcularDespesa();
                                break;
                            case 3:
                                veiculos.listarDespesa();
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Voltando para o menu principal ....");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    } while (opcaoSubMenu != 0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        //

    }
}