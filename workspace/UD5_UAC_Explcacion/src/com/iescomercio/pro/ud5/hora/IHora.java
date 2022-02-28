package com.iescomercio.pro.ud5.hora;

public interface IHora {

	public final int NUM_MAX_SEG= 59;
	public final int NUM_MAX_MIN= 59;
	public final int NUM_MAX_HORA= 23;


	public void inc();
	public void dec();
	
}
