package pHopitalJPA.metier;

import java.util.HashMap;
import java.util.LinkedList;

import pHopitalJPA.model.Patient;

public class Hopital {
	private String secretaire;
	private HashMap<Integer, Salle> salles;
	LinkedList<Patient> fileAttente;

	public Hopital() {
		fileAttente = new LinkedList<Patient>();
		salles = new HashMap<Integer, Salle>();
	}

	public Hopital(String secretaire) {
		fileAttente = new LinkedList<Patient>();
		this.secretaire = secretaire;
	}

	public void addSalle(Salle s) {
		if (!salles.containsKey(s.getNumero()))
			salles.put(s.getNumero(), s);
	}

	public String getSecretaire() {
		return secretaire;
	}

	public void setSecretaire(String secretaire) {
		this.secretaire = secretaire;
	}

	public boolean addPatientFile(Patient p) {
		return fileAttente.add(p);

	}

	public boolean containtsPatientFile(Patient patient) {
		for (Patient p : fileAttente)
			if (p.getNumero() == patient.getNumero())
				return true;
		return false;
	}

	// retire le premier patient de la file d'attente
	public Patient supPatientFile() {
		return fileAttente.poll();
	}

	// renvoie le premier patient de la file d'attente sans le retirer de la
	// file d'attente
	public Patient getPatientSuivant() {
		return fileAttente.peek();
	}

	
	public void updatePatientFileAttente(Patient patient) {
		for (int i = 0; i < fileAttente.size(); i++) {
			Patient p = fileAttente.get(i);
			if (p.getNumero() == patient.getNumero()) {
				fileAttente.set(i, patient);
				break;
			}

		}
	}

	public String getStrFileAttente() {
		StringBuilder strFileAttente = new StringBuilder();

		for (Patient p : fileAttente)
			strFileAttente.append(p + "\n");

		return strFileAttente.toString();

	}



}
