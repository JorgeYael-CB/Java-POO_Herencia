package org.yael.ejemplo;

import org.yael.pooherencia.*;


public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Yael", "Chino", 14, "Insituto Nacional");
        alumno.setNotaMatematica(4.9);
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInsitucion("Insituto Nacional");
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);

        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(30);

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir( Persona persona ){
        System.out.print(persona.saludar());

        if( persona instanceof Alumno ){
            double promedio = ((Alumno) persona).calcularPromedio();
            System.out.println("  ===== Calificacion promedio del alumno: " + promedio);
        } else {
            System.out.println(".");
        }
    }
}
