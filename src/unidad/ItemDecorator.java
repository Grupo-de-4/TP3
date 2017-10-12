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
	
	protected Unidad getUnidad(){
		return this.unidad;
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
