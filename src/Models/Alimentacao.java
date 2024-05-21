package Models;

import java.util.Scanner;

public class Alimentacao extends Despesa {

    private String nomeRestaurante;
    private int qtdRefeicao;

    /*
     * cadastrarDespesa: Reescreve o método para ler (e armazena nos respectivos
     * atributos) a descrição e inicializa com zero o valorTotal
     */
    @Override
    public void cadastrarDespesa() {
        Scanner leitor = new Scanner(System.in);
        // descricao, valor (super classe)
        // nome restaurante, qtdrefeições (sub classe)
        super.cadastrarDespesa();
        System.out.println("Digite o nome do restaurante: ");
        this.nomeRestaurante = leitor.nextLine();
    }

    /*
     * Lê a quantidade de refeições e aplica a formula:
     * valorTotal = quantidade de refeições * 18
     */
    @Override
    public void calcularDespesa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de refeições: ");
        this.qtdRefeicao = leitor.nextInt();
        setValor(this.qtdRefeicao * 18);
    }

    // listarDespesa: Apresenta todos os atributos do objeto
    @Override
    public void listarDespesa() {
        System.out.println("Despesas de Alimentação" +
                "\n----------------------------------\n" +
                "Descrição: " + super.getDescricao() +
                "\nNome do restaurante: " + this.nomeRestaurante +
                "\nQuantidade de refeições" + this.qtdRefeicao +
                "\nValor total: " + super.getValor());
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }
}
