
public class CanaisFilmes implements ColecaoDeCanais {
	protected Canal[] canais;

	public CanaisFilmes() {
		canais = new Canal[5];

		canais[0] = new Canal("Telecine Premium");
		canais[1] = new Canal("MegaPix");
		canais[2] = new Canal("HBO");
		canais[3] = new Canal("AXN");
		canais[4] = new Canal("Max HD");
	}

	public MatrizDeCanaisIterator createIterator() {
		return new MatrizDeCanaisIterator(canais);
	}
}