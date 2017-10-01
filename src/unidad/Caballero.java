package unidad;

public class Caballero extends Unidad{


	private final static int SALUD = 200;

	private final static int ATAQUE = 50;

	private final static int DEFENSA = 3;

	private final static double DISTANCIA_MINIMA = 1;

	private final static double DISTANCIA_MAXIMA = 2;
	
	private final static double ATAQUES_LIMITE = 3;
	
	private int cant_ataques = 0;
	
	public Caballero(Punto Pos) {
		super(Pos);
		this.salud = SALUD;
		this.ataque = ATAQUE;
		this.defensa = DEFENSA;
		this.distanciaMinima = DISTANCIA_MINIMA;
		this.distanciaMaxima = DISTANCIA_MAXIMA;
		
	}
	@Override
	public void consumirAgua() {
		this.cant_ataques = 0;
		
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
		this.cant_ataques++;
		
	}

	@Override
	protected boolean puedeRealizarAtaque() {
		if(this.cant_ataques < 3)
			return true;
		return false;
	}

}
