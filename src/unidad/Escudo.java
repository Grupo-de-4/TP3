package unidad;

public class Escudo extends ItemDecorator{

	private int defensaBonus;
	
	public Escudo(Unidad unidad) {
		super(unidad);
	}

	@Override
	public void darBonus() {
			this.getUnidad().defensa += this.getUnidad().defensa * 0.4;
			this.getUnidad().items[0] = "Escudo";
	}
/*
	@Override
	public void consumirAgua() {
		this.getUnidad().consumirAgua();
	}
*/
	/*
	@Override
	public boolean atacar(Unidad unidad) {
		return this.getUnidad().atacar(unidad);
	}*/

	@Override
	public void serAtacado(int daño) {
		this.getUnidad().serAtacado(daño);
	}

	@Override
	public void realizarAtaque() {
		this.getUnidad().realizarAtaque();
	}

	@Override
	protected boolean puedeRealizarAtaque() {return false;}

	@Override
	protected boolean puedeEquipar() {
		if(this.getUnidad().items[0] == null)
			return true;
		return false;
	}
	@Override
	public void sacarBonus() {
		this.getUnidad().defensa -= this.defensaBonus;
		this.getUnidad().items[0] = null;
		
	}
	
}
