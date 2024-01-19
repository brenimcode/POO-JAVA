import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		System.out.println("KKKKKKKKKKKKKK");
		int vet[][] = {{10,9,8,12},{3,4,5,6}};
		int i,j,maior = vet[0][0];
		Arrays.sort(vet[0]);
		Arrays.sort(vet[1]);
		for(i = 0;i < 2 ; i++) {
			for(j = 0;j < 4; j++) {
				if(maior < vet[i][j])
					maior = vet[i][j];
			}	
		}

		System.out.printf("[%d]\n", maior);
		
	}

}
