package letraB;

public class Main {

	public static void main(String[] args) {
		CartaoWeb[] cartoes = new CartaoWeb[2];
		cartoes[0] = new DiaDosNamorados("Kkk");
		cartoes[1] = new Natal("NATAL");
		
		 for (CartaoWeb cartao : cartoes) {
	            cartao.showMessage();
	            System.out.println(); // Adiciona uma linha em branco entre os cartões
	       }
		
	}

}
