package Models;

import java.util.Scanner;

public class Diaria extends Despesa {

    private double qtdDiaria;

    /*
     * calcularDespesa: Reescreve o método para que leia a quantidade de diárias
     * utilizadas (armazena no atributo qtdeDiarias) e aplica a formula:
     * valorTotal = qtdeDiarias * 50
     */
    @Override
    public void calcularDespesa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de diárias: ");
        this.qtdDiaria = leitor.nextDouble();
        setValor(this.qtdDiaria * 50);
    }

    // listarDespesa: Apresenta todos os atributos do objeto
    @Override
    public void listarDespesa() {
        System.out.println("Despesas de Diária" +
                "\n----------------------------------\n" +
                "Descrição: " + super.getDescricao() +
                "\nQuantidade de diárias: " + this.qtdDiaria +
                "\nValor total: " + super.getValor());
    }

    public double getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }
}
