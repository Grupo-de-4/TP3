package unidad;

public class Capa extends ItemDecorator {

	private int energiaBonus;
	private int ataqueBonus;

	public Capa(Unidad unidad) {
		super(unidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean puedeEquipar() {
		if (this.getUnidad().items[1] == null)
			return true;
		return false;
	}

	@Override
	public void darBonus() {
		//this.getUnidad().darBonus();
		this.getUnidad().energia *= 2;
		this.getUnidad().ataque -= this.getUnidad().ataque * 0.1;
		this.getUnidad().items[1] = "Capa";
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
	}
*/
	@Override
	public void serAtacado(int daño) {
		this.getUnidad().serAtacado(daño);
	}

	@Override
	public void realizarAtaque() {
		this.getUnidad().realizarAtaque();
	}

	@Override
	protected boolean puedeRealizarAtaque() {
		return false;
	}

	@Override
	public void sacarBonus() {
		this.getUnidad().energia -= this.energiaBonus;
		this.getUnidad().ataque += this.ataqueBonus;
		this.getUnidad().items[1] = null;
	}
}
