package unidad;

public class Arquero extends Unidad{

	private final static int SALUD = 50;

	private final static int ATAQUE = 5;

	private final static int DEFENSA = 3;

	private final static double DISTANCIA_MINIMA = 2;

	private final static double DISTANCIA_MAXIMA = 5;
	
	private final static int FLECHAS_MAX = 500;
	
	private int flechas = 20;
	
	public Arquero(Punto Posicion){
		super(Posicion);
		this.salud = SALUD;
		this.ataque =ATAQUE;
		this.defensa = DEFENSA;
		this.distanciaMinima = DISTANCIA_MINIMA;
		this.distanciaMaxima = DISTANCIA_MAXIMA;
	}
	@Override
	public void consumirAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serAtacado(int daño) {
			if (this.salud < daño - this.salud)
				this.salud = 0;
			else
				this.salud -= daño - this.defensa;
	}

	@Override
	public void realizarAtaque() {
		this.flechas --;
		
	}

	protected boolean puedeRealizarAtaque() {
		if(this.flechas > 0)
			return true;
		return false;
	}

	public void recargarFlechas() {
		if(!this.estaMuerto()) {
			if(this.flechas + 6 <= Arquero.FLECHAS_MAX)
				this.flechas += 6;
		}
	}
}
