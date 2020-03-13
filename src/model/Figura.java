package model;

public abstract class Figura {
private int posX;
private int posY;
private int tamanoo;
private int dir;
private int vel1;
private int vel2;
private int color;

	public Figura( int tamannno,int posx,int posy, int dir) {
		this.posX=posx;
		this.posY=posy;
		this.dir=dir;
		//this.color=color;
		this.tamanoo=tamannno;
		vel1=2;
		vel2=3;
	}
	
	public void mover() {
		posX += vel1;
		posY += vel2;
		
		if(posX>=460 || posX<=110) {
			vel1*=-1;
		}
		if(posY>=480 || posY<=20) {
			vel2*=-1;
		}
	}
	
	public void dibujar() {
		
	}
	public int getDir() {
		return dir;
	}
	
	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTamanoo() {
		return tamanoo;
	}

	public void setTamanoo(int tamanoo) {
		this.tamanoo = tamanoo;
	}

	public int getVel1() {
		return vel1;
	}

	public void setVel1(int vel1) {
		this.vel1 = vel1;
	}

	public int getVel2() {
		return vel2;
	}

	public void setVel2(int vel2) {
		this.vel2 = vel2;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
