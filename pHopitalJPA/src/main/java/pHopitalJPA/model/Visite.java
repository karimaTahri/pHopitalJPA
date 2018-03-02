package pHopitalJPA.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "visite")
public class Visite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqVisite")
	@SequenceGenerator(name = "seqVisite", sequenceName = "seq_visite", initialValue = 100, allocationSize = 1)
	@Column(name = "no_visite")
	private Integer numero;
	
	@ManyToOne
	@JoinColumn(name = "numero_patient")
	private Patient patient;
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date_visite;
	
	@ManyToOne
	@JoinColumn(name = "numero_medecin")
	private Medecin medecin;
	

	@ManyToOne
	@JoinColumn(name = "numero_salle")
	private Salle salle;
	
	@Column(name = "tarif",nullable = false)
	@NotNull(message = "nom null")
	private Integer tarif;
	
	@Version
	private int version;

	public Visite() {
		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getDate_visite() {
		return date_visite;
	}

	public void setDate_visite(Date date_visite) {
		this.date_visite = date_visite;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Integer getTarif() {
		return tarif;
	}

	public void setTarif(Integer tarif) {
		this.tarif = tarif;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
	

}
