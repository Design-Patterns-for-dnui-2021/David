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
		// the default state will be available, set in constructor
		HotelRoom hotel = new HotelRoom();
		hotel.showInfo();
		
		// change the room state to reserved
		hotel.changeState(new RoomReserved());
		hotel.showInfo();
		
		// change the room state to occupied
		hotel.changeState(new RoomOccupied());
		hotel.showInfo();
		
		// change it back to available
		hotel.changeState(new RoomAvailable());
		hotel.showInfo();
	}
    
}
