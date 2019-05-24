
import java.util.ArrayList;

public class ArrayListDeCanaisIterator implements Iterator {
	protected ArrayList<Canal> lista;
	protected int contador;

	public ArrayListDeCanaisIterator(ArrayList<Canal> lista) {
		this.lista = lista;
		contador = 0;
	}

	public void next() {
		contador++;
	}

	public boolean hasNext() {
		return contador == lista.size();
	}

	public Canal currentItem() {
		if (hasNext()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}

		return lista.get(contador);
	}
}
