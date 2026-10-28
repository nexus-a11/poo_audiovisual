package uni1a;

public class Investigador {
    private String nombre;
    private String especialidad;
    private int experiencia;

    public Investigador(String nombre, String especialidad, int aniosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAñosExperiencia() {
        return experiencia;
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ", " + experiencia + " años de experiencia)";
    }
}