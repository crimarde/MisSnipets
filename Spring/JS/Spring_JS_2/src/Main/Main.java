package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import clases.StudentImp;
import clases.UniversityCertificate;

public class Main {

	public static void main(String[] args) {
		// carga del contexto
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentImp student = ctx.getBean("chris",StudentImp.class);
		System.out.println("Mi nombre es: " + student.getName());
		System.out.println("He estudiado: " + student.study().getCarrerName());	
		UniversityCertificate certificado = (UniversityCertificate) student.getCarrer().graduate();
		System.out.println("El certificado es de la carrera: " + certificado.getCarrerName()); //Opcion 1 a traves de certificado
		System.out.println("Expedido por la universidad: " +  student.getCarrer().graduate().getUniversityName());  //Opcion 2 a traves de student.getCarrer().graduate()  
				
	}

}
