package unidad;

public abstract class ItemDecorator extends Unidad{
	
	private Unidad unidad;
	

	public ItemDecorator(Unidad unidad) {
		super();
		this.unidad = unidad;
		
		if(this.puedeEquipar()){
			this.darBonus();
		}
	}
	protected abstract boolean puedeEquipar();


	public abstract void darBonus();
	public abstract void sacarBonus();
	
	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}
	
	public Unidad getUnidad(){
		return this.unidad.getUnidad();
	}

	@Override
	public boolean atacar(Unidad unidad) {
		return this.getUnidad().atacar(unidad);
	}
	
	@Override
	public Punto getPosicion() {
		return this.getUnidad().getPosicion();
	}
	
	@Override
	public void consumirAgua() {
		this.getUnidad().consumirAgua();
	}
	@Override
	public void serAtacado(int daño) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void realizarAtaque() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected boolean puedeRealizarAtaque() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setSalud(int salud) {
		this.unidad.salud = salud;
	}

	@Override
	public int getSalud() {
		return this.unidad.salud;
	}
	
	@Override
	public int getAtaque() {
		return this.unidad.ataque;
	}

	@Override
	public void setAtaque(int ataque) {
		this.unidad.ataque = ataque;
	}

	@Override
	public int getDefensa() {
		return this.unidad.defensa;
	}

	@Override
	public void setDefensa(int defensa) {
		this.unidad.defensa = defensa;
	}

	@Override
	public int getEnergia() {
		return this.unidad.energia;
	}

	@Override
	public void setEnergia(int energia) {
		this.unidad.energia = energia;
	}

	@Override
	public double getDistanciaMinima() {
		return this.unidad.distanciaMinima;
	}

	@Override
	public void setDistanciaMaxima(double distanciaMaxima) {
		this.unidad.distanciaMaxima = distanciaMaxima;
	}

	@Override
	public String[] getItems() {
		return items;
	}

	@Override
	public void setItems(String[] items) {
		this.items = items;
	}
	
}
