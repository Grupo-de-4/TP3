package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import unidad.Arquero;
import unidad.Punto;

public class ArqueroTest {

	@Test
	public void testAtaqueArquero() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Arquero a1 = new Arquero(p);
		Arquero a2 = new Arquero(p2);
		
		a1.atacar(a2);
		
		assertEquals( 48, a2.getSalud(), 0);	
	}

	@Test
	public void testArqueroNoPuedeAtacarPorqueEstaMuyCerca() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 2);
		Arquero a1 = new Arquero(p);
		Arquero a2 = new Arquero(p2);
		
		a1.atacar(a2);
		
		assertEquals( 50, a2.getSalud(), 0);	
	}
	
	@Test
	public void testArqueroNoPuedeAtacarPorqueEstaMuyLejos() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 7);
		Arquero a1 = new Arquero(p);
		Arquero a2 = new Arquero(p2);
		
		a1.atacar(a2);
		
		assertEquals( 50, a2.getSalud(), 0);	
	}
	
	@Test
	public void testArqueroSeQuedaSinFlechas() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Arquero a1 = new Arquero(p);
		Arquero a2 = new Arquero(p2);
		
		for (int i = 0; i < 20; i++) {
			a1.atacar(a2);
		}
		
		assertFalse( a1.puedeRealizarAtaque());
	}
	
	@Test
	public void testArqueroSeQuedaSinFlechasPeroAgarraMas() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Arquero a1 = new Arquero(p);
		Arquero a2 = new Arquero(p2);
		
		for (int i = 0; i < 20; i++) {
			a1.atacar(a2);
		}
		
		a1.recargarFlechas();
		
		
		assertTrue( a1.puedeRealizarAtaque());
	}
	
	

	
}
