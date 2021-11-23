/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dvd
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Device tv = new TV("LG", 200);
		Device washMachine = new WashingMachine("Samsung", 150);
		Socket socket = new ThreePhaseAdapter(tv);
		socket.plug();
		System.out.println("---------------------------");
		socket = new ThreePhaseAdapter(washMachine);
		socket.plug();
		
	}
    
}
