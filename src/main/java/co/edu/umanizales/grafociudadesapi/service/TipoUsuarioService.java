package co.edu.umanizales.grafociudadesapi.service;

import co.edu.umanizales.grafociudadesapi.domain.entities.TipoUsuario;
import co.edu.umanizales.grafociudadesapi.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class TipoUsuarioService implements Serializable {
    private TipoUsuarioRepository tipoUsuarioRepository;

    @Autowired  //Inyección de dependencias
    public TipoUsuarioService(TipoUsuarioRepository tipoUsuarioRepository) {
        this.tipoUsuarioRepository = tipoUsuarioRepository;
    }

    /**
     * Método que permite obtener todos los registros de la tabla
     * tipo Usuario
     * @return Iterable<TipoUsuario>
     */
    public Iterable<TipoUsuario> getAllTipoUsuarios()
    {
        return tipoUsuarioRepository.findAll();
    }

    public TipoUsuario getTipoUsuarioById(int id)
    {
        return tipoUsuarioRepository.findById(id).get();
    }

    public TipoUsuario saveTipoUsuario(TipoUsuario tipoUsuario)
    {
        tipoUsuarioRepository.save(tipoUsuario);
        return tipoUsuario;
    }
}
