import java.util.Iterator;

/**
 *
 * Repr�sente une liste de num�ros de t�l�phone (objets NumTel).  
 * La liste contient au moins un num�ro (pas de liste vide). Les num�ros peuvent �tre
*  acc�d�s au travers de leur position (index) dans la liste. Les index allant de  0  �
*  n - 1, o� n est le nombre de num�ros de t�l�phones pr�sents dans la liste.
 * 
 * @see NumTel
 * @author <a href="mailto:Philippe.Genoud@imag.fr">Philippe Genoud</a>
 */

public interface IListeNumTel {

  /**
   * ajoute un num�ro � la fin de la liste, sans effet si le num�ro est d�j� 
   * pr�sent dans la liste.
   * @param num le num�ro � ajouter
   * @return <code>true</code> si le num�ro a �t� ajout�, <code>false</code> si l'ajout
   *        n'a pas eu lieu car la liste contient d�j� le num�ro.
   */
  public boolean ajouterFin(NumTel num) ;

   /**
   * ajoute un num�ro au d�but de la liste, sans effet si le num�ro est d�j� 
   * pr�sent dans la liste.
   * @param num le num�ro � ajouter
   * @return <code>true</code> si le num�ro a �t� ajout�, <code>false</code> si l'ajout
   *        n'a pas eu lieu car la liste contient d�j� le num�ro.
   */
  public boolean ajouterDebut(NumTel num) ;
  
  
  /**
   * ajoute un num�ro � une position donn�e dans la liste, sans effet si le num�ro est d�j� 
   * pr�sent dans la liste.
   * @param int index la position d'insertion dans la liste
   * @param num le num�ro � ajouter
   * @return <code>true</code> si le num�ro a �t� ajout�, <code>false</code> si l'ajout
   *        n'a pas eu lieu car la liste contient d�j� le num�ro.
   *
   *  @throws IndexOutOfBoundsException - si l'index est en dehors des bornes (index < 0 || index >= nbNumeros()).
   */
  public boolean ajouter(int index, NumTel num) ;

  /**
   * retourne le premier num�ro de la liste (il existe forc�ment) 
   * @return le premier num�ro de la liste.
   */
  public NumTel premierNumero() ;
  
  /**
   * retourne le i�me num�ro de la liste.
   * @param index la position du num�ro � rechercher 
   * @return le numero de la liste � la position index.
   *
   *  @throws IndexOutOfBoundsException - si l'index est en dehors des bornes (index < 0 || index >= nbNumeros()).
   */
  public NumTel numero(int index ) ;
 
 /**
  * Teste la pr�sence d'un num�ro dans la liste.
  * @param num le num�ro � rechercher.
  * @return <code>true</code> si la liste contient le objet Numtel dont le num�ro est
  *         identique � <code>num</code>, false sinon
  */
  public boolean contientNumero(int num) ;

 /**
  * retourne le nombre de num�ros de la liste (>=1).
  * @return nombre de num�ros pr�sents dans la liste.
  */
  public int nbNumeros() ;

  /**
   * Retourne dans une cha�ne de caract�res la s�quence des num�ros contenu dans
   * cette liste. Dans la cha�ne r�sultat les num�ros sont s�par�s par des virgules.
   * <BR>
   * exemple:<BR><pre>
   * 0476088634 (D), 0654789045 (P), 0476615277 (T)
   * </pre><BR>
   * @return la chaine contenant la s�quence des num�ros.
   */ 
  public String toString() ;

  /**
   * Renvoie un it�rateur sur les num�ros de t�l�phone contenus dans la liste.
   *
   * @return un iterateur permettant le parcours des num�ros de la liste
   */
   public Iterator<?> iterator() ;
   
  /**
   * Enl�ve un num�ro de la liste, cette op�ration n'est possible que si la liste
   * contient au moins deux num�ros (nbNumero()>1). Si la liste ne contient contient
   * qu'un seul num�ro cette op�ration est sans effet. De m�me si le num�ro sp�cifi� 
   * n'est pas pr�sent dans la liste.<br>
   * Cette m�thode retourne un bool�en qui indique si cette liste de num�ros de t�l�phone
   * a �t� affect�e par l'op�ration de retrait.
   *
   * @param num le numero � enlever.
   * 
   * @return <code>true</code> si un NumTel dont le num�ro est num a �t� retir� de la liste,
   *         <code>false</code> si la liste ne contient plus qu'un seul num�ro ou si il n'y
   *         a pas dans la liste de NumTel de num�ro num.
   */
  public boolean retirer(int num);
  
  
}// ListeNumTel

