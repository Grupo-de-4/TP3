package unidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class CapaTest {

	@Test
	public void test() {
		Punto p2 = new Punto(1, 4);
		Unidad s2 = new Soldado(p2);

		s2 = new Capa( s2 );
			
		assertEquals( 9, s2.getAtaque() , 0);
		assertEquals( 200, s2.getEnergia(), 0);
	}
	


}
