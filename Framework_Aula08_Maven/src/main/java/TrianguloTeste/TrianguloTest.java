package TrianguloTeste;
import org.junit.jupiter.api.Test;
import triangulo.Triangulo;
import static org.junit.jupiter.api.Assertions.*;
public class TrianguloTest {
	
	 @Test
	    public void testEquilatero() {
	        assertEquals("Equilátero", Triangulo.classificarTriangulo(5, 5, 5));
	    }

	    @Test
	    public void testIsosceles() {
	        assertEquals("Isósceles", Triangulo.classificarTriangulo(5, 5, 3));
	        assertEquals("Isósceles", Triangulo.classificarTriangulo(3, 5, 5));
	        assertEquals("Isósceles", Triangulo.classificarTriangulo(5, 3, 5));
	    }

	    @Test
	    public void testEscaleno() {
	        assertEquals("Escaleno", Triangulo.classificarTriangulo(4, 5, 6));
	    }

	    @Test
	    public void testLadoInvalido() {
	        assertEquals("Lado inválido", Triangulo.classificarTriangulo(0, 5, 5));
	        assertEquals("Lado inválido", Triangulo.classificarTriangulo(5, -1, 5));
	        assertEquals("Lado inválido", Triangulo.classificarTriangulo(5, 5, -2));
	    }

	    @Test
	    public void testNaoFormaTriangulo() {
	        assertEquals("Não forma triângulo", Triangulo.classificarTriangulo(1, 2, 3));
	        assertEquals("Não forma triângulo", Triangulo.classificarTriangulo(10, 2, 2));
	        assertEquals("Não forma triângulo", Triangulo.classificarTriangulo(2, 10, 2));
	        assertEquals("Não forma triângulo", Triangulo.classificarTriangulo(2, 2, 10));
	    }

}
