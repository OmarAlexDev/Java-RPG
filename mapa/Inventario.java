package mapa;
import objetos.*;
import heroes.*;
import enemigos.*;

public class Inventario{
	
	private Objeto [] objetos;
	
	public Inventario(){
		objetos= new Objeto[15];
	}
	public void addObjeto(Objeto objeto, int index){
		objetos[index]=objeto;
	}
	public void quitarObjeto(Objeto objeto, int index){
		objetos[index] = null;
	}
	public Objeto[] getObjetos(){
		return objetos;
	}
	
	
}