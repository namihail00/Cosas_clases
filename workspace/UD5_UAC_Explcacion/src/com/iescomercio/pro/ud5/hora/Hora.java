package com.iescomercio.pro.ud5.hora;

public class Hora implements IHora {

	private int minutos;
	private int horas;

	public Hora(int minutos, int horas) {

		this.minutos = minutos;
		this.horas = horas;
	}

	public void inc() {

		if ((this.horas <= 23 && this.horas >= 0) && (this.minutos >= 0 && this.minutos <= 59)) {

			if (this.minutos == 59) {
				minutos = 00;
				if (this.horas == 23) {
					this.horas = 00;
				} else
					this.horas++;
			} else
				this.horas++;

		} else {
			System.err.println("no");
		}
	}

	Boolean setMinutos(int minutos) {
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
			return true;
		} else
			return false;

	}

	Boolean setHora(int horas) {
		if (horas >= 0 && horas <= 23) {
			this.horas = horas;
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return horas+":"+minutos;
	}

	@Override
	public void dec() {
		
		
	}
	
	
}
