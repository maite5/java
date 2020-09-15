package Ejercicio.Java;

public class Alumno {
	public String nombre;
	 public int[] notas =new int[100];
	 public int cantidad_notas=0;
	 public void agregarNota(int nota) {
		 
		 this.notas[this.cantidad_notas]= nota;
		 this.cantidad_notas++;
	 }
	 
	 public double promedio() {
		 double sum =0;
		 for(int i = 0; i<this.cantidad_notas; i++) {
			 sum += this.notas[i] ; 
		 }
		 return sum/this.cantidad_notas; 
	 }
		
	  //nota maxima 
	 public int maximaNota() {
		 int max=0;
		 for (int i =0; i< this.cantidad_notas; i++) {
			 if (this.notas[i] >max) {
				 max= this.notas[i];
			 }
		 }
		 return max;
	 }
	}



