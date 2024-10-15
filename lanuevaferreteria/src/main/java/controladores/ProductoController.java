package controladores;

import modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import servicios.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }

    @GetMapping("/listar")
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    @PutMapping("/modificar/{id}")
    public Producto modificarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.modificarProducto(id, producto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }
}
