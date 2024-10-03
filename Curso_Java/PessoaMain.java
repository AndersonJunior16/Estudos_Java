class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    long telefone;


    public Pessoa(String nomeInit, int idadeInit, String enderecoInit, long telefoneInit) {
        this.nome = nomeInit;
        this.idade = idadeInit;
        this.endereco = enderecoInit;
        this.telefone = telefoneInit;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}

public class PessoaMain {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Harry Potter", 13, "Rua dos Alfeneiros", 1345510356);

        System.out.println("Nome: " + pessoa.nome );
        System.out.println("Endereço: " + pessoa.endereco );
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Telefone: " + pessoa.telefone );


    }
}