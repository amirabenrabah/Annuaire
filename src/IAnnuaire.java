import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Ztr
 *
 */

public interface IAnnuaire {
    
    /**
     * ajoute une nouvelle entr�e dans l'annuaire. Si p n'existe pas: on cr�e une nouvelle
     * association (p,nums) et le booleen <code>true</code> est retourn�; sinon le booleen
     * <code>/false</code> est retourn� et la m�thode est sans effet.
     *
     * @param p la personne
     * @param nums sa liste de numeros
     * @return <code>true</code>si l'entr�e a �t� ajout�e, <code>false</code> si la personne
     *        <oce>p</code> �tait d�j� pr�sente dans l'annuaire
     */
    public boolean ajouterEntree(Personne p, ImpListeNumTel nums) ;
    
    /**
     * ajoute un numero � la fin de la liste des num�ros d'une personne.
     * Si la personne n'existe pas on cr�e une nouvelle entr�e pour cette personne avec
     * comme liste de num�ros associ�e la liste constitu�e du num�ro pass� en param�tre.
     *
     * @param p la personne
     * @param n le numero � ajouter
     */
    public void ajouterNumeroFin(Personne p, NumTel n) ;
    
    /**
     * ajoute un numero au d�but de la liste des num�ros d'une personne.
     * Si la personne n'existe pas on cr�e une nouvelle entr�e pour cette personne avec
     * comme liste de num�ros associ�e la liste constitu�e du num�ro pass� en param�tre.
     *
     * @param p la personne
     * @param n le numero � ajouter
     */
    
    public void ajouterNumeroDebut(Personne p, NumTel n) ;
    
    /**
     * retourne le premier num�ro d'une personne, si la personne n'est pas dans 
     * l'annuaire retourne null.
     * @param p la personne dont on recherche le num�ro
     * @return son numero, <code>null</code> si p n'est pas pr�sente dans l'annuaire.
     */
    public NumTel premierNumero(Personne p) ;
    
    /**
     * retourne la liste des num�ros d'une personne si la personne est absente 
     * retourne null
     * @param o la personne pour laquelle on consulte les numeros.
     * @return la liste des num�ros de la personne si celle-ci est pr�sente dans
     *         l'annuaire, <code>null</code> sinon.
     */
    public IListeNumTel numeros(Personne p) ;
    
    
    /**
     * renvoie un iterateur sur l'ensemble des personnes contenues dans l'annuaire
     * @return l'iterateur
     */
    public Iterator<?> personnes();
    
    /**
     * affiche l'int�gralit� de l'annuaire, sous la forme d'une personne par ligne
     * suivie de ses num�ros de t�l�phone.
     */
    public void afficher();
    
    /**
     * supprime une personne de l'annuaire. Sans effet si la persoone n'est pas 
     * pr�sente dans l'annuaire.
     * @param p la personne � retirer de l'annuaire.
     */
    public void supprimer(Personne p);
    
    
    /**
     * supprime un numero donn� pour une personne.<BR>
     * Si ce num�ro est le seul num�ro pour la  personne, la personne est 
     * alors retir�e de l'annuaire.<BR>
     * Sans effet si la personne n'est pas pr�sente dans l'annuaire.
     * @param p la personne pour laquelle un num�ro doit �tre supprim�.
     * @param n le numero a supprimer.
     */
    public void supprimer(Personne p, int n) ;
    
    public Set<?> entreepourchaine(String S1) ;
    
}// Annuaire
