package unidad;

public class Puñal extends ItemDecorator{

	public Puñal(Unidad unidad) {
		super(unidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean puedeEquipar() {
		if(this.items[2] == null)
			return true;
		return false;
	}

	@Override
	public void darBonus() {
		if(this.puedeEquipar())
		{
			this.ataque += 3;
			this.defensa -= 3;
			this.items[1] = "Puñal";
		}
	
		
	}

	@Override
	public void consumirAgua() {
		// TODO Auto-generated method stub
		
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

}
