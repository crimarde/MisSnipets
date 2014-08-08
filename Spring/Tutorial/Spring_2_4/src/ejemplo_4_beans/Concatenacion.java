package ejemplo_4_beans;

public class Concatenacion implements Proceso {

	@Override
	public Object ejecuta() {
		// TODO Auto-generated method stub
		return new StringBuilder()
				.append("Hola")
				.append(" ")
				.append("Mundo");
	}

}
