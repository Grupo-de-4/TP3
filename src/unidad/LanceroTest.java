package unidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class LanceroTest {

	@Test
	public void testAtaqueLancero() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Lancero l1 = new Lancero(p);
		Lancero l2 = new Lancero(p2);
		
		l1.atacar(l2);
		
		assertEquals( 128, l2.salud, 0);	
	}

	
	@Test
	public void testLanceroNoPuedeAtacarPorqueEstaMuyCerca() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 1);
		Lancero l1 = new Lancero(p);
		Lancero l2 = new Lancero(p2);
		
		l1.atacar(l2);
		
		assertEquals( 150, l2.salud, 0);	
	}
	
	@Test
	public void testLanceroNoPuedeAtacarPorqueEstaMuyLejos() {

		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 5);
		Lancero l1 = new Lancero(p);
		Lancero l2 = new Lancero(p2);
		
		l1.atacar(l2);
		
		assertEquals( 150, l2.salud, 0);	
	}

}
