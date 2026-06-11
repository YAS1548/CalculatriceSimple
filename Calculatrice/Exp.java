package Calculatrice;

public class Exp extends OperationUnaire {
	public Exp(double val) {
		super(val);
	}

	public double Calculer() {
		return Math.exp(val);
	}

}
