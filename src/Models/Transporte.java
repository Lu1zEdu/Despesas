package Models;

import java.util.Scanner;

public class Transporte extends Despesa {
    private double kmPercorrida;
    private double pedagios;

    /*
     * calcularDespesa: Reescreve o método para que leia a quilometragem percorrida
     * (armazena no atributo kmPercorrida), leia o valor gasto com pedagios
     * (armazena
     * no atributo valorPedagios ) e aplica a formula:
     * valorTotal = (quilometragem percorrida * 3) + valor dos pedagios
     */
    @Override
    public void calcularDespesa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quilometragem percorrida: ");
        this.kmPercorrida = leitor.nextDouble();
        System.out.println("Digite o valor pago em pedágios: ");
        this.pedagios = leitor.nextDouble();
        setValor((this.kmPercorrida * 3) + this.pedagios);
    }

    // listarDespesa: Apresenta todos os atributos do objeto
    @Override
    public void listarDespesa() {
        System.out.println("Despesas de Transporte" +
                "\n----------------------------------\n" +
                "Descrição: " + super.getDescricao() +
                "\nQuilometragem percorrida: " + this.kmPercorrida +
                "\nPedágios: " + this.pedagios +
                "\nValor total: " + super.getValor());
    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getPedagios() {
        return pedagios;
    }

    public void setPedagios(double pedagios) {
        this.pedagios = pedagios;
    }
}
