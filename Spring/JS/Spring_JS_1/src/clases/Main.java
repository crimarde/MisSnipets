package clases;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.InterfazSaludo;
import beans.SaludoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("holamundo.xml");
		InterfazSaludo saludoConstructor = (SaludoImpl)
		ctx.getBean("saludoConstructor");
				
		saludoConstructor.saluda();
		InterfazSaludo saludoMetodo = (SaludoImpl) ctx.getBean("saludoMetodo");
		saludoMetodo.saluda();
	}

}
