package empresa;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor); // inicializa o valor usando o construtor da classe mãe
    }

    public void info() {
        // exibe o valor em real
        System.out.println("Real - Valor: " + this.valor);
    }

    public double converter() {
        // converte o valor em real
        return this.valor;
    }

    public String nome() {
        // nome usado na listagem
        return "Real";
    }
}
