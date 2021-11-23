/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dvd
 */
public class TV extends Device{
    private String tvName;
	public TV(String tvName, int voltase) {
		this.tvName = tvName;
		this.voltase = voltase;
	}
	
	@Override
	public void turnOn() {
		System.out.println(this.tvName+" is Turned on");
	}
	
	@Override
	public void turnOff() {
		System.out.println(this.tvName+" is Turned off");
	}

	@Override
	public String getName() {
		return tvName;
	}
}
