package ejemplo_4_beans;

import org.springframework.stereotype.Service;

@Service (value="miServicioRemoto")
public class ServicioRemoto {
	
	private Proceso proceso;
	private int repticiones;
	
	/*Constructor por defecto*/
	public ServicioRemoto(){
		
	}
	
	public void setRepeticiones(Integer repeticiones){
		this.repticiones = repeticiones;
	}
	
	/*Constructor al que se le pasa una referencia a una inyeccion de Spring*/
	public ServicioRemoto(Proceso proceso){
		this.proceso = proceso;
	}
	
	public Object consultaDato() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < repticiones; i++) {
			stringBuilder	.append(i+1)
							.append("")
							.append(proceso.ejecuta())
							.append("\n");
		}
		return stringBuilder.toString();
	}
}
