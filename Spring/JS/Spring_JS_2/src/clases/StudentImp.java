package clases;

import interfaces.Carrer;
import interfaces.Certificate;
import interfaces.Student;

public class StudentImp implements Student {
	/** Nombre del estudiante */
	private String name;
	/** Carrera que cursa el estudiante (La gracia del ejemplo es que es una interfaz)*/
	private Carrer carrer;

	//Constructor por defecto
	public StudentImp() {
	}

	// Devuelve un objeto que implente la interfaz carrer
	public Carrer getCarrer() {
		return carrer;
	}

	//Establece el objeto carrer (un objeto que implemete la interfaz carrer)
	public void setCarrer(Carrer carrer) {
		this.carrer = carrer;
	}

	//Devuelve el nombre del estudiante
	public String getName() {
		return name;
	}

	//Establece el nombre del estudiante
	public void setName(String name) {
		this.name = name;
	}

	//Devuelve un certificado (hace que el estudiante se gradue)
	public Certificate study() {
		return this.carrer.graduate();
	}
}