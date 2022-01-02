package annuairVersionGenerique;

import java.util.Iterator;
/**
 * 
 * @author Ztr
 *
 * @param <Ilistee>
 */
	public interface IListeGenerique<Ilistee>{
		
		public boolean ajouterFin(Ilistee num) ;
		public boolean ajouterDebut(Ilistee num) ;
		public boolean ajouter(int index, Ilistee num) ;
		public Ilistee premierNumero() ;
		public Ilistee numero(int index ) ;
		public boolean contientNumero(int num) ;
		public int nbNumeros() ;
		public String toString() ;
		public Iterator<?> iterator() ;
		public boolean retirer(int num);

	}



