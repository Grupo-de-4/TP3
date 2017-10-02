package unidad;

public abstract class ItemDecorator extends Unidad{
	
	private Unidad unidad;
	

	public ItemDecorator(Unidad unidad) {
		super();
		this.unidad = unidad;
	}
	protected abstract boolean puedeEquipar();


	
	public  void equipar(){
		if(this.puedeEquipar()){
			this.darBonus();
		}
	}
	
	public void desEquipar() {
		if(this.puedeEquipar()== false)
			this.sacarBonus();
	}
	
	public abstract void darBonus();
	public abstract void sacarBonus();
	
	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}
	
	protected Unidad getUnidad(){
		return this.unidad;
	}
	
}
