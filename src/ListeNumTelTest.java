/**
 * 
 * @author Ztr
 *
 */
public class ListeNumTelTest {
    
    /**
     * la liste des numéros de téléphone
     */
    private static IListeNumTel listNum;
    
    /**
     * affiche un menu proposant les différentes opérations possibles sur la liste
     */
    private static void affMenu() {
        System.out.println("-----------------------------------------------");
        System.out.println("1 : ajouter un numéro au debut de la liste ");
        System.out.println("2 : ajouter un numéro à la fin de la liste ");
        System.out.println("3 : ajouter un numéro à une position donnée ");
        System.out.println("4 : retirer un numéro de la liste ");
        System.out.println("5 : afficher la liste ");
        System.out.println("6 : nombre de numéros de la liste ");
        System.out.println("7 : récupérer le premier de la liste ");
        System.out.println("8 : vérifier la présence d'un numéro dans la liste ");
        System.out.println("0 : quitter l'application ");
        
        System.out.print("\nVotre choix : ");
    }
    
    
    private static NumTel creerNumTel() {
        System.out.print("numero : ");
        int num = LectureClavier.lireEntier();
        System.out.print("type (T : Fixe professionnel, D : Fixe domicile, P : Portable, F : Fax, ? inconnu)");
        char type = LectureClavier.lireChar();
        return new NumTel(num,type);
    }
    
    private static void ajouterNumeroDebut() {
        System.out.println("numéro de téléphone à ajouter au début de la liste : ");
        NumTel num = creerNumTel();
        listNum.ajouterDebut(num);
    }
    
    private static void ajouterNumeroFin() {
        System.out.println("numéro de téléphone à ajouter en fin de la liste: ");
        NumTel num = creerNumTel();
        listNum.ajouterFin(num);
    }
    
    private static void ajouterNumero() {
        System.out.println("numéro de téléphone à ajouter dans la liste: ");
        NumTel num = creerNumTel();
        System.out.print("Position d'insertion dans la liste : ");
        int pos = LectureClavier.lireEntier();
        listNum.ajouter(pos,num);
    }
    
    private static void retirerNumero() {
        System.out.print("numero à retirer : ");
        int num = LectureClavier.lireEntier();
        if (listNum.retirer(num)) {
            System.out.println("opération de retrait a réussi");
        }
        else {
            System.out.println("opération de retrait a échoué");
        }
    }
    
    private static void creerListe() {
        System.out.println("Création du 1er numéro de la liste : ");
        NumTel num = creerNumTel();
        listNum = new ImpListeNumTel(num);
    }
    
    private static void rechercherNumero() {
        
        System.out.print("numéro à rechercher : ");
        int num = LectureClavier.lireEntier();
        if (listNum.contientNumero(num)) {
            System.out.println("le numéro est présent dans la liste");
        }
        else {
            System.out.println("le numéro n'est pas présent dans la liste");
        }
    }
    
   /* public static void main(String[] args){
        
        creerListe();
        
        boolean encore = true;
        do {
            affMenu();
            int rep = LectureClavier.lireEntier();
            switch (rep) {
                case 0:  System.out.print("Voulez vous vraimment quitter l'application O/N ");
                encore = ! LectureClavier.lireOuiNon();
                break;
                case 1:  ajouterNumeroDebut();
                break;
                case 2:  ajouterNumeroFin();
                break;
                case 3:  ajouterNumero();
                break;
                case 4:  retirerNumero();
                break;
                case 5:  System.out.println(listNum);
                break;
                case 6:  System.out.println("nombre de numéros de la liste : " + listNum.nbNumeros());
                break;
                case 7:  System.out.println("premier numero de la liste : " + listNum.premierNumero());
                break;
                case 8:  rechercherNumero();
                break;
                default:  System.out.println("Mauvais numéro de commande");
                break;
            } // fin du switch
        } while (encore);
    }
    */
    public static void main(String[] args) { 
    	 
        // crée un annuaire vide     
    	IAnnuaire an = new Annuaire();       
    	
    	// ajoute deux personnes à l'annuaire     
    	
    	Personne p1 = new  Personne(Personne.MLLE,"DURAND","Sophie");     
    	
    	an.ajouterEntree(p1,new ImpListeNumTel(new NumTel(151171,'D'))); 
     
        an.ajouterEntree(new Personne(Personne.MR,"DUPONT","Jean"),new ImpListeNumTel(new NumTel(151170,'P'))); 
        
     
        an.ajouterEntree(new Personne(Personne.MR,"DUSCHMOL", "Louis"), new ImpListeNumTel(new NumTel(146761,'P')));  
        
        an.ajouterEntree(new Personne(Personne.MR,"AARGHH", "Robert"),new ImpListeNumTel(new NumTel(140361,'P'))); 
     
     
        // imprime l'annuaire     
        
        System.out.println("------------------------------");    
        System.out.println(an);     
        System.out.println("------------------------------");     
        
        // Recherche des numéros de Sophie DURAND     
        System.out.println("numeros de " + p1);     
        System.out.println(an.numeros(p1)); 
     
        
        // Recherche des numéros de Jean DUPONT     
        Personne p2 = new Personne(Personne.MR,"DUPONT","Jean");     
        System.out.println("numeros de " + p2);     System.out.println(an.numeros(p2));  
        System.out.println(an.entreepourchaine("DU"));}
    
    
}// ListeNumTelTest
