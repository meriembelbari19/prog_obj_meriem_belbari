package fr.dauphine.javaavance.td2;

public class Multiplication implements Expr {

	private Expr expr1;
	private Expr expr2;

	public Multiplication(Expr expr1, Expr expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public double eval() {
		return (expr1.eval() * expr2.eval());
	}

	@Override
	public String toString() {
		return "Le résultat de la multiplication est : " + this.eval();
	}
}