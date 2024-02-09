
public class ContaEspecial extends ContaBancaria {
	private float limite;

	public ContaEspecial(String cpf, int nro_conta, float limite) {
		super(cpf, nro_conta);
		this.limite = limite;
		
	}
	public void sacar(float val) {
		if(getSaldo()-val >= limite) {
			setSaldo(getSaldo()-val);
		}
	}
}
