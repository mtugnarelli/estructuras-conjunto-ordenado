package ar.edu.untref.edd2.conjuntos;

public class Alumno {

    private int legajo;
    
    private String nombre;
    
    private double promedio;
    
    public Alumno(int legajo, String nombre, double promedio) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}
