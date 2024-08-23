package com.ESFE.Asistenciaa.Repositorios;

import com.ESFE.Asistenciaa.Entidades.Estudiante;
import com.ESFE.Asistenciaa.Entidades.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository  extends JpaRepository<Estudiante,Integer> {
}
