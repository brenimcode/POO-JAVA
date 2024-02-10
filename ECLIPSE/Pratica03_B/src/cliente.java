
public class cliente extends pessoa{
	private String CPF;
	private String Endereco;
	
	public cliente(String nome, String sobrenome, int idade, String rG, String lugar_de_nascimento, String cPF,
			String endereco) {
		
		super(nome, sobrenome, idade, rG, lugar_de_nascimento);
		CPF = cPF;
		Endereco = endereco;
	}
	
	
	
}
