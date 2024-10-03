class Livro {
	public String titulo;
	private String autor;
	protected int anoPublicacao;
	float preco;

	public Livro(){
		this.titulo = "Desconhecido";
		this.autor = "Desconhecido";
		this.anoPublicacao = 0;
		this.preco = 0.0f;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public Livro(String tituloInit, String autorInit, int anoPublicacaoInit) {
		titulo = tituloInit;
		autor = autorInit;
		anoPublicacao = anoPublicacaoInit;
	}

}

public class AplicacaoLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro();
		System.out.println("LIVRO 1 \n");
		System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());
        System.out.println("Preço: " + livro1.preco);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas","Machado de Assis", 1881);
		System.out.println("LIVRO 2 \n");
		System.out.println("Título: " + livro2.titulo);
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano de Publicação: " + livro2.anoPublicacao);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
	}
} 