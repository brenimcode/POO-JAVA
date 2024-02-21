package revisao_p1;

public abstract class veiculo {
	private String placa;
	private double velocidade_max;
	private int capacidade;
	
	public void buzina() {
		System.out.println("Paaaa");
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getVelocidade_max() {
		return velocidade_max;
	}
	public void setVelocidade_max(double velocidade_max) {
		this.velocidade_max = velocidade_max;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public veiculo(String placa, double velocidade_max, int capacidade) {
		this.placa = placa;
		this.velocidade_max = velocidade_max;
		this.capacidade = capacidade;
	}
	
	
}
