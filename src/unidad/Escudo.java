package unidad;

public class Escudo extends ItemDecorator{

	public Escudo(Unidad unidad) {
		super(unidad);
	}

	@Override
	public void darBonus() {
		if(this.puedeEquipar())
			{this.defensa += (this.defensa*40)/100;
			this.items[0] = "Escudo";}
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
	protected boolean puedeEquipar() {
		if(this.items[0] == null)
			return true;
		return false;
	}
	
}
