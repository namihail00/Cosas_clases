package com.iescomercio.prog.ud4.ej7.maquinaria;

public class Vagon {

	private Integer id;
	private Double cargaMax;
	private Double cargaActual;
	private String tipoMercancia;
	
	
	

	public Vagon(Integer id, Double cargaMax, String tipoMercancia) {
		super();
		this.id = id;
		this.cargaMax = cargaMax;		
		this.tipoMercancia = tipoMercancia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getCargaMax() {
		return cargaMax;
	}

	public Double getCargaActual() {

		return cargaActual;
	}

	public void setCargaActual(Double cargaActual) {
		if (cargaActual < this.cargaMax) {
			this.cargaActual = cargaActual;
		}

	}

	public String getTipoMercancia() {
		return tipoMercancia;
	}

	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}

}
