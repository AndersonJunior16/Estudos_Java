class Personagem{
    String nome;
    int nivelPoder;

    public Personagem(String nomeInit, int nivelPoderInit){
        this.nome = nomeInit;
        this.nivelPoder = nivelPoderInit;
    }

    //metodo que não funciona
    public void tentarAumentarNivelDePoder(int nivelPoder){
        nivelPoder += 1000;
    }

    //metodo que funciona
    public void aumentarNivelDePoder(){
        this.nivelPoder += 1000;
    }

    public void mudarNome(Personagem personagem) {
        personagem.nome = "Vegeta";
    }

}

public class PesonagemMain {

    public static void main(String[] args) {

        Personagem personagem = new Personagem("Goku", 8000);

        System.out.println("O poder de " + personagem.nome + " é mais de " + personagem.nivelPoder);

        personagem.mudarNome(personagem);
        //metodo que não funciona
        personagem.tentarAumentarNivelDePoder(personagem.nivelPoder);
        //metodo que funciona
        personagem.aumentarNivelDePoder();

        System.out.println("\nAGORA!!\n");

        System.out.println(personagem.nome + " tem mais de " + personagem.nivelPoder);

    }
}