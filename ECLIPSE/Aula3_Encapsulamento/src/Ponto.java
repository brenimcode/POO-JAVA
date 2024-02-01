import java.lang.Math;

public class Ponto {
		private float x;
		private float y;
		
		
		
		
		public Ponto(float x, float y) {
			this.x = x;
			this.y = y;
		}
		public Ponto() {
			this.x = 0;
			this.y = 0;
		}
		 
		
		
		public float getX() {
			return x;
		}
		public void setX(float x) {
			if(x < 0 )
				System.out.printf("Erro\n");
			this.x = x;
		}
		
		public float getY() {
			return y;
		}
		
		public void setY(float y) {
			if(y < 0 ) 
				System.out.printf("Erro\n");
			this.y = y;
		}
		
		public double dist(Ponto a, Ponto b) {
			return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
		}
		

}
