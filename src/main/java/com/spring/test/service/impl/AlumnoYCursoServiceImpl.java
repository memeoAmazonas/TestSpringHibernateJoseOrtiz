package com.spring.test.service.impl;

import com.spring.test.entity.Alumno;
import com.spring.test.entity.Curso;
import com.spring.test.repository.CreateQuery;
import com.spring.test.repository.impl.CreateQueryImpl;
import com.spring.test.service.AlumnoYCursoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("alumnoYCursolServiceImpl")

public class AlumnoYCursoServiceImpl implements AlumnoYCursoService {

    private CreateQuery createQuery = new CreateQueryImpl();

    @Override
    public List<Curso> listCursoJuan() {
        return createQuery.listCursosJuan();
    }

    @Override
    public List<Curso> getAlumnosMaximoCalculo() {
        List<Curso> curso = createQuery.getAlumnosMaximoCalculo();
        return curso;
    }
    @Override
    public Double averageNotasPedro() {
        return createQuery.averageNotasPedro();
    }

    @Override
    public List<Alumno> listCursosNombreEqualA() {
        return createQuery.listCursosNombreEqualA();
    }
}
