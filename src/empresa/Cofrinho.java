package empresa;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>(); // lista de moedas armazenadas

    public void adicionar(Moeda moeda){
        listaMoedas.add(moeda); // adiciona uma nova moeda ao cofrinho
    }

    public void remover(Moeda moeda) {

        double valorParaRemover = moeda.valor; // valor solicitado para remover
        Class<?> tipo = moeda.getClass();  // obtém o tipo da moeda (Real/Dolar/Euro)

        // percorre a lista enquanto ainda houver valor a remover
        for (int i = 0; i < listaMoedas.size() && valorParaRemover > 0; i++) {

            Moeda m = listaMoedas.get(i); // moeda corrente da lista

            // verifica se é o mesmo tipo de moeda
            if (m.getClass() == tipo) {

                if (m.valor <= valorParaRemover) {
                    // remove moeda inteira
                    valorParaRemover -= m.valor;
                    listaMoedas.remove(i);
                    i--;
                } else {
                    // desconta parte do valor dentro da mesma moeda
                    m.valor -= valorParaRemover;
                    valorParaRemover = 0;
                }
            }
        }

        // verifica se o valor total foi removido
        if (valorParaRemover == 0) {
            System.out.println("Valor removido com sucesso!");
        } else {
            System.out.println("Não há moedas suficientes para remover esse valor.");

        }
    }

    // Listagem das Moedas adicionadas
    public void listagemMoedas(){
        if (listaMoedas.isEmpty()){
            System.out.println("Cofrinho vazio!");
            return;
        }

        double totalReal = 0;
        double totalDolar = 0;
        double totalEuro = 0;

        // soma valores por tipo
        for (Moeda m : listaMoedas){
            if (m instanceof Real) totalReal += m.valor;
            else if (m instanceof Dolar) totalDolar += m.valor;
            else if (m instanceof Euro) totalEuro += m.valor;
        }

        // exibe apenas tipos que possuem valor
        if (totalReal > 0) new Real(0).info(totalReal);
        if (totalDolar > 0) new Dolar(0).info(totalDolar);
        if (totalEuro > 0) new Euro(0).info(totalEuro);

    }

    // calcula o valor total convertido para Real
    public double totalConvertido(){
        double total = 0;

        for (Moeda moeda : listaMoedas){
            total += moeda.converter();
        }
        return total;
    }
}
