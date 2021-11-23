/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dvd
 */
public abstract class Device {
	protected int voltase;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract String getName();
	
	public void setVolt(int newVoltase) {
		this.voltase = newVoltase;
	}
	
	public int getVolt() {
		return voltase;
	}
}
