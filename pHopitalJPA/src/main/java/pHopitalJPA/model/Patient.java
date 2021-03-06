package pHopitalJPA.model;


import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "patient")
@NamedQueries({ 
		@NamedQuery(name = "Patient.findAllWithVisites", query = "select distinct a from Patient a left join fetch a.visitesPatient "),
		@NamedQuery(name = "Patient.findPersoByKeyWithVisites", query = "select distinct a from Patient a left join fetch a.visitesPatient where a.numero=:numero")
		 })

public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPatient")
	@SequenceGenerator(name = "seqPatient", sequenceName = "seq_patient", initialValue = 100, allocationSize = 1)
	@Column(name = "no_patient")
	private Integer numero;
	
	@Column(name = "nom_patient", length = 100, nullable = false)
	@NotNull(message = "nom null")
	private String nom;
	
	@Column(name = "prenom_patient", length = 150)
	@Size(min = 3, message = "il faut 3 caracteres minimum")
	private String prenom;
	
	@Column(name = "tel_patient", length = 150)
	@Size(min = 10, message = "il faut 10 caracteres minimum")
	private  String tel;
	
	@OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
	private List<Visite> visitesPatient;
	
	
	
	
	
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "numero", column = @Column(name = "numero_rue_patient")),
			@AttributeOverride(name = "rue", column = @Column(name = "rue_patient", length = 150)),
			@AttributeOverride(name = "codePostal", column = @Column(name = "code_postal_patient", length = 5)),
			@AttributeOverride(name = "ville", column = @Column(name = "ville_patient", length = 150)) })
	private Adresse adresse;
	
		
		
	
	@Version
	private int version;
	
	
	public Patient() {

	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
	public List<Visite> getVisitesPatient() {
		return visitesPatient;
	}

	public void setVisitesPatient(List<Visite> visitesPatient) {
		this.visitesPatient = visitesPatient;
	}

	
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
