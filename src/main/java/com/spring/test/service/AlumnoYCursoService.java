package com.spring.test.service;

import com.spring.test.entity.Alumno;
import com.spring.test.entity.Curso;

import java.util.List;

public interface AlumnoYCursoService {
    Double averageNotasPedro();
    List<Alumno> listCursosNombreEqualA();
    List<Curso> listCursoJuan();
    List<Curso> getAlumnosMaximoCalculo();
}
