
public class Principio2 {
	
	public static void main(String[] args) {
		/*
		 * EXERCICIO 2
		 */
		Ponto pl = new Ponto();
		pl.setX(1f);
		pl.setY(1f);
		Ponto p2 = new Ponto();
		p2.setX(0f);
		p2.setY(0f);
		System.out.println("AI: " +  p2.dist(pl, p2));
		
		/*
		 * EXERCICIO 3
		 */
		System.out.println("EXERCICIO 3: ");
		Ponto doCirc = new Ponto();
		doCirc.setX(1f);
		doCirc.setY(1f);
		Circulo KK = new Circulo("Circulo lel",doCirc,3f);
		KK.mostrar();
		float area = KK.area();
		float circ = KK.circuferencia();
		float di = KK.diametro();
		
		System.out.println("Area " + area + " circ " + circ + " diametro : " + di);
	}

}
