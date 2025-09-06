package Clases;

public class Numero {	
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	private double numero;

	public Numero(double numero) {
		super();
		this.numero = numero;
	}
	public double Potenciar() {
		return numero*numero;
	}
}
