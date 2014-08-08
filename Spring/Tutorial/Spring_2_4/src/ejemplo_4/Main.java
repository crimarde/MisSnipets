package ejemplo_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ejemplo_4_beans.ServicioRemoto;

@SuppressWarnings("deprecation")
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	//Carga el archivo de configuracion de Spring
    	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");	    
    	 /* AplicationContext ofrece funcionalidad extra sobre beanFactory, además carga todos los
	     * singletons cuando se carga el contexto y no cuando se solicitan por la aplicación como 
	     * sucede con beanfactory*/
		
		
		//Le pido el Bean al BeanFactory
		ServicioRemoto servicio = applicationContext.getBean("miServicioRemoto", ServicioRemoto.class);
		//ServicioRemoto servicio = (ServicioRemoto)beanFactory.getBean("servicioRemoto");
	    
		//Simplemente lo uso como si lo hubiera instanciado con un new
	    System.out.println("El valor es " + servicio.consultaDato());
	}

}
