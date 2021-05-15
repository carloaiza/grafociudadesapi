package co.edu.umanizales.grafociudadesapi.controller;

import co.edu.umanizales.grafociudadesapi.domain.entities.Localidad;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/grafo")
public class GrafoController {
    //Inyectar los servicios

    @GetMapping(path="/djikstra/{origen}/{destino}")
    public List<Localidad> calcularDjikstra(
            @PathVariable("origen") int origen, @PathVariable("destino") int destino)
    {
        return null;
    }

}
