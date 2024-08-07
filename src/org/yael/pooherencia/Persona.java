package org.yael.pooherencia;

public class Persona {
//    protected String nombre; // es visible en la propia clase y en toda su desendencia siempre que esten en el mismo package.
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String email;


    public Persona(){
        System.out.println("persona: Inicializando constructor vacio");
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, String email){
        this(nombre, apellido, edad);
        this.email = email;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
