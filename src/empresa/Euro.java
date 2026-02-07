package empresa;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor); // inicializa o valor usando o construtor da classe mãe
    }

    public void info() {
        // exibe o valor em euro
        System.out.println("Euro - Valor: " + this.valor);
    }

    public double converter() {
        // converte o valor do euro para real (taxa fixa)
        return this.valor * 6.20;
    }

    public String nome() {
        // nome usado na listagem
        return "Euro";
    }
}
