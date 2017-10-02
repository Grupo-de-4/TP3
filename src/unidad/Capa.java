package unidad;

public class Capa extends ItemDecorator{

	private int energiaBonus;
	private int ataqueBonus;
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
				this.energiaBonus = this.energia *= 2;
				this.energiaBonus = this.ataque -= (this.ataque*10)/100;
				this.items[1] = "Capa";
		
	}

	@Override
	public void consumirAgua() {}

	@Override
	public void serAtacado(int daño) {}

	@Override
	public void realizarAtaque() {}

	@Override
	protected boolean puedeRealizarAtaque() {
		return false;
	}

	@Override
	public void equipar() {
		if(this.puedeEquipar()){
			this.darBonus();
		}
			
		
	}

	@Override
	public void desEquipar() {
		if(this.puedeEquipar()== false)
			this.sacarBonus();
		
	}

	@Override
	public void sacarBonus() {
		this.energia -= this.energiaBonus;
		this.ataque += this.ataqueBonus;
		this.items[1] = null;
		
	}
	
	

}
