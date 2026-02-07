package empresa;

public abstract class Moeda {

    double valor; // valor da moeda armazenado

    public Moeda(double valor) {
        this.valor = valor; // inicializa o valor da moeda
    }

    public void info(double totalTipo){
        // exibe o nome da moeda e o total correspondente
        System.out.println(nome() + " - " + totalTipo);
    }

    public abstract String nome(); // retorna o nome da moeda (implementação nas subclasses)

    public abstract double converter(); // converte o valor para Real (implementado nas subclasses)
}
