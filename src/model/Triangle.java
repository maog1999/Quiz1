package model;

import processing.core.PApplet;

public class Triangle extends Figura{

	PApplet appTri;
	
	public Triangle(int tamannno,int posx,int posy, int dir, PApplet appTri) {
		super(tamannno,posx,posy,dir);
		
		this.appTri=appTri;
	}
	
	public void dibujar() {
		appTri.fill(getColor());		
		int puntox1 = getPosX();
		int puntox2 = getPosX()+getTamanoo();
		int puntox3 = getPosX()+(2*getTamanoo());
		int puntoy1 = getPosY();
		int puntoy2 = getPosY()- getTamanoo();
		int puntoy3 = getPosY();
		appTri.triangle(puntox1,puntoy1,puntox2,puntoy2,puntox3,puntoy3);
	}
	
	
	

}
