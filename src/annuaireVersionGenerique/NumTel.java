package annuairVersionGenerique;

/**
 * 
 * @author Ztr
 *
 */
public class NumTel {

	// ----------------------------------------------
	// constantes
	// ----------------------------------------------
	/**
	 * telephone fixe professionnel
	 */
	public static final char FIXE_PROF = 'T';

	/**
	 * telephone fixe domicile
	 */
	public static final char FIXE_DOM = 'D';

	/**
	 * telephone portable
	 */
	public static final char PORTABLE = 'P';

	/**
	 * fax
	 */
	public static final char FAX = 'F';

	/**
	 * nature du numéro inconnue
	 */
	public static final char INCONNU = '?';

	// ----------------------------------------------
	// attributs (variables de classes)
	// ----------------------------------------------
	private int numero;

	private char type;

	// ----------------------------------------------
	// Constructeurs
	// ----------------------------------------------

	/**
	 * crée un numéro de téléphone d'un type donné.
	 * 
	 * @param num
	 *            le numéro de téléphone
	 * @param type
	 *            son type (si ce type n'est pas 'T','D','P' ou 'F', la valeur
	 *            INCONNU ('?') sera associée à ce numéro).
	 */
	public NumTel(int num, char type) {
		this.numero = num;
		setType(type);
	}

	/**
	 * crée un numéro de téléphone de type inconnu
	 * 
	 * @param num
	 *            le numéro de téléphone
	 */
	public NumTel(int num) {
		this(num, INCONNU);
	}

	// ----------------------------------------------
	// méthodes
	// ----------------------------------------------

	// ---- accesseurs --------------------------------------
	/**
	 * retourne le numéro de téléphone
	 * 
	 * @return le numéro.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * retourne le type de ce numéro de téléphone
	 * 
	 * @return le type.
	 */
	public char getType() {
		return type;
	}

	// ---- modifieurs --------------------------------------
	/**
	 * change le type de ce numéro de téléphone
	 * 
	 * @param type
	 *            le nouveau type pour ce numéro. (si ce type n'est pas
	 *            'T','D','P' ou 'F', la valeur INCONNU ('?') sera associée à ce
	 *            numéro).
	 */
	public void setType(char type) {
		switch (type) {
		case FIXE_PROF:
		case FIXE_DOM:
		case PORTABLE:
		case FAX:
			this.type = type;
			break;
		default:
			this.type = INCONNU;
		}
	}

	// -------------------------------------------------------
	// méthodes héritées de la classe Object et redéfinies
	// -------------------------------------------------------

	/**
	 * renvoie une représentation textuelle du numéro de téléphone sous la forme
	 * d'une chaîne de caractères. Cette chaine et de la forme suivante :<br>
	 * <I>numéro</I> <B>(</B><I>Type</I><B>)</B>).
	 * 
	 * @return la chaine correspondant au numéro de téléphone et à son type
	 */
	public String toString() {
		return numero + " (" + type + ")";
	}

	/**
	 * teste l'égalité de ce numéro de téléphone avec un autre. L'égalité porte
	 * uniquement sur le numéro et ne tient pas compte du type.
	 * 
	 * @param o
	 *            le numéro de téléphone à comparer avec ce numéro.
	 * @return <code>false</code> si l'objet o n'est pas de type NumTel ou si
	 *         son numéro n'est pas identique à celui de l'objet NumTel
	 *         récepteur du message, <code>false</code> sinon.
	 */
	public boolean equals(Object o) {
		if (!(o instanceof NumTel))
			return false;

		NumTel num = (NumTel) o;

		return this.numero == num.numero;
	}

	/**
	 * redéfinition de la méthode hashCode pour rester cohérent avec la méthode
	 * equals. deux NumTel égaux doivent produirent le même hashCode. voir le
	 * javadoc de la classe Object.
	 * 
	 * @return la valeur de hashCode
	 */
	public int hashCode() {
		return numero;
	}

}// NumTel
