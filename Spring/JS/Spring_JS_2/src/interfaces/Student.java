package interfaces;

/** Interfaz que representa a un studiante*/
public interface Student {
	
	/** Establece la carrera que est� estudiando*/
	public void setCarrer(Carrer carrer);

	/** Devuelve el nombre del estudiante */
	public String getName();

	/** Establece el nombre del estudiante */
	public void setName(String name);

	/** Har� que el estudiante estudie y obtenga un certificado */
	public Certificate study();
}