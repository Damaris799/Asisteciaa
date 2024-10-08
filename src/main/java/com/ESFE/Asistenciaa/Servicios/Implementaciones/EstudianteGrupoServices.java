package com.ESFE.Asistenciaa.Servicios.Implementaciones;

import com.ESFE.Asistenciaa.Entidades.EstudianteGrupo;
import com.ESFE.Asistenciaa.Repositorios.IEstudianteGrupoRepository;
import com.ESFE.Asistenciaa.Servicios.Interfaces.IEstudianteGrupoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteGrupoServices implements IEstudianteGrupoServices {

    @Autowired
    private IEstudianteGrupoRepository estudianteGrupoRepository;

    @Override
    public Page<EstudianteGrupo> BuscarTodosPaginados(Pageable pageable) {
        return estudianteGrupoRepository.findByOrderByEstudianteDesc(pageable);
    }

    @Override
    public List<EstudianteGrupo> ObtenerTodos() {
        return estudianteGrupoRepository.findAll();
    }

    @Override
    public EstudianteGrupo CrearOeditar(EstudianteGrupo estudianteGrupo) {
        return estudianteGrupoRepository.save(estudianteGrupo);
    }

    @Override
    public Optional<EstudianteGrupo> BuscarPorId(Integer id) {
        return estudianteGrupoRepository.findById(id);
    }

    @Override
    public void EliminarPorId(Integer id) {
        estudianteGrupoRepository.deleteById(id);
    }
}
