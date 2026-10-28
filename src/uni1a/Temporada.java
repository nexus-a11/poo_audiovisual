package uni1a;

public class Temporada {
	private int numero;
	private int numCapitulos;
	
	public Temporada(int numero, int numCapitulos) {
		this.numero = numero;
		this.numCapitulos = numCapitulos;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getNumCapitulos() {
		return numCapitulos;
	}
	
	@Override
	public String toString() {
		return "Temporada " + numero + " (" + numCapitulos + " capitulos)";
	}
}
