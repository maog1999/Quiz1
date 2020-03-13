package view;

import controller.Controller;
import processing.core.PApplet;

public class MainView extends PApplet {
	
	private Controller co;

	public static void main(String[] args) {
		PApplet.main("view.MainView");
	}
public void settings() {
	size(500,500);
}
public void setup() {
	
	co = new Controller(this);

}
public void draw() {
	background(0,0,255);
}
}
