package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
		
        System.out.println("Hello from Eclipse!\n");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[6];
        
        // Pelicula con agregacion de actores
        Pelicula avatar = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[0] = avatar;
        
        // Serie con composición de temporadas
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasia");
        serie.agregarTemporada(1, 10);
        serie.agregarTemporada(2, 10);
        contenidos[1] = serie;
        
        // Documental con asociación a un investigador
        Documental doc = new Documental("Cosmos", 45, "Ciencia", "Astronomia");
        Investigador inv = new Investigador("Carl Sagan", "Astronomia", 40);
        doc.setInvestigador(inv);
        contenidos[2] = doc;

        // Podcast con agregación de invitados
        Podcast pod = new Podcast("El Pabellon", 127, "Terror", "Carlos Mena", "Spotify");
        Invitado inv1 = new Invitado("Tomas Delgado", "Comediante y Actor");
        pod.agregarInvitado(inv1);
        contenidos[3] = pod;
        
        // Streaming
        Streaming st = new Streaming("Noche de juegos", 120, "Gaming", "ProPlayer", "Twitch", 350);
        contenidos[4] = st;
        
        // Segunda película con actores creados aparte (agregación)
        Actor a1 = new Actor("Tom Hanks", 68, "Estadounidense");
        Actor a2 = new Actor("Meg Ryan", 64, "Estadounidense");
        Pelicula sleepless = new Pelicula("Sleepless in Seattle", 105, "Romance", "TriStar");
        sleepless.agregarActor(a1);
        sleepless.agregarActor(a2);
        contenidos[5] = sleepless;
        
        // ---- MANIPULACIÓN DE OBJETOS ----
        avatar.agregarActor(new Actor("Sam Worthington", 49, "Australiano"));
        serie.agregarTemporada(3, 8);
        st.sumarEspectadores(50);
        pod.quitarInvitado(inv1);
        
        // ---- MOSTRAR DETALLES (polimorfismo) ----
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
        
        // ---- PRUEBA DE GETTERS ----
        System.out.println("Cantidad de temporadas de " + serie.getTitulo() + ": "
                + serie.getCantidadTemporadas());
        System.out.println("Actores de " + avatar.getTitulo() + ": "
                + avatar.getActores().size());
        System.out.println("Invitados de " + pod.getTitulo() + ": "
                + pod.getInvitados().size());
        System.out.println("Espectadores de " + st.getTitulo() + ": "
                + st.getEspectadores());
        System.out.println("Investigador de " + doc.getTitulo() + ": "
                + doc.getInvestigador().getNombre());
	}
}