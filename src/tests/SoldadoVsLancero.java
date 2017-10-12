package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import unidad.Lancero;
import unidad.Punto;
import unidad.Puñal;
import unidad.Soldado;
import unidad.Unidad;

public class SoldadoVsLancero {
	
	private Unidad soldado;
	private Unidad lancero;
	Punto posicion1;
	Punto posicion2;
	
	@Before
	public void SetUp()
	{
		posicion1 = new Punto(1, 1);
		posicion2 = new Punto(1, 4);
		soldado = new Soldado(posicion1);
		lancero = new Lancero(posicion2);
	}
	
	@Test
	public void testSoldadoPlanoVsLanceroPlano() {
		soldado.atacar(lancero);
		assertEquals( 143, lancero.getSalud(), 0);	
	}
	
	@Test
	public void testSoldadoPuñalVsLanceroPlano() {
		soldado = new Puñal(soldado);
		soldado.atacar(lancero);
		
		Unidad soldado2 = new Puñal(new Soldado(posicion1));
		System.out.println(soldado2.getAtaque());
		System.out.println(soldado2.getSalud());
		assertEquals( 140, lancero.getSalud(), 0);	
	}
	
	
}
