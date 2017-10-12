package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import unidad.Arquero;
import unidad.Caballero;
import unidad.Capa;
import unidad.Escudo;
import unidad.Punto;
import unidad.Puñal;
import unidad.Unidad;

/*TODO
15.Arquero pelado vs Caballero
16.Arquero con puñal vs Caballero
17.Arquero con puñal y capa vs Caballero
18.Arquero con puñal y capa vs Caballero con escudo
19.Arquero vs Caballero con escudo
19.2 Arquero ataca a Caballero dos veces
19.3 Arquero ataca a caballero hasta la muerte, lluvia de flechas persa
 */

public class ArqueroVsCaballero {
	private Unidad arquero;
	private Unidad caballero;
	Punto posicion1;
	Punto posicion2;
	
	@Before
	public void SetUp()
	{
		posicion1 = new Punto(1, 1);
		posicion2 = new Punto(2, 4);
		arquero = new Arquero(posicion1);
		caballero = new Caballero(posicion2);
	}
	
	@Test
	public void testArqueroPlanoVsCaballeroPlano() {
		arquero.atacar(caballero);
		assertEquals( 198, caballero.getSalud(), 0);	
	}
	
	@Test
	public void testArqueroPuñalVsCaballeroPlano() {
		arquero = new Puñal(arquero);
		arquero.atacar(caballero);
		assertEquals( 195, caballero.getSalud(), 0);	
	}
	
	@Test
	public void testArqueroPuñalCapaVsCaballeroPlano() {
		arquero = new Puñal(arquero);
		arquero = new Capa(arquero);
		arquero.atacar(caballero);
		assertEquals( 196, caballero.getSalud(), 0);	
	}
	
	@Test
	public void testArqueroPuñalCapaVsCaballeroEscudo() {
		arquero = new Puñal(arquero);
		arquero = new Capa(arquero);
		caballero = new Escudo(caballero);
		arquero.atacar(caballero);
		assertEquals( 197, caballero.getSalud(), 0);	
	}
	
	@Test
	public void testArqueroPlanoVsCaballeroEscudo() {
		caballero = new Escudo(caballero);
		arquero.atacar(caballero);
		assertEquals( 199, caballero.getSalud(), 0);	
	}
	
	@Test
	public void testArqueroPlanoVsCaballeroEscudoDosVeces() {
		caballero = new Escudo(caballero);
		arquero.atacar(caballero);
		arquero.atacar(caballero);
		assertEquals( 198, caballero.getSalud(), 0);	
	}
	
	/* Falta solucionar el problema de polimorfismo
	@Test
	public void testArqueroPlanoVsCaballeroEscudoPersa() {
		caballero = new Escudo(caballero);
		while(caballero.getSalud()>=0)
		{
			if(arquero.)
			arquero.atacar(caballero);
		}
		
		assertEquals( 0, caballero.getSalud(), 0);	
	}
	*/
}
