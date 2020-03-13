package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	
	private Logic lo;
	private PApplet appCo;
	
	public Controller(PApplet appCo) {
		this.appCo=appCo;
		this.lo= new Logic(appCo);
	}
	
	
}
