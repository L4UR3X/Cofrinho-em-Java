package empresa;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor); // inicializa o valor usando o construtor da classe mãe
    }

    public void info() {
        // exibe o valor em dólar
        System.out.println("Dólar - Valor: " + this.valor);
    }

    public double converter(){
        // converte o valor do dólar para real (taxa fixa)
        return this.valor * 5.30;
    }

    public String nome() {
        // nome usado na listagem
        return "Dolar";
    }
}
