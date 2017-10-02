package unidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuñalTest {

	@Test
	public void test() {
		Punto p2 = new Punto(1, 4);
		Soldado s2 = new Soldado(p2);

		s2.equiparPuñal();
			
		assertEquals( 13, s2.ataque, 0);
		assertEquals( 0, s2.defensa, 0);
	}
}
