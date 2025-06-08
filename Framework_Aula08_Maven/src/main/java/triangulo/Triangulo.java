package triangulo;

public class Triangulo {
	
	  public static String classificarTriangulo(int a, int b, int c) {
	        
	        if (a <= 0 || b <= 0 || c <= 0) {
	            return "Lado inválido";
	        }
	        
	        if (a >= b + c || b >= a + c || c >= a + b) {
	            return "Não forma triângulo";
	        }
	        if (a == b && b == c) {
	            return "Equilátero";
	            
	        } else if (a == b || a == c || b == c) {
	            return "Isósceles";
	            
	        } else {
	            return "Escaleno";
	        }
	    }

}
