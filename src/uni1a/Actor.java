package uni1a;

public class Actor {
	private String nombre;
	private int edad;
	private String pais;
	
	public Actor(String nombre, int edad, String nacionalidad) {
		this.nombre = nombre;
		this.edad = edad;
		this.pais = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getPais() {
		return pais;
	}
	
	@Override
	public String toString() {
		return nombre + " (" + edad + " años, " + pais + ")";
	}

}
