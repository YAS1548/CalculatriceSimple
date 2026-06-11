package Calculatrice;

public class Cos extends OperationUnaire {
	public Cos(double val) {
		super(val);
	}

	public double Calculer() {
		return Math.cos(val);
	}

}
