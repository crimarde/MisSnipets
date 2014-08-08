package ejemplo_4_beans;

public class Calculo implements Proceso {

	@Override
	public Object ejecuta() {
		// TODO Auto-generated method stub
		return (int) (Math.random() * 100.0);
	}

}
