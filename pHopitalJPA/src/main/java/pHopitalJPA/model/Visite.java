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

}
