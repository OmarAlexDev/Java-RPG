package objetos;
import heroes.*;
import enemigos.*;

public class RecipienteGas extends Objeto{
	
	private int cantidadGas;
		
		public int getCantidadGas(){
			return cantidadGas;
		}
		
		public void setCantidadGas(int cantidadGas){
			this.cantidadGas=cantidadGas;
		}
		
		public RecipienteGas(String descripcion, int cantidadGas){
			super(descripcion);
			this.cantidadGas=cantidadGas;
		}
		
		

}