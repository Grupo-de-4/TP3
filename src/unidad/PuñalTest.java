package unidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuñalTest {

	@Test
	public void test() {
			Punto p2 = new Punto(1, 4);
			Unidad s2 = new Soldado(p2);

			s2 = new Puñal( s2 );
				
			assertEquals( 0, s2.getDefensa() , 0);
			assertEquals( 13, s2.getAtaque() , 0);
	}
}
