/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsimulation;

/**
 *
 * @author Dvd
 */
public class PetFactory {
	private String sound;
	public Pet createBaseOn(String sound) {
		this.sound = sound;
		if(sound.equalsIgnoreCase("quack")){
			return new Duck();
		}
		if(sound.equalsIgnoreCase("meow")){
			return new Cat();
		}
		if(sound.equalsIgnoreCase("cit")){
			return new Mouse();
		}
		throw new Error("Sound ERROR");
	}
	public void displayInfo() {
		
	}
}
