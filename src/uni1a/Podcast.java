//Clase Podcast
package uni1a;

import java.util.ArrayList;

// Subclase Podcast que extiende de ContenidoAudiovisual
public class Podcast extends ContenidoAudiovisual {
    private String anfitrion;
    private String plataforma;
    private ArrayList<Invitado> invitados = new ArrayList<>(); // AGREGACIÓN

    public Podcast(String titulo, int duracionEnMinutos, String genero,
                   String anfitrion, String plataforma) {
        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.plataforma = plataforma;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void agregarInvitado(Invitado invitado) {
        invitados.add(invitado);
    }

    public void quitarInvitado(Invitado invitado) {
        invitados.remove(invitado);
    }

    public ArrayList<Invitado> getInvitados() {
        return invitados;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Anfitrion: " + anfitrion);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Invitados:");
        if (invitados.isEmpty()) {
            System.out.println(" (sin invitados registrados)");
        } else {
            for (Invitado i : invitados) {
                System.out.println(" - " + i);
            }
        }
        System.out.println();
    }
}