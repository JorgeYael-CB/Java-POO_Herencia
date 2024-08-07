package org.yael.pooherencia;

public class Alumno extends Persona{ // herencia
    private String insitucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: Inicializando constructor");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String instucion){
        super(nombre, apellido, edad);
        this.insitucion = instucion;
    }

    public Alumno(
            String nombre,
            String apellido,
            int edad,
            String instucion,
            double notaMatematica,
            double notaHistoria,
            double notaCastellano
    ){
        this(nombre, apellido, edad, instucion);
        this.notaMatematica = notaMatematica;
        this.notaHistoria = notaHistoria;
        this.notaCastellano = notaCastellano;
    }


    public String getInsitucion() {
        return insitucion;
    }

    public void setInsitucion(String insitucion) {
        this.insitucion = insitucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
