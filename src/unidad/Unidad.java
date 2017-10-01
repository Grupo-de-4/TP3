package unidad;


public abstract class Unidad {
	
	protected final static int CANT_MAX_ITEMS = 3;
	
	protected int salud;
	protected int ataque;
	protected int defensa;
	protected int energia;
	protected double distanciaMinima;
	protected double distanciaMaxima;
	protected Punto posicion;
	protected String[] items;
	
	public Unidad(Punto Pos){
		items = new String[3];
		this.posicion = Pos;
	}
	
//	public Unidad(int sa, int at, int de, int en, double mi, double ma, Punto posicion2) {
//		this.salud = sa;
//		this.ataque = at;
//		this.defensa = de;
//		this.energia = en;
//		this.distanciaMinima = mi;
//		this.distanciaMaxima = ma;
//		this.posicion = posicion2;
//	}

	public Unidad() {
		// TODO Auto-generated constructor stub
	}

	public boolean atacar(Unidad unidad) {
		if(this.puedeAtacar(unidad)) {
			this.realizarAtaque();
			unidad.serAtacado(this.ataque);
			return true;
		}
		return false;
}

	public abstract void consumirAgua();
	
	public abstract void serAtacado(int daño);	
	
	public  abstract void realizarAtaque();

	public boolean puedeAtacar(Unidad unidad) {
		if(this.estaMuerto() || unidad.estaMuerto())
			return false;
		double distancia = this.posicion.distanciaCon(unidad.getPosicion());
		if(distancia >= this.distanciaMinima && distancia <= this.distanciaMaxima && this.puedeRealizarAtaque())
			return true;
		return false;
	}


	protected abstract boolean puedeRealizarAtaque();

	public boolean estaMuerto() {
		// TODO Auto-generated method stub
		return this.salud == 0;
	}
	
	public Punto getPosicion() {
		return posicion;
	}

	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	
}


