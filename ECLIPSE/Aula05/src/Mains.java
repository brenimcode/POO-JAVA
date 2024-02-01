import java.util.ArrayList;
import java.util.Collections;

public class Mains {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> vetor = new ArrayList<>();
		vetor.add(1);
		vetor.add(3);
		vetor.add(2);
		 */
		
		Tempo a = new Tempo(11,17,20);
		a.mostraHorario();
		a.ajusteMinutos("Incrementa");
		a.mostraHorario();
		a.ajusteMinutos("Decrementa");
		a.mostraHorario();
		
		
	}
	

}
