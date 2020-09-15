package Ejercicio.Java;
import java.util.Scanner;

import Ejercicio.Java.Alumno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
		
		System.out.println("Cuantos alumnos va a ingresar");
		int cant_alumnos= sc.nextInt();
		
		Alumno[] array_alumnos = new Alumno[cant_alumnos];
		
		for(int i=0; i< array_alumnos.length; i++) {
			
		 array_alumnos[i] = new Alumno(); 
		 System.out.println("Ingrese el nombre del alumno");
		 
		 array_alumnos[i].nombre = sc.next();
		 
		 while(true) {
			 System.out.println("Ingrese nota (-2 para terminar");
			 int nota= sc.nextInt();
			 if (nota== -2) {
				 break;
			 }
			 array_alumnos[i].agregarNota(nota);
		 }
		}
		 
		 for (int i = 0; i< array_alumnos.length; i++) {
			 double promedio= array_alumnos[i].promedio();
			 
			// System.out.println("El promedio de " +array_alumnos[i].nombre+ " es: " +promedio);
			 System.out.println("El promedio de " +array_alumnos[i].nombre+ " es: " +promedio + " y su mayor nota fue " +array_alumnos[i].maximaNota());
			 
			 
		 }
		 
		 sc.close();
		}
	
	}


