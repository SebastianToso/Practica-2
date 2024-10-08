package modelos;

public class Productos {
    private int id;

    private String nombre;
    private int cantidad;
    private String proveedor;


    public Productos(int id, String nombre, int cantidad, String proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

}
