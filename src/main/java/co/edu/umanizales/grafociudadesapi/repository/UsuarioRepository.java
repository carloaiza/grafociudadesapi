package co.edu.umanizales.grafociudadesapi.repository;

import co.edu.umanizales.grafociudadesapi.domain.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {

    @Query("SELECT usuario FROM Usuario usuario WHERE usuario.correo=?1")
    Usuario findUsuarioByCorreo(String correo);
}
