public class MatrizDeCanaisIterator implements Iterator {
	protected Canal[] lista;
	protected int contador;

	public MatrizDeCanaisIterator(Canal[] lista) {
		this.lista = lista;
	}

	public void next() {
		contador++;
	}

	public boolean hasNext() {
		return contador == lista.length;
	}

	public Canal currentItem() {
		if (hasNext()) {
			contador = lista.length - 1;
		} else if (contador < 0) {
			contador = 0;
		}
	
		return lista[contador];
	}
}