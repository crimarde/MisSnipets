package ejemplo_3_beans;

import org.springframework.stereotype.Service;

@Service (value="miServicioRemoto")
public class ServicioRemoto {
	
	public int consultaDato() {
		return (int) (Math.random() * 10.0);
	}
}
