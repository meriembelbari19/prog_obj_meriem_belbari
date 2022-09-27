package fr.dauphine.javaavance.td1.Exercice_2;

import java.util.List;

public class Ring extends Cercle {
	
private int radiusOut;

	public Ring(Point p, int r,int r2) {
		super(p, Math.min(r, r2));
		this.radiusOut=Math.max(r, r2);
	}

	public boolean equals(Object obj) {
		  if (obj instanceof Ring) {
			  if(this.radiusOut==((Ring)obj).radiusOut && 
					  this.getCenter().equals(((Ring)obj).getCenter())
					  &&this.getRadius()==((Ring)obj).getRadius())return true;
		  }
			return false;  
		}
	
	public String toString() {	
	return "( "+super.toString()+" , "+this.radiusOut+" )";
	}
	
	public boolean contains(Point p) {
		double distance = Math.sqrt(Math.pow(this.getCenter().getY()-p.getY(), 2)+Math.pow(this.getCenter().getX()-p.getX(),2));
		if(distance <= this.getRadius() && distance >= this.getRadius()-this.radiusOut)return true;
		return false;
	}
	
	public boolean contains(Point p, List<Cercle> rings) {
		for (Cercle r : rings ) {
			if (r.contains(p)) return true;
		}
		return false;
	}

}
