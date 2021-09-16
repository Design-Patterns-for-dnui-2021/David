/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObservers() {
            observers.forEach((observer) -> {
                observer.update();
        });
	}
}
