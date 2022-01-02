import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * @author Ztr
 *
 */
public class ImpListeNumTel implements IListeNumTel {
   protected List<NumTel> listNum_ = new ArrayList<NumTel>();

   public ImpListeNumTel(NumTel var1) {
      this.listNum_.add(var1);
   }

/*
 * Ajoute un numéro à une position donnée dans la liste, sans effet si le numéro est déjà présent dans la liste
 */
   public boolean ajouter(int index, NumTel num) {
      if (!this.listNum_.contains(num)) {
         this.listNum_.add(index, num);
         return true;
      } else {
         return false;
      }
   }
   
   
/*
 * Ajoute un numéro au début de la liste, sans effet si le numéro est déjà présent dans la liste
 */
   public boolean ajouterDebut(NumTel num) {
      return this.ajouter(0, num);
   }

   
//Ajouter num a la fin de la liste sans effet si le num est deja present dans la liste
   public boolean ajouterFin(NumTel num) {
      return this.ajouter(this.listNum_.size(), num);
   }

   

/*
 * Test la presence d'un num dans la liste
 */
   public boolean contientNumero(int num) {
      return this.listNum_.contains(new NumTel(num));
   }

   
//Renvoie un iterateur sur les nums de telephone contenus dans la liste
   public Iterator<NumTel> iterator() {
      return this.listNum_.iterator();
   }

  
/*
 * Retourne le nbr de nums de la liste (>=1)
 */
   public int nbNumeros() {
      return this.listNum_.size();
   }

   
   
 /*
  * Retourne le ieme num de la liste , et null si la liste contient moins de i num
  */
  public NumTel numero(int index) {
      return (NumTel)this.listNum_.get(index);
   }

  
  
 /*
  * Retourne le 1er num de la liste
  */
  public NumTel premierNumero() {
      return (NumTel)this.listNum_.get(0);
   }

  
//Enleve un num de la liste , n'est pas possible si la liste contient au moins deux nums (nbNum()>1)
   public boolean retirer(int num) {
      return this.nbNumeros() > 1 ? this.listNum_.remove(new NumTel(num)) : false;
   }

   
 //Retourne dans une chaine de caracteres la sequence des num contenu dans cette liste 
   public String toString() {
      String var1 = this.listNum_.toString();
      return var1.substring(1, var1.length() - 1);
   }

   public String toString1() {
      Iterator<NumTel> var1 = this.listNum_.iterator();
      String var2 = var1.next().toString();

      while(var1.hasNext()) {
         var2.concat(",");
         var2.concat(var1.next().toString());
      }

      return var2;
   }

   public String toString2() {
      Iterator<NumTel> var1 = this.listNum_.iterator();

      String var2;
      for(var2 = var1.next().toString(); var1.hasNext(); var2 = var2.concat(var1.next().toString())) {
         var2 = var2.concat(",");
      }

      return var2;
   }

   public String toString3() {
      Iterator<NumTel> var1 = this.listNum_.iterator();
      StringBuffer var2 = new StringBuffer(var1.next().toString());

      while(var1.hasNext()) {
         var2.append(",");
         var2.append(var1.next().toString());
      }

      return var2.toString();
   }
}
