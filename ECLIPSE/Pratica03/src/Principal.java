
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaPoupanca contas1[] = new ContaPoupanca[5];
		ContaEspecial contas2[] = new ContaEspecial[5];
		for(int i=0;i<5;i++) {
			contas1[i] = new ContaPoupanca("Sa", 2);
		}
		for(int i=0;i<5;i++) {
			System.out.printf("[s], [%d]\n",contas1[i].getCpf(),contas1[i].getNro_conta());
			
		}
	}
}
