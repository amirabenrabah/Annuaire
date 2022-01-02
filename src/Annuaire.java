import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap; 
import java.util.Set;
/**
 * 
 * @author Ztr
 *
 */

public class Annuaire implements IAnnuaire {
	
	
	static TreeMap<Personne,ImpListeNumTel> AnnuaireTreeM;
	
	
	public Annuaire (){
		
		AnnuaireTreeM= new TreeMap<Personne,ImpListeNumTel>();
		
	}
	
	
	
	@Override
	public boolean ajouterEntree(Personne Per, ImpListeNumTel Lnums) {
		
		if(!AnnuaireTreeM.containsKey(Per))
			{
				AnnuaireTreeM.put(Per, Lnums);
				return true ;
			}
		else {
			return false ;
			}
		
		
	}

	@Override
	public void ajouterNumeroFin(Personne Per, NumTel n) {
		
		ImpListeNumTel t = AnnuaireTreeM.get(Per);
		if ( t != null) 
			{
				t.ajouterFin(n);
				AnnuaireTreeM.replace(Per,t);
		}else {
				AnnuaireTreeM.put(Per,new ImpListeNumTel(n));
			}
		
		
		
	}

	@Override
	public void ajouterNumeroDebut(Personne Per, NumTel n) {
		
		ImpListeNumTel t = AnnuaireTreeM.get(Per);
		if ( t != null) 
			{
			
				t.ajouterDebut(n);
				AnnuaireTreeM.replace(Per,t);
			
		}else {
			
				AnnuaireTreeM.put(Per,new ImpListeNumTel(n));
		
			}
		
		
	}

	@Override
	public NumTel premierNumero(Personne Per) {
		
		ImpListeNumTel t = AnnuaireTreeM.get(Per);
		
		if ( t == null) 
			{
				return null;
			
		}else 
			{
			
				return t.premierNumero();
			}
	}
	
	

	@Override
	public IListeNumTel numeros(Personne Per) {
		
		return AnnuaireTreeM.get(Per);
	}

	
	@Override
	public Iterator<Personne> personnes() {
		return AnnuaireTreeM.keySet().iterator();
	}

	
	
	@Override
	public void afficher() {
		
		Iterator<Personne> iterator = personnes();
		while (iterator.hasNext()) 
			{
			
			 	Personne entry = (Personne) iterator.next();
			 	System.out.print("La personne est : "+entry.toString());
			 	System.out.println("Le num : "+AnnuaireTreeM.get(entry).toString3());
            			
			}
		
	}

	
	@Override
	public void supprimer(Personne Per) {
		
		ImpListeNumTel t = AnnuaireTreeM.get(Per);
		if ( t != null) 
			{
				AnnuaireTreeM.remove(Per);
				System.out.println(Per+"a été supprimé");
			
			}else 
				{
					System.out.println(Per+"n'existe pas, donc l'opération de suppression a échoué");
				}
	}
	
	
	

	@Override
	public void supprimer(Personne Per, int n) {
		ImpListeNumTel t = AnnuaireTreeM.get(Per);
		if (t != null) 
			{
				t.retirer(n);
			}
	}
	
	
	   
	public Set<String> entreepourchaine(String Str) {
      Set<String> hashSet = new HashSet<String>(); 
      
		Iterator<?> perr= personnes();
		Personne Per; int i=0;
		while(perr.hasNext()) {
			Per=(Personne) perr.next();
			
			if(Str.equals(Per.getNom().substring(0,Str.length()))) {
				i++;
				System.out.println(i+"-"+Per.getNom());
				hashSet.add(Per.getNom());
            				
			}
			
			
		}
		return hashSet;
	}
}
	
	


