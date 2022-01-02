package annuairVersionGenerique;
/**
 * 
 * @author Ztr
 *  
 *  Une �num�ration est un type de donn�es particulier, dans lequel 
 *  une variable ne peut prendre qu'un nombre restreint de valeurs. 
 *  Ces valeurs sont des constantes nomm�es ,
 *  par exemple La classe civilit� sert a enumerer la civilite des personne.
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
