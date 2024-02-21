package revisao_p1;
import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		ArrayList <Integer> num_par = new ArrayList<>();	
		num_par.add(2);
		num_par.add(4);
		num_par.add(6);
		num_par.remove(2);
		System.out.println(num_par);
	}

}
