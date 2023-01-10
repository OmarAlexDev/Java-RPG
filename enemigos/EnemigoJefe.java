package enemigos;
import heroes.*;
import objetos.*;

public class EnemigoJefe extends Enemigo {
	
		private int defensa, gas;
				
		public EnemigoJefe(int posEnemigoX, String nombre, int ataque, int vida, int defensa, int xpReward){
			super(posEnemigoX, nombre ,ataque ,vida, xpReward);
			this.defensa=defensa;
		}
			
		public int getDefensa(){
			return defensa;
		}
		
		public void setDefensa(int defensa){
			this.defensa= defensa;
		}
		
}