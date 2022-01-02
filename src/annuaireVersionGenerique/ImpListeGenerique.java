package annuairVersionGenerique;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Ztr
 *
 * @param <ListeG>
 */
public class ImpListeGenerique<ListeG> implements IListeGenerique<ListeG> {

	protected List<ListeG> listNum_;

	   public ImpListeGenerique(ListeG var1) {
		   listNum_ = new ArrayList<ListeG>();
	   }
	@Override
	public boolean ajouterFin(ListeG num) {
	      return this.ajouter(this.listNum_.size(), num);

	}

	@Override
	public boolean ajouterDebut(ListeG num) {
		 return this.ajouter(0, num);
	}

	@Override
	public boolean ajouter(int index, ListeG num) {
		 if (!this.listNum_.contains(num)) {
	         this.listNum_.add(index, num);
	         return true;
	      } else {
	         return false;
	      }
	}

	@Override
	public ListeG premierNumero() {
	      return (ListeG)this.listNum_.get(0);
	}

	@Override
	public ListeG numero(int index) {
	      return (ListeG)this.listNum_.get(index);

	}

	@Override
	public boolean contientNumero(int num) {
	      return this.listNum_.contains(  ListeG (num));

	}

	private Object   ListeG(int num) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int nbNumeros() {
	      return this.listNum_.size();

	}

	@Override
	public Iterator<?> iterator() {
	      return this.listNum_.iterator();

	}

	@Override
	public boolean retirer(int num) {
	      return this.nbNumeros() > 1 ? this.listNum_.remove( ListeG(num)) : false;

	}
	
	@Override
	public String toString() {
	      String var1 = this.listNum_.toString();
	      return var1.substring(1, var1.length() - 1);
	   }
	
	
	   public String toString1() {
	      Iterator<?> var1 = this.listNum_.iterator();
	      String var2 = var1.next().toString();

	      while(var1.hasNext()) {
	         var2.concat(",");
	         var2.concat(var1.next().toString());
	      }

	      return var2;
	   }
	
	   public String toString2() {
	      Iterator<?> var1 = this.listNum_.iterator();

	      String var2;
	      for(var2 = var1.next().toString(); var1.hasNext(); var2 = var2.concat(var1.next().toString())) {
	         var2 = var2.concat(",");
	      }

	      return var2;
	   }
	
	   public String toString3() {
			Iterator<ListeG> var1 = this.listNum_.iterator();
		      StringBuffer var2 = new StringBuffer(var1.next().toString());

		      while(var1.hasNext()) {
		         var2.append(",");
		         var2.append(var1.next().toString());
		      }

		      return var2.toString();
		   }

}
