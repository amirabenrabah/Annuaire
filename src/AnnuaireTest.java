/**
 *
 * @author Ztr
 *
 */
public class AnnuaireTest {




    /**
     * affiche un menu proposant les diff�rentes op�rations possibles sur l'annuaire
     */
    private  static Annuaire AnnuaireTree = new Annuaire();

    private static void affMenu() {
        System.out.println("-----------------------------------------------");
        System.out.println("1 : Afficher l'annuaire");
        System.out.println("2 : Ajouter une nouvelle entr�e dans l'annuaire ");
        System.out.println("3 : Ajouter un numero au d�but de la liste des numeros d'une personne");
        System.out.println("4 : Ajouter un numero au fin de la liste des nums d'une personne");
        System.out.println("5 : Afficher les num d'une personne ");
        System.out.println("6 : Afficher l'ensemble des personnes  ");
        System.out.println("7 : Afficher le premier num d'une personne ");
        System.out.println("8 : Supprimer une personne de l'annuaire ");
        System.out.println("9 : Supprimer un nom donnee pour une personne");
        System.out.println("0 : Quitter l'application ");

        System.out.print("\nVotre choix : ");
    }
//La cr�ation d'une personne.
    private static Personne creerPersonne(){
    	System.out.println("Nom :");
    	String Nom=LectureClavier.lireChaine();
    	System.out.println("Pr�nom:");
    	String Prenom=LectureClavier.lireChaine();

    	return new Personne(Nom,Prenom);
    }


//Cr�er un num d'une personne.
    private static NumTel creerNumTel() {
        System.out.print("Le num : ");
        int Num = LectureClavier.lireEntier();
        System.out.print("Type (T : Fixe professionnel, D : Fixe domicile, P : Portable, F : Fax, ? inconnu)");
        char Type = LectureClavier.lireChar();
        return new NumTel(Num,Type);
    }

//Ajouter une nouvelle entr�e dans l'annuaire.
    private static void AjouteEntree() {
        System.out.println("Donner une nouvelle entr�e dans l'annuaire :");
        NumTel numero = creerNumTel();
        ImpListeNumTel numeros = new ImpListeNumTel(numero);
        Personne personne = creerPersonne();
        AnnuaireTree.ajouterEntree(personne, numeros);
    }

//Ajouter un num�ro au d�but de la liste des num d'une personne.
    private static void AjouterNumeroDebutAn() {
    	Personne personne = creerPersonne();
        System.out.println("Donner Num�ro de t�l�phone � ajouter au d�but de la liste d'un personne:");
        NumTel numero = creerNumTel();
        AnnuaireTree.ajouterNumeroDebut(personne, numero);
    }

//Ajouter un num � la fin de la liste des nums d'une personne.
    private static void AjouterNumeroFinAn() {
    	Personne personne = creerPersonne();
        System.out.println("Donnez le num�ro de t�l�phone � ajouter � la fin de la liste:");
        NumTel num = creerNumTel();
        AnnuaireTree.ajouterNumeroFin(personne, num);
    }

//Afficher les num si la personne est absente retourne null.
    private static void AfficherNums() {
    	Personne personne = creerPersonne();

        System.out.println("Les numeros du personne:"+personne +" sont :"+AnnuaireTree.numeros(personne));
    }

//Afficher l'ensemble des personnes contenues dans l'annuaire.
    private static void Afficherpersonnes() {
          AnnuaireTree.personnes().forEachRemaining(e->{
            System.out.println(e+"\n");
          });
    }

//Afficher le premier num d�une personne.
    private static void AfficherpermierNum() {
    	Personne personne = creerPersonne();
        System.out.println("Le permier num du personne:"+personne+"est :"+AnnuaireTree.premierNumero(personne));
    }



//Supprimer une personne de l'annuaire.
    private static void SupprimePersonne() {
        System.out.print("La personne pour supprim�e est: ");
        Personne personne = creerPersonne();
        AnnuaireTree.supprimer(personne);
    }


//Supprimer un num donn�e pour une personne l'annuaire.
    private static void SupprimeNumPersonne() {
    	Personne personne = creerPersonne();
        AnnuaireTree.supprimer(personne);
    }
//Afficher l'int�gralit� de l'annuaire.
    private static void AfficherAnnuaire() {
    	AnnuaireTree.afficher();
}
    private static void excuteentreepourchaine() {
		  System.out.println("Donner string pour rechercher les personnes qui commence leur nom avec");
		  String S=LectureClavier.lireChaine();
		  System.out.println(AnnuaireTree.entreepourchaine(S));


	  }

public static void main(String[] args){


        boolean encore = true;
        do {
            affMenu();
            int rep = LectureClavier.lireEntier();
            switch (rep) {
                case 0:  System.out.print("Voulez vous vraiment quitter l'application O/N ");
                encore = ! LectureClavier.lireOuiNon();
                break;
                case 1:  AfficherAnnuaire();
                break;
                case 2:  AjouteEntree();
                break;
                case 3:  AjouterNumeroDebutAn();
                break;
                case 4:  AjouterNumeroFinAn();
                break;
                case 5:  AfficherNums();
                break;
                case 6:  Afficherpersonnes();
                break;
                case 7:  AfficherpermierNum();
                break;
                case 8:  SupprimePersonne();
                break;
                case 9:  SupprimeNumPersonne();
                break;
                case 10: excuteentreepourchaine();
                break;
                default: ;
                break;
            }
        } while (encore);


        /*System.out.println("                 ************                 ");

		        System.out.println("----Ajouter une nouvelle entrée dans l'annuaire ");
		        AjouteEntree();

        System.out.println("                 ************                 ");

		        System.out.println("----Ajouter un numero au début de la liste des numeros d'une personne");
		        AjouterNumeroDebutAn();

        System.out.println("                 ************                 ");

		        System.out.println("----Ajouter un numero au fin de la liste des nums d'une personne");
		        AjouterNumeroFinAn();

        System.out.println("                 ************                 ");

		        System.out.println("----Afficher les nums d'une personne donnee ");
		        AfficherNums();

        System.out.println("                 ************                 ");

		        System.out.println("----Afficher l'ensemble des personnes qui sont dans l'annuaire ");
		        AfficherPersonnes();

        System.out.println("                 ************                 ");

		        System.out.println("----Afficher le premier num d'une personne ");
		        AfficherPermierNum();

		System.out.println("                 ************                 ");

		        System.out.println("----Afficher l'annuaire");
		        AfficherAnnuaire();

        System.out.println("                 ************                 ");


		        System.out.println("----Supprimer une personne de l'annuaire ");
		        SupprimeUnePersonne();

        System.out.println("                 ************                 ");

        		System.out.println("----Supprimer une Numero d'une personne de l'annuaire ");
        		SupprimeUnNumPersonne();

        System.out.println("                 ************                 ");

		        System.out.println("----Afficher les noms des personnes qui commence par string donnée ");
		        excuteentreepourchaine();

        System.out.println("                 ************                 ");

		        System.out.println("----Afficher l'annuaire");
		        AfficherAnnuaire();

        System.out.println("                 ************                 ");
        */
    }


}// Annuaire Test
