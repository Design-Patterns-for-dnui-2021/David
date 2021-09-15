/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3;

/**
 *
 * @author Dvd
 */
public final class Horizontal extends ScrollDecorator {
	public Horizontal(UI component) {
		super(component);
	}
	
	@Override
	public double scroll() {
		return this.component.scroll();
	}
	
	@Override
	public void info() {
		this.component.info();
		System.out.println("Horizontal Scroll ");
	}
}
