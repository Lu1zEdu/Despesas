package Models;

import java.util.Scanner;

public abstract class Despesa {

    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }

    /*
     * cadastrarDespesa: Lê (e armazena nos respectivos atributos) a descrição e
     * inicializa
     * com zero o valorTotal
     */
    public void cadastrarDespesa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a descrição da despesa: ");
        this.descricao = leitor.nextLine();
        this.valor = 0;
    }

    // Um método abstrato é utilizado em uma classe abstrata
    // Quando a responsabilidade de codificar o método é do filho.
    public abstract void calcularDespesa();

    public abstract void listarDespesa();

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
