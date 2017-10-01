package unidad;

public abstract class ItemDecorator extends Unidad{
	
	private Unidad unidad;
	
	public ItemDecorator(Unidad unidad) {
		super();
		this.unidad = unidad;
	}
	protected boolean puedeEquipar() {
		//array list tiene menos de 3 elementos
		if(this.items)
			return true;
		return false;
	}

	protected Unidad getUnidad(){
		return this.unidad;
	}
	public abstract void darBonus();
	
}
