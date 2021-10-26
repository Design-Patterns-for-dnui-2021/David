/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment6;

/**
 *
 * @author Dvd
 */
public class Experiment6 {
	public static void main(String[] args) {
		PrintPool app = PrintPool.getInstance();
		app.input(1, "Image1.jpeg", 1);
		app.input(2, "Image2.jpeg", 1);
		app.input(3, "Image3.jpeg", 1);
		app.show();
		app.changeprio(1, 3);
		app.abort(2);
		System.out.println("Update : ");
		app.show();
		PrintPool app2 = PrintPool.getInstance();
	}

}
