package annuairVersionGenerique;
/**
 * 
 * @author Ztr
 *  
 *  Une énumération est un type de données particulier, dans lequel 
 *  une variable ne peut prendre qu'un nombre restreint de valeurs. 
 *  Ces valeurs sont des constantes nommées ,
 *  par exemple La classe civilité sert a enumerer la civilite des personne.
 *
 */
public enum civilite {

	
		  MR("MR"),
		  MME("MME"),
		  MLLE("MLLE"),
		  Inconnu("Inconnu");
	private String abreviation ;  ;
	
		  civilite(String abreviation){
			  this.abreviation = abreviation ;
		    
		  }   
		  public String toString(){
		    return abreviation;
		  }
		  public void set(String civilite){
			  abreviation=civilite;
			  }
		 
		
	
}
