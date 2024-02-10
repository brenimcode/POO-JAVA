
public class ContaPoupanca extends ContaBancaria{
	private static float taxa_rendimento_mensal;
	
	public ContaPoupanca(String cpf, int nro_conta) {
		super(cpf, nro_conta);
		taxa_rendimento_mensal = 1.10f;
	}
	
	public void CalcularNovoSaldo() {
		setSaldo(getSaldo() * taxa_rendimento_mensal);
	}
}
