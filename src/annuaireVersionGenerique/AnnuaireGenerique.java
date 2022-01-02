package annuairVersionGenerique;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
/**
 * 
 * On creer une classe generique avec trois varibales qui represent Personne ,  IListe et Numm.
 * 
 * @author Ztr
 *
 * @param <Personneee>
 * @param <IListe>
 * @param <Numm>
 */
public class AnnuaireGenerique<Personneee,IListe,Numm> implements IAnnuaireGenerique<Personneee,IListe,Numm> {
	
	TreeMap<Personneee,IListe> T;
	
	public AnnuaireGenerique (){
		T= new TreeMap<Personneee,IListe>();
		
	}
	
	@Override
	public boolean ajouterEntree(Personneee Personneee, IListe nums) {
		if(!T.containsKey(Personneee)) 
			{ 
				T.put(Personneee, nums);
				return true ;
			}
		else {
			return false ;
			}
	}

	
	@Override
	public void ajouterNumeroFin(Personneee Personneee, Numm Numm) {
		
		IListe Li = (IListe) T.get(Personneee);
		if ( Li == null) 
			{
				T.put(Personneee, IListe (Numm));
				
			}else 
				{
					( (IListeGenerique)Li).ajouterFin((NumTel) Numm);
					T.replace(Personneee,Li);
			}
				
	}

		
	private IListe IListe(Numm Numm) {
		return null;
	}

	@Override
	public void ajouterNumeroDebut(Personneee Personneee, Numm Numm) {
		IListe Li = T.get(Personneee);
		
		if ( Li== null) 
			{
				T.put(Personneee, IListe(Numm));
				
			}else 
				{
					( (IListeGenerique)Li).ajouterDebut((NumTel) Numm);
					T.replace(Personneee,Li);
				}		
	}
	
	

	@Override
	public Numm premierNumero(Personneee Personneee) {
		IListe t = T.get(Personneee);
		if ( t == null) 
			{
				return null;
				
			}else 
				{
					return (Numm) ((IListeGenerique) t).premierNumero();
				}
	}
	

	@Override
	public IListe numeros(Personneee Personneee) {
		return T.get(Personneee);

	}

	@Override
	public Iterator<?> personnes() {
		return T.keySet().iterator();

	}

	@Override
	public void afficher() {
		Iterator<Personneee> iterator = (Iterator<Personneee>) personnes();
		while (iterator.hasNext()) {
			
			 Personne entry = (Personne) iterator.next();
			System.out.print("Personne est : "+entry.toString());
			System.out.println(" Numero : "+((IListeGenerique) T.get(entry)).toString());
            			
		}
					
	}

	@Override
	public void supprimer(Personneee Personneee) {
		IListe Li = T.get(Personneee);
		if ( Li != null) 
			{
				T.remove(Personneee);
				System.out.println("La personne"+Personneee+"a ete supprimer");
				
			}else {
				System.out.println("La personne"+Personneee+"Numm'existe pas donc l'opération de supprimer a échoué");
			}		
	}
	
	

	@Override
	public void supprimer(Personneee Personneee, int Numm) {
		
		IListe Li = T.get(Personneee);
		if (Li != null) 
			{
				((IListeGenerique) Li).retirer(Numm);
			}		
	}
	

	@Override
	public Set<?> entreepourchaine(String S1) {
		 Set<String> hashSet = new HashSet<String>(); 
			
			Iterator<?> E=personnes();
			Personne Personneee; int IListe=0;
			
			while(E.hasNext()) {
				Personneee=(Personne) E.next();
				
				if(S1.equals(Personneee.getNom().substring(0,S1.length()))) 
					{
						IListe++;
						System.out.println(IListe+"-"+Personneee.getNom());
						hashSet.add(Personneee.getNom());
		            				
					}
				
				
			}
			return hashSet;
	}

}
