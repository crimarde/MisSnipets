package interfaces;


/** Interfaz para la carrera establece el nombre y el nombre de ka universidad que imparte los estudios*/
public interface Carrer {
	
	/** Establece el nombre de la carrera */
	public void setName(String carrerName);

	/** Establece el nombre de la universidad */
	public void setUniversityName(String universityName);

	/** Devuelve un certificado de estudios al ejecutar el metodo graduate*/
	public Certificate graduate();
}
