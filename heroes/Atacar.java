package heroes;
import enemigos.*;
import objetos.*;
import mapa.*;

public interface Atacar{
	
	public void atacar(int ataque, Enemigo enemigo);
		
	public void atacar(int ataque, Objeto objeto, Enemigo enemigo);
		
	public void atacar(int ataque, int gas, Enemigo enemigo);
	
}