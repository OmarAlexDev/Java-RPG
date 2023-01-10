package mapa;
import heroes.*;
import objetos.*;
import enemigos.*;

public class Mapa{

		private Casilla[] casillas;
		private Inventario bag= new Inventario();
		
		public Mapa(){
			casillas = new Casilla[20];
		}
		
		public void addCasilla(Casilla c, int index){
			casillas[index]=c;
		}
		
		public Casilla[] getCasillas(){
			return casillas;
		}
		
		public Inventario getInventario(){
			return bag;
		} 
		public void setInventario(Inventario inventario){
			this.bag= bag;
		}
		
} 

