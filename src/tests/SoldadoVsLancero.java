package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sun.security.x509.PolicyInformation;
import unidad.Capa;
import unidad.Escudo;
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

		assertEquals( 140, lancero.getSalud(), 0);	
	}
	
	/*
	 * 13.Soldado con puñal y capa vs Lancero
14.Soldado con puñal, capa vs Lancero con escudo
20. Soldado vs Lancero con escudo
20.2 Soldado vs Lancero con escudo, lancero toma pocion
20.3 Soldado vs lancero, ataca hasta la muerte del lancero. La familia del lancero llora.
	*/
	
	@Test
	public void testSoldadoPuñalCapaVsLancero()
	{
		soldado = new Puñal(soldado);
		soldado = new Capa(soldado);
		soldado.atacar(lancero);
		assertEquals( 142, lancero.getSalud(), 0);	
	}
	
	@Test
	public void testSoldadoPuñalCapaVsLanceroEscudo()
	{
		soldado = new Puñal(soldado);
		soldado = new Capa(soldado);
		lancero = new Escudo(lancero);
		soldado.atacar(lancero);
		assertEquals( 143, lancero.getSalud(), 0);	
	}
	
	@Test
	public void testSoldadoPlanoVsLanceroEscudo()
	{
		lancero = new Escudo(lancero);
		soldado.atacar(lancero);
		assertEquals( 144, lancero.getSalud(), 0);	
	}
	
	@Test
	public void testSoldadoPlanoVsLanceroEscudoPocion()
	{
		lancero = new Escudo(lancero);
		soldado.atacar(lancero);
		
		assertEquals( 144, lancero.getSalud(), 0);	
	}
}
