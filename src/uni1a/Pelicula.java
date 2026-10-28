package uni1a;
import java.util.ArrayList;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores = new ArrayList<>();

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public void quitarActor(Actor actor) {
        actores.remove(actor);
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la pelicula:");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Reparto:");
        if (actores.isEmpty()) {
            System.out.println(" (sin actores registrados)");
        } else {
            for (Actor a : actores) {
                System.out.println(" - " + a);
            }
        }
        System.out.println();
    }
}