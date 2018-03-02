/**
 * 
 */
package pHopitalJPA.model;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



/**
 * @author mohamed
 *
 */

@Entity
@DiscriminatorValue("S")
public class Secretaire extends Utilisateur {

	@Column(name="profil")
	public final static String profil = "Secretaire";
	
	/**
	 * 
	 */
	public Secretaire() {
	}

	
	
	

}
