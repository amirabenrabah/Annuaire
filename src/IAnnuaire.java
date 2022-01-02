import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Ztr
 *
 */

public interface IAnnuaire {
    
    /**
     * ajoute une nouvelle entrée dans l'annuaire. Si p n'existe pas: on crée une nouvelle
     * association (p,nums) et le booleen <code>true</code> est retourné; sinon le booleen
     * <code>/false</code> est retourné et la méthode est sans effet.
     *
     * @param p la personne
     * @param nums sa liste de numeros
     * @return <code>true</code>si l'entrée a été ajoutée, <code>false</code> si la personne
     *        <oce>p</code> était déjà présente dans l'annuaire
     */
    public boolean ajouterEntree(Personne p, ImpListeNumTel nums) ;
    
    /**
     * ajoute un numero à la fin de la liste des numéros d'une personne.
     * Si la personne n'existe pas on crée une nouvelle entrée pour cette personne avec
     * comme liste de numéros associée la liste constituée du numéro passé en paramètre.
     *
     * @param p la personne
     * @param n le numero à ajouter
     */
    public void ajouterNumeroFin(Personne p, NumTel n) ;
    
    /**
     * ajoute un numero au début de la liste des numéros d'une personne.
     * Si la personne n'existe pas on crée une nouvelle entrée pour cette personne avec
     * comme liste de numéros associée la liste constituée du numéro passé en paramètre.
     *
     * @param p la personne
     * @param n le numero à ajouter
     */
    
    public void ajouterNumeroDebut(Personne p, NumTel n) ;
    
    /**
     * retourne le premier numéro d'une personne, si la personne n'est pas dans 
     * l'annuaire retourne null.
     * @param p la personne dont on recherche le numéro
     * @return son numero, <code>null</code> si p n'est pas présente dans l'annuaire.
     */
    public NumTel premierNumero(Personne p) ;
    
    /**
     * retourne la liste des numéros d'une personne si la personne est absente 
     * retourne null
     * @param o la personne pour laquelle on consulte les numeros.
     * @return la liste des numéros de la personne si celle-ci est présente dans
     *         l'annuaire, <code>null</code> sinon.
     */
    public IListeNumTel numeros(Personne p) ;
    
    
    /**
     * renvoie un iterateur sur l'ensemble des personnes contenues dans l'annuaire
     * @return l'iterateur
     */
    public Iterator<?> personnes();
    
    /**
     * affiche l'intégralité de l'annuaire, sous la forme d'une personne par ligne
     * suivie de ses numéros de téléphone.
     */
    public void afficher();
    
    /**
     * supprime une personne de l'annuaire. Sans effet si la persoone n'est pas 
     * présente dans l'annuaire.
     * @param p la personne à retirer de l'annuaire.
     */
    public void supprimer(Personne p);
    
    
    /**
     * supprime un numero donné pour une personne.<BR>
     * Si ce numéro est le seul numéro pour la  personne, la personne est 
     * alors retirée de l'annuaire.<BR>
     * Sans effet si la personne n'est pas présente dans l'annuaire.
     * @param p la personne pour laquelle un numéro doit être supprimé.
     * @param n le numero a supprimer.
     */
    public void supprimer(Personne p, int n) ;
    
    public Set<?> entreepourchaine(String S1) ;
    
}// Annuaire
