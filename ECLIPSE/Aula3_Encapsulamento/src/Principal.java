
public class Principal {
	
	public static void main(String[] args) {
		/*
		Ponto pl = new Ponto();
		Circulo kekel = new Circulo();
		pl.setX(2.5f);
		pl.setY(4.2f);
		kekel.setP(pl);
		System.out.println(kekel.getP().getX() + " , " + kekel.getP().getY());
		*/
		Triangulo lele = new Triangulo(4f,3f,5f);
		lele.mostrar();
		if(lele.verificaExistencia() == true) {
			System.out.printf("Existe\n");
		}
		else {
			System.out.printf("Nao Existe!\n");
		}
		System.out.println("Perimetro: "+ lele.CalculaPerimetro());
		lele.TipoTriangulo();
	}

}
