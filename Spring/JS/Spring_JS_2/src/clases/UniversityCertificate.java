package clases;

import interfaces.Certificate;

public class UniversityCertificate implements Certificate {
	private String carrerName;
	private String universityName;

	public UniversityCertificate(String carrerName, String universityName) {
		this.carrerName = carrerName;
		this.universityName = universityName;
	}

	public String getCarrerName() {
		return this.carrerName;
	}

	public void setCarrerName(String carrerName) {
		this.carrerName = carrerName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
}