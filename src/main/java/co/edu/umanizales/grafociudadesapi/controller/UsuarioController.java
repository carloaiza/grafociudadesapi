package co.edu.umanizales.grafociudadesapi.controller;

import co.edu.umanizales.grafociudadesapi.domain.entities.Usuario;
import co.edu.umanizales.grafociudadesapi.domain.model.ResponseDTO;
import co.edu.umanizales.grafociudadesapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="autenticar")
@Validated
public class UsuarioController {
    private UsuarioService usuarioService;
    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.POST})
    public ResponseDTO autenticarUsuario(@RequestBody Usuario usuario)
    {
        return usuarioService.autenticarUsuario(usuario);
    }
}
