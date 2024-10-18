public enum TiposMembresia
{
    BASICA(1, 10000, "Acceso basico pixeleado y con anuncios de 10 min"),
    PREMIUM(2, 25000, "Acceso premium pero sin Disney+"),
    VIP(3, 50000, "Acceso VIP videos +18 y lo que vos quieras");

    private int Codigo;
    private double Precio;
    private String Descripcion;

    TiposMembresia(int Codigo, double Precio, String Descripcion)
    {
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
    }
}