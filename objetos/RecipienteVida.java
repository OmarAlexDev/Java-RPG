package objetos;
import heroes.*;
import enemigos.*;

public class RecipienteVida extends Objeto{
	private int cantidadVida;
		
		public int getCantidadVida(){
			return cantidadVida;
		}
		
		public void setCantidadVida(int cantidadVida){
			this.cantidadVida=cantidadVida;
		}
		
		public RecipienteVida (int cantidadVida ,String descripcion){
			super(descripcion);
			this.cantidadVida=cantidadVida;
		}
		
		
}