package entidades;

public class Roupa {

    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;


    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public void decrementa(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("Não é possível remover mais do que o disponível no estoque!");
        } else {
            this.quantidade -= quantidade;
        }
    }

    public void incrementa(int quantidade) {
        this.quantidade += quantidade;
    }


    public double valorTotal() {
        return quantidade * valor;
    }


    @Override
    public String toString() {
        return "Roupa [marca=" + marca +
                "\n, tipo=" + tipo +
                "\n, tamanho=" + tamanho +
                "\n, quantidade=" + quantidade +
                "\n, valor=" + valor +
                "\n, valor total: R$" + valorTotal() + "]";
    }
}
