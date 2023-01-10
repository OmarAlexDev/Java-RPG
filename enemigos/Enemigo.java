package enemigos;
import heroes.*;
import objetos.*;

public class Enemigo implements AtacarEnemigo{
	
	private int posEnemigoX, posEnemigoY, vida, xpReward, ataque;
	private String nombre;
			
	public Enemigo(int posEnemigoX, String nombre, int ataque, int vida , int xpReward){
		this.posEnemigoX=posEnemigoX;
		this.nombre=nombre;
		this.ataque=ataque;
		this.vida=vida;
		this.xpReward=xpReward;
	}
			// Getters y setters	
	public String getNombre(){
		return nombre;
	}	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public int getXpReward(){
		return xpReward;
	}	
	public void setXpReward(int xpReward){
		this.xpReward=xpReward;
	}	
	public int getPosEnemigoX(){
		return posEnemigoX;
	}	
	public void setPosEnemigoX(int posEnemigoX){
		this.posEnemigoX=posEnemigoX;
	}	
	public int getAtaque(){
		return ataque;
	}		
	public void setAtaque(int ataque){
		this.ataque= ataque;
	}
	public int getVida(){
		return vida;
	}		
	public void setVida(int vida){
		this.vida = vida;
	}
	
	public void atacar(int ataque, Heroe heroe){
		heroe.setSalud(heroe.getSalud()- getAtaque());
	}
			
}