
public class ContaBancaria {
	private String cpf;
	private int nro_conta;
	private float saldo;
	
	public ContaBancaria(String cpf, int nro_conta) {
		this.cpf = cpf;
		this.nro_conta = nro_conta;
		this.saldo = 0;
	}
	
	public void saque(float valor) {
		if(valor <=saldo) {
			this.saldo -= valor;
		}
	}
	public void deposito(float valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNro_conta() {
		return nro_conta;
	}
	public void setNro_conta(int nro_conta) {
		this.nro_conta = nro_conta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
