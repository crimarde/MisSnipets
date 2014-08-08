package ejemplo_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import ejemplo_1_beans.ServicioRemoto;

@SuppressWarnings("deprecation")
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	//Carga el archivo de configuracion de Spring
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
	    
		//Le pido el Bean al BeanFactory
		ServicioRemoto servicio = beanFactory.getBean("servicioRemoto", ServicioRemoto.class);
		//ServicioRemoto servicio = (ServicioRemoto)beanFactory.getBean("servicioRemoto");
	    
		//Simplemente lo uso como si lo hubiera instanciado con un new
	    System.out.println("El valor es " + servicio.consultaDato());
	}

}
