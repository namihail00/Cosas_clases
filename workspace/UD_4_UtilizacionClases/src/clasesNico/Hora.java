package clasesNico;

public class Hora {

	private int horas;
	private int minutos;
	private int segundos;

	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public void mostrarHora() {
		System.out.println(this.horas + ":" + this.minutos + ":" + this.segundos);
	}

	public void incrementarSegundos(int incremento) {
		this.segundos = this.segundos + incremento;
		this.ajustarHora();

	}

	public void incrementarMinutos(int incremento) {
		this.minutos = this.minutos + incremento;
		this.ajustarHora();
	}

	private void ajustarHora() {
		if (this.segundos >= 60) {
			int restoMin = this.segundos % 60;
			int minutos = this.segundos / 60;

			this.minutos = this.minutos + minutos;
			this.segundos = this.segundos + restoMin;
		}
		if (this.minutos >= 60) {
			int restoHora = this.minutos % 60;
			int horas = this.minutos / 60;

			this.horas = this.horas + horas;
			this.minutos = this.minutos + restoHora;
		}

	}

	public boolean esAnterior(Hora hora) {

		if (this.horas < hora.horas) {
			return true;
		}
		if (this.horas > hora.horas) {
			return false;
		} else if (this.minutos < hora.minutos) {
			return true;
		} else if (this.minutos > hora.minutos) {
			return false;
		} else if (this.horas > hora.horas) {
			return false;
		} else if (this.segundos < hora.segundos) {
			return true;
		} else
			return false;

	}
	
//	private int segundos(Hora hora) {				
//		return (hora.horas * 60) + (hora.minutos * 60) + hora.segundos;
//	}
//  MIRAR DESPUÉS MAL??------------------------------------------------------------------------------------------

	public int devolverSegundosHora(Hora hora) {
		int segH1 = (this.horas * 60) + (this.minutos * 60) + this.segundos;
		int segH2 = (hora.horas * 60) - (hora.minutos * 60) + hora.segundos;

		if (segH1 > segH2) {
			return segH1 - segH2;
		} else
			return segH2 - segH1;

	}
}
