package annuairVersionGenerique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <P>Cette classe a pour r�le de faciliter la lecture de donn�es � partir du
 * clavier.</P>
 * <P>Elle definit une m�thode de lecture pour les types de base les plus
 * courramment utilis�s (int, float, double, boolean, String).</P>
 * <P>La lecture d'une valeur au clavier se fait en tapant celle-ci suivie d'un
 * retour chariot.</P>
 * <P>En cas d'erreur de lecture (par exemple un caract�re a �t� tap� lors de la
 * lecture d'un entier) un message d'erreur est affich� sur la console et
 * l'ex�cution du programme est interrompue.</P>
 * <P>Toutes les m�thodes d�inies dans cette classe sont pr�sentent sous deux 
 * formes :<BR>
 * <UL>
 *    <LI>une version avec un mesage d'invite en parm�tre, message qui sera
 *    affich� sur la console avant la lecture</LI>
 *    <LI>une version sans message d'invite</LI> 
 * </UL> 
 * </P>
 * <B>exemples d'utilisation de cette classe</B><BR>
 * 
 * <PRE>
 * 
 * char c = LectureClavier.lireChar("entrez un caract�re :");
 * System.out.println("caract�re lu : " + c);
 * 
 * String s = LectureClavier.lireChaine("entrez une chaine :");
 * System.out.println("chaine lue : " + s);
 * 
 * int i = LectureClavier.lireEntier("entrez un entier : ");
 * System.out.println("entier lu : " + i);
 * 
 * float f = LectureClavier.lireFloat("entrez une r�el (float) : ");
 * System.out.println("r�el (float) lu : " + f);
 * 
 * double d = LectureClavier.lireDouble("entrez une r�el (double) : ");
 * System.out.println("r�el (double) lu : " + d);
 * 
 * boolean b = LectureClavier.lireOuiNon("entrez une r�ponse O/N : ");
 * System.out.println("booleen lu : " + b);
 * 
 * </PRE>
 * 
 * @author Philippe Genoud <A
 *         HREF="mailto:Philippe.Genoud@imag.fr">Philippe.Genoud@imag.fr</A>.
 * @version 7/11/2006
 */
public class LectureClavier {

	private static BufferedReader stdin = new BufferedReader(
			new InputStreamReader(System.in));

	/**
	 * lecture au clavier d'un entier simple precision (int)
	 * 
	 * @param prompt :
	 *            cha�ne d'invite
	 * @return l'entier lu
	 */
	public static int lireEntier(String prompt) {
		System.out.print(prompt);
		System.out.flush();
		return lireEntier();
	}
	
	/**
	 * lecture au clavier d'un entier simple precision (int)
	 * 
	 * @return l'entier lu
	 */
	public static int lireEntier() {
		try {
			return (Integer.parseInt(stdin.readLine()));
		} catch (IOException e) {
			erreurEntree(e, "entier");
			return 0; // m�me si on passe jamais ici il faut un return !!
		}
	}

	/**
	 * lecture au clavier d'une chaine de caract�res
	 * 
	 * @param prompt :
	 *            cha�ne d'invite
	 * @return la chaine lue
	 */
	public static String lireChaine(String prompt) {
		System.out.print(prompt);
		System.out.flush();
		return lireChaine();
	}

	/**
	 * lecture au clavier d'une chaine de caract�res
	 * 
	 * @return la chaine lue
	 */
	public static String lireChaine() {
		try {
			return (stdin.readLine());
		} catch (IOException e) {
			erreurEntree(e, "chaine de caract�res");

			return null;
		}
	}

	/**
	 * lecture au clavier d'un r�el simple pr�cision (float)
	 * 
	 * @param prompt :
	 *            cha�ne d'invite
	 * @return le float lu
	 */
	public static float lireFloat(String prompt) {
		System.out.print(prompt);
		System.out.flush();
		return lireFloat();
	}

	/**
	 * lecture au clavier d'un r�el simple pr�cision (float)
	 * 
	 * @return le float lu
	 */
	public static float lireFloat() {

		try {
			return (Float.valueOf(stdin.readLine()).floatValue());
		} catch (IOException e) {
			erreurEntree(e, "r�el (float)");

			return (float) 0.0;
		}
	}

	/**
	 * lecture au clavier d'un re�l double pr�cision (double)
	 * 
	 * @param prompt :
	 *            cha�ne d'invite
	 * @return le double lu
	 */
	public static double lireDouble(String prompt) {
		System.out.print(prompt);
		System.out.flush();
		return lireDouble();
	}

	/**
	 * lecture au clavier d'un re�l double pr�cision (double)
	 * 
	 * @return le double lu
	 */
	public static double lireDouble() {
		try {
			return (Double.valueOf(stdin.readLine()).doubleValue());
		} catch (IOException e) {
			erreurEntree(e, "r�el (double)");
			return 0.0;
		}
	}

	/**
	 * lecture au clavier d'une r�ponse de type oui/non. Si la valeur tap�e est
	 * "o" ou "O" cette m�thode renvoie <code>true</code>, sinon elle renvoie
	 * <code>false</code>.
	 * 
	 * @param prompt :
	 *            cha�ne d'invite
	 * @return <code>true</code> si la chaine lue est "o" ou "O",
	 *         <code>false</code> sinon
	 */
	public static boolean lireOuiNon(String prompt) {
		System.out.print(prompt);
		System.out.flush();
		return lireOuiNon();
	}

	/**
	 * lecture au clavier d'une r�ponse de type oui/non. Si la valeur tap�e est
	 * "o" ou "O" cette m�thode renvoie <code>true</code>, sinon elle renvoie
	 * <code>false</code>.
	 * 
	 * @return <code>true</code> si la chaine lue est "o" ou "O",
	 *         <code>false</code> sinon
	 */
	public static boolean lireOuiNon() {
		String ch;
		ch = lireChaine();
		return (ch.equals("o") || ch.equals("O"));
	}

	/**
	 * lecture au clavier d'un caract�re
	 * 
	 * @param prompt :
	 *            cha�ne d'invite
	 * @return le caract�re lu
	 */
	public static char lireChar(String prompt) {
		System.out.print(prompt);
		System.out.flush();
		return lireChar();
	}

	/**
	 * lecture au clavier d'un caract�re
	 * 
	 * @return le caract�re lu
	 */
	public static char lireChar() {
		String ch;
		ch = lireChaine();
		return ch.charAt(0);
	}
	
	/**
	 * en cas d'erreur lors d'une lecture, affiche sur la sortie standard
	 * (System.out) un message indiquant le type de l'erreur ainsi que la la
	 * pile des appels de m�thodes ayant conduit � cette erreur.
	 * 
	 * @param e
	 *            l'exception d�crivant l'erreur.
	 * @param message
	 *            le message d'erreur � afficher.
	 */
	private static void erreurEntree(Exception e, String message) {
		System.out.println("Erreur lecture " + message);
		System.out.println(e);
		e.printStackTrace();
		System.exit(1);
	}

} // LectureClavier
