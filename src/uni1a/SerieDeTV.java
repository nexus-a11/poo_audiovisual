package uni1a;

import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private ArrayList<Temporada> temporadas = new ArrayList<>(); // COMPOSICIÓN

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
    }

    public void agregarTemporada(int numero, int cantidadCapitulos) {
        temporadas.add(new Temporada(numero, cantidadCapitulos));
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public int getCantidadTemporadas() {
        return temporadas.size();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Temporadas: " + temporadas.size());
        for (Temporada t : temporadas) {
            System.out.println(" - " + t);
        }
        System.out.println();
    }
}