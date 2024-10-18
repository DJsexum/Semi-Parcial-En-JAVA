import java.time.LocalDate;

public class Membresia
{
    public class membresia
    {
        private TiposMembresia tipo;
        private LocalDate fechaInicio;
        private LocalDate fechaFin;
    }

    public void cancelar()
    {
        System.out.print("Cancelado pa");
    }

    public void renovar()
    {
        System.out.print("Segui pagando carnero");
    }
}