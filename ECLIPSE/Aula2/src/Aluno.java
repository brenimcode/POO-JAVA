public class Aluno {

		private String nome;
		private int idade;
		private int nota;
		
		public Aluno(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
		
		public void mostrar()
		{
			System.out.println("Nome: " + this.getNome());
			System.out.println("Idade: " + this.getIdade());
			System.out.println("Nota: " + this.getNota());
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getNota() {
			return nota;
		}
		public void setNota(int nota) {
			this.nota = nota;
		}
		

}
