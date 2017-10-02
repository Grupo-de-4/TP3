package unidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class CapaTest {

	@Test
	public void test() {
		Punto p2 = new Punto(1, 4);
		Soldado s2 = new Soldado(p2);

		s2.equiparCapa();
			
		assertEquals( 9, s2.ataque, 0);
		assertEquals( 200, s2.energia, 0);
	}

}
