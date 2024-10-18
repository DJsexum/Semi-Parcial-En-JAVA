import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una membresía
        Membresia membresia = new Membresia();
        membresia.renovar(); // Ejemplo de renovación de membresía

        // Crear un usuario
        Usuario usuario = new Usuario("John Doe", "johndoe@gmail.com", "123456", membresia);

        // Crear perfiles para el usuario
        Perfil perfil1 = new Perfil("Juanito", 25);
        Perfil perfil2 = new Perfil("Maria", 30);

        // Agregar los perfiles al usuario
        usuario.agregarPerfil(perfil1);
        usuario.agregarPerfil(perfil2);

        // Crear contenido: serie y película
        Serie serie = new Serie("Breaking Bad", "Crimen", 60, 5); // (Título, Género, Duración, Número de temporadas)
        Pelicula pelicula = new Pelicula("Inception", "Ciencia Ficción", 148, "Christopher Nolan"); // (Título, Género, Duración, Director)

        // Mostrar detalles de la serie y la película
        System.out.println("Detalles de la Serie:");
        serie.mostrarDetalles();
        System.out.println("\nDetalles de la Película:");
        pelicula.mostrarDetalles();

        // Reproducir contenido
        System.out.println("\nReproduciendo serie...");
        serie.reproducir();
        System.out.println("\nReproduciendo película...");
        pelicula.reproducir();

        // Ver episodio de la serie
        perfil1.verContenido(serie); // Juanito ve un episodio de la serie
        serie.verEpisodio(1, 1); // Ver episodio 1 de la temporada 1

        // Ver trailer de la película
        pelicula.verTrailer();

        // Cancelar membresía
        System.out.print("¿Deseas cancelar tu membresía? (sí/no): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("sí")) {
            membresia.cancelar();
        }

        // Cerrar sesión del usuario
        usuario.cerrarSesion();

        scanner.close();
    }
}
