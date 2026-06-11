package Calculatrice;

public abstract class OperationBinaire implements CalculMath {
	protected double val1;
	protected double val2;

	public OperationBinaire(double val1, double val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

}
