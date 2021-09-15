package experiment3;
public class Window implements UI {
	@Override
	public double scroll() {
		return 0;
	}

	@Override
	public void info() {
		System.out.println("Window is scrolling");
	}
}
