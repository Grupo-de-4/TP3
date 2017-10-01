package unidad;

public class Capa extends ItemDecorator{

	public Capa(Unidad unidad) {
		super(unidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean puedeEquipar() {
		if(this.items[1] == null)
			return true;
		return false;
	}

	@Override
	public void darBonus() {
		if(this.puedeEquipar())
			{
				this.energia *= 2;
				this.ataque -= (this.ataque*10)/100;
				this.items[1] = "Capa";
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
