package co.edu.umanizales.grafociudadesapi.controller;


import co.edu.umanizales.grafociudadesapi.domain.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import co.edu.umanizales.grafociudadesapi.service.EstudianteService;

import java.util.List;

@RestController
@RequestMapping(path="/estudiante")
@Validated
public class EstudianteController {

    private EstudianteService estudianteService;

    @Autowired
    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET})
    public List<Estudiante> obtenerEstudiantes()
    {
        return estudianteService.getListado();
    }

    @PostMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.POST})
    public List<Estudiante> adicionarEstudiante(@RequestBody Estudiante estu)
    {
        return estudianteService.adicionarEstudiante(estu);
    }
}
