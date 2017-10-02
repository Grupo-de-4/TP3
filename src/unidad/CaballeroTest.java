package unidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaballeroTest {

	
	
	@Test
	public void testAtaqueCaballero() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 2);
		Caballero c1 = new Caballero(p);
		Caballero c2 = new Caballero(p2);
		
		c1.atacar(c2);
		
		assertEquals( 153, c2.salud, 0);	
	}

	public void testCaballoSePoneRevelde() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 2);
		Caballero c1 = new Caballero(p);
		Caballero c2 = new Caballero(p2);
		
		c1.atacar(c2);
		c1.atacar(c2);
		c1.atacar(c2);
		
		assertFalse( c1.puedeRealizarAtaque());	
	}
	
	public void testPosionCuraAlCaballo() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 2);
		Caballero c1 = new Caballero(p);
		Caballero c2 = new Caballero(p2);
		
		c1.atacar(c2);
		c1.atacar(c2);
		c1.atacar(c2);
		
		c1.consumirAgua();
		
		assertTrue( c1.puedeRealizarAtaque());	
	}
	
}
