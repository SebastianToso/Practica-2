package modelos;

public class Usuarios {
    private String nombre;
    private String DNI;
    private String Dirección;
    private String Contraseña;

    public Usuarios(String nombre, String DNI, String dirección, String contraseña) {
        this.nombre = nombre;
        this.DNI = DNI;
        Dirección = dirección;
        Contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String dirección) {
        Dirección = dirección;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
