package mapa;
import heroes.*;
import enemigos.*;
import objetos.*;

public class Casilla{
	
	private int index;
		private Objeto objeto;
		private Enemigo enemigo;
		
		public int getIndex(){
			return index;
		}
		
		public void setIndex(int index){
			this.index=index;
		}
		
		public Casilla(int index, Enemigo enemigo, Objeto objeto){
			this.index=index;
			this.enemigo=enemigo;
			this.objeto=objeto;
		}
		
		public Enemigo getEnemigo(){
			return enemigo;
		}
		public Objeto getObjeto(){
			return objeto;
		}
		public void setEnemigo(Enemigo enemigo){
				this.enemigo=enemigo;
			}
		public void setObjeto(Objeto objeto){
				this.objeto=objeto;
			}
		
}