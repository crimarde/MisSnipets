package interfaces;

/** Interfaz que representa un certificado de estudios */
public interface Certificate {
	
	/** Nombre de la carrera del certificado */
	public String getCarrerName();
	
	/** Establece el nombre de la carrera*/
	public void setCarrerName(String carrerName);
	
	/** Devuelve el nombre de la universidad */
	public String getUniversityName();
	
	/** Establece el nombre de la universidad */
	public void setUniversityName(String universityName);
}
