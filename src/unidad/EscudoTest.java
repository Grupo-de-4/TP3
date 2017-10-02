package unidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class EscudoTest {

	@Test
	public void testEquiparEscudo() {
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Soldado s1 = new Soldado(p);
		Soldado s2 = new Soldado(p2);

		s2.equiparEscudo();
		s1.atacar(s2);
		
		
		assertEquals( 194, s2.salud, 0);
	}
	
	@Test
	public void testDesEquiparEscudo() {
		Punto p2 = new Punto(1, 4);
		Soldado s2 = new Soldado(p2);

		s2.equiparCapa();
			
		assertEquals( 3, s2.defensa, 0);
	}

}
