//Clase Streaming

package uni1a;

// Subclase Streaming que extiende de ContenidoAudiovisual
public class Streaming extends ContenidoAudiovisual {
    private String streamer;
    private String plataforma;
    private int espectadores;

    public Streaming(String titulo, int duracionEnMinutos, String genero,
                     String streamer, String plataforma, int espectadores) {
        super(titulo, duracionEnMinutos, genero);
        this.streamer = streamer;
        this.plataforma = plataforma;
        this.espectadores = espectadores;
    }

    public String getStreamer() {
        return streamer;
    }

    public void setStreamer(String streamer) {
        this.streamer = streamer;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }

    public void sumarEspectadores(int cantidad) {
        espectadores += cantidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del streaming:");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Streamer: " + streamer);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Espectadores: " + espectadores);
        System.out.println();
    }
}