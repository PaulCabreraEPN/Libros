package org.example;
import java.util.Arrays;

public class Estudiante {
    private String nombreCompleto;
    private int edad;
    private int cedula;
    private String correo;
    private float[] arregloNotasInterno = new float[5];

    public Estudiante() {}

    public Estudiante(String nombreCompleto, int edad, int cedula, String correo, float[] arregloNotasExterno) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.cedula = cedula;
        this.correo = correo;
        this.arregloNotasInterno = arregloNotasExterno;
    }

    private String getNombreCmpleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public float[] getArregloNotasInterno() {
        return arregloNotasInterno;
    }

    public void setArregloNotasInterno(float[] arregloNotasExterno) {
        this.arregloNotasInterno = arregloNotasExterno;
    }

    //metodos personalizados

    public void imprimirArreglo() {
        if (arregloNotasInterno == null) {
            System.out.println("No existen Notas Registradas.");
        } else {
            System.out.println("Notas del Estudiante:");
            for (int i = 0; i < arregloNotasInterno.length; i++) {
                System.out.println("Nota " +(i+1) + ": " + arregloNotasInterno[i]);
            }
        }
    }

    //min y max
    public void Min(){
        float minimo = Float.MAX_VALUE;
        for (int i = 0; i < arregloNotasInterno.length; i++) {
            if (arregloNotasInterno[i] < minimo) {
                minimo = arregloNotasInterno[i];
            }
        }
        System.out.println("La nota minima del estudiante es:");
        System.out.println(minimo);
    }
    public void Max(){
        float max = Float.MIN_VALUE;
        for (int i = 0; i < arregloNotasInterno.length; i++) {
            if (arregloNotasInterno[i] > max) {
                max = arregloNotasInterno[i];
            }
        }
        System.out.println("La nota maxima del estudiante es:");
        System.out.println(max);
    }

    //Promedio de las notas
    public void PromedioNotas(){
        float promedio = 0;
        float sum = 0;
        for (int i = 0; i < arregloNotasInterno.length; i++) {
            sum += arregloNotasInterno[i];
            promedio= sum/arregloNotasInterno.length;
        }
        System.out.println("El promedio de notas del estudiante es " + promedio);
    }

    public void mostrarInformacionEstudiante() {
        System.out.println("Nombre Completo: "+this.getNombreCmpleto());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Cedula: "+this.getCedula());
        System.out.println("Correo: "+this.getCorreo());
        imprimirArreglo();
        Min();
        Max();
        PromedioNotas();
    }




}
