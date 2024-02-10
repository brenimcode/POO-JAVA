
public class fornecedor extends pessoa{
	private String EnderecoEmpresa;
	private String CNPJ;
	
	public fornecedor(String nome, String sobrenome, int idade, String rG, String lugar_de_nascimento,
			String enderecoEmpresa, String cNPJ) {
		super(nome, sobrenome, idade, rG, lugar_de_nascimento);
		EnderecoEmpresa = enderecoEmpresa;
		CNPJ = cNPJ;
	}
	
	
}
