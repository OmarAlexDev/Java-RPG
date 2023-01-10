package objetos;
import heroes.*;
import enemigos.*;
import mapa.*;

public class Objeto{
	
	private String descripcion;
	private int cantidadGas, cantidadVida, potenciadorAtaque;
		
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setDescripcion( String descripcion){
		this.descripcion = descripcion;
	}
	
	public Objeto(String descripcion){
		this.descripcion=descripcion;
	}
	
	public int getCantidadGas(){
		return cantidadGas;
	}
	public int getCantidadVida(){
		return cantidadVida;
	}
	
	public int getPotenciadorAtaque(){
		return potenciadorAtaque;
	}
}