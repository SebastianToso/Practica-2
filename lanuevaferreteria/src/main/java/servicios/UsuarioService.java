package servicios;

import modelos.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario modificarUsuario(Long id, Usuario usuario);
    void eliminarUsuario(Long id);
}

