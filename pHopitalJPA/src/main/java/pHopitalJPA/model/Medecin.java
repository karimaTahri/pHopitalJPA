package pHopitalJPA.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("M")
public class Medecin extends Utilisateur {
	
	@Column(name="profil")
	public final static String profil = "Medecin";

	
	@OneToMany(mappedBy = "medecin", fetch = FetchType.LAZY)
	private List<Visite> visites;
	
	
	
	/**
	 * 
	 */
	public Medecin() {
		visites = new ArrayList<Visite>();
	}

	public List<Visite> getVisites() {
		return visites;
	}

	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}
	
	
	public boolean addVisite (Visite v) {
		return this.visites.add(v);
	}
	
	public boolean removeVisite(Visite v) {		
		return this.visites.remove(v);
	}

	
}
