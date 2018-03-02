package pHopitalJPA.model;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



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
	private Integer tel;
	
	
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "numero", column = @Column(name = "numero_rue_adherent")),
			@AttributeOverride(name = "rue", column = @Column(name = "rue_adherent", length = 150)),
			@AttributeOverride(name = "codePostal", column = @Column(name = "code_postal_adherent", length = 5)),
			@AttributeOverride(name = "ville", column = @Column(name = "ville_adherent", length = 150)) })
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

	public Integer getTelo() {
		return tel;
	}

	public void setTel(Integer tel) {
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
