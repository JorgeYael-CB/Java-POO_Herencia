package org.yael.pooherencia;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor vacio");
    }

    public Profesor( String nombre, String apellido ){
        super(nombre, apellido);
    }

    public Profesor( String nombre, String apellido, String asignatura ){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public Profesor( String nombre, String apellido, String asignatura, int edad ){
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    public Profesor( String nombre, String apellido, String asignatura, int edad, String email ){
        super(nombre, apellido, edad, email);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Hola, sere su profesor y mi nombre es " + this.getNombre();
    }

}
