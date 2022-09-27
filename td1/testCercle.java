package fr.dauphine.javaavance.td1.Exercice_2;

public class testCercle {
	  public static void main (String[] args){
		 /* Point p = new Point(1,2);
		  Cercle c = new Cercle(p,1);
		  Cercle c2=new Cercle(p,2);
		  c2.translate(1, 1);
		  System.out.println(c+" "+c2);*/
		  Cercle c = new Cercle(new Point(1,2),1);
		  
		  Point p = c.getCenter().translate1(1,1);
		  System.out.println(c);
		  
	  }
}
