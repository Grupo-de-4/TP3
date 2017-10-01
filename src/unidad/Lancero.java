package unidad;

public class Lancero extends Unidad{

	private final static int SALUD = 150;

	private final static int ATAQUE = 25;

	private final static int DEFENSA = 3;

	private final static double DISTANCIA_MINIMA = 1;

	private final static double DISTANCIA_MAXIMA = 3;
	
	public Lancero(Punto Posicion){
		super(Posicion);
		this.ataque = ATAQUE;
		this.defensa = DEFENSA;
		this.salud = SALUD;
		this.distanciaMinima = DISTANCIA_MINIMA;
		this.distanciaMaxima = DISTANCIA_MAXIMA;
	}
	@Override
	public void consumirAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serAtacado(int daño) {
		if(daño > this.defensa)
			if (this.salud < daño)
				this.salud = 0;
			else
				this.salud -= daño - this.defensa;
		
	}

	@Override
	public void realizarAtaque() {
		
	}

	@Override
	protected boolean puedeRealizarAtaque() {
		return true;
	}

}
