package dnui;

/**
 *
 * @author Dvd
 */
// FLIGHT OPTION
interface flightoption{
    abstract void DoFlight();
}
class subsonic implements flightoption{
    @Override
    public void DoFlight(){
        System.out.println("SubSonic Flight");
    };
}
class supersonic implements flightoption{
    @Override
    public void DoFlight(){
        System.out.println("SuperSonic Flight");
    };
}

// TAKEOFF OPTION
interface takeoffoption{
    public void DoTakeoff();   
}
class longdistancetakeoff implements takeoffoption{
        @Override
        public void DoTakeoff() { 
            System.out.println("Long Distance TakeOff");
        }
    }
class verticaltakeoff implements takeoffoption{
        @Override
        public void DoTakeoff() { 
            System.out.println("Vertical TakeOff");
        }
    }
class aircraft {
        private takeoffoption takeoff;
	private flightoption flight;
	
	public void setTakeOff(takeoffoption takeoff) {
		this.takeoff = takeoff;
	}
	
	public void setFlight(flightoption flight) {
		this.flight = flight;
	}
	
	public void DoTakeOff() {
		this.takeoff.DoTakeoff();
	}
	
	public void DoFlight() {
		this.flight.DoFlight();
	}
        public void aircraftInfo() {
		
	}
}
class Helicopter extends aircraft{
    @Override
	public void aircraftInfo() {
		System.out.println("Helicopter");
		System.out.print("TakeOff Type : ");
		this.DoTakeOff();
		System.out.print("Flight Type : ");
                this.DoFlight();
                System.out.println("\n");
	}
}
class Airplane extends aircraft{
    @Override
	public void aircraftInfo() {
		System.out.println("Airplane");
		System.out.print("TakeOff Type : ");
		this.DoTakeOff();
		System.out.print("Flight Type : ");
                this.DoFlight();
                System.out.println("\n");
	}
}
class Fighter extends aircraft{
    @Override
	public void aircraftInfo() {
		System.out.println("Fighter");
		System.out.print("TakeOff Type : ");
		this.DoTakeOff();
		System.out.print("Flight Type : ");
                this.DoFlight();
                System.out.println("\n");
	}
}
class Harrier extends aircraft{
    @Override
	public void aircraftInfo() {
		System.out.println("Harrier");
		System.out.print("TakeOff Type : ");
		this.DoTakeOff();
		System.out.print("Flight Type : ");
                this.DoFlight();
	}
}
public class experiments1 {

    
    public static void main(String[] args) {
          aircraft Helicopter = new Helicopter();
          Helicopter.setTakeOff(new verticaltakeoff());
          Helicopter.setFlight(new subsonic());
          
          aircraft Airplane = new Airplane();
          Airplane.setTakeOff(new longdistancetakeoff());
          Airplane.setFlight(new subsonic());
          
          aircraft Fighter = new Fighter();
          Fighter.setTakeOff(new longdistancetakeoff());
          Fighter.setFlight(new supersonic());
         
          aircraft Harrier = new Harrier();
          Harrier.setTakeOff(new verticaltakeoff());
          Harrier.setFlight(new supersonic());
          
          //Output
          Helicopter.aircraftInfo();
          Airplane.aircraftInfo();
          Fighter.aircraftInfo();
          Harrier.aircraftInfo();
          
    }
    
}
