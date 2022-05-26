package Entidades;

import java.util.Date;

public class Contratos {
	
	private Date data;
	private double valorHora;
	private Integer hora;
	
	public Contratos() {	
	}

	public Contratos(Date contratoData, double valorHora, Integer hora) {
		this.data = contratoData;
		this.valorHora = valorHora;
		this.hora = hora;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}
	
	public double valorTotal() {
		return valorHora * hora;
	}

	
	

	
	
}
