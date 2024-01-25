
public class Circulo {
	
	private String nome;
	private Ponto centro;
	private float raio;
	public static float PI = 3.1415f;
	
	public void mostrar() {
		System.out.println("Raio : " + raio + " Centro : " + centro.getX() + " , " + centro.getY() + " Nome: " + nome);
	}
	
	public Circulo(String nome, Ponto p, float raio) {
		setNome(nome);
		setP(p);
		setRaio(raio);
	}
	
	
	
	public float getRaio() {
		return raio;
	}


	public void setRaio(float raio) {
		if(raio < 0 ) {
			System.out.println("erro");
		}
		this.raio = raio;
	}
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Ponto getP() {
		return centro;
	}

	public void setP(Ponto p) {
		this.centro = p;
	}
	

	public void getB() {
		System.out.println(centro.getX() + ',' + centro.getY());
	}
	
	public float diametro() {
		return raio*2;
	}
	public float area() {
		return PI*raio*raio;
	}
	
	public float circuferencia() {
		return PI*2*raio;
	}
	
	
	
}
