package pHopitalJPA.model;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING, length = 1)
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUser")
	@SequenceGenerator(name = "seqUser", sequenceName = "seq_user", initialValue = 50, allocationSize = 1)
	@Column(name = "id_User", length = 150)
	private Integer id_Utilisateur;
	
	
	@Column(name = "nom", length = 150)
	@Size(min = 3, message = "il faut 3 caracteres minimum")
	private String nom;
	
	@Column(name = "prenom", length = 150)
	@Size(min = 3, message = "il faut 3 caracteres minimum")
	private String prenom;
	
	@Column(name = "login", nullable=false)
	private String login;
	
	@Column(name = "mdp", nullable=false)
	@Size(min = 4, message = "il faut 4 caracteres minimum")
	private String mdp;



	/**
	 * 
	 */
	public Utilisateur() {	}



	/**
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param mdp
	 */
	public Utilisateur(String nom, String prenom, String login, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Integer getId_Utilisateur() {
		return id_Utilisateur;
	}



	public void setId_Utilisateur(Integer id_Utilisateur) {
		this.id_Utilisateur = id_Utilisateur;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getMdp() {
		return mdp;
	}



	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
}
