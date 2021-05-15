package co.edu.umanizales.grafociudadesapi.service;

import co.edu.umanizales.grafociudadesapi.domain.entities.Usuario;
import co.edu.umanizales.grafociudadesapi.domain.model.ResponseDTO;
import co.edu.umanizales.grafociudadesapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UsuarioService implements Serializable {
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public ResponseDTO autenticarUsuario(Usuario usuario)
    {
        Usuario usuarioAutenticado= usuarioRepository.findUsuarioByCorreo(usuario.getCorreo());
        if(usuarioAutenticado !=null)
        {
            //Encontró un usuario
            if(usuarioAutenticado.getContrasenia().equals(usuario.getContrasenia()))
            {
                return new ResponseDTO(200,"Usuario válido");
            }
            else
            {
                return new ResponseDTO(404,"Datos Erróneos");
            }
        }
        else
        {
            return new ResponseDTO(404,"Datos Erróneos");
        }

    }
}
