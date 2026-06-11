package Calculatrice;

public class Addition extends OperationBinaire {

	public Addition(double val1, double val2) {
		super(val1, val2);
	}

	public double Calculer() {
		return val1 + val2;

	}

}
