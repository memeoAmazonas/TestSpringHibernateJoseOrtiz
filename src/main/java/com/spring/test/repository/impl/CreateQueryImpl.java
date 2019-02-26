package com.spring.test.repository.impl;

import com.spring.test.entity.Alumno;
import com.spring.test.entity.Curso;
import com.spring.test.repository.CreateQuery;
import com.spring.test.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateQueryImpl implements CreateQuery {


    @Override
    public void setData() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Alumno a1 = new Alumno("juan","gonzales","06/12/1983","caracas");
        Curso c1 = new Curso("curso1",20,"prof1",3,3,a1);
        Curso c2 = new Curso("curso2",30,"prof2",4,4,a1);
        Curso c3 = new Curso("curso3",40,"prof3",5,5,a1);
        Curso c4 = new Curso("curso4",50,"prof4",6,6,a1);
        Set<Curso> cursos = new HashSet<>();
        cursos.add(c1);
        cursos.add(c2);
        cursos.add(c3);
        cursos.add(c4);
        a1.setCursos(cursos);
        session.save(a1);
        if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            session.getTransaction().commit();
        }
        Alumno a2 = new Alumno("Alejandro","fernandez","06/12/1983","caracas");
        Curso c11 = new Curso("calculo numerico",20,"prof1",131,3,a2);
        Curso c12 = new Curso("curso2",30,"prof2",41,14,a2);
        Curso c13 = new Curso("curso3",40,"prof3",51,5,a2);
        Curso c14 = new Curso("curso4",50,"prof4",61,6,a2);
        cursos.clear();
        cursos.add(c11);
        cursos.add(c12);
        cursos.add(c13);
        cursos.add(c14);
        a2.setCursos(cursos);
        session.save(a2);
        if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            session.getTransaction().commit();
        }
        Alumno a5 = new Alumno("Pedro","alcantara","06/12/1983","caracas");
        Curso c21 = new Curso("calculo numerico",20,"prof1",311,13,a5);
        Curso c22 = new Curso("curso2",30,"prof2",41,4,a5);
        Curso c23 = new Curso("curso3",40,"prof3",51,5,a5);
        Curso c24 = new Curso("curso4",50,"prof4",61,6,a5);
        cursos.clear();
        cursos.add(c21);
        cursos.add(c22);
        cursos.add(c23);
        cursos.add(c24);
        a5.setCursos(cursos);
        session.save(a5);
        if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            session.getTransaction().commit();
        }
        Alumno a4 = new Alumno("Luis","perez","06/12/1983","caracas");
        Curso c31 = new Curso("calculo numerico",20,"prof1",310,19,a4);
        Curso c32 = new Curso("curso2",30,"prof2",41,4,a4);
        Curso c33 = new Curso("curso3",40,"prof3",51,5,a4);
        Curso c34 = new Curso("curso4",50,"prof4",61,6,a4);
        cursos.clear();
        cursos.add(c31);
        cursos.add(c32);
        cursos.add(c33);
        cursos.add(c34);
        a4.setCursos(cursos);
        session.save(a4);
        if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            session.getTransaction().commit();
        }
        Alumno a3 = new Alumno("Andres","peleaez","06/12/1983","caracas");
        Curso c41 = new Curso("calculo numerico",20,"prof1",31,1,a3);
        Curso c42 = new Curso("curso2",30,"prof2",41,4,a3);
        Curso c43 = new Curso("curso3",40,"prof3",51,5,a3);
        Curso c44 = new Curso("curso4",50,"prof4",61,6,a3);
        cursos.clear();
        cursos.add(c41);
        cursos.add(c42);
        cursos.add(c43);
        cursos.add(c44);
        a3.setCursos(cursos);
        session.save(a3);
        if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            session.getTransaction().commit();
        }
        session.close();
    }

    @Override
    public Double averageNotasPedro() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select avg(c.nota) from Curso c inner join Alumno a on c.alumno.idAlumno = a.idAlumno where c.alumno.nombre = 'Pedro'");
        List<Double> avgs =  query.list();
        session.close();
        return avgs.get(0);
    }

    @Override
    public List<Curso> listCursosJuan() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select c from Curso c inner join Alumno a on c.alumno.idAlumno = a.idAlumno where c.alumno.nombre = 'juan'");
        List<Curso> cursos =  query.list();
        session.close();
        return cursos;
    }

    @Override
    public List<Alumno> listCursosNombreEqualA() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select a from Alumno a where a.nombre like 'A%'");
        List<Alumno> alumnos =  query.list();
        session.close();
        return alumnos;
    }

    @Override
    public List<Curso> getAlumnosMaximoCalculo() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("select c from Curso c inner join Alumno a on c.alumno.idAlumno = a.idAlumno where c.nombreCurso = 'calculo numerico' order by c.nota desc ");
        query.setMaxResults(2);
        List<Curso> response = query.list();
        for (Curso curso : response){
            System.out.println(curso.toString());
        }
        session.close();
        return response;
    }
}
