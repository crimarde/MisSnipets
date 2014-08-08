package beans;

public class SaludoImpl implements InterfazSaludo {

	private String saludo;
	
	public SaludoImpl (String saludo) {
		this.saludo = saludo;
	}
	
	public SaludoImpl() {
		
	}
	
	@Override
	public String getSaludo() {
		return this.saludo;
	}

	@Override
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	@Override
	public void saluda() {
		System.out.println(saludo);
	}

}
