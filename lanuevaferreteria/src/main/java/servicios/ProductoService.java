package servicios;

import modelos.Producto;

import java.util.List;

public interface ProductoService {
    Producto crearProducto(Producto producto);
    List<Producto> listarProductos();
    Producto modificarProducto(Long id, Producto producto);
    void eliminarProducto(Long id);

}
