package heroes;
import enemigos.*;
import objetos.*;
import mapa.*;

public class Moto extends Heroe{
				
		public Moto(String nombre, int posx,  int xp, int nivel, int salud, int gas, int ataque,Objeto objeto){
				super(nombre, posx, xp, nivel, salud , gas , ataque, objeto);
		}
			
			
		public void atacar(int ataque, Enemigo enemigo){
			enemigo.setVida(enemigo.getVida()-getAtaque());
		}
				
		public void atacar(int ataque, Objeto objeto, Enemigo enemigo){
			enemigo.setVida(enemigo.getVida()-(getAtaque()+ objeto.getPotenciadorAtaque()));
		}
				
		public void atacar(int ataque, int gas, Enemigo enemigo){
			enemigo.setVida(enemigo.getVida()-(getAtaque()+20));
			setGas(getGas()-Heroe.usoGas);
		}	
}