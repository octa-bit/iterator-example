
import java.util.ArrayList;

public class CanaisEsportes implements ColecaoDeCanais {
	protected ArrayList<Canal> canais;

	public CanaisEsportes() {
		canais = new ArrayList<Canal>();

		canais.add(new Canal("ESPN"));
		canais.add(new Canal("FOX Sports"));
		canais.add(new Canal("Premiere FC"));
		canais.add(new Canal("Champions League"));
		canais.add(new Canal("Candangao 2019"));
	}

	public ArrayListDeCanaisIterator createIterator() {
		return new ArrayListDeCanaisIterator(canais);
	}
}