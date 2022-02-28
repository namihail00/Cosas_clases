package com.iescomercio.pro.ud5.hora;

public class HoraExacta extends Hora {

	private int segundos;
	
	
	public HoraExacta(int minutos, int horas, int segundos) {
		super(minutos, horas);
		this.segundos=segundos;
	}
	
	Boolean setSegundo(int segundos) {
			if (segundos >= 0 && segundos <= 59) {
				this.segundos = segundos;
				return true;
			} else
				return false;
	}
	
	//importanteeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
	// poner final (clase) para evitar que se herede
	
	@Override
	public void inc() {
		this.segundos++;
		if(this.segundos==60) {
			this.segundos=0;
			super.inc();
		}
	}
	
	

}
