public abstract class Contenido
{
    private String titulo;
    private String genero;
    private double duracion;

    public abstract void reproducir();

    public void mostrarDetalles()
    {
        System.out.print("Aca entraste por que estas buscando detalles de tu cuenta papi");
    }
}