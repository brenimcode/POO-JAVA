
public class Tempo {
	private int hora;
	private int minuto;
	private int segundos;

	public Tempo(int hora, int minuto, int segundos) {
		if(hora < 0 || hora >60)
			this.hora = 0;
		else 
			this.hora = hora;
		
		if(minuto < 0 || minuto >60)
			this.minuto = 0;
		else
			this.minuto = minuto;
		
		if(segundos < 0 || segundos >60)
			this.segundos = 0;
		else 
			this.segundos = segundos;
	}
	
	public Tempo(int hora, int minuto) {
		if(hora < 0 || hora >60)
			this.hora = 0;
		else 
			this.hora = hora;
		if(minuto < 0 || minuto >60)
			this.minuto = minuto;
		else
			this.minuto = 0;
	
		this.segundos = 0;
	}
	
	public Tempo(int hora) {
		if(hora < 0 || hora >60)
			this.hora = 0;
		else {
			this.hora = hora;
		}
		this.minuto = 0;
		this.segundos = 0;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void mostraHorario() {
		System.out.printf("%d:%d:%d\n",hora,minuto,segundos);
	}
	
	public void ajusteMinutos(String i) {
		if(i.equals("Decrementa")) {
			if(this.minuto == 0) {
				minuto = 59;
				hora--;
			}
			else {
				minuto--;
			}
		}
		else {
			if(this.minuto == 59) {
				minuto = 0;
				hora +=1;
			}
			else {
				minuto++;
			}
		}
	}
}
