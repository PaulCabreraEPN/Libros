package org.example;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner x = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        do {
            System.out.println("Bienvenido al Menu de Calificaciones");
            System.out.println("1. Ingresar libro nuevo");
            System.out.println("2. Revisar libros");
            System.out.println("3. Modificar Libros");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = x.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar información del Estudiante 1:");
                    ingresarInformacionEstudiante(estudiante1,x);

                    break;
                case 2:
                    System.out.println("Mostrando información de los Estudiantes:");
                    estudiante1.mostrarInformacionEstudiante();
                    break;
                /*case 3:
                    System.out.println("Elija qué libro desea modificar (1-5): ");
                    int opcionLibro = x.nextInt();
                    if (opcionLibro >= 1 && opcionLibro <= 5) {
                        modificarLibro(opcionLibro, libro1, libro2, libro3, libro4, libro5, x);
                    } else {
                        System.out.println("Número de libro no válido.");
                    }
                    break;*/
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
        x.close();
    }

    public static void ingresarInformacionEstudiante(Estudiante estudiante, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nombres y Apellidos del Estudiante: ");
        estudiante.setNombreCompleto(scanner.nextLine());
        System.out.println("Edad del Estudiante: ");
        estudiante.setEdad(scanner.nextInt());
        System.out.println("Cédula del Estudiante: ");
        estudiante.setCedula(scanner.nextInt());
        System.out.println("Correo del Estudiante: ");
        estudiante.setCorreo(scanner.next());

        System.out.println("Notas");

        float [] notas=new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresar nota"+(i+1)+" del estudiante: ");
            notas[i]= scanner.nextFloat();
        }

        estudiante.setArregloNotasInterno(notas);
    }



    //public static void modificarLibro(int opcionLibro, Libros libro1, Libros libro2, Libros libro3, Libros libro4, Libros libro5, Scanner scanner) {
        /*Libros libroSeleccionado = null;

        switch (opcionLibro) {
            case 1:
                libroSeleccionado = libro1;
                break;
            case 2:
                libroSeleccionado = libro2;
                break;
            case 3:
                libroSeleccionado = libro3;
                break;
            case 4:
                libroSeleccionado = libro4;
                break;
            case 5:
                libroSeleccionado = libro5;
                break;
            default:
                System.out.println("Número de libro no válido.");
                return;
        }*/
    }
