package annuairVersionGenerique;

import java.util.Iterator;
import java.util.Set;
/**
 * 
 * @author Ztr
 *
 * @param <Person>
 * @param <IListe>
 * @param <Numb>
 */
public interface IAnnuaireGenerique<Person,IListe,Numb> {
	
	public boolean ajouterEntree(Person Person, IListe nums) ;
	public void ajouterNumeroFin(Person Person, Numb Numb) ;
	public void ajouterNumeroDebut(Person Person, Numb Numb) ;
	public Numb premierNumero(Person Person) ;
	public IListe numeros(Person Person) ;
	public Iterator<?> personnes();
	public void afficher();
	public void supprimer(Person Person);
	public void supprimer(Person Person, int Numb) ;
	public Set<?> entreepourchaine(String S1) ;

}
