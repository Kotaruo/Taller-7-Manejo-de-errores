package SementodeErrores;

public class TodoTIpodeErrores {

	  public static void main(String[] args) {
	        // Error de sintaxis: falta un punto y coma al final de la línea
	        int x = 10
	        System.out.println("El valor de x es: " + x);

	        // Error lógico: se espera que el resultado sea 5, pero es 6
	        int y = 10;
	        int z = 2;
	        int resultado = y / z + 1;
	        System.out.println("El resultado es: " + resultado);

	        // Excepción: se intenta acceder a un elemento fuera del rango de un array
	        int[] numeros = {1, 2, 3};
	        try {
	            int numero = numeros[3];
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Se produjo una excepción: " + e.getMessage());
	        }
	    }
	}
