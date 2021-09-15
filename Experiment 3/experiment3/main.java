package experiment3;
public class main {

	public static void main(String[] args) {
		UI window = new Window();
		window = new Vertical(window);
		window = new Horizontal(window);
		window.info();
		System.out.println("Current scroll position of the window: " + window.scroll());
	}

}