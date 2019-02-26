package com.spring.test.repository;

import com.spring.test.entity.Alumno;
import com.spring.test.entity.Curso;

import java.util.List;

public interface CreateQuery {
    void setData();
    Double averageNotasPedro();
    List<Curso> listCursosJuan();
    List<Alumno> listCursosNombreEqualA();
    List<Curso> getAlumnosMaximoCalculo();
}
