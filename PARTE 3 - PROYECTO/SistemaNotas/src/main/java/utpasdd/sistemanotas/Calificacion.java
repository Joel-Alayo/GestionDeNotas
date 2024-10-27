/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpasdd.sistemanotas;

/**
 *
 * @author garci
 */
public class Calificacion {
    private Alumno alumno;
    private Curso curso;
    private double nota;

    public Calificacion(Alumno alumno, Curso curso, double nota) {
        this.alumno = alumno;
        this.curso = curso;
        this.nota = nota;
    }
    public Alumno getAlumno() { return alumno; }
    public void setAlumno(Alumno alumno) { this.alumno = alumno; }
    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }
}
