package fr.dauphine.javaavance.td2;


public class Racine implements Expr {
	private double val;

	public Racine(double nb) {
		this.val = nb;
	}

	public Racine(Expr expr) {
		this.val = expr.eval();
	}

	@Override
	public double eval() {
		return Math.sqrt(val);
	}

	@Override
	public String toString() {
		return "La resulat de la racine carre \u221A : " + this.eval();
	}
}