package ar.edu.untref.edd2.conjuntos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCurso {

    private Curso curso;
    
    @Before
    public void inicializar() {
        
        this.curso = new Curso("Estructura de Datos 2");
    }
    
    @Test
    public void crearCursoSinAlumnos() {
        
        Curso edd1 = new Curso("Estructura de Datos 1");
        
        Assert.assertEquals("nombre", "Estructura de Datos 1", edd1.getNombre());
        Assert.assertEquals("cantidad de alumnos", 0, edd1.contarAlumnos());
    }
    
    @Test
    public void agregarUnUnicoAlumno() {
        
        Alumno damian = new Alumno(6587, "Damian", 5.2);

        this.curso.agregar(damian);
        
        Assert.assertEquals("cantidad de alumnos", 1, this.curso.contarAlumnos());
        Assert.assertNotNull("1º alumno", this.curso.obtenerAlumno(1));
        Assert.assertEquals("1º alumno, damian", damian, this.curso.obtenerAlumno(1));
    }
    
    @Test
    public void agregarMultiplesAlumnos() {
        
        Alumno martin = new Alumno(6527, "Martin", 4.0);
        Alumno julieta = new Alumno(5896, "Julieta", 8.0);
        Alumno lucas = new Alumno(5877, "Lucas", 7.5);

        this.curso.agregar(martin);
        this.curso.agregar(julieta);
        this.curso.agregar(lucas);
        
        Assert.assertEquals("cantidad de alumnos", 3, this.curso.contarAlumnos());
        Assert.assertEquals("1º alumno", martin, this.curso.obtenerAlumno(1));
        Assert.assertEquals("2º alumno", julieta, this.curso.obtenerAlumno(2));
        Assert.assertEquals("3º alumno", lucas, this.curso.obtenerAlumno(3));
    }
    
    @Test(expected = Exception.class)
    public void obtenerUnAlumnoConOrdenMenorAUnoGeneraUnError() {
        
        this.curso.obtenerAlumno(0);
    }
    
    @Test(expected = Exception.class)
    public void obtenerUnAlumnoConOrdenMayorACantidadDeAlumnosGeneraUnError() {
        
        Alumno martin = new Alumno(6527, "Martin", 4.0);
        Alumno julieta = new Alumno(5896, "Julieta", 8.0);
        this.curso.agregar(martin);
        this.curso.agregar(julieta);

        this.curso.obtenerAlumno(3);
    }
}
