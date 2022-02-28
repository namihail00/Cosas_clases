package com.iescomercio.prog.ud4.ej7.maquinaria;

import java.util.ArrayList;

import com.iescomercio.prog.ud4.ej7.personal.Maquinista;

public class Tren {

	private Locomotora locomotora;
	private ArrayList<Vagon> vagones;
	private Maquinista maquinista;

	public void aniadirVagon(Integer id, Double cargaMax, String tipoMercancia) {
		Vagon v = new Vagon(id, cargaMax, tipoMercancia);
		if (this.vagones.size() < 5) {
			this.vagones.add(v);
		}
	}

}
