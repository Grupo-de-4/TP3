package unidad;


public class Main {

	public static void main(String[] args) {

		Punto p = new Punto(1, 1);
		Punto p2 = new Punto(1, 4);
		Soldado s1 = new Soldado(p);
		Soldado s2 = new Soldado(p2);

		s2.equiparEscudo();
		s1.atacar(s2);
	}

}
