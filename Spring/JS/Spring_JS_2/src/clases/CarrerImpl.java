package clases;

import interfaces.Carrer;
import interfaces.Certificate;

public class CarrerImpl implements Carrer {
	private String carrerName;
	private String universityName;

	public void setName(String carrerName) {
		this.carrerName = carrerName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Certificate graduate() {
		return new UniversityCertificate(carrerName, universityName);
	}
}
