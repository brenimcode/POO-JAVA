public class Principal {
	public static void main(String[] args) {
		ContaPoupanca contas1[] = new ContaPoupanca[5];
		ContaEspecial contas2[] = new ContaEspecial[5];
		for(int i=0;i<5;i++) {
			 contas1[i] = new ContaPoupanca("192", 1823891);
		}
		for(int i=0;i<5;i++) {
			System.out.printf("[%s], [%d]\n",contas1[i].getCpf(),contas1[i].getNro_conta());
			
		}
		for(int i=0;i<5;i++) {
			 contas1[i] = new ContaPoupanca("2", 35);
		}
		for(int i=0;i<5;i++) {
			System.out.printf("[%s], [%d]\n",contas1[i].getCpf(),contas1[i].getNro_conta());
			
		}
	}
}
