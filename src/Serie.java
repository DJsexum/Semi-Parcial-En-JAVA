public class Serie extends Contenido
{
    private int numeroTemporadas;

    public void reproducir()
    {
        System.out.print("Bueno, esto es de la clase Serie, y es la funcion reproducir, pero no se que hace o que poner");
    }

    public void verEpisodio(int temporada, int episodio)
    {
        System.out.print("Vas a ver el episodio" + episodio + "de la temporada" + temporada);
    }
}