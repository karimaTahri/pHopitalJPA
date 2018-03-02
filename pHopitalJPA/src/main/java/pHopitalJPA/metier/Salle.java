package pHopitalJPA.metier;

import java.util.ArrayList;

import pHopitalJPA.model.Visite;

/**
 * @author ajc
 *
 */
public class Salle {
	
	private int numero;
	private String medecin;
	private ArrayList<Visite> listeVisites;
	private Hopital hopital;

	private final static int maxVisite = 10;

	
	public Salle(int numero, String medecin, Hopital hopital) {
		this.numero = numero;
		this.medecin = medecin;
		this.hopital = hopital;
	
		this.listeVisites = new  ArrayList<Visite>();
	}

	public int getNumero() {
		return numero;
	}
	

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}
	
	

	public Hopital getHopital() {
		return hopital;
	}
	

}
