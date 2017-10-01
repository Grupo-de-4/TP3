package unidad;


public class Soldado extends Unidad{

	private final  static int ENERGIA = 100;

	private final static int SALUD = 200;

	private final static int ATAQUE = 10;

	private final static int DEFENSA = 3;

	private final static double DISTANCIA_MINIMA = 0;

	private final static double DISTANCIA_MAXIMA = 1;
	
	private int energia;

	public Soldado(Punto posicion) {
			super(posicion);
			this.energia = ENERGIA;
			this.salud = SALUD;
			this.ataque = ATAQUE;
			this.defensa = DEFENSA;
			this.distanciaMinima = DISTANCIA_MINIMA;
			this.distanciaMaxima = DISTANCIA_MAXIMA;
	}
	
	@Override
	public void consumirAgua() {
		if (!this.estaMuerto())
			this.energia = ENERGIA;
		
	}

	@Override
	public void serAtacado(int daño) {
		// TODO Auto-generated method stub
		if(daño > this.defensa)
			if (this.salud < daño)
				this.salud = 0;
			else
				this.salud -= daño - this.defensa;
	}

	@Override
	public void realizarAtaque() {
		// TODO Auto-generated method stub
		this.energia -= 10;
	}
	
	protected  boolean puedeRealizarAtaque() {
		if(this.energia>= 10)
			return true;
		return false;
	}
}
