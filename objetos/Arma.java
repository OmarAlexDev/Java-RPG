package objetos;
import heroes.*;
import enemigos.*;

public class Arma extends Objeto{
	
	private int potenciadorAtaque;
	
	public void setPotenciadorAtaque(int potenciadorAtaque){
		this.potenciadorAtaque=potenciadorAtaque;
	}
	
	public Arma(String descripcion, int potenciadorAtaque){
		super(descripcion);
		this.potenciadorAtaque=potenciadorAtaque;
	}
}