package heroes;
import enemigos.*;
import objetos.*;
import mapa.*;

public abstract class Heroe implements Atacar{
	
		private int  posx, nivel, xp, salud, gas, ataque, potenciadorAtaque;
		private String nombre;
		private Objeto objeto;
		public static int usoGas=20;
		
		
		public Heroe(String nombre, int posx, int xp, int nivel, int salud , int gas , int ataque, Objeto objeto){
			this.nombre=nombre;
			this.posx=posx;
			this.xp=xp;
			this.nivel=nivel;
			this.salud=salud;
			this.gas=gas;
			this.ataque=ataque;
			this.objeto=objeto;

		}
		// Getters y setters de las variables
		public int getSalud(){
			return salud;
		}
		public void setSalud(int salud){
			this.salud=salud;
		}
		public int getGas(){
			return gas;
		}
		public void setGas(int gas){
			this.gas=gas;
		}
		public int getAtaque(){
			return ataque;
		}
		public void setAtaque(int ataque){
			this.ataque=ataque;
		}
		public String getNombre(){
			return nombre;
		}
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		public int getPosX(){
			return posx;
		}
		public void setPosX(int posx){
			this.posx=posx;
		}
		public int getXp(){
			return xp;
		}
		public void setXp(int xp){
			this.xp=xp;
		}
		public int getNivel(){
			return nivel;
		} 
		public void setNivel(int nivel){
			this.nivel=nivel;
		} 
		public Objeto getObjeto(){
			return objeto;
		} 
		public void setObjeto(Objeto objeto){
			this.objeto=objeto;
		} 
		
		// Metodos del heroe
		
		public void avanzar(int posx){
			setPosX(getPosX()+1);
		}
		public void addXp(int xp, Enemigo enemigo){
			setXp(getXp()+enemigo.getXpReward());	 
		} 
		public void subirNivel(int nivel){	
			setNivel(getNivel()+1);
			setAtaque(getAtaque()+20);
			setGas(getGas()+20);
			setSalud(getSalud()+20);
		}	
		public void huir(int gas){
			setGas(getGas()-Heroe.usoGas);
			setPosX(getPosX()+1);
		}
		public void addSalud(int salud, Objeto objeto){
			setSalud(getSalud()+objeto.getCantidadVida());
		}
		public void addGasolina(int gas, Objeto objeto){
			setGas(getGas()+objeto.getCantidadGas());
		}
		
		// Metodos abstractos 
		
		public abstract void atacar(int ataque , Enemigo enemigo);
			
		public abstract void atacar(int ataque, Objeto objeto, Enemigo enemigo);
			
		public abstract void atacar(int ataque, int gas, Enemigo enemigo);
}