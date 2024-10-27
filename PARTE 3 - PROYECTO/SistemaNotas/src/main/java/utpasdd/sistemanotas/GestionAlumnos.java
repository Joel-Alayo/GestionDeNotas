/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpasdd.sistemanotas;

/**
 *
 * @author garci
 */
import java.util.ArrayList;
public class GestionAlumnos {
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    // Agregar un alumno
    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }
    // Listar todos los alumnos
    public void listarAlumnos() {
        for (Alumno alumno : listaAlumnos) {  // Estructura repetitiva
            System.out.println(alumno);
        }
    }
    // Buscar un alumno por ID
    public Alumno buscarAlumno(int id) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId() == id) {  // Condicional
                return alumno;
            }
        }
        return null;
    }
}

