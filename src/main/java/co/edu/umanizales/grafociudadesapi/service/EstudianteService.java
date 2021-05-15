package co.edu.umanizales.grafociudadesapi.service;

import co.edu.umanizales.grafociudadesapi.domain.model.Estudiante;
import co.edu.umanizales.grafociudadesapi.domain.model.Universidad;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class EstudianteService {
    private List<Estudiante> listado;

    public EstudianteService() {
        listado = new ArrayList<>();
        listado.add(new Estudiante("82201612345",
                "Maykol Sedano", Universidad.UMANIZALES));
        listado.add(new Estudiante("82201612356",
                "Ricardo Duque",
                Universidad.UCATOLICA));
    }

    public List<Estudiante> getListado() {
        return listado;
    }

    public void setListado(List<Estudiante> listado) {
        this.listado = listado;
    }

    public List<Estudiante> adicionarEstudiante(Estudiante estu)
    {
        listado.add(estu);
        return listado;
    }
}
