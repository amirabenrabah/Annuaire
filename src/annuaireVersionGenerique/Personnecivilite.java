package annuairVersionGenerique;

/**
 * 
 * @author Ztr
 *
 */

public class Personnecivilite implements Comparable<Object> {
	
		String nom_;
	    String prenom_;
	   static civilite Cvlt;

	  public Personnecivilite (String nom, String prenom) {
	    this(civilite.Inconnu,nom,prenom);
	  }
	  

	  public Personnecivilite (civilite cv, String nom, String prenom) {
		    nom_ = nom;
		    prenom_ = prenom;
		    if (civiliteCorrecte(cv.toString()))
		    	{
				 	Cvlt =cv;
		    	} else
		    		Cvlt=civilite.Inconnu;
	  		}
	  

	  private boolean civiliteCorrecte(String civilite) 
	  		{
		    	return  (civilite=="MR" ||civilite=="MLLE"||civilite=="MME");
		    }
	  
	  public String getNom() 
	  		{
		  		return nom_;
	  		}

	  public String getPrenom() 
	  		{
		  		return prenom_;
	  		}

	  public String getcvte() 
	  		{
		  		return Cvlt.toString();
	  		}
	  
	  public void setCivilite(String civilite) 
	  		{
			      if (civiliteCorrecte(civilite)) 
			      	{
			    	  Cvlt.set(civilite);
			      	}
			 }
	  
	public String toString() 
			{
			    return Cvlt.toString() + " " + prenom_ + " " + nom_;
			}
	
	//Il faut ajouter cette méthode car c'est nécessaire d’avoir une relation d'ordre keys entre les personnes
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (! (o instanceof Personne) )
	        throw new ClassCastException("On peut pas comparer un " + 
	           o.getClass().getName() + "avec une Personne");
	    
		Personnecivilite p = (Personnecivilite) o;
	    String s = this.nom_ + this.prenom_ + this.getcvte();
	    return s.compareTo(p.nom_ + p.prenom_ +p.getcvte());
	}


}
