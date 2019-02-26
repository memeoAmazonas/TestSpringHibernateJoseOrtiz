package com.spring.test.entity;

import java.io.Serializable;


public class Curso implements Serializable {
    private Long idCurso;

    private int nota;

    private String nombreCurso;

    private int horasDictadas;

    private String profesor;

    private Alumno alumno;

    private int cantidadAsistencia;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso() {
    }

    public Curso(String nombreCurso, int horasDictadas, String profesor,int nota, int cantidadAsistencia, Alumno alumno) {
        this.nombreCurso = nombreCurso;
        this.horasDictadas = horasDictadas;
        this.profesor = profesor;
        this.alumno = alumno;
        this.nota = nota;
        this.cantidadAsistencia = cantidadAsistencia;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getCantidadAsistencia() {
        return cantidadAsistencia;
    }

    public void setCantidadAsistencia(int cantidadAsistencia) {
        this.cantidadAsistencia = cantidadAsistencia;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(int horasDictadas) {
        this.horasDictadas = horasDictadas;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nota=" + nota +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", horasDictadas=" + horasDictadas +
                ", profesor='" + profesor + '\'' +
                ", alumno=" + alumno +
                ", cantidadAsistencia=" + cantidadAsistencia +
                '}';
    }
}
