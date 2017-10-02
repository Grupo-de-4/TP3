package unidad;

public class Puñal extends ItemDecorator{

	private int ataqueBonus;
	private int defensaBonus;
	public Puñal(Unidad unidad) {
		super(unidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean puedeEquipar() {
		if(this.getUnidad().items[2] == null)
			return true;
		return false;
	}

	@Override
	public void darBonus() {
			this.getUnidad().ataque += 3;
			this.getUnidad().defensa -= 3;
			this.getUnidad().items[2] = "Puñal";
	}

	@Override
	public void consumirAgua() {}

	@Override
	public void serAtacado(int daño) {}

	@Override
	public void realizarAtaque() {}

	@Override
	protected boolean puedeRealizarAtaque() {return false;}

	@Override
	public void sacarBonus() {
		this.getUnidad().ataque -= this.ataqueBonus;
		this.getUnidad().defensa += this.defensaBonus;
		this.getUnidad().items[2] = null;
		
	}

}
