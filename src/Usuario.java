import java.util.ArrayList;

public class Usuario
{
    private String nombre;
    private String email;
    private String clave;
    private Membresia membresia;
    private ArrayList<Perfil> perfiles;

    public void iniciarSesion()
    {
        System.out.print("Iniciaste sesion");
    }

    public void cerrarSesion()
    {
        System.out.print("Cerraste la sesion");
    }

    public void agregarPerfil()
    {
        System.out.print("Agregaste otro perfil pibe");
    }

    public void verPerfilUsuario()
    {
        System.out.print("Estas viendo el perfil");
    }
}