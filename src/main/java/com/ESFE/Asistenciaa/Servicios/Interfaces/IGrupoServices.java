package com.ESFE.Asistenciaa.Servicios.Interfaces;

import com.ESFE.Asistenciaa.Entidades.Grupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface IGrupoServices {
    Optional<Grupo> BuscarPorId();

    Page<Grupo> BuscarTodosPaginados(Pageable pageable);
    List<Grupo> ObtenerTodos();
    Optional<Grupo> BuscarPorId(Integer id);
    Grupo CrearOeditar(Grupo grupo);
    void EliminarPorId(Integer id);

}
