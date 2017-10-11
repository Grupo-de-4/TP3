package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import unidad.Escudo;
import unidad.Punto;
import unidad.Soldado;
import unidad.Unidad;

public class EscudoTest {

	@Test
	public void test() {
		Punto p2 = new Punto(1, 4);
		Unidad s2 = new Soldado(p2);

		s2 = new Escudo( s2 );
			
		assertEquals( 4, s2.getDefensa() , 0);
	}
}
