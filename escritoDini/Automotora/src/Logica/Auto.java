package Logica;

public class Auto extends Vehiculo{
	
	private int cilindrada;
	
	public Auto(){
		
	}
public Auto(int cilindrada,String matricula,String marca,double precio) {
	super(matricula,marca,precio);
	this.cilindrada=cilindrada;
	
}
public int getCilindrada() {
	return cilindrada;
}
public void setCilindrada(int cilindrada) {
	this.cilindrada = cilindrada;
}
@Override
public String toString() {
	return "Auto [cilindrada=" + cilindrada + "]";
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
