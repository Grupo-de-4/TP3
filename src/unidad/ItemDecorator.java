package unidad;

public abstract class ItemDecorator extends Unidad{
	
	private Unidad unidad;
	
	public ItemDecorator(Unidad unidad) {
		super();
		this.unidad = unidad;
	}
	protected abstract boolean puedeEquipar();

	protected Unidad getUnidad(){
		return this.unidad;
	}
	
	public abstract void equipar();
	public abstract void desEquipar();
	public abstract void darBonus();
	public abstract void sacarBonus();
}
