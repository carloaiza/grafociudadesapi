package co.edu.umanizales.grafociudadesapi.repository;

import co.edu.umanizales.grafociudadesapi.domain.entities.TipoUsuario;
import org.springframework.data.repository.CrudRepository;

public interface TipoUsuarioRepository extends
        CrudRepository<TipoUsuario,Integer> {
}
