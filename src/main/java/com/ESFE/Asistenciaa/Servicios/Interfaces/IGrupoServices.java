package com.ESFE.Asistenciaa.Servicios.Interfaces;

import com.ESFE.Asistenciaa.Entidades.Grupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface IGrupoServices {
    Page<Grupo> BuscarTodosPaginados(Pageable pageable);
    List<Grupo> ObtenerTodos();
    Grupo CrearOeditar(Grupo grupo);
    Optional<Grupo> BuscarPorId(Integer id);
    void EliminarPorId(Integer id);
}
