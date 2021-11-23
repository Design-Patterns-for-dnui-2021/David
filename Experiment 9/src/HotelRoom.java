/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dvd
 */
public class HotelRoom {
        private RoomState state;
	
	public HotelRoom() {
		this.state = new RoomAvailable();
	}
	
	public void showInfo() {
		this.state.roomInfo();
	}
	
	public void changeState(RoomState state) {
		this.state = state;
	}
}
