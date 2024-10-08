package com.ESFE.Asistenciaa.Servicios.Interfaces;

import com.ESFE.Asistenciaa.Entidades.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IEstudianteServices {
    Page<Estudiante> BuscarTodosPaginados(Pageable pageable);
    List<Estudiante> ObtenerTodos();
    Estudiante CrearOeditar(Estudiante estudiante);
    Optional<Estudiante> BuscarPorId(Integer id);
    void EliminarPorId(Integer id);
}
