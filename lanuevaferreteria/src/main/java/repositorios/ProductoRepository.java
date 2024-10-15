package repositorios;

import modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Usuario, Long> {}

