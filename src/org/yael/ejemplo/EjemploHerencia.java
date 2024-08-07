package org.yael.ejemplo;

import org.yael.pooherencia.*;


public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("=== Crendo instancia ===");
        Alumno alumno = new Alumno();
        alumno.setNombre("Yael");
        alumno.setApellido("Chino");
        alumno.setNotaCastellano(7.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("=== Creando instancia ===");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Petter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("U.S.A.");
        alumnoInt.setEdad(15);
        alumnoInt.setInsitucion("Insituto Nacional");
        alumnoInt.setNotaIdiomas(7.0);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("=== Creando instancia ===");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");

        System.out.println("=== Finalizando instancias ===");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getNombre() + " de " + profesor.getAsignatura());
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido());

        Class clase = alumnoInt.getClass();

        // API de reflexion
        while( clase.getSuperclass() != null ){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println("hija = " + hija);
            System.out.println("padre = " + padre);
            clase = clase.getSuperclass();
        }
    }
}
