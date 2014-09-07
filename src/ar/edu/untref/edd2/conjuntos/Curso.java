package ar.edu.untref.edd2.conjuntos;

import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nombre;
    
    private List<Alumno> alumnos;
    
    public Curso(String nombre) {
        
        this.nombre = nombre;
        this.alumnos = new LinkedList<Alumno>();
    }
    
    public String getNombre() {
        
        return this.nombre;
    }
    
    /**
     * post: agrega el Alumno al curso, quedando asociado al último número 
     *       de orden disponible.  
     * 
     * @param alumno : nuevo Alumno del Curso.
     */
    public void agregar(Alumno alumno) {
        
        this.alumnos.add(alumno);
    }
    
    /**
     * @return cantidad de Alumnos que pertenecen al Curso. 
     */
    public int contarAlumnos() {
        
        return this.alumnos.size();
    }
    
    /**
     * pre : orden está en el intervalo [1, contarAlumnos()]
     * post: busca el Alumno asociado el número de orden dado.
     * 
     * @param orden
     * @return Alumno asociado a orden. 
     */
    public Alumno obtenerAlumno(int orden) {
        
        if ((orden < 1) || (orden > this.contarAlumnos())) {
            
            throw new IllegalArgumentException("No existe el alumno con el número de orden indicado: " + orden);
        }
        
        return this.alumnos.get(orden - 1);
    }
}
