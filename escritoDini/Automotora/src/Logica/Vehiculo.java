package Logica;

public class Vehiculo {

	private String matricula;
	private String marca;
	private double precio;
	
	public Vehiculo() {
		
	}
	public Vehiculo(String matricula,String marca,double precio) {
		this.matricula=matricula;
		this.marca=marca;
		this.precio=precio;
		
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculos [matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
