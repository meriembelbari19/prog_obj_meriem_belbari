package fr.dauphine.javaavance.td1.Exercice_2;

import java.util.List;

public class Cercle {

	private Point center;
	private int radius;
	
	public Cercle(Point p,int r) {
		this.center=p;
		this.radius=r;
	}
	
	public Point getCenter() {
		return this.center;
	}
	public int getRadius() {
		return this.radius;
	}
	public String toString() {
		return " ( "+this.center.toString()+" , "+this.radius+" ) ";
	}
	
	public void translate(int dx, int dy) {
		Point c = this.center.translate1(dx,dy);
		this.center = c;
		//this.center.translate(dx, dy);
	}
	
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
	
	public boolean contains(Point p) {
		double distance = Math.sqrt(Math.pow(center.getY()-p.getY(), 2)+Math.pow(center.getX()-p.getX(),2));
		if(distance <= this.radius)return true;
		return false;
	}
	
	public boolean contains (Point p , List<Cercle> cercles) {
		for(Cercle c : cercles ) {
			if(c.contains(p))return true;
		}
		return false;
	}
}
