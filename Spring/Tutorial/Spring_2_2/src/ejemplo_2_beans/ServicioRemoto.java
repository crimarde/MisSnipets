package ejemplo_2_beans;

import org.springframework.stereotype.Service;

public class ServicioRemoto {
	
	public int consultaDato() {
		return (int) (Math.random() * 10.0);
	}
}
