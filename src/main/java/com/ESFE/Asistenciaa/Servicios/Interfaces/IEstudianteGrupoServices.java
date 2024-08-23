package com.ESFE.Asistenciaa.Servicios.Interfaces;

import com.ESFE.Asistenciaa.Entidades.EstudianteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IEstudianteGrupoServices {
    Page<EstudianteGrupo> BuscarTodosPaginados(Pageable pageable);
    List<EstudianteGrupo> ObtenerTodos();
    EstudianteGrupo CrearOeditar(EstudianteGrupo estudianteGrupo);
    Optional<EstudianteGrupo> BuscarPorId(Integer id);
    void EliminarPorId(Integer id);
}
