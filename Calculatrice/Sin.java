package Calculatrice;

public class Sin extends OperationUnaire {
	public Sin(double val) {
		super(val);
	}

	public double Calculer() {
		return Math.sin(val);
	}

}
