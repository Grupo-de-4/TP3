package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import unidad.Punto;
import unidad.Soldado;

public class SoldadoTest {


	@Test
	public void testAtaqueSoldado() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Soldado s1 = new Soldado(p);
		Soldado s2 = new Soldado(p2);
		
		s1.atacar(s2);
		
		assertEquals( 193, s2.getSalud(), 0);	
	}

	@Test
	public void testSoldadoNoPuedeAtacarPorqueNoTieneEnergia() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Soldado s1 = new Soldado(p);
		Soldado s2 = new Soldado(p2);
		
		s1.setEnergia(0);
		assertFalse( s1.puedeAtacar(s2));
	}
	
	@Test
	public void testSoldadoRecargaLaEnergiaConLaPosion() {
		
		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Soldado s1 = new Soldado(p);
		Soldado s2 = new Soldado(p2);
		
		s1.setEnergia(0);
		s1.consumirAgua();
		
		assertTrue( s1.puedeAtacar(s2));
	}
		

}
