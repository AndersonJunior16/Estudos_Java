package exercicio.dados;

public class Produto {
    private String nome;
    private double preco;
    private int qtdestoque;
    
    public Produto (String nomeInit, double precoInit, int qtdestoqueInit) {
        nome = nomeInit;
        preco = precoInit;
        qtdestoque = qtdestoqueInit;
        
    }
    
    public String printinfo() {
        return "O nome do produto é " + nome + ", a quantidade em estoque é de " + qtdestoque + " e o valor unitario é de R$" + preco;
    }
}