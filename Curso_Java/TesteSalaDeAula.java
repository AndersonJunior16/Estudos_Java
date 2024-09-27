class Aluno {

	 static int total_aluno = 0;

	 public Aluno() {
	 	total_aluno++;
	 }
}

public class TesteSalaDeAula{

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();

		Aluno aluno2 = new Aluno();

		Aluno aluno3 = new Aluno();

		System.out.println(Aluno.total_aluno);
	}
}