package com.ESFE.Asistenciaa.Servicios.Implementaciones;

import com.ESFE.Asistenciaa.Entidades.Grupo;
import com.ESFE.Asistenciaa.Repositorios.IGrupoRepository;
import com.ESFE.Asistenciaa.Servicios.Interfaces.IGrupoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoServices implements IGrupoServices {
    @Override
    public Optional<Grupo> BuscarPorId() {
        return Optional.empty();
    }

    @Autowired
    private IGrupoRepository grupoRepository;

    @Override
    public Page<Grupo> BuscarTodosPaginados(Pageable pageable) {
        return grupoRepository.findAll(pageable);
    }

    @Override
    public List<Grupo> ObtenerTodos() {
        return grupoRepository.findAll();
    }

    @Override
    public Optional<Grupo> BuscarPorId(Integer id) {
        return grupoRepository.findById(id);
    }

    @Override
    public Grupo CrearOeditar(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    @Override
    public void EliminarPorId(Integer id) {
        grupoRepository.deleteById(id);

    }
}
