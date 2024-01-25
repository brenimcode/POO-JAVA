
public class Triangulo {
		private float lado1;
		private float lado2;
		private float lado3;
		
		
		
		public Triangulo(float lado1, float lado2, float lado3) {
			
			setLado1(lado1);
			setLado2(lado2);
			setLado3(lado3);
		}
		
		public void mostrar() {
			System.out.printf("Lado1 = [%.2f]\nLado2 = [%.2f]\nLado3 = [%.2f]\n",getLado1(),getLado2(),getLado3());
		}
		
		public float getLado1() {
			return lado1;
		}
		public void setLado1(float lado1) {
			if(lado1 <= 0) {
				this.lado1 = 1;
			}
			this.lado1 = lado1;
		}
		public float getLado2() {
			return lado2;
		}
		public void setLado2(float lado2) {
			if(lado2 <= 0) {
				this.lado2 = 1;
			}
			this.lado2 = lado2;
		}
		public float getLado3() {
			return lado3;
		}
		public void setLado3(float lado3) {
			if(lado3 <= 0) {
				this.lado3 = 1;
			}
			this.lado3 = lado3;
		}
		
		public boolean verificaExistencia() {
			if(lado1 < lado2 + lado3 && lado2 < lado1+lado3 && lado3 < lado1+lado2) {
				return true;
			}
			else {
				return false;
			}
				
		}
		
		public float CalculaPerimetro() {
			return lado1+lado2+lado3;
		}
		
		public void TipoTriangulo() {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Equilatero");
			}
			else if(lado1 != lado2 && lado2 != lado3) {
				System.out.println("Escaleno");
			}
			else {
				System.out.println("Isosceles");
			}
		}
		
}
