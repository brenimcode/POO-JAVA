
public class pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private String RG;
	private String lugar_de_nascimento;
	
	public pessoa(String nome, String sobrenome, int idade, String rG, String lugar_de_nascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		RG = rG;
		this.lugar_de_nascimento = lugar_de_nascimento;
	}
	
	public void infoPessoal() {
		System.out.printf("[%s] - [%s] - [%d] - [%s] - [%s]\n",nome,sobrenome,idade,RG,lugar_de_nascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getLugar_de_nascimento() {
		return lugar_de_nascimento;
	}

	public void setLugar_de_nascimento(String lugar_de_nascimento) {
		this.lugar_de_nascimento = lugar_de_nascimento;
	}
	
	
	
}
